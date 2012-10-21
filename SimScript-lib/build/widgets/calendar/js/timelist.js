// TODO find a way to properly deal with borders in the jquery ui resizable plugin

/**
 * Creates a timeline and allows the user to define slots on it.
 * @param slotList the list that will be populated with the created slots.
 * The timelist will be updated when this list changes.
 * @param container the container to append the timeline to.
 * @param product the product for which slots should be created.
 * @param day the day for which you want to make a slotlist.
 * @param timelineStartHour the hour at which the timeline should start. Defaults to 0.
 * @param timelineEndHour the hour at which the timeline should end. Defaults to 24.
 */
function timeList(slotList, container, product, day, timelineStartHour, timelineEndHour) {
	// constants
	var emptySlotHeight = 82; // Note: this should include borders!
	var emptySlotWidth = 250; // Note: this should include borders!
	var emptySlotBorderWidth = 1;
	var slotDuration = product.getSlot_duration() == undefined ? 15 : product.getSlot_duration().get();
	timelineStartHour = timelineStartHour == undefined ? 0 : timelineStartHour;
	timelineEndHour = timelineEndHour == undefined ? 24 : timelineEndHour;
	var cssHour = 'sim-ui-timelist-hour';
	var cssEmptySlot = 'sim-ui-timelist-empty-slot';
	var cssSlot = 'sim-ui-timelist-slot';
	var cssSolidSlot = 'sim-ui-timelist-solid-slot';
	var cssSlotDelete = 'sim-ui-timelist-slot-delete';
	var cssSlotsContainer = 'sim-ui-timelist-slots-container';
	var jqDataKey = 'sim-ui-timelist-slot';
	
	// derived values
	var minuteHeight = emptySlotHeight / 60;
	product.getSlot_duration().addObserver(function(){slotDuration = product.getSlot_duration().get();});

	// private variables
	var imAdjustingTheSlotList = false;
	var imAdjustingVisibleSlots = false;
	
	// a container for this timeList
	var list = $('<div>');
	container.append(list);
	
	/*
	 *	+---------------------+
	 *	|  Standard TimeLine  |
	 *	+---------------------+ 
	 */
	
	// The timeline has a left column for the numbers of the hours 
	// and a right column where the slots should go.
	var timeline = $('<table>');
	timeline.attr({cellspacing: "0", cellpadding: "0"});
	timeline.css({'table-layout':'fixed', 'border-collapse':'collapse', 'border-spacing':'0px'});
	list.append(timeline);
	
	// Construct the timeline with empty slots.
	for (var i = timelineStartHour; i < timelineEndHour; i++) {
		var row = $('<tr>'); 
		var left = $('<td>');
		left.css({'border-width' : emptySlotBorderWidth+'px', height:emptySlotHeight+'px'});
		left.addClass(cssHour);
		left.html(i);
		
		var right = $('<td>');
		right.css({
			'min-width'		: emptySlotWidth - emptySlotBorderWidth + 'px',
			'border-width'	: emptySlotBorderWidth + 'px',
			height			: emptySlotHeight + 'px'
		});
		right.addClass(cssEmptySlot);
		
		row.append(left).append(right);
		timeline.append(row);
	}

	// Slots can stretch different hours, so they will be absolutely positioned over the timeline table.
	var slotsContainer = $('<div>');
	slotsContainer.css({
		width	: emptySlotWidth + 'px',
		height	: (timelineEndHour - timelineStartHour) * emptySlotHeight + 'px',
		position: 'absolute'
	});
	list.append(slotsContainer);
	// update the position of the slotsContainer
	slotsContainer.offset(list.find('.'+cssEmptySlot).offset());
	
	/*
	 *	+--------------------------+
	 *	|  SlotCreation Specifics  |
	 *	+--------------------------+ 
	 */
	
	slotsContainer.addClass(cssSlotsContainer);
	
	// this column overlays the empty slots in the timeline
	// we will use this column to listen to mouseclicks.
	var clickableCol = $(document.createElement('div'));
	clickableCol.css({
		position	: 'absolute',
		left		: 0,
		top			: 0,
		width		: '100%',
		height		: '100%'
	});
	slotsContainer.html(clickableCol);
	clickableCol.click(function(event) {
		createSlot(computeStartTimeFromPageTopOffset(event.pageY));
	});

	function computeStartTimeFromPageTopOffset(pageY) {
		// the top offset of the clicked location within the slotsContainer
		var innerOffset = pageY - slotsContainer.offset().top;
		return timelineStartHour * 60 + roundToNearestFive(innerOffset / minuteHeight);
	}
	
	/**
	 * Creates a solid slot.
	 * It's simply a block at the given start time, with a height according to slotDuration.
	 */
	function createSolidSlot(startTime) {
		var slot = $(document.createElement('div'));
		slot.addClass(cssSolidSlot);
		slot.css({
			// initial height computed from the slot duration.
			height	: slotDuration * minuteHeight + 'px',
			position: 'absolute',
			// position the slot in the right place.
			top		: computeSlotsContainerTopOffset(startTime) + 'px'
		});
		slotsContainer.append(slot);
	}
	
	/**
	 * Creates a slot.
	 * It is put at the start hour and minute and has an initial height,
	 * which is computed from the slotDuration.
	 * 
	 * The vertical size is resizable, but slots can't be resized over each other
	 * or outside the timeline.
	 * Neither can they be resized smaller than the slotDuration.
	 * 
	 * MinuteLength is optional and can be used to define an initial height other than the slot duration. 
	 */
	function createSlot(startTime, minuteLength) {
		// only create a new slot if there is room for it
		var next = getNextSlotByTime(startTime);
		if (next != null && getStartTime(next) - startTime < slotDuration) {
			return;
		}
		// also skip if the slot is too close to the bottom
		var slotsContainerTopOffset = computeSlotsContainerTopOffset(startTime);
		if (slotsContainer.innerHeight() - slotsContainerTopOffset < slotDuration) {
			return;
		}
		
		// the slot
		var slot = $(document.createElement('div'));
		slot.addClass(cssSlot);
		slot.css({
			// initial height computed from the slot duration.
			height	: minuteLength == undefined ? slotDuration * minuteHeight + 'px' : minuteLength * minuteHeight + 'px',
			position: 'absolute',
			// position the slot in the right place.
			top		: slotsContainerTopOffset + 'px'
		});
		slotsContainer.append(slot);
		
		var slotDeleteSpan = $('<span>x</span>');
		slotDeleteSpan.addClass(cssSlotDelete);
		slotDeleteSpan.css({
			position: 'absolute', 
			right: '3px',
			top : '0'
		});
		slot.append(slotDeleteSpan);
		slotDeleteSpan.click(function() {
			slot.remove();
			updateSlotsData();
			updateSlotsBoundaries();
			updateSlotList();
		});
		
		// TODO: what do we put in the slot?
		// put in the start time
		var startTimeSpan = $(document.createElement('span'));
		slot.append(startTimeSpan);
		updateStartTimeSpan();
		slot.append(' - ');
		// create a span to hold the end time
		var endTimeSpan = $(document.createElement('span'));
		slot.append(endTimeSpan);
		// compute the end time and put it in the span
		updateEndTimeSpan();
		
		// computes the start time of the slot and puts it in the span
		// should be called when the slot is dragged
		function updateStartTimeSpan() {
			var startTime = getStartTime(slot);
			startTimeSpan.text(normalize(getHour(startTime)) + ':' + normalize(getMinute(startTime)));
		}
		
		// computes the end time of the slot and puts it in the span.
		// it's a separate function since it should also be called when the slot is resized
		function updateEndTimeSpan() {
			var endTime = getStartTime(slot) + roundToNearestFive(slot.innerHeight() / minuteHeight); 
			endTimeSpan.text(normalize(getHour(endTime)) + ':' + normalize(getMinute(endTime)));
		}
		
		// keep the slot inside the timeline
		if (slot.outerWidth() > emptySlotWidth) {
			slot.outerWidth(emptySlotWidth);
		}
		// fancy opacity TODO shouldn't really be here, should it?
		slot.fadeTo(0, 0.8);
		
		// options for the jquery ui resizable plugin
		var resizeOptions = {
				// the slot is resizable in a downward (south) direction 
				handles		: 's',
				// and should not leave the timeline (and thus slotsContainer)
				containment	: slotsContainer,
				// resize at slotDuration minute intervals
				grid		: [50, slotDuration * minuteHeight],
				// update the endtime of the slot on resize
				resize: function(){
					updateEndTimeSpan();
				},
				// a slot can never be smaller than the slotDuration
				minHeight	: slotDuration * minuteHeight,
				// update the slots
				stop		: function(event) {
					// FIXME apparently resizable plugin partly ignores maxHeight and containment
					// see these logs
//					console.log('Max resizable height: '+slot.resizable('option', 'maxHeight'));
//					console.log('outerHeight: '+slot.outerHeight());
//					console.log('innerHeight: '+slot.innerHeight());
//					>> Max resizable height: 75
//					>> widgets.js:406outerHeight: 85
//					>> widgets.js:407innerHeight: 81
					// so let's just do it ourselves
					var maxHeight = slot.resizable('option', 'maxHeight');
					// first check is for resizing over slots (ignoring maxHeight)
					// second check is for resizing over slotsContainer (ignoring containment)
					if (slot.innerHeight() > maxHeight 
							|| slot.offset().top + slot.innerHeight() > slotsContainer.offset().top + slotsContainer.innerHeight()) {
						slot.innerHeight(slot.innerHeight() - slotDuration * minuteHeight);
					}
					updateStartTimeSpan();
					updateEndTimeSpan();
					updateSlotsBoundaries();
					updateSlotList();
				}
		};
		
		// options for the jquery ui draggable plugin
		var draggableOptions = {
				// only drag vertical
				axis 		: 'y',
				// drag in 5 minute intervals
//				grid 		: [50, 5 * minuteHeight],
				// snapping to edges of slotcontainer
				snap		: '.' + cssSlotsContainer+", ."+cssSlot,
				snapMode 	: 'both',
				snapTolerance:3*minuteHeight,
				// placeholder for the containment area
				containment	: [],
				// update the times when the slot is being dragged
				drag : function() {
					updateStartTimeSpan();
					updateEndTimeSpan();
				},
				// update the boundaries of previous and next slots
				stop		: function(event) {
					updateStartTimeSpan();
					updateEndTimeSpan();
					updateSlotsBoundaries();
					updateSlotList();
				}
		};
		
		// make the slot resizable
		slot.resizable(resizeOptions);
		// make the slot draggable
		slot.draggable(draggableOptions);

		updateSlotsData();
		updateSlotsBoundaries();
		updateSlotList();
	}
	
	function getAllSlotsSorted() {
		return slotsContainer.children('.'+cssSlot).sort(function(a,b){return $(a).offset().top - $(b).offset().top;});
	}
	function getNextSlotByTime(time) {
		var sortedSlots = getAllSlotsSorted();
		for (var i = 0; i < sortedSlots.length; i++) {
			if (getStartTime($(sortedSlots[i])) > time) {
				break;
			}
		}
		return i < sortedSlots.length ? $(sortedSlots[i]) : null;
	}
	function getStartTime(slot) {
		return parseInt(computeStartTimeFromPageTopOffset(slot.offset().top));
	}
	function getHour(time) {
		return Math.floor(time / 60);
	}
	function getMinute(time) {
		return roundToNearestFive(time % 60);
	}
	
	// adds a leading 0 if number < 10
	function normalize(number) {
		return number < 10 ? '0' + number : number;
	}
	
	// Rounds the given number to the nearest Integer which can be fully divided by 5.
	function roundToNearestFive(number) {
		number = Math.round(number);
		return number % 5 < 3 ? number - number % 5 : number + (5 - number % 5);
	}
	
	// computes the top offset required to place a slot at the given start time. 
	function computeSlotsContainerTopOffset(time) {
		return (time - timelineStartHour * 60) * minuteHeight;
	}
	
	/*
	 * 	+--------------------+
	 * 	|  Update functions  |
	 * 	+--------------------+
	 */
	
	/**
	 * Updates the jquery data stored for all slots.
	 * 
	 * jqDataKey : {next : nextSlot, previous: previousSlot}
	 */
	function updateSlotsData() {
		var slots = getAllSlotsSorted();
		slots.each(function(i, slot) {
			slot = $(slot);
			slot.data(jqDataKey, {
				previous	: i > 0 ? $(slots[i-1]) : null,
				next		: i < slots.length - 1 ? $(slots[i+1]) : null
			});
		});
	}
	
	/**
	 * Updates the resizable and draggable boundaries for all slots.
	 */
	function updateSlotsBoundaries() {
		var slots = getAllSlotsSorted();
		slots.each(function(i, slot) {
			slot = $(slot);
			var prev = i > 0 ? $(slots[i-1]) : null;
			var next = i < slots.length - 1 ? $(slots[i+1]) : null;
			updateDraggableUpperBoundary(slot, prev);
			updateDraggableLowerBoundary(slot, next);
			updateResizableBoundary(slot, next);
		});
		
		function updateDraggableUpperBoundary(lowerSlot, upperSlot) {
			var oldContainment = lowerSlot.draggable('option', 'containment');
			// upperSlot is optional, without it we restrict dragging to the slotsContainer
			if (upperSlot == undefined) {
				lowerSlot.draggable('option', 'containment', 
						[slotsContainer.offset().left,
						 slotsContainer.offset().top,
						 oldContainment[2],
						 oldContainment[3]]);
			} else {
				lowerSlot.draggable('option', 'containment', 
						[slotsContainer.offset().left,
						 upperSlot.offset().top + upperSlot.outerHeight(),
						 oldContainment[2],
						 oldContainment[3]]);
			}
		}
		function updateDraggableLowerBoundary(upperSlot, lowerSlot) {
			var oldContainment = upperSlot.draggable('option', 'containment');
			// lowerSlot is optional, without it we restrict dragging to the slotsContainer
			if (lowerSlot == undefined) {
				upperSlot.draggable('option', 'containment',
						[oldContainment[0],
						 oldContainment[1],
						 slotsContainer.offset().left + emptySlotWidth,
						 slotsContainer.offset().top + slotsContainer.innerHeight() - upperSlot.outerHeight()]);
			} else {
				upperSlot.draggable('option', 'containment', 
						[oldContainment[0],
						 oldContainment[1],
						 slotsContainer.offset().left + emptySlotWidth,
						 lowerSlot.offset().top - upperSlot.outerHeight()]);
			}
		}
		function updateResizableBoundary(upperSlot, lowerSlot){
			if (lowerSlot == undefined) {
				// boundary will be set be the containment
				upperSlot.resizable('option', 'maxHeight', slotsContainer.innerHeight());
			} else {
				upperSlot.resizable('option', 'maxHeight', lowerSlot.offset().top - upperSlot.offset().top);
			}
		}
	}

	/**
	 * Updates the slotsList with all slots currently visible in the list.
	 */
	function updateSlotList() {
		if (!imAdjustingVisibleSlots) {
			imAdjustingTheSlotList = true;
			slotList.clear();
			var slots = getAllSlotsSorted();
			// split long slots in smaller slots with length = slotDuration
			slots.each(function(i, el){
				var slot = $(el);
				var minutes = slot.innerHeight() / minuteHeight;
				for (var j = 0; j < Math.round(minutes / slotDuration); j++) {
					var startTime = getStartTime(slot) + j * slotDuration;
					slotList.add(new Item({
						product : product.getId(),
						day : day.get(),
						'start_time' : {hours: getHour(startTime), minutes : getMinute(startTime)},
						planned_activities : []
					}));
				}
			});
			imAdjustingTheSlotList = false;
		}
	}
	
	/**
	 * Updates the currently visible slots from the data in the slotList.
	 */
	function updateSlotsFromSlotList() {
		slotsContainer.children('.'+cssSlot+', .'+cssSolidSlot).remove();
		var startTimes = [];
		slotList.forAll(function(azslot){
			if (azslot.getPlanned_activities() != null && !azslot.getPlanned_activities().isEmpty()) {
				createSolidSlot(azslot.getStart_time().getHours().get() * 60 + parseInt(azslot.getStart_time().getMinutes().get()));
			} else {
				startTimes.push(
						parseInt(azslot.getStart_time().getHours().get() * 60) + 
						parseInt(azslot.getStart_time().getMinutes().get())
				);
			}
		});
		startTimes.sort(function(a,b){return a-b;});
		imAdjustingVisibleSlots = true;
		for (var i = 0; i < startTimes.length; i++) {
			// deal with adjacent slots
			var j = i + 1;
			while (j < startTimes.length && startTimes[j] == parseInt(startTimes[j-1]) + parseInt(slotDuration)) { j++;}
			j--;
			if (i != j) {
				createSlot(startTimes[i], (1+j-i) * slotDuration);
				i = j;
			} else {
				createSlot(startTimes[i]);
			}
		}
		imAdjustingVisibleSlots = false;
	}
	
	/*
	 * 	+---------------+
	 * 	|  Databinding  |
	 * 	+---------------+
	 */
	slotList.addObserver(function() {
		if (!imAdjustingTheSlotList) {
			updateSlotsFromSlotList();
		}
	});
}
