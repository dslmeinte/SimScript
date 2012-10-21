function TimeSlotList(container, startHour, endHour) {
	/*
	 * +--------------------------------------------+
	 * | constants (in px, but we need to do math) 	|
	 * +--------------------------------------------+
	 */ 
	// TODO: recheck the borderwidth subtractions across this function
	var slotHeight = 42; // Note: this should include borders!
	var slotWidth = 250; // Note: this should include borders! 
	var borderWidth = 1;

	/*
	 * +-----------------------------------+
	 * | Parameter and precondition checks |
	 * +-----------------------------------+
	 */
	// defaults for parameters
	if(startHour == null) { startHour = 8; }
	if(endHour == null) { endHour = 24; }

	// Precondition checks
	if(!$.isNumeric(startHour) || !$.isNumeric(endHour)) { throw "Start and end hour should be numerical."; }
	if(startHour != Math.floor(startHour) || endHour != Math.floor(endHour)) { throw "Start and end hour should be integers."; }
	if(startHour >= endHour) { throw "Start hour should be before end hour."; }
	
	/*
	 * +-------------+
	 * | UI Elements |
	 * +-------------+
	 */
	
	// Just a container for the timelist
	var list = $('<div>').css({position:'relative'});
	
	// The timeline has a left column for the numbers of the hours 
	// and a right column where the slots should go.
	var timeline = $('<table>');
	timeline.attr({cellspacing: "0", cellpadding: "0"});
	timeline.css({'table-layout':'fixed', 'border-collapse':'collapse', 'border-spacing':'0px'});
	list.append(timeline);
	
	// Slots can stretch different hours, so they will be absolutely positioned over the timeline table.
	var slotsContainer = $('<div>');
	slotsContainer.css({width:slotWidth+'px', height:'100%', position:'absolute', display:'none'});
	list.append(slotsContainer);

	// Construct the timeline's data with empty slots.
	for (var i = startHour; i < endHour; i++) {
		var row = $('<tr>'); 
		var left = $('<td>');
		left.css({'border-width' : borderWidth+'px', height:slotHeight+'px'});
		left.addClass('sim-ui-timelist-hour');
		left.html(i);
		
		var right = $('<td>');
		right.css({'min-width': slotWidth-borderWidth+'px', 'border-width':borderWidth+'px', height:slotHeight+'px'});
		right.addClass('sim-ui-timelist-empty-slot');
		
		row.append(left).append(right);
		timeline.append(row);
	}
	
	// Append the list to the container
	container.append(list);
	
	/*
	 * +-----------+
	 * | Functions |
	 * +-----------+
	 */
	var self = this;
	/**
	 * The onSelect function will be called when a slot is selected.
	 * It will be given the selected slot.
	 */
	var onSelect = function() {};
	this.onSelect = function(func) { onSelect = func; };

    /**
     * The onDelete function will be called when a slot is deleted.
     */
    var onDelete = function() {};
    this.onDelete = function(func) { onDelete = func; };
	
	/**
	 * Loads the free/open/available slots in the list.
	 */
	this.loadSlots = function(freeSlots) {
		// clear any old slots and place the slotsContainer
		self.clearSlots();
		slotsContainer.css('display', 'block');
		// place it right over the right column
		var offset = timeline.offset();
		offset.top += borderWidth;
		offset.left += timeline.find('tr:first').children('td:first').outerWidth();
		slotsContainer.offset(offset);

		// load the slots if there are any.
		if (freeSlots && freeSlots.length && freeSlots.length>0) {
			for (var i = 0; i < freeSlots.length; i++) {
				var freeSlot = freeSlots[i];
				// only load slots that should be displayed
				if (freeSlot.startTime.hours >= startHour) {
					var slot = $('<div>');
                    var delCon = $('<div>');
                    delCon.css({position:'absolute',right:0+'px',top:0+'px'});
                    slot.append(delCon);
                    var delBut = $('<a>');
                    delCon.append(delBut);
                    delBut.html("X");
                    delBut.click(
                        function(freeSlot) {
                            return function() {
                                onDelete(freeSlot);
                                //freeSlots.splice(i,1);
                                //self.loadSlots(freeSlots);
                            };
                        }(freeSlot)
                    );
                    
					var height = (freeSlot.endTime.hours - freeSlot.startTime.hours) * slotHeight;
                    var top = (freeSlot.startTime.minutes / 60);
					height += Math.ceil((freeSlot.endTime.minutes - freeSlot.startTime.minutes) * (slotHeight/60));
					// position it absolute over the timeline
					slot.css({height:height, position:'absolute', top:(freeSlot.startTime.hours - startHour + top)*slotHeight+'px'});
					slot.addClass('sim-ui-timelist-slot');
					slot.append(freeSlot.name);
					slotsContainer.append(slot);
					// make it clickable
					slot.click(
							function(freeSlot){
								return function() {
									onSelect(freeSlot);
								};
							}(freeSlot)
					);
				}
			}
		}
	};
	
	// clear any old slots
	this.clearSlots = function() {
		slotsContainer.html('');
	};
}
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
	var emptySlotWidth = 100; // Note: this should include borders!
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
/*!
 * jQuery UI 1.8.21
 *
 * Copyright 2012, AUTHORS.txt (http://jqueryui.com/about)
 * Dual licensed under the MIT or GPL Version 2 licenses.
 * http://jquery.org/license
 *
 * http://docs.jquery.com/UI
 */
(function( $, undefined ) {

// prevent duplicate loading
// this is only a problem because we proxy existing functions
// and we don't want to double proxy them
$.ui = $.ui || {};
if ( $.ui.version ) {
	return;
}

$.extend( $.ui, {
	version: "1.8.21",

	keyCode: {
		ALT: 18,
		BACKSPACE: 8,
		CAPS_LOCK: 20,
		COMMA: 188,
		COMMAND: 91,
		COMMAND_LEFT: 91, // COMMAND
		COMMAND_RIGHT: 93,
		CONTROL: 17,
		DELETE: 46,
		DOWN: 40,
		END: 35,
		ENTER: 13,
		ESCAPE: 27,
		HOME: 36,
		INSERT: 45,
		LEFT: 37,
		MENU: 93, // COMMAND_RIGHT
		NUMPAD_ADD: 107,
		NUMPAD_DECIMAL: 110,
		NUMPAD_DIVIDE: 111,
		NUMPAD_ENTER: 108,
		NUMPAD_MULTIPLY: 106,
		NUMPAD_SUBTRACT: 109,
		PAGE_DOWN: 34,
		PAGE_UP: 33,
		PERIOD: 190,
		RIGHT: 39,
		SHIFT: 16,
		SPACE: 32,
		TAB: 9,
		UP: 38,
		WINDOWS: 91 // COMMAND
	}
});

// plugins
$.fn.extend({
	propAttr: $.fn.prop || $.fn.attr,

	_focus: $.fn.focus,
	focus: function( delay, fn ) {
		return typeof delay === "number" ?
			this.each(function() {
				var elem = this;
				setTimeout(function() {
					$( elem ).focus();
					if ( fn ) {
						fn.call( elem );
					}
				}, delay );
			}) :
			this._focus.apply( this, arguments );
	},

	scrollParent: function() {
		var scrollParent;
		if (($.browser.msie && (/(static|relative)/).test(this.css('position'))) || (/absolute/).test(this.css('position'))) {
			scrollParent = this.parents().filter(function() {
				return (/(relative|absolute|fixed)/).test($.curCSS(this,'position',1)) && (/(auto|scroll)/).test($.curCSS(this,'overflow',1)+$.curCSS(this,'overflow-y',1)+$.curCSS(this,'overflow-x',1));
			}).eq(0);
		} else {
			scrollParent = this.parents().filter(function() {
				return (/(auto|scroll)/).test($.curCSS(this,'overflow',1)+$.curCSS(this,'overflow-y',1)+$.curCSS(this,'overflow-x',1));
			}).eq(0);
		}

		return (/fixed/).test(this.css('position')) || !scrollParent.length ? $(document) : scrollParent;
	},

	zIndex: function( zIndex ) {
		if ( zIndex !== undefined ) {
			return this.css( "zIndex", zIndex );
		}

		if ( this.length ) {
			var elem = $( this[ 0 ] ), position, value;
			while ( elem.length && elem[ 0 ] !== document ) {
				// Ignore z-index if position is set to a value where z-index is ignored by the browser
				// This makes behavior of this function consistent across browsers
				// WebKit always returns auto if the element is positioned
				position = elem.css( "position" );
				if ( position === "absolute" || position === "relative" || position === "fixed" ) {
					// IE returns 0 when zIndex is not specified
					// other browsers return a string
					// we ignore the case of nested elements with an explicit value of 0
					// <div style="z-index: -10;"><div style="z-index: 0;"></div></div>
					value = parseInt( elem.css( "zIndex" ), 10 );
					if ( !isNaN( value ) && value !== 0 ) {
						return value;
					}
				}
				elem = elem.parent();
			}
		}

		return 0;
	},

	disableSelection: function() {
		return this.bind( ( $.support.selectstart ? "selectstart" : "mousedown" ) +
			".ui-disableSelection", function( event ) {
				event.preventDefault();
			});
	},

	enableSelection: function() {
		return this.unbind( ".ui-disableSelection" );
	}
});

$.each( [ "Width", "Height" ], function( i, name ) {
	var side = name === "Width" ? [ "Left", "Right" ] : [ "Top", "Bottom" ],
		type = name.toLowerCase(),
		orig = {
			innerWidth: $.fn.innerWidth,
			innerHeight: $.fn.innerHeight,
			outerWidth: $.fn.outerWidth,
			outerHeight: $.fn.outerHeight
		};

	function reduce( elem, size, border, margin ) {
		$.each( side, function() {
			size -= parseFloat( $.curCSS( elem, "padding" + this, true) ) || 0;
			if ( border ) {
				size -= parseFloat( $.curCSS( elem, "border" + this + "Width", true) ) || 0;
			}
			if ( margin ) {
				size -= parseFloat( $.curCSS( elem, "margin" + this, true) ) || 0;
			}
		});
		return size;
	}

	$.fn[ "inner" + name ] = function( size ) {
		if ( size === undefined ) {
			return orig[ "inner" + name ].call( this );
		}

		return this.each(function() {
			$( this ).css( type, reduce( this, size ) + "px" );
		});
	};

	$.fn[ "outer" + name] = function( size, margin ) {
		if ( typeof size !== "number" ) {
			return orig[ "outer" + name ].call( this, size );
		}

		return this.each(function() {
			$( this).css( type, reduce( this, size, true, margin ) + "px" );
		});
	};
});

// selectors
function focusable( element, isTabIndexNotNaN ) {
	var nodeName = element.nodeName.toLowerCase();
	if ( "area" === nodeName ) {
		var map = element.parentNode,
			mapName = map.name,
			img;
		if ( !element.href || !mapName || map.nodeName.toLowerCase() !== "map" ) {
			return false;
		}
		img = $( "img[usemap=#" + mapName + "]" )[0];
		return !!img && visible( img );
	}
	return ( /input|select|textarea|button|object/.test( nodeName )
		? !element.disabled
		: "a" == nodeName
			? element.href || isTabIndexNotNaN
			: isTabIndexNotNaN)
		// the element and all of its ancestors must be visible
		&& visible( element );
}

function visible( element ) {
	return !$( element ).parents().andSelf().filter(function() {
		return $.curCSS( this, "visibility" ) === "hidden" ||
			$.expr.filters.hidden( this );
	}).length;
}

$.extend( $.expr[ ":" ], {
	data: function( elem, i, match ) {
		return !!$.data( elem, match[ 3 ] );
	},

	focusable: function( element ) {
		return focusable( element, !isNaN( $.attr( element, "tabindex" ) ) );
	},

	tabbable: function( element ) {
		var tabIndex = $.attr( element, "tabindex" ),
			isTabIndexNaN = isNaN( tabIndex );
		return ( isTabIndexNaN || tabIndex >= 0 ) && focusable( element, !isTabIndexNaN );
	}
});

// support
$(function() {
	var body = document.body,
		div = body.appendChild( div = document.createElement( "div" ) );

	// access offsetHeight before setting the style to prevent a layout bug
	// in IE 9 which causes the elemnt to continue to take up space even
	// after it is removed from the DOM (#8026)
	div.offsetHeight;

	$.extend( div.style, {
		minHeight: "100px",
		height: "auto",
		padding: 0,
		borderWidth: 0
	});

	$.support.minHeight = div.offsetHeight === 100;
	$.support.selectstart = "onselectstart" in div;

	// set display to none to avoid a layout bug in IE
	// http://dev.jquery.com/ticket/4014
	body.removeChild( div ).style.display = "none";
});





// deprecated
$.extend( $.ui, {
	// $.ui.plugin is deprecated.  Use the proxy pattern instead.
	plugin: {
		add: function( module, option, set ) {
			var proto = $.ui[ module ].prototype;
			for ( var i in set ) {
				proto.plugins[ i ] = proto.plugins[ i ] || [];
				proto.plugins[ i ].push( [ option, set[ i ] ] );
			}
		},
		call: function( instance, name, args ) {
			var set = instance.plugins[ name ];
			if ( !set || !instance.element[ 0 ].parentNode ) {
				return;
			}
	
			for ( var i = 0; i < set.length; i++ ) {
				if ( instance.options[ set[ i ][ 0 ] ] ) {
					set[ i ][ 1 ].apply( instance.element, args );
				}
			}
		}
	},
	
	// will be deprecated when we switch to jQuery 1.4 - use jQuery.contains()
	contains: function( a, b ) {
		return document.compareDocumentPosition ?
			a.compareDocumentPosition( b ) & 16 :
			a !== b && a.contains( b );
	},
	
	// only used by resizable
	hasScroll: function( el, a ) {
	
		//If overflow is hidden, the element might have extra content, but the user wants to hide it
		if ( $( el ).css( "overflow" ) === "hidden") {
			return false;
		}
	
		var scroll = ( a && a === "left" ) ? "scrollLeft" : "scrollTop",
			has = false;
	
		if ( el[ scroll ] > 0 ) {
			return true;
		}
	
		// TODO: determine which cases actually cause this to happen
		// if the element doesn't have the scroll set, see if it's possible to
		// set the scroll
		el[ scroll ] = 1;
		has = ( el[ scroll ] > 0 );
		el[ scroll ] = 0;
		return has;
	},
	
	// these are odd functions, fix the API or move into individual plugins
	isOverAxis: function( x, reference, size ) {
		//Determines when x coordinate is over "b" element axis
		return ( x > reference ) && ( x < ( reference + size ) );
	},
	isOver: function( y, x, top, left, height, width ) {
		//Determines when x, y coordinates is over "b" element
		return $.ui.isOverAxis( y, top, height ) && $.ui.isOverAxis( x, left, width );
	}
});

})( jQuery );
/*!
 * jQuery UI Widget 1.8.21
 *
 * Copyright 2012, AUTHORS.txt (http://jqueryui.com/about)
 * Dual licensed under the MIT or GPL Version 2 licenses.
 * http://jquery.org/license
 *
 * http://docs.jquery.com/UI/Widget
 */
(function( $, undefined ) {

// jQuery 1.4+
if ( $.cleanData ) {
	var _cleanData = $.cleanData;
	$.cleanData = function( elems ) {
		for ( var i = 0, elem; (elem = elems[i]) != null; i++ ) {
			try {
				$( elem ).triggerHandler( "remove" );
			// http://bugs.jquery.com/ticket/8235
			} catch( e ) {}
		}
		_cleanData( elems );
	};
} else {
	var _remove = $.fn.remove;
	$.fn.remove = function( selector, keepData ) {
		return this.each(function() {
			if ( !keepData ) {
				if ( !selector || $.filter( selector, [ this ] ).length ) {
					$( "*", this ).add( [ this ] ).each(function() {
						try {
							$( this ).triggerHandler( "remove" );
						// http://bugs.jquery.com/ticket/8235
						} catch( e ) {}
					});
				}
			}
			return _remove.call( $(this), selector, keepData );
		});
	};
}

$.widget = function( name, base, prototype ) {
	var namespace = name.split( "." )[ 0 ],
		fullName;
	name = name.split( "." )[ 1 ];
	fullName = namespace + "-" + name;

	if ( !prototype ) {
		prototype = base;
		base = $.Widget;
	}

	// create selector for plugin
	$.expr[ ":" ][ fullName ] = function( elem ) {
		return !!$.data( elem, name );
	};

	$[ namespace ] = $[ namespace ] || {};
	$[ namespace ][ name ] = function( options, element ) {
		// allow instantiation without initializing for simple inheritance
		if ( arguments.length ) {
			this._createWidget( options, element );
		}
	};

	var basePrototype = new base();
	// we need to make the options hash a property directly on the new instance
	// otherwise we'll modify the options hash on the prototype that we're
	// inheriting from
//	$.each( basePrototype, function( key, val ) {
//		if ( $.isPlainObject(val) ) {
//			basePrototype[ key ] = $.extend( {}, val );
//		}
//	});
	basePrototype.options = $.extend( true, {}, basePrototype.options );
	$[ namespace ][ name ].prototype = $.extend( true, basePrototype, {
		namespace: namespace,
		widgetName: name,
		widgetEventPrefix: $[ namespace ][ name ].prototype.widgetEventPrefix || name,
		widgetBaseClass: fullName
	}, prototype );

	$.widget.bridge( name, $[ namespace ][ name ] );
};

$.widget.bridge = function( name, object ) {
	$.fn[ name ] = function( options ) {
		var isMethodCall = typeof options === "string",
			args = Array.prototype.slice.call( arguments, 1 ),
			returnValue = this;

		// allow multiple hashes to be passed on init
		options = !isMethodCall && args.length ?
			$.extend.apply( null, [ true, options ].concat(args) ) :
			options;

		// prevent calls to internal methods
		if ( isMethodCall && options.charAt( 0 ) === "_" ) {
			return returnValue;
		}

		if ( isMethodCall ) {
			this.each(function() {
				var instance = $.data( this, name ),
					methodValue = instance && $.isFunction( instance[options] ) ?
						instance[ options ].apply( instance, args ) :
						instance;
				// TODO: add this back in 1.9 and use $.error() (see #5972)
//				if ( !instance ) {
//					throw "cannot call methods on " + name + " prior to initialization; " +
//						"attempted to call method '" + options + "'";
//				}
//				if ( !$.isFunction( instance[options] ) ) {
//					throw "no such method '" + options + "' for " + name + " widget instance";
//				}
//				var methodValue = instance[ options ].apply( instance, args );
				if ( methodValue !== instance && methodValue !== undefined ) {
					returnValue = methodValue;
					return false;
				}
			});
		} else {
			this.each(function() {
				var instance = $.data( this, name );
				if ( instance ) {
					instance.option( options || {} )._init();
				} else {
					$.data( this, name, new object( options, this ) );
				}
			});
		}

		return returnValue;
	};
};

$.Widget = function( options, element ) {
	// allow instantiation without initializing for simple inheritance
	if ( arguments.length ) {
		this._createWidget( options, element );
	}
};

$.Widget.prototype = {
	widgetName: "widget",
	widgetEventPrefix: "",
	options: {
		disabled: false
	},
	_createWidget: function( options, element ) {
		// $.widget.bridge stores the plugin instance, but we do it anyway
		// so that it's stored even before the _create function runs
		$.data( element, this.widgetName, this );
		this.element = $( element );
		this.options = $.extend( true, {},
			this.options,
			this._getCreateOptions(),
			options );

		var self = this;
		this.element.bind( "remove." + this.widgetName, function() {
			self.destroy();
		});

		this._create();
		this._trigger( "create" );
		this._init();
	},
	_getCreateOptions: function() {
		return $.metadata && $.metadata.get( this.element[0] )[ this.widgetName ];
	},
	_create: function() {},
	_init: function() {},

	destroy: function() {
		this.element
			.unbind( "." + this.widgetName )
			.removeData( this.widgetName );
		this.widget()
			.unbind( "." + this.widgetName )
			.removeAttr( "aria-disabled" )
			.removeClass(
				this.widgetBaseClass + "-disabled " +
				"ui-state-disabled" );
	},

	widget: function() {
		return this.element;
	},

	option: function( key, value ) {
		var options = key;

		if ( arguments.length === 0 ) {
			// don't return a reference to the internal hash
			return $.extend( {}, this.options );
		}

		if  (typeof key === "string" ) {
			if ( value === undefined ) {
				return this.options[ key ];
			}
			options = {};
			options[ key ] = value;
		}

		this._setOptions( options );

		return this;
	},
	_setOptions: function( options ) {
		var self = this;
		$.each( options, function( key, value ) {
			self._setOption( key, value );
		});

		return this;
	},
	_setOption: function( key, value ) {
		this.options[ key ] = value;

		if ( key === "disabled" ) {
			this.widget()
				[ value ? "addClass" : "removeClass"](
					this.widgetBaseClass + "-disabled" + " " +
					"ui-state-disabled" )
				.attr( "aria-disabled", value );
		}

		return this;
	},

	enable: function() {
		return this._setOption( "disabled", false );
	},
	disable: function() {
		return this._setOption( "disabled", true );
	},

	_trigger: function( type, event, data ) {
		var prop, orig,
			callback = this.options[ type ];

		data = data || {};
		event = $.Event( event );
		event.type = ( type === this.widgetEventPrefix ?
			type :
			this.widgetEventPrefix + type ).toLowerCase();
		// the original event may come from any element
		// so we need to reset the target on the new event
		event.target = this.element[ 0 ];

		// copy original event properties over to the new event
		orig = event.originalEvent;
		if ( orig ) {
			for ( prop in orig ) {
				if ( !( prop in event ) ) {
					event[ prop ] = orig[ prop ];
				}
			}
		}

		this.element.trigger( event, data );

		return !( $.isFunction(callback) &&
			callback.call( this.element[0], event, data ) === false ||
			event.isDefaultPrevented() );
	}
};

})( jQuery );
/*!
 * jQuery UI Mouse 1.8.21
 *
 * Copyright 2012, AUTHORS.txt (http://jqueryui.com/about)
 * Dual licensed under the MIT or GPL Version 2 licenses.
 * http://jquery.org/license
 *
 * http://docs.jquery.com/UI/Mouse
 *
 * Depends:
 *	jquery.ui.widget.js
 */
(function( $, undefined ) {

var mouseHandled = false;
$( document ).mouseup( function( e ) {
	mouseHandled = false;
});

$.widget("ui.mouse", {
	options: {
		cancel: ':input,option',
		distance: 1,
		delay: 0
	},
	_mouseInit: function() {
		var self = this;

		this.element
			.bind('mousedown.'+this.widgetName, function(event) {
				return self._mouseDown(event);
			})
			.bind('click.'+this.widgetName, function(event) {
				if (true === $.data(event.target, self.widgetName + '.preventClickEvent')) {
				    $.removeData(event.target, self.widgetName + '.preventClickEvent');
					event.stopImmediatePropagation();
					return false;
				}
			});

		this.started = false;
	},

	// TODO: make sure destroying one instance of mouse doesn't mess with
	// other instances of mouse
	_mouseDestroy: function() {
		this.element.unbind('.'+this.widgetName);
		$(document)
			.unbind('mousemove.'+this.widgetName, this._mouseMoveDelegate)
			.unbind('mouseup.'+this.widgetName, this._mouseUpDelegate);
	},

	_mouseDown: function(event) {
		// don't let more than one widget handle mouseStart
		if( mouseHandled ) { return };

		// we may have missed mouseup (out of window)
		(this._mouseStarted && this._mouseUp(event));

		this._mouseDownEvent = event;

		var self = this,
			btnIsLeft = (event.which == 1),
			// event.target.nodeName works around a bug in IE 8 with
			// disabled inputs (#7620)
			elIsCancel = (typeof this.options.cancel == "string" && event.target.nodeName ? $(event.target).closest(this.options.cancel).length : false);
		if (!btnIsLeft || elIsCancel || !this._mouseCapture(event)) {
			return true;
		}

		this.mouseDelayMet = !this.options.delay;
		if (!this.mouseDelayMet) {
			this._mouseDelayTimer = setTimeout(function() {
				self.mouseDelayMet = true;
			}, this.options.delay);
		}

		if (this._mouseDistanceMet(event) && this._mouseDelayMet(event)) {
			this._mouseStarted = (this._mouseStart(event) !== false);
			if (!this._mouseStarted) {
				event.preventDefault();
				return true;
			}
		}

		// Click event may never have fired (Gecko & Opera)
		if (true === $.data(event.target, this.widgetName + '.preventClickEvent')) {
			$.removeData(event.target, this.widgetName + '.preventClickEvent');
		}

		// these delegates are required to keep context
		this._mouseMoveDelegate = function(event) {
			return self._mouseMove(event);
		};
		this._mouseUpDelegate = function(event) {
			return self._mouseUp(event);
		};
		$(document)
			.bind('mousemove.'+this.widgetName, this._mouseMoveDelegate)
			.bind('mouseup.'+this.widgetName, this._mouseUpDelegate);

		event.preventDefault();
		
		mouseHandled = true;
		return true;
	},

	_mouseMove: function(event) {
		// IE mouseup check - mouseup happened when mouse was out of window
		if ($.browser.msie && !(document.documentMode >= 9) && !event.button) {
			return this._mouseUp(event);
		}

		if (this._mouseStarted) {
			this._mouseDrag(event);
			return event.preventDefault();
		}

		if (this._mouseDistanceMet(event) && this._mouseDelayMet(event)) {
			this._mouseStarted =
				(this._mouseStart(this._mouseDownEvent, event) !== false);
			(this._mouseStarted ? this._mouseDrag(event) : this._mouseUp(event));
		}

		return !this._mouseStarted;
	},

	_mouseUp: function(event) {
		$(document)
			.unbind('mousemove.'+this.widgetName, this._mouseMoveDelegate)
			.unbind('mouseup.'+this.widgetName, this._mouseUpDelegate);

		if (this._mouseStarted) {
			this._mouseStarted = false;

			if (event.target == this._mouseDownEvent.target) {
			    $.data(event.target, this.widgetName + '.preventClickEvent', true);
			}

			this._mouseStop(event);
		}

		return false;
	},

	_mouseDistanceMet: function(event) {
		return (Math.max(
				Math.abs(this._mouseDownEvent.pageX - event.pageX),
				Math.abs(this._mouseDownEvent.pageY - event.pageY)
			) >= this.options.distance
		);
	},

	_mouseDelayMet: function(event) {
		return this.mouseDelayMet;
	},

	// These are placeholder methods, to be overriden by extending plugin
	_mouseStart: function(event) {},
	_mouseDrag: function(event) {},
	_mouseStop: function(event) {},
	_mouseCapture: function(event) { return true; }
});

})(jQuery);


/*
 * jQuery UI Datepicker 1.8.18
 *
 * Copyright 2011, AUTHORS.txt (http://jqueryui.com/about)
 * Dual licensed under the MIT or GPL Version 2 licenses.
 * http://jquery.org/license
 *
 * http://docs.jquery.com/UI/Datepicker
 *
 * Depends:
 *	jquery.ui.core.js
 */
(function( $, undefined ) {
$.fn.extend({
	zIndex: function( zIndex ) {
		if ( zIndex !== undefined ) {
			return this.css( "zIndex", zIndex );
		}

		if ( this.length ) {
			var elem = $( this[ 0 ] ), position, value;
			while ( elem.length && elem[ 0 ] !== document ) {
				// Ignore z-index if position is set to a value where z-index is ignored by the browser
				// This makes behavior of this function consistent across browsers
				// WebKit always returns auto if the element is positioned
				position = elem.css( "position" );
				if ( position === "absolute" || position === "relative" || position === "fixed" ) {
					// IE returns 0 when zIndex is not specified
					// other browsers return a string
					// we ignore the case of nested elements with an explicit value of 0
					// <div style="z-index: -10;"><div style="z-index: 0;"></div></div>
					value = parseInt( elem.css( "zIndex" ), 10 );
					if ( !isNaN( value ) && value !== 0 ) {
						return value;
					}
				}
				elem = elem.parent();
			}
		}

		return 0;
	}
});

$.extend($.ui, { datepicker: { version: "1.8.18" } });

var PROP_NAME = 'datepicker';
var dpuuid = new Date().getTime();
var instActive;

/* Date picker manager.
   Use the singleton instance of this class, $.datepicker, to interact with the date picker.
   Settings for (groups of) date pickers are maintained in an instance object,
   allowing multiple different settings on the same page. */

function Datepicker() {
	this.debug = false; // Change this to true to start debugging
	this._curInst = null; // The current instance in use
	this._keyEvent = false; // If the last event was a key event
	this._disabledInputs = []; // List of date picker inputs that have been disabled
	this._datepickerShowing = false; // True if the popup picker is showing , false if not
	this._inDialog = false; // True if showing within a "dialog", false if not
	this._mainDivId = 'ui-datepicker-div'; // The ID of the main datepicker division
	this._inlineClass = 'ui-datepicker-inline'; // The name of the inline marker class
	this._appendClass = 'ui-datepicker-append'; // The name of the append marker class
	this._triggerClass = 'ui-datepicker-trigger'; // The name of the trigger marker class
	this._dialogClass = 'ui-datepicker-dialog'; // The name of the dialog marker class
	this._disableClass = 'ui-datepicker-disabled'; // The name of the disabled covering marker class
	this._unselectableClass = 'ui-datepicker-unselectable'; // The name of the unselectable cell marker class
	this._currentClass = 'ui-datepicker-current-day'; // The name of the current day marker class
	this._dayOverClass = 'ui-datepicker-days-cell-over'; // The name of the day hover marker class
	this.regional = []; // Available regional settings, indexed by language code
	this.regional[''] = { // Default regional settings
		closeText: 'Done', // Display text for close link
		prevText: 'Prev', // Display text for previous month link
		nextText: 'Next', // Display text for next month link
		currentText: 'Today', // Display text for current month link
		monthNames: ['January','February','March','April','May','June',
			'July','August','September','October','November','December'], // Names of months for drop-down and formatting
		monthNamesShort: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'], // For formatting
		dayNames: ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'], // For formatting
		dayNamesShort: ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'], // For formatting
		dayNamesMin: ['Su','Mo','Tu','We','Th','Fr','Sa'], // Column headings for days starting at Sunday
		weekHeader: 'Wk', // Column header for week of the year
		dateFormat: 'mm/dd/yy', // See format options on parseDate
		firstDay: 0, // The first day of the week, Sun = 0, Mon = 1, ...
		isRTL: false, // True if right-to-left language, false if left-to-right
		showMonthAfterYear: false, // True if the year select precedes month, false for month then year
		yearSuffix: '' // Additional text to append to the year in the month headers
	};
	this._defaults = { // Global defaults for all the date picker instances
		showOn: 'focus', // 'focus' for popup on focus,
			// 'button' for trigger button, or 'both' for either
		showAnim: 'fadeIn', // Name of jQuery animation for popup
		showOptions: {}, // Options for enhanced animations
		defaultDate: null, // Used when field is blank: actual date,
			// +/-number for offset from today, null for today
		appendText: '', // Display text following the input box, e.g. showing the format
		buttonText: '...', // Text for trigger button
		buttonImage: '', // URL for trigger button image
		buttonImageOnly: false, // True if the image appears alone, false if it appears on a button
		hideIfNoPrevNext: false, // True to hide next/previous month links
			// if not applicable, false to just disable them
		navigationAsDateFormat: false, // True if date formatting applied to prev/today/next links
		gotoCurrent: false, // True if today link goes back to current selection instead
		changeMonth: false, // True if month can be selected directly, false if only prev/next
		changeYear: false, // True if year can be selected directly, false if only prev/next
		yearRange: 'c-10:c+10', // Range of years to display in drop-down,
			// either relative to today's year (-nn:+nn), relative to currently displayed year
			// (c-nn:c+nn), absolute (nnnn:nnnn), or a combination of the above (nnnn:-n)
		showOtherMonths: false, // True to show dates in other months, false to leave blank
		selectOtherMonths: false, // True to allow selection of dates in other months, false for unselectable
		showWeek: false, // True to show week of the year, false to not show it
		calculateWeek: this.iso8601Week, // How to calculate the week of the year,
			// takes a Date and returns the number of the week for it
		shortYearCutoff: '+10', // Short year values < this are in the current century,
			// > this are in the previous century,
			// string value starting with '+' for current year + value
		minDate: null, // The earliest selectable date, or null for no limit
		maxDate: null, // The latest selectable date, or null for no limit
		duration: 'fast', // Duration of display/closure
		beforeShowDay: null, // Function that takes a date and returns an array with
			// [0] = true if selectable, false if not, [1] = custom CSS class name(s) or '',
			// [2] = cell title (optional), e.g. $.datepicker.noWeekends
		beforeShow: null, // Function that takes an input field and
			// returns a set of custom settings for the date picker
		onSelect: null, // Define a callback function when a date is selected
		onChangeMonthYear: null, // Define a callback function when the month or year is changed
		onClose: null, // Define a callback function when the datepicker is closed
		numberOfMonths: 1, // Number of months to show at a time
		showCurrentAtPos: 0, // The position in multipe months at which to show the current month (starting at 0)
		stepMonths: 1, // Number of months to step back/forward
		stepBigMonths: 12, // Number of months to step back/forward for the big links
		altField: '', // Selector for an alternate field to store selected dates into
		altFormat: '', // The date format to use for the alternate field
		constrainInput: true, // The input is constrained by the current date format
		showButtonPanel: false, // True to show button panel, false to not show it
		autoSize: false, // True to size the input for the date format, false to leave as is
		disabled: false // The initial disabled state
	};
	$.extend(this._defaults, this.regional['']);
	this.dpDiv = bindHover($('<div id="' + this._mainDivId + '" class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>'));
}

$.extend(Datepicker.prototype, {
	/* Class name added to elements to indicate already configured with a date picker. */
	markerClassName: 'hasDatepicker',
	
	//Keep track of the maximum number of rows displayed (see #7043)
	maxRows: 4,

	/* Debug logging (if enabled). */
	log: function () {
		if (this.debug)
			console.log.apply('', arguments);
	},
	
	// TODO rename to "widget" when switching to widget factory
	_widgetDatepicker: function() {
		return this.dpDiv;
	},

	/* Override the default settings for all instances of the date picker.
	   @param  settings  object - the new settings to use as defaults (anonymous object)
	   @return the manager object */
	setDefaults: function(settings) {
		extendRemove(this._defaults, settings || {});
		return this;
	},

	/* Attach the date picker to a jQuery selection.
	   @param  target    element - the target input field or division or span
	   @param  settings  object - the new settings to use for this date picker instance (anonymous) */
	_attachDatepicker: function(target, settings) {
		// check for settings on the control itself - in namespace 'date:'
		var inlineSettings = null;
		for (var attrName in this._defaults) {
			var attrValue = target.getAttribute('date:' + attrName);
			if (attrValue) {
				inlineSettings = inlineSettings || {};
				try {
					inlineSettings[attrName] = eval(attrValue);
				} catch (err) {
					inlineSettings[attrName] = attrValue;
				}
			}
		}
		var nodeName = target.nodeName.toLowerCase();
		var inline = (nodeName == 'div' || nodeName == 'span');
		if (!target.id) {
			this.uuid += 1;
			target.id = 'dp' + this.uuid;
		}
		var inst = this._newInst($(target), inline);
		inst.settings = $.extend({}, settings || {}, inlineSettings || {});
		if (nodeName == 'input') {
			this._connectDatepicker(target, inst);
		} else if (inline) {
			this._inlineDatepicker(target, inst);
		}
	},

	/* Create a new instance object. */
	_newInst: function(target, inline) {
		var id = target[0].id.replace(/([^A-Za-z0-9_-])/g, '\\\\$1'); // escape jQuery meta chars
		return {id: id, input: target, // associated target
			selectedDay: 0, selectedMonth: 0, selectedYear: 0, // current selection
			drawMonth: 0, drawYear: 0, // month being drawn
			inline: inline, // is datepicker inline or not
			dpDiv: (!inline ? this.dpDiv : // presentation div
			bindHover($('<div class="' + this._inlineClass + ' ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all"></div>')))};
	},

	/* Attach the date picker to an input field. */
	_connectDatepicker: function(target, inst) {
		var input = $(target);
		inst.append = $([]);
		inst.trigger = $([]);
		if (input.hasClass(this.markerClassName))
			return;
		this._attachments(input, inst);
		input.addClass(this.markerClassName).keydown(this._doKeyDown).
			keypress(this._doKeyPress).keyup(this._doKeyUp).
			bind("setData.datepicker", function(event, key, value) {
				inst.settings[key] = value;
			}).bind("getData.datepicker", function(event, key) {
				return this._get(inst, key);
			});
		this._autoSize(inst);
		$.data(target, PROP_NAME, inst);
		//If disabled option is true, disable the datepicker once it has been attached to the input (see ticket #5665)
		if( inst.settings.disabled ) {
			this._disableDatepicker( target );
		}
	},

	/* Make attachments based on settings. */
	_attachments: function(input, inst) {
		var appendText = this._get(inst, 'appendText');
		var isRTL = this._get(inst, 'isRTL');
		if (inst.append)
			inst.append.remove();
		if (appendText) {
			inst.append = $('<span class="' + this._appendClass + '">' + appendText + '</span>');
			input[isRTL ? 'before' : 'after'](inst.append);
		}
		input.unbind('focus', this._showDatepicker);
		if (inst.trigger)
			inst.trigger.remove();
		var showOn = this._get(inst, 'showOn');
		if (showOn == 'focus' || showOn == 'both') // pop-up date picker when in the marked field
			input.focus(this._showDatepicker);
		if (showOn == 'button' || showOn == 'both') { // pop-up date picker when button clicked
			var buttonText = this._get(inst, 'buttonText');
			var buttonImage = this._get(inst, 'buttonImage');
			inst.trigger = $(this._get(inst, 'buttonImageOnly') ?
				$('<img/>').addClass(this._triggerClass).
					attr({ src: buttonImage, alt: buttonText, title: buttonText }) :
				$('<button type="button"></button>').addClass(this._triggerClass).
					html(buttonImage == '' ? buttonText : $('<img/>').attr(
					{ src:buttonImage, alt:buttonText, title:buttonText })));
			input[isRTL ? 'before' : 'after'](inst.trigger);
			inst.trigger.click(function() {
				if ($.datepicker._datepickerShowing && $.datepicker._lastInput == input[0])
					$.datepicker._hideDatepicker();
				else if ($.datepicker._datepickerShowing && $.datepicker._lastInput != input[0]) {
					$.datepicker._hideDatepicker(); 
					$.datepicker._showDatepicker(input[0]);
				} else
					$.datepicker._showDatepicker(input[0]);
				return false;
			});
		}
	},

	/* Apply the maximum length for the date format. */
	_autoSize: function(inst) {
		if (this._get(inst, 'autoSize') && !inst.inline) {
			var date = new Date(2009, 12 - 1, 20); // Ensure double digits
			var dateFormat = this._get(inst, 'dateFormat');
			if (dateFormat.match(/[DM]/)) {
				var findMax = function(names) {
					var max = 0;
					var maxI = 0;
					for (var i = 0; i < names.length; i++) {
						if (names[i].length > max) {
							max = names[i].length;
							maxI = i;
						}
					}
					return maxI;
				};
				date.setMonth(findMax(this._get(inst, (dateFormat.match(/MM/) ?
					'monthNames' : 'monthNamesShort'))));
				date.setDate(findMax(this._get(inst, (dateFormat.match(/DD/) ?
					'dayNames' : 'dayNamesShort'))) + 20 - date.getDay());
			}
			inst.input.attr('size', this._formatDate(inst, date).length);
		}
	},

	/* Attach an inline date picker to a div. */
	_inlineDatepicker: function(target, inst) {
		var divSpan = $(target);
		if (divSpan.hasClass(this.markerClassName))
			return;
		divSpan.addClass(this.markerClassName).append(inst.dpDiv).
			bind("setData.datepicker", function(event, key, value){
				inst.settings[key] = value;
			}).bind("getData.datepicker", function(event, key){
				return this._get(inst, key);
			});
		$.data(target, PROP_NAME, inst);
		this._setDate(inst, this._getDefaultDate(inst), true);
		this._updateDatepicker(inst);
		this._updateAlternate(inst);
		//If disabled option is true, disable the datepicker before showing it (see ticket #5665)
		if( inst.settings.disabled ) {
			this._disableDatepicker( target );
		}
		// Set display:block in place of inst.dpDiv.show() which won't work on disconnected elements
		// http://bugs.jqueryui.com/ticket/7552 - A Datepicker created on a detached div has zero height
		inst.dpDiv.css( "display", "block" );
	},

	/* Pop-up the date picker in a "dialog" box.
	   @param  input     element - ignored
	   @param  date      string or Date - the initial date to display
	   @param  onSelect  function - the function to call when a date is selected
	   @param  settings  object - update the dialog date picker instance's settings (anonymous object)
	   @param  pos       int[2] - coordinates for the dialog's position within the screen or
	                     event - with x/y coordinates or
	                     leave empty for default (screen centre)
	   @return the manager object */
	_dialogDatepicker: function(input, date, onSelect, settings, pos) {
		var inst = this._dialogInst; // internal instance
		if (!inst) {
			this.uuid += 1;
			var id = 'dp' + this.uuid;
			this._dialogInput = $('<input type="text" id="' + id +
				'" style="position: absolute; top: -100px; width: 0px; z-index: -10;"/>');
			this._dialogInput.keydown(this._doKeyDown);
			$('body').append(this._dialogInput);
			inst = this._dialogInst = this._newInst(this._dialogInput, false);
			inst.settings = {};
			$.data(this._dialogInput[0], PROP_NAME, inst);
		}
		extendRemove(inst.settings, settings || {});
		date = (date && date.constructor == Date ? this._formatDate(inst, date) : date);
		this._dialogInput.val(date);

		this._pos = (pos ? (pos.length ? pos : [pos.pageX, pos.pageY]) : null);
		if (!this._pos) {
			var browserWidth = document.documentElement.clientWidth;
			var browserHeight = document.documentElement.clientHeight;
			var scrollX = document.documentElement.scrollLeft || document.body.scrollLeft;
			var scrollY = document.documentElement.scrollTop || document.body.scrollTop;
			this._pos = // should use actual width/height below
				[(browserWidth / 2) - 100 + scrollX, (browserHeight / 2) - 150 + scrollY];
		}

		// move input on screen for focus, but hidden behind dialog
		this._dialogInput.css('left', (this._pos[0] + 20) + 'px').css('top', this._pos[1] + 'px');
		inst.settings.onSelect = onSelect;
		this._inDialog = true;
		this.dpDiv.addClass(this._dialogClass);
		this._showDatepicker(this._dialogInput[0]);
		if ($.blockUI)
			$.blockUI(this.dpDiv);
		$.data(this._dialogInput[0], PROP_NAME, inst);
		return this;
	},

	/* Detach a datepicker from its control.
	   @param  target    element - the target input field or division or span */
	_destroyDatepicker: function(target) {
		var $target = $(target);
		var inst = $.data(target, PROP_NAME);
		if (!$target.hasClass(this.markerClassName)) {
			return;
		}
		var nodeName = target.nodeName.toLowerCase();
		$.removeData(target, PROP_NAME);
		if (nodeName == 'input') {
			inst.append.remove();
			inst.trigger.remove();
			$target.removeClass(this.markerClassName).
				unbind('focus', this._showDatepicker).
				unbind('keydown', this._doKeyDown).
				unbind('keypress', this._doKeyPress).
				unbind('keyup', this._doKeyUp);
		} else if (nodeName == 'div' || nodeName == 'span')
			$target.removeClass(this.markerClassName).empty();
	},

	/* Enable the date picker to a jQuery selection.
	   @param  target    element - the target input field or division or span */
	_enableDatepicker: function(target) {
		var $target = $(target);
		var inst = $.data(target, PROP_NAME);
		if (!$target.hasClass(this.markerClassName)) {
			return;
		}
		var nodeName = target.nodeName.toLowerCase();
		if (nodeName == 'input') {
			target.disabled = false;
			inst.trigger.filter('button').
				each(function() { this.disabled = false; }).end().
				filter('img').css({opacity: '1.0', cursor: ''});
		}
		else if (nodeName == 'div' || nodeName == 'span') {
			var inline = $target.children('.' + this._inlineClass);
			inline.children().removeClass('ui-state-disabled');
			inline.find("select.ui-datepicker-month, select.ui-datepicker-year").
				removeAttr("disabled");
		}
		this._disabledInputs = $.map(this._disabledInputs,
			function(value) { return (value == target ? null : value); }); // delete entry
	},

	/* Disable the date picker to a jQuery selection.
	   @param  target    element - the target input field or division or span */
	_disableDatepicker: function(target) {
		var $target = $(target);
		var inst = $.data(target, PROP_NAME);
		if (!$target.hasClass(this.markerClassName)) {
			return;
		}
		var nodeName = target.nodeName.toLowerCase();
		if (nodeName == 'input') {
			target.disabled = true;
			inst.trigger.filter('button').
				each(function() { this.disabled = true; }).end().
				filter('img').css({opacity: '0.5', cursor: 'default'});
		}
		else if (nodeName == 'div' || nodeName == 'span') {
			var inline = $target.children('.' + this._inlineClass);
			inline.children().addClass('ui-state-disabled');
			inline.find("select.ui-datepicker-month, select.ui-datepicker-year").
				attr("disabled", "disabled");
		}
		this._disabledInputs = $.map(this._disabledInputs,
			function(value) { return (value == target ? null : value); }); // delete entry
		this._disabledInputs[this._disabledInputs.length] = target;
	},

	/* Is the first field in a jQuery collection disabled as a datepicker?
	   @param  target    element - the target input field or division or span
	   @return boolean - true if disabled, false if enabled */
	_isDisabledDatepicker: function(target) {
		if (!target) {
			return false;
		}
		for (var i = 0; i < this._disabledInputs.length; i++) {
			if (this._disabledInputs[i] == target)
				return true;
		}
		return false;
	},

	/* Retrieve the instance data for the target control.
	   @param  target  element - the target input field or division or span
	   @return  object - the associated instance data
	   @throws  error if a jQuery problem getting data */
	_getInst: function(target) {
		try {
			return $.data(target, PROP_NAME);
		}
		catch (err) {
			throw 'Missing instance data for this datepicker';
		}
	},

	/* Update or retrieve the settings for a date picker attached to an input field or division.
	   @param  target  element - the target input field or division or span
	   @param  name    object - the new settings to update or
	                   string - the name of the setting to change or retrieve,
	                   when retrieving also 'all' for all instance settings or
	                   'defaults' for all global defaults
	   @param  value   any - the new value for the setting
	                   (omit if above is an object or to retrieve a value) */
	_optionDatepicker: function(target, name, value) {
		var inst = this._getInst(target);
		if (arguments.length == 2 && typeof name == 'string') {
			return (name == 'defaults' ? $.extend({}, $.datepicker._defaults) :
				(inst ? (name == 'all' ? $.extend({}, inst.settings) :
				this._get(inst, name)) : null));
		}
		var settings = name || {};
		if (typeof name == 'string') {
			settings = {};
			settings[name] = value;
		}
		if (inst) {
			if (this._curInst == inst) {
				this._hideDatepicker();
			}
			var date = this._getDateDatepicker(target, true);
			var minDate = this._getMinMaxDate(inst, 'min');
			var maxDate = this._getMinMaxDate(inst, 'max');
			extendRemove(inst.settings, settings);
			// reformat the old minDate/maxDate values if dateFormat changes and a new minDate/maxDate isn't provided
			if (minDate !== null && settings['dateFormat'] !== undefined && settings['minDate'] === undefined)
				inst.settings.minDate = this._formatDate(inst, minDate);
			if (maxDate !== null && settings['dateFormat'] !== undefined && settings['maxDate'] === undefined)
				inst.settings.maxDate = this._formatDate(inst, maxDate);
			this._attachments($(target), inst);
			this._autoSize(inst);
			this._setDate(inst, date);
			this._updateAlternate(inst);
			this._updateDatepicker(inst);
		}
	},

	// change method deprecated
	_changeDatepicker: function(target, name, value) {
		this._optionDatepicker(target, name, value);
	},

	/* Redraw the date picker attached to an input field or division.
	   @param  target  element - the target input field or division or span */
	_refreshDatepicker: function(target) {
		var inst = this._getInst(target);
		if (inst) {
			this._updateDatepicker(inst);
		}
	},

	/* Set the dates for a jQuery selection.
	   @param  target   element - the target input field or division or span
	   @param  date     Date - the new date */
	_setDateDatepicker: function(target, date) {
		var inst = this._getInst(target);
		if (inst) {
			this._setDate(inst, date);
			this._updateDatepicker(inst);
			this._updateAlternate(inst);
		}
	},

	/* Get the date(s) for the first entry in a jQuery selection.
	   @param  target     element - the target input field or division or span
	   @param  noDefault  boolean - true if no default date is to be used
	   @return Date - the current date */
	_getDateDatepicker: function(target, noDefault) {
		var inst = this._getInst(target);
		if (inst && !inst.inline)
			this._setDateFromField(inst, noDefault);
		return (inst ? this._getDate(inst) : null);
	},

	/* Handle keystrokes. */
	_doKeyDown: function(event) {
		var inst = $.datepicker._getInst(event.target);
		var handled = true;
		var isRTL = inst.dpDiv.is('.ui-datepicker-rtl');
		inst._keyEvent = true;
		if ($.datepicker._datepickerShowing)
			switch (event.keyCode) {
				case 9: $.datepicker._hideDatepicker();
						handled = false;
						break; // hide on tab out
				case 13: var sel = $('td.' + $.datepicker._dayOverClass + ':not(.' + 
									$.datepicker._currentClass + ')', inst.dpDiv);
						if (sel[0])
							$.datepicker._selectDay(event.target, inst.selectedMonth, inst.selectedYear, sel[0]);
							var onSelect = $.datepicker._get(inst, 'onSelect');
							if (onSelect) {
								var dateStr = $.datepicker._formatDate(inst);

								// trigger custom callback
								onSelect.apply((inst.input ? inst.input[0] : null), [dateStr, inst]);
							}
						else
							$.datepicker._hideDatepicker();
						return false; // don't submit the form
						break; // select the value on enter
				case 27: $.datepicker._hideDatepicker();
						break; // hide on escape
				case 33: $.datepicker._adjustDate(event.target, (event.ctrlKey ?
							-$.datepicker._get(inst, 'stepBigMonths') :
							-$.datepicker._get(inst, 'stepMonths')), 'M');
						break; // previous month/year on page up/+ ctrl
				case 34: $.datepicker._adjustDate(event.target, (event.ctrlKey ?
							+$.datepicker._get(inst, 'stepBigMonths') :
							+$.datepicker._get(inst, 'stepMonths')), 'M');
						break; // next month/year on page down/+ ctrl
				case 35: if (event.ctrlKey || event.metaKey) $.datepicker._clearDate(event.target);
						handled = event.ctrlKey || event.metaKey;
						break; // clear on ctrl or command +end
				case 36: if (event.ctrlKey || event.metaKey) $.datepicker._gotoToday(event.target);
						handled = event.ctrlKey || event.metaKey;
						break; // current on ctrl or command +home
				case 37: if (event.ctrlKey || event.metaKey) $.datepicker._adjustDate(event.target, (isRTL ? +1 : -1), 'D');
						handled = event.ctrlKey || event.metaKey;
						// -1 day on ctrl or command +left
						if (event.originalEvent.altKey) $.datepicker._adjustDate(event.target, (event.ctrlKey ?
									-$.datepicker._get(inst, 'stepBigMonths') :
									-$.datepicker._get(inst, 'stepMonths')), 'M');
						// next month/year on alt +left on Mac
						break;
				case 38: if (event.ctrlKey || event.metaKey) $.datepicker._adjustDate(event.target, -7, 'D');
						handled = event.ctrlKey || event.metaKey;
						break; // -1 week on ctrl or command +up
				case 39: if (event.ctrlKey || event.metaKey) $.datepicker._adjustDate(event.target, (isRTL ? -1 : +1), 'D');
						handled = event.ctrlKey || event.metaKey;
						// +1 day on ctrl or command +right
						if (event.originalEvent.altKey) $.datepicker._adjustDate(event.target, (event.ctrlKey ?
									+$.datepicker._get(inst, 'stepBigMonths') :
									+$.datepicker._get(inst, 'stepMonths')), 'M');
						// next month/year on alt +right
						break;
				case 40: if (event.ctrlKey || event.metaKey) $.datepicker._adjustDate(event.target, +7, 'D');
						handled = event.ctrlKey || event.metaKey;
						break; // +1 week on ctrl or command +down
				default: handled = false;
			}
		else if (event.keyCode == 36 && event.ctrlKey) // display the date picker on ctrl+home
			$.datepicker._showDatepicker(this);
		else {
			handled = false;
		}
		if (handled) {
			event.preventDefault();
			event.stopPropagation();
		}
	},

	/* Filter entered characters - based on date format. */
	_doKeyPress: function(event) {
		var inst = $.datepicker._getInst(event.target);
		if ($.datepicker._get(inst, 'constrainInput')) {
			var chars = $.datepicker._possibleChars($.datepicker._get(inst, 'dateFormat'));
			var chr = String.fromCharCode(event.charCode == undefined ? event.keyCode : event.charCode);
			return event.ctrlKey || event.metaKey || (chr < ' ' || !chars || chars.indexOf(chr) > -1);
		}
	},

	/* Synchronise manual entry and field/alternate field. */
	_doKeyUp: function(event) {
		var inst = $.datepicker._getInst(event.target);
		if (inst.input.val() != inst.lastVal) {
			try {
				var date = $.datepicker.parseDate($.datepicker._get(inst, 'dateFormat'),
					(inst.input ? inst.input.val() : null),
					$.datepicker._getFormatConfig(inst));
				if (date) { // only if valid
					$.datepicker._setDateFromField(inst);
					$.datepicker._updateAlternate(inst);
					$.datepicker._updateDatepicker(inst);
				}
			}
			catch (event) {
				$.datepicker.log(event);
			}
		}
		return true;
	},

	/* Pop-up the date picker for a given input field.
       If false returned from beforeShow event handler do not show. 
	   @param  input  element - the input field attached to the date picker or
	                  event - if triggered by focus */
	_showDatepicker: function(input) {
		input = input.target || input;
		if (input.nodeName.toLowerCase() != 'input') // find from button/image trigger
			input = $('input', input.parentNode)[0];
		if ($.datepicker._isDisabledDatepicker(input) || $.datepicker._lastInput == input) // already here
			return;
		var inst = $.datepicker._getInst(input);
		if ($.datepicker._curInst && $.datepicker._curInst != inst) {
			$.datepicker._curInst.dpDiv.stop(true, true);
			if ( inst && $.datepicker._datepickerShowing ) {
				$.datepicker._hideDatepicker( $.datepicker._curInst.input[0] );
			}
		}
		var beforeShow = $.datepicker._get(inst, 'beforeShow');
		var beforeShowSettings = beforeShow ? beforeShow.apply(input, [input, inst]) : {};
		if(beforeShowSettings === false){
            //false
			return;
		}
		extendRemove(inst.settings, beforeShowSettings);
		inst.lastVal = null;
		$.datepicker._lastInput = input;
		$.datepicker._setDateFromField(inst);
		if ($.datepicker._inDialog) // hide cursor
			input.value = '';
		if (!$.datepicker._pos) { // position below input
			$.datepicker._pos = $.datepicker._findPos(input);
			$.datepicker._pos[1] += input.offsetHeight; // add the height
		}
		var isFixed = false;
		$(input).parents().each(function() {
			isFixed |= $(this).css('position') == 'fixed';
			return !isFixed;
		});
		if (isFixed && $.browser.opera) { // correction for Opera when fixed and scrolled
			$.datepicker._pos[0] -= document.documentElement.scrollLeft;
			$.datepicker._pos[1] -= document.documentElement.scrollTop;
		}
		var offset = {left: $.datepicker._pos[0], top: $.datepicker._pos[1]};
		$.datepicker._pos = null;
		//to avoid flashes on Firefox
		inst.dpDiv.empty();
		// determine sizing offscreen
		inst.dpDiv.css({position: 'absolute', display: 'block', top: '-1000px'});
		$.datepicker._updateDatepicker(inst);
		// fix width for dynamic number of date pickers
		// and adjust position before showing
		offset = $.datepicker._checkOffset(inst, offset, isFixed);
		inst.dpDiv.css({position: ($.datepicker._inDialog && $.blockUI ?
			'static' : (isFixed ? 'fixed' : 'absolute')), display: 'none',
			left: offset.left + 'px', top: offset.top + 'px'});
		if (!inst.inline) {
			var showAnim = $.datepicker._get(inst, 'showAnim');
			var duration = $.datepicker._get(inst, 'duration');
			var postProcess = function() {
				var cover = inst.dpDiv.find('iframe.ui-datepicker-cover'); // IE6- only
				if( !! cover.length ){
					var borders = $.datepicker._getBorders(inst.dpDiv);
					cover.css({left: -borders[0], top: -borders[1],
						width: inst.dpDiv.outerWidth(), height: inst.dpDiv.outerHeight()});
				}
			};
			inst.dpDiv.zIndex($(input).zIndex()+1);
			$.datepicker._datepickerShowing = true;
			if ($.effects && $.effects[showAnim])
				inst.dpDiv.show(showAnim, $.datepicker._get(inst, 'showOptions'), duration, postProcess);
			else
				inst.dpDiv[showAnim || 'show']((showAnim ? duration : null), postProcess);
			if (!showAnim || !duration)
				postProcess();
			if (inst.input.is(':visible') && !inst.input.is(':disabled'))
				inst.input.focus();
			$.datepicker._curInst = inst;
		}
	},

	/* Generate the date picker content. */
	_updateDatepicker: function(inst) {
		var self = this;
		self.maxRows = 4; //Reset the max number of rows being displayed (see #7043)
		var borders = $.datepicker._getBorders(inst.dpDiv);
		instActive = inst; // for delegate hover events
		inst.dpDiv.empty().append(this._generateHTML(inst));
		var cover = inst.dpDiv.find('iframe.ui-datepicker-cover'); // IE6- only
		if( !!cover.length ){ //avoid call to outerXXXX() when not in IE6
			cover.css({left: -borders[0], top: -borders[1], width: inst.dpDiv.outerWidth(), height: inst.dpDiv.outerHeight()});
		}
		inst.dpDiv.find('.' + this._dayOverClass + ' a').mouseover();
		var numMonths = this._getNumberOfMonths(inst);
		var cols = numMonths[1];
		var width = 17;
		inst.dpDiv.removeClass('ui-datepicker-multi-2 ui-datepicker-multi-3 ui-datepicker-multi-4').width('');
		if (cols > 1)
			inst.dpDiv.addClass('ui-datepicker-multi-' + cols).css('width', (width * cols) + 'em');
		inst.dpDiv[(numMonths[0] != 1 || numMonths[1] != 1 ? 'add' : 'remove') +
			'Class']('ui-datepicker-multi');
		inst.dpDiv[(this._get(inst, 'isRTL') ? 'add' : 'remove') +
			'Class']('ui-datepicker-rtl');
		if (inst == $.datepicker._curInst && $.datepicker._datepickerShowing && inst.input &&
				// #6694 - don't focus the input if it's already focused
				// this breaks the change event in IE
				inst.input.is(':visible') && !inst.input.is(':disabled') && inst.input[0] != document.activeElement)
			inst.input.focus();
		// deffered render of the years select (to avoid flashes on Firefox) 
		if( inst.yearshtml ){
			var origyearshtml = inst.yearshtml;
			setTimeout(function(){
				//assure that inst.yearshtml didn't change.
				if( origyearshtml === inst.yearshtml && inst.yearshtml ){
					inst.dpDiv.find('select.ui-datepicker-year:first').replaceWith(inst.yearshtml);
				}
				origyearshtml = inst.yearshtml = null;
			}, 0);
		}
	},

	/* Retrieve the size of left and top borders for an element.
	   @param  elem  (jQuery object) the element of interest
	   @return  (number[2]) the left and top borders */
	_getBorders: function(elem) {
		var convert = function(value) {
			return {thin: 1, medium: 2, thick: 3}[value] || value;
		};
		return [parseFloat(convert(elem.css('border-left-width'))),
			parseFloat(convert(elem.css('border-top-width')))];
	},

	/* Check positioning to remain on screen. */
	_checkOffset: function(inst, offset, isFixed) {
		var dpWidth = inst.dpDiv.outerWidth();
		var dpHeight = inst.dpDiv.outerHeight();
		var inputWidth = inst.input ? inst.input.outerWidth() : 0;
		var inputHeight = inst.input ? inst.input.outerHeight() : 0;
		var viewWidth = document.documentElement.clientWidth + $(document).scrollLeft();
		var viewHeight = document.documentElement.clientHeight + $(document).scrollTop();

		offset.left -= (this._get(inst, 'isRTL') ? (dpWidth - inputWidth) : 0);
		offset.left -= (isFixed && offset.left == inst.input.offset().left) ? $(document).scrollLeft() : 0;
		offset.top -= (isFixed && offset.top == (inst.input.offset().top + inputHeight)) ? $(document).scrollTop() : 0;

		// now check if datepicker is showing outside window viewport - move to a better place if so.
		offset.left -= Math.min(offset.left, (offset.left + dpWidth > viewWidth && viewWidth > dpWidth) ?
			Math.abs(offset.left + dpWidth - viewWidth) : 0);
		offset.top -= Math.min(offset.top, (offset.top + dpHeight > viewHeight && viewHeight > dpHeight) ?
			Math.abs(dpHeight + inputHeight) : 0);

		return offset;
	},

	/* Find an object's position on the screen. */
	_findPos: function(obj) {
		var inst = this._getInst(obj);
		var isRTL = this._get(inst, 'isRTL');
        while (obj && (obj.type == 'hidden' || obj.nodeType != 1 || $.expr.filters.hidden(obj))) {
            obj = obj[isRTL ? 'previousSibling' : 'nextSibling'];
        }
        var position = $(obj).offset();
	    return [position.left, position.top];
	},

	/* Hide the date picker from view.
	   @param  input  element - the input field attached to the date picker */
	_hideDatepicker: function(input) {
		var inst = this._curInst;
		if (!inst || (input && inst != $.data(input, PROP_NAME)))
			return;
		if (this._datepickerShowing) {
			var showAnim = this._get(inst, 'showAnim');
			var duration = this._get(inst, 'duration');
			var self = this;
			var postProcess = function() {
				$.datepicker._tidyDialog(inst);
				self._curInst = null;
			};
			if ($.effects && $.effects[showAnim])
				inst.dpDiv.hide(showAnim, $.datepicker._get(inst, 'showOptions'), duration, postProcess);
			else
				inst.dpDiv[(showAnim == 'slideDown' ? 'slideUp' :
					(showAnim == 'fadeIn' ? 'fadeOut' : 'hide'))]((showAnim ? duration : null), postProcess);
			if (!showAnim)
				postProcess();
			this._datepickerShowing = false;
			var onClose = this._get(inst, 'onClose');
			if (onClose)
				onClose.apply((inst.input ? inst.input[0] : null),
					[(inst.input ? inst.input.val() : ''), inst]);
			this._lastInput = null;
			if (this._inDialog) {
				this._dialogInput.css({ position: 'absolute', left: '0', top: '-100px' });
				if ($.blockUI) {
					$.unblockUI();
					$('body').append(this.dpDiv);
				}
			}
			this._inDialog = false;
		}
	},

	/* Tidy up after a dialog display. */
	_tidyDialog: function(inst) {
		inst.dpDiv.removeClass(this._dialogClass).unbind('.ui-datepicker-calendar');
	},

	/* Close date picker if clicked elsewhere. */
	_checkExternalClick: function(event) {
		if (!$.datepicker._curInst)
			return;

		var $target = $(event.target),
			inst = $.datepicker._getInst($target[0]);

		if ( ( ( $target[0].id != $.datepicker._mainDivId &&
				$target.parents('#' + $.datepicker._mainDivId).length == 0 &&
				!$target.hasClass($.datepicker.markerClassName) &&
				!$target.closest("." + $.datepicker._triggerClass).length &&
				$.datepicker._datepickerShowing && !($.datepicker._inDialog && $.blockUI) ) ) ||
			( $target.hasClass($.datepicker.markerClassName) && $.datepicker._curInst != inst ) )
			$.datepicker._hideDatepicker();
	},

	/* Adjust one of the date sub-fields. */
	_adjustDate: function(id, offset, period) {
		var target = $(id);
		var inst = this._getInst(target[0]);
		if (this._isDisabledDatepicker(target[0])) {
			return;
		}
		this._adjustInstDate(inst, offset +
			(period == 'M' ? this._get(inst, 'showCurrentAtPos') : 0), // undo positioning
			period);
		this._updateDatepicker(inst);
	},

	/* Action for current link. */
	_gotoToday: function(id) {
		var target = $(id);
		var inst = this._getInst(target[0]);
		if (this._get(inst, 'gotoCurrent') && inst.currentDay) {
			inst.selectedDay = inst.currentDay;
			inst.drawMonth = inst.selectedMonth = inst.currentMonth;
			inst.drawYear = inst.selectedYear = inst.currentYear;
		}
		else {
			var date = new Date();
			inst.selectedDay = date.getDate();
			inst.drawMonth = inst.selectedMonth = date.getMonth();
			inst.drawYear = inst.selectedYear = date.getFullYear();
		}
		this._notifyChange(inst);
		this._adjustDate(target);
	},

	/* Action for selecting a new month/year. */
	_selectMonthYear: function(id, select, period) {
		var target = $(id);
		var inst = this._getInst(target[0]);
		inst['selected' + (period == 'M' ? 'Month' : 'Year')] =
		inst['draw' + (period == 'M' ? 'Month' : 'Year')] =
			parseInt(select.options[select.selectedIndex].value,10);
		this._notifyChange(inst);
		this._adjustDate(target);
	},

	/* Action for selecting a day. */
	_selectDay: function(id, month, year, td) {
		var target = $(id);
		if ($(td).hasClass(this._unselectableClass) || this._isDisabledDatepicker(target[0])) {
			return;
		}
		var inst = this._getInst(target[0]);
		inst.selectedDay = inst.currentDay = $('a', td).html();
		inst.selectedMonth = inst.currentMonth = month;
		inst.selectedYear = inst.currentYear = year;
		this._selectDate(id, this._formatDate(inst,
			inst.currentDay, inst.currentMonth, inst.currentYear));
	},

	/* Erase the input field and hide the date picker. */
	_clearDate: function(id) {
		var target = $(id);
		var inst = this._getInst(target[0]);
		this._selectDate(target, '');
	},

	/* Update the input field with the selected date. */
	_selectDate: function(id, dateStr) {
		var target = $(id);
		var inst = this._getInst(target[0]);
		dateStr = (dateStr != null ? dateStr : this._formatDate(inst));
		if (inst.input)
			inst.input.val(dateStr);
		this._updateAlternate(inst);
		var onSelect = this._get(inst, 'onSelect');
		if (onSelect)
			onSelect.apply((inst.input ? inst.input[0] : null), [dateStr, inst]);  // trigger custom callback
		else if (inst.input)
			inst.input.trigger('change'); // fire the change event
		if (inst.inline)
			this._updateDatepicker(inst);
		else {
			this._hideDatepicker();
			this._lastInput = inst.input[0];
			if (typeof(inst.input[0]) != 'object')
				inst.input.focus(); // restore focus
			this._lastInput = null;
		}
	},

	/* Update any alternate field to synchronise with the main field. */
	_updateAlternate: function(inst) {
		var altField = this._get(inst, 'altField');
		if (altField) { // update alternate field too
			var altFormat = this._get(inst, 'altFormat') || this._get(inst, 'dateFormat');
			var date = this._getDate(inst);
			var dateStr = this.formatDate(altFormat, date, this._getFormatConfig(inst));
			$(altField).each(function() { $(this).val(dateStr); });
		}
	},

	/* Set as beforeShowDay function to prevent selection of weekends.
	   @param  date  Date - the date to customise
	   @return [boolean, string] - is this date selectable?, what is its CSS class? */
	noWeekends: function(date) {
		var day = date.getDay();
		return [(day > 0 && day < 6), ''];
	},

	/* Set as calculateWeek to determine the week of the year based on the ISO 8601 definition.
	   @param  date  Date - the date to get the week for
	   @return  number - the number of the week within the year that contains this date */
	iso8601Week: function(date) {
		var checkDate = new Date(date.getTime());
		// Find Thursday of this week starting on Monday
		checkDate.setDate(checkDate.getDate() + 4 - (checkDate.getDay() || 7));
		var time = checkDate.getTime();
		checkDate.setMonth(0); // Compare with Jan 1
		checkDate.setDate(1);
		return Math.floor(Math.round((time - checkDate) / 86400000) / 7) + 1;
	},

	/* Parse a string value into a date object.
	   See formatDate below for the possible formats.

	   @param  format    string - the expected format of the date
	   @param  value     string - the date in the above format
	   @param  settings  Object - attributes include:
	                     shortYearCutoff  number - the cutoff year for determining the century (optional)
	                     dayNamesShort    string[7] - abbreviated names of the days from Sunday (optional)
	                     dayNames         string[7] - names of the days from Sunday (optional)
	                     monthNamesShort  string[12] - abbreviated names of the months (optional)
	                     monthNames       string[12] - names of the months (optional)
	   @return  Date - the extracted date value or null if value is blank */
	parseDate: function (format, value, settings) {
		if (format == null || value == null)
			throw 'Invalid arguments';
		value = (typeof value == 'object' ? value.toString() : value + '');
		if (value == '')
			return null;
		var shortYearCutoff = (settings ? settings.shortYearCutoff : null) || this._defaults.shortYearCutoff;
		shortYearCutoff = (typeof shortYearCutoff != 'string' ? shortYearCutoff :
				new Date().getFullYear() % 100 + parseInt(shortYearCutoff, 10));
		var dayNamesShort = (settings ? settings.dayNamesShort : null) || this._defaults.dayNamesShort;
		var dayNames = (settings ? settings.dayNames : null) || this._defaults.dayNames;
		var monthNamesShort = (settings ? settings.monthNamesShort : null) || this._defaults.monthNamesShort;
		var monthNames = (settings ? settings.monthNames : null) || this._defaults.monthNames;
		var year = -1;
		var month = -1;
		var day = -1;
		var doy = -1;
		var literal = false;
		// Check whether a format character is doubled
		var lookAhead = function(match) {
			var matches = (iFormat + 1 < format.length && format.charAt(iFormat + 1) == match);
			if (matches)
				iFormat++;
			return matches;
		};
		// Extract a number from the string value
		var getNumber = function(match) {
			var isDoubled = lookAhead(match);
			var size = (match == '@' ? 14 : (match == '!' ? 20 :
				(match == 'y' && isDoubled ? 4 : (match == 'o' ? 3 : 2))));
			var digits = new RegExp('^\\d{1,' + size + '}');
			var num = value.substring(iValue).match(digits);
			if (!num)
				throw 'Missing number at position ' + iValue;
			iValue += num[0].length;
			return parseInt(num[0], 10);
		};
		// Extract a name from the string value and convert to an index
		var getName = function(match, shortNames, longNames) {
			var names = $.map(lookAhead(match) ? longNames : shortNames, function (v, k) {
				return [ [k, v] ];
			}).sort(function (a, b) {
				return -(a[1].length - b[1].length);
			});
			var index = -1;
			$.each(names, function (i, pair) {
				var name = pair[1];
				if (value.substr(iValue, name.length).toLowerCase() == name.toLowerCase()) {
					index = pair[0];
					iValue += name.length;
					return false;
				}
			});
			if (index != -1)
				return index + 1;
			else
				throw 'Unknown name at position ' + iValue;
		};
		// Confirm that a literal character matches the string value
		var checkLiteral = function() {
			if (value.charAt(iValue) != format.charAt(iFormat))
				throw 'Unexpected literal at position ' + iValue;
			iValue++;
		};
		var iValue = 0;
		for (var iFormat = 0; iFormat < format.length; iFormat++) {
			if (literal)
				if (format.charAt(iFormat) == "'" && !lookAhead("'"))
					literal = false;
				else
					checkLiteral();
			else
				switch (format.charAt(iFormat)) {
					case 'd':
						day = getNumber('d');
						break;
					case 'D':
						getName('D', dayNamesShort, dayNames);
						break;
					case 'o':
						doy = getNumber('o');
						break;
					case 'm':
						month = getNumber('m');
						break;
					case 'M':
						month = getName('M', monthNamesShort, monthNames);
						break;
					case 'y':
						year = getNumber('y');
						break;
					case '@':
						var date = new Date(getNumber('@'));
						year = date.getFullYear();
						month = date.getMonth() + 1;
						day = date.getDate();
						break;
					case '!':
						var date = new Date((getNumber('!') - this._ticksTo1970) / 10000);
						year = date.getFullYear();
						month = date.getMonth() + 1;
						day = date.getDate();
						break;
					case "'":
						if (lookAhead("'"))
							checkLiteral();
						else
							literal = true;
						break;
					default:
						checkLiteral();
				}
		}
		if (iValue < value.length){
			throw "Extra/unparsed characters found in date: " + value.substring(iValue);
		}
		if (year == -1)
			year = new Date().getFullYear();
		else if (year < 100)
			year += new Date().getFullYear() - new Date().getFullYear() % 100 +
				(year <= shortYearCutoff ? 0 : -100);
		if (doy > -1) {
			month = 1;
			day = doy;
			do {
				var dim = this._getDaysInMonth(year, month - 1);
				if (day <= dim)
					break;
				month++;
				day -= dim;
			} while (true);
		}
		var date = this._daylightSavingAdjust(new Date(year, month - 1, day));
		if (date.getFullYear() != year || date.getMonth() + 1 != month || date.getDate() != day)
			throw 'Invalid date'; // E.g. 31/02/00
		return date;
	},

	/* Standard date formats. */
	ATOM: 'yy-mm-dd', // RFC 3339 (ISO 8601)
	COOKIE: 'D, dd M yy',
	ISO_8601: 'yy-mm-dd',
	RFC_822: 'D, d M y',
	RFC_850: 'DD, dd-M-y',
	RFC_1036: 'D, d M y',
	RFC_1123: 'D, d M yy',
	RFC_2822: 'D, d M yy',
	RSS: 'D, d M y', // RFC 822
	TICKS: '!',
	TIMESTAMP: '@',
	W3C: 'yy-mm-dd', // ISO 8601

	_ticksTo1970: (((1970 - 1) * 365 + Math.floor(1970 / 4) - Math.floor(1970 / 100) +
		Math.floor(1970 / 400)) * 24 * 60 * 60 * 10000000),

	/* Format a date object into a string value.
	   The format can be combinations of the following:
	   d  - day of month (no leading zero)
	   dd - day of month (two digit)
	   o  - day of year (no leading zeros)
	   oo - day of year (three digit)
	   D  - day name short
	   DD - day name long
	   m  - month of year (no leading zero)
	   mm - month of year (two digit)
	   M  - month name short
	   MM - month name long
	   y  - year (two digit)
	   yy - year (four digit)
	   @ - Unix timestamp (ms since 01/01/1970)
	   ! - Windows ticks (100ns since 01/01/0001)
	   '...' - literal text
	   '' - single quote

	   @param  format    string - the desired format of the date
	   @param  date      Date - the date value to format
	   @param  settings  Object - attributes include:
	                     dayNamesShort    string[7] - abbreviated names of the days from Sunday (optional)
	                     dayNames         string[7] - names of the days from Sunday (optional)
	                     monthNamesShort  string[12] - abbreviated names of the months (optional)
	                     monthNames       string[12] - names of the months (optional)
	   @return  string - the date in the above format */
	formatDate: function (format, date, settings) {
		if (!date)
			return '';
		var dayNamesShort = (settings ? settings.dayNamesShort : null) || this._defaults.dayNamesShort;
		var dayNames = (settings ? settings.dayNames : null) || this._defaults.dayNames;
		var monthNamesShort = (settings ? settings.monthNamesShort : null) || this._defaults.monthNamesShort;
		var monthNames = (settings ? settings.monthNames : null) || this._defaults.monthNames;
		// Check whether a format character is doubled
		var lookAhead = function(match) {
			var matches = (iFormat + 1 < format.length && format.charAt(iFormat + 1) == match);
			if (matches)
				iFormat++;
			return matches;
		};
		// Format a number, with leading zero if necessary
		var formatNumber = function(match, value, len) {
			var num = '' + value;
			if (lookAhead(match))
				while (num.length < len)
					num = '0' + num;
			return num;
		};
		// Format a name, short or long as requested
		var formatName = function(match, value, shortNames, longNames) {
			return (lookAhead(match) ? longNames[value] : shortNames[value]);
		};
		var output = '';
		var literal = false;
		if (date)
			for (var iFormat = 0; iFormat < format.length; iFormat++) {
				if (literal)
					if (format.charAt(iFormat) == "'" && !lookAhead("'"))
						literal = false;
					else
						output += format.charAt(iFormat);
				else
					switch (format.charAt(iFormat)) {
						case 'd':
							output += formatNumber('d', date.getDate(), 2);
							break;
						case 'D':
							output += formatName('D', date.getDay(), dayNamesShort, dayNames);
							break;
						case 'o':
							output += formatNumber('o',
								Math.round((new Date(date.getFullYear(), date.getMonth(), date.getDate()).getTime() - new Date(date.getFullYear(), 0, 0).getTime()) / 86400000), 3);
							break;
						case 'm':
							output += formatNumber('m', date.getMonth() + 1, 2);
							break;
						case 'M':
							output += formatName('M', date.getMonth(), monthNamesShort, monthNames);
							break;
						case 'y':
							output += (lookAhead('y') ? date.getFullYear() :
								(date.getYear() % 100 < 10 ? '0' : '') + date.getYear() % 100);
							break;
						case '@':
							output += date.getTime();
							break;
						case '!':
							output += date.getTime() * 10000 + this._ticksTo1970;
							break;
						case "'":
							if (lookAhead("'"))
								output += "'";
							else
								literal = true;
							break;
						default:
							output += format.charAt(iFormat);
					}
			}
		return output;
	},

	/* Extract all possible characters from the date format. */
	_possibleChars: function (format) {
		var chars = '';
		var literal = false;
		// Check whether a format character is doubled
		var lookAhead = function(match) {
			var matches = (iFormat + 1 < format.length && format.charAt(iFormat + 1) == match);
			if (matches)
				iFormat++;
			return matches;
		};
		for (var iFormat = 0; iFormat < format.length; iFormat++)
			if (literal)
				if (format.charAt(iFormat) == "'" && !lookAhead("'"))
					literal = false;
				else
					chars += format.charAt(iFormat);
			else
				switch (format.charAt(iFormat)) {
					case 'd': case 'm': case 'y': case '@':
						chars += '0123456789';
						break;
					case 'D': case 'M':
						return null; // Accept anything
					case "'":
						if (lookAhead("'"))
							chars += "'";
						else
							literal = true;
						break;
					default:
						chars += format.charAt(iFormat);
				}
		return chars;
	},

	/* Get a setting value, defaulting if necessary. */
	_get: function(inst, name) {
		return inst.settings[name] !== undefined ?
			inst.settings[name] : this._defaults[name];
	},

	/* Parse existing date and initialise date picker. */
	_setDateFromField: function(inst, noDefault) {
		if (inst.input.val() == inst.lastVal) {
			return;
		}
		var dateFormat = this._get(inst, 'dateFormat');
		var dates = inst.lastVal = inst.input ? inst.input.val() : null;
		var date, defaultDate;
		date = defaultDate = this._getDefaultDate(inst);
		var settings = this._getFormatConfig(inst);
		try {
			date = this.parseDate(dateFormat, dates, settings) || defaultDate;
		} catch (event) {
			this.log(event);
			dates = (noDefault ? '' : dates);
		}
		inst.selectedDay = date.getDate();
		inst.drawMonth = inst.selectedMonth = date.getMonth();
		inst.drawYear = inst.selectedYear = date.getFullYear();
		inst.currentDay = (dates ? date.getDate() : 0);
		inst.currentMonth = (dates ? date.getMonth() : 0);
		inst.currentYear = (dates ? date.getFullYear() : 0);
		this._adjustInstDate(inst);
	},

	/* Retrieve the default date shown on opening. */
	_getDefaultDate: function(inst) {
		return this._restrictMinMax(inst,
			this._determineDate(inst, this._get(inst, 'defaultDate'), new Date()));
	},

	/* A date may be specified as an exact value or a relative one. */
	_determineDate: function(inst, date, defaultDate) {
		var offsetNumeric = function(offset) {
			var date = new Date();
			date.setDate(date.getDate() + offset);
			return date;
		};
		var offsetString = function(offset) {
			try {
				return $.datepicker.parseDate($.datepicker._get(inst, 'dateFormat'),
					offset, $.datepicker._getFormatConfig(inst));
			}
			catch (e) {
				// Ignore
			}
			var date = (offset.toLowerCase().match(/^c/) ?
				$.datepicker._getDate(inst) : null) || new Date();
			var year = date.getFullYear();
			var month = date.getMonth();
			var day = date.getDate();
			var pattern = /([+-]?[0-9]+)\s*(d|D|w|W|m|M|y|Y)?/g;
			var matches = pattern.exec(offset);
			while (matches) {
				switch (matches[2] || 'd') {
					case 'd' : case 'D' :
						day += parseInt(matches[1],10); break;
					case 'w' : case 'W' :
						day += parseInt(matches[1],10) * 7; break;
					case 'm' : case 'M' :
						month += parseInt(matches[1],10);
						day = Math.min(day, $.datepicker._getDaysInMonth(year, month));
						break;
					case 'y': case 'Y' :
						year += parseInt(matches[1],10);
						day = Math.min(day, $.datepicker._getDaysInMonth(year, month));
						break;
				}
				matches = pattern.exec(offset);
			}
			return new Date(year, month, day);
		};
		var newDate = (date == null || date === '' ? defaultDate : (typeof date == 'string' ? offsetString(date) :
			(typeof date == 'number' ? (isNaN(date) ? defaultDate : offsetNumeric(date)) : new Date(date.getTime()))));
		newDate = (newDate && newDate.toString() == 'Invalid Date' ? defaultDate : newDate);
		if (newDate) {
			newDate.setHours(0);
			newDate.setMinutes(0);
			newDate.setSeconds(0);
			newDate.setMilliseconds(0);
		}
		return this._daylightSavingAdjust(newDate);
	},

	/* Handle switch to/from daylight saving.
	   Hours may be non-zero on daylight saving cut-over:
	   > 12 when midnight changeover, but then cannot generate
	   midnight datetime, so jump to 1AM, otherwise reset.
	   @param  date  (Date) the date to check
	   @return  (Date) the corrected date */
	_daylightSavingAdjust: function(date) {
		if (!date) return null;
		date.setHours(date.getHours() > 12 ? date.getHours() + 2 : 0);
		return date;
	},

	/* Set the date(s) directly. */
	_setDate: function(inst, date, noChange) {
		var clear = !date;
		var origMonth = inst.selectedMonth;
		var origYear = inst.selectedYear;
		var newDate = this._restrictMinMax(inst, this._determineDate(inst, date, new Date()));
		inst.selectedDay = inst.currentDay = newDate.getDate();
		inst.drawMonth = inst.selectedMonth = inst.currentMonth = newDate.getMonth();
		inst.drawYear = inst.selectedYear = inst.currentYear = newDate.getFullYear();
		if ((origMonth != inst.selectedMonth || origYear != inst.selectedYear) && !noChange)
			this._notifyChange(inst);
		this._adjustInstDate(inst);
		if (inst.input) {
			inst.input.val(clear ? '' : this._formatDate(inst));
		}
	},

	/* Retrieve the date(s) directly. */
	_getDate: function(inst) {
		var startDate = (!inst.currentYear || (inst.input && inst.input.val() == '') ? null :
			this._daylightSavingAdjust(new Date(
			inst.currentYear, inst.currentMonth, inst.currentDay)));
			return startDate;
	},

	/* Generate the HTML for the current state of the date picker. */
	_generateHTML: function(inst) {
		var today = new Date();
		today = this._daylightSavingAdjust(
			new Date(today.getFullYear(), today.getMonth(), today.getDate())); // clear time
		var isRTL = this._get(inst, 'isRTL');
		var showButtonPanel = this._get(inst, 'showButtonPanel');
		var hideIfNoPrevNext = this._get(inst, 'hideIfNoPrevNext');
		var navigationAsDateFormat = this._get(inst, 'navigationAsDateFormat');
		var numMonths = this._getNumberOfMonths(inst);
		var showCurrentAtPos = this._get(inst, 'showCurrentAtPos');
		var stepMonths = this._get(inst, 'stepMonths');
		var isMultiMonth = (numMonths[0] != 1 || numMonths[1] != 1);
		var currentDate = this._daylightSavingAdjust((!inst.currentDay ? new Date(9999, 9, 9) :
			new Date(inst.currentYear, inst.currentMonth, inst.currentDay)));
		var minDate = this._getMinMaxDate(inst, 'min');
		var maxDate = this._getMinMaxDate(inst, 'max');
		var drawMonth = inst.drawMonth - showCurrentAtPos;
		var drawYear = inst.drawYear;
		if (drawMonth < 0) {
			drawMonth += 12;
			drawYear--;
		}
		if (maxDate) {
			var maxDraw = this._daylightSavingAdjust(new Date(maxDate.getFullYear(),
				maxDate.getMonth() - (numMonths[0] * numMonths[1]) + 1, maxDate.getDate()));
			maxDraw = (minDate && maxDraw < minDate ? minDate : maxDraw);
			while (this._daylightSavingAdjust(new Date(drawYear, drawMonth, 1)) > maxDraw) {
				drawMonth--;
				if (drawMonth < 0) {
					drawMonth = 11;
					drawYear--;
				}
			}
		}
		inst.drawMonth = drawMonth;
		inst.drawYear = drawYear;
		var prevText = this._get(inst, 'prevText');
		prevText = (!navigationAsDateFormat ? prevText : this.formatDate(prevText,
			this._daylightSavingAdjust(new Date(drawYear, drawMonth - stepMonths, 1)),
			this._getFormatConfig(inst)));
		var prev = (this._canAdjustMonth(inst, -1, drawYear, drawMonth) ?
			'<a class="ui-datepicker-prev ui-corner-all" onclick="DP_jQuery_' + dpuuid +
			'.datepicker._adjustDate(\'#' + inst.id + '\', -' + stepMonths + ', \'M\');"' +
			' title="' + prevText + '"><span class="ui-icon ui-icon-circle-triangle-' + ( isRTL ? 'e' : 'w') + '">' + prevText + '</span></a>' :
			(hideIfNoPrevNext ? '' : '<a class="ui-datepicker-prev ui-corner-all ui-state-disabled" title="'+ prevText +'"><span class="ui-icon ui-icon-circle-triangle-' + ( isRTL ? 'e' : 'w') + '">' + prevText + '</span></a>'));
		var nextText = this._get(inst, 'nextText');
		nextText = (!navigationAsDateFormat ? nextText : this.formatDate(nextText,
			this._daylightSavingAdjust(new Date(drawYear, drawMonth + stepMonths, 1)),
			this._getFormatConfig(inst)));
		var next = (this._canAdjustMonth(inst, +1, drawYear, drawMonth) ?
			'<a class="ui-datepicker-next ui-corner-all" onclick="DP_jQuery_' + dpuuid +
			'.datepicker._adjustDate(\'#' + inst.id + '\', +' + stepMonths + ', \'M\');"' +
			' title="' + nextText + '"><span class="ui-icon ui-icon-circle-triangle-' + ( isRTL ? 'w' : 'e') + '">' + nextText + '</span></a>' :
			(hideIfNoPrevNext ? '' : '<a class="ui-datepicker-next ui-corner-all ui-state-disabled" title="'+ nextText + '"><span class="ui-icon ui-icon-circle-triangle-' + ( isRTL ? 'w' : 'e') + '">' + nextText + '</span></a>'));
		var currentText = this._get(inst, 'currentText');
		var gotoDate = (this._get(inst, 'gotoCurrent') && inst.currentDay ? currentDate : today);
		currentText = (!navigationAsDateFormat ? currentText :
			this.formatDate(currentText, gotoDate, this._getFormatConfig(inst)));
		var controls = (!inst.inline ? '<button type="button" class="ui-datepicker-close ui-state-default ui-priority-primary ui-corner-all" onclick="DP_jQuery_' + dpuuid +
			'.datepicker._hideDatepicker();">' + this._get(inst, 'closeText') + '</button>' : '');
		var buttonPanel = (showButtonPanel) ? '<div class="ui-datepicker-buttonpane ui-widget-content">' + (isRTL ? controls : '') +
			(this._isInRange(inst, gotoDate) ? '<button type="button" class="ui-datepicker-current ui-state-default ui-priority-secondary ui-corner-all" onclick="DP_jQuery_' + dpuuid +
			'.datepicker._gotoToday(\'#' + inst.id + '\');"' +
			'>' + currentText + '</button>' : '') + (isRTL ? '' : controls) + '</div>' : '';
		var firstDay = parseInt(this._get(inst, 'firstDay'),10);
		firstDay = (isNaN(firstDay) ? 0 : firstDay);
		var showWeek = this._get(inst, 'showWeek');
		var dayNames = this._get(inst, 'dayNames');
		var dayNamesShort = this._get(inst, 'dayNamesShort');
		var dayNamesMin = this._get(inst, 'dayNamesMin');
		var monthNames = this._get(inst, 'monthNames');
		var monthNamesShort = this._get(inst, 'monthNamesShort');
		var beforeShowDay = this._get(inst, 'beforeShowDay');
		var showOtherMonths = this._get(inst, 'showOtherMonths');
		var selectOtherMonths = this._get(inst, 'selectOtherMonths');
		var calculateWeek = this._get(inst, 'calculateWeek') || this.iso8601Week;
		var defaultDate = this._getDefaultDate(inst);
		var html = '';
		for (var row = 0; row < numMonths[0]; row++) {
			var group = '';
			this.maxRows = 4;
			for (var col = 0; col < numMonths[1]; col++) {
				var selectedDate = this._daylightSavingAdjust(new Date(drawYear, drawMonth, inst.selectedDay));
				var cornerClass = ' ui-corner-all';
				var calender = '';
				if (isMultiMonth) {
					calender += '<div class="ui-datepicker-group';
					if (numMonths[1] > 1)
						switch (col) {
							case 0: calender += ' ui-datepicker-group-first';
								cornerClass = ' ui-corner-' + (isRTL ? 'right' : 'left'); break;
							case numMonths[1]-1: calender += ' ui-datepicker-group-last';
								cornerClass = ' ui-corner-' + (isRTL ? 'left' : 'right'); break;
							default: calender += ' ui-datepicker-group-middle'; cornerClass = ''; break;
						}
					calender += '">';
				}
				calender += '<div class="ui-datepicker-header ui-widget-header ui-helper-clearfix' + cornerClass + '">' +
					(/all|left/.test(cornerClass) && row == 0 ? (isRTL ? next : prev) : '') +
					(/all|right/.test(cornerClass) && row == 0 ? (isRTL ? prev : next) : '') +
					this._generateMonthYearHeader(inst, drawMonth, drawYear, minDate, maxDate,
					row > 0 || col > 0, monthNames, monthNamesShort) + // draw month headers
					'</div><table class="ui-datepicker-calendar"><thead>' +
					'<tr>';
				var thead = (showWeek ? '<th class="ui-datepicker-week-col">' + this._get(inst, 'weekHeader') + '</th>' : '');
				for (var dow = 0; dow < 7; dow++) { // days of the week
					var day = (dow + firstDay) % 7;
					thead += '<th' + ((dow + firstDay + 6) % 7 >= 5 ? ' class="ui-datepicker-week-end"' : '') + '>' +
						'<span title="' + dayNames[day] + '">' + dayNamesMin[day] + '</span></th>';
				}
				calender += thead + '</tr></thead><tbody>';
				var daysInMonth = this._getDaysInMonth(drawYear, drawMonth);
				if (drawYear == inst.selectedYear && drawMonth == inst.selectedMonth)
					inst.selectedDay = Math.min(inst.selectedDay, daysInMonth);
				var leadDays = (this._getFirstDayOfMonth(drawYear, drawMonth) - firstDay + 7) % 7;
				var curRows = Math.ceil((leadDays + daysInMonth) / 7); // calculate the number of rows to generate
				var numRows = (isMultiMonth ? this.maxRows > curRows ? this.maxRows : curRows : curRows); //If multiple months, use the higher number of rows (see #7043)
				this.maxRows = numRows;
				var printDate = this._daylightSavingAdjust(new Date(drawYear, drawMonth, 1 - leadDays));
				for (var dRow = 0; dRow < numRows; dRow++) { // create date picker rows
					calender += '<tr>';
					var tbody = (!showWeek ? '' : '<td class="ui-datepicker-week-col">' +
						this._get(inst, 'calculateWeek')(printDate) + '</td>');
					for (var dow = 0; dow < 7; dow++) { // create date picker days
						var daySettings = (beforeShowDay ?
							beforeShowDay.apply((inst.input ? inst.input[0] : null), [printDate]) : [true, '']);
						var otherMonth = (printDate.getMonth() != drawMonth);
						var unselectable = (otherMonth && !selectOtherMonths) || !daySettings[0] ||
							(minDate && printDate < minDate) || (maxDate && printDate > maxDate);
						tbody += '<td class="' +
							((dow + firstDay + 6) % 7 >= 5 ? ' ui-datepicker-week-end' : '') + // highlight weekends
							(otherMonth ? ' ui-datepicker-other-month' : '') + // highlight days from other months
							((printDate.getTime() == selectedDate.getTime() && drawMonth == inst.selectedMonth && inst._keyEvent) || // user pressed key
							(defaultDate.getTime() == printDate.getTime() && defaultDate.getTime() == selectedDate.getTime()) ?
							// or defaultDate is current printedDate and defaultDate is selectedDate
							' ' + this._dayOverClass : '') + // highlight selected day
							(unselectable ? ' ' + this._unselectableClass + ' ui-state-disabled': '') +  // highlight unselectable days
							(otherMonth && !showOtherMonths ? '' : ' ' + daySettings[1] + // highlight custom dates
							(printDate.getTime() == currentDate.getTime() ? ' ' + this._currentClass : '') + // highlight selected day
							(printDate.getTime() == today.getTime() ? ' ui-datepicker-today' : '')) + '"' + // highlight today (if different)
							((!otherMonth || showOtherMonths) && daySettings[2] ? ' title="' + daySettings[2] + '"' : '') + // cell title
							(unselectable ? '' : ' onclick="DP_jQuery_' + dpuuid + '.datepicker._selectDay(\'#' +
							inst.id + '\',' + printDate.getMonth() + ',' + printDate.getFullYear() + ', this);return false;"') + '>' + // actions
							(otherMonth && !showOtherMonths ? '&#xa0;' : // display for other months
							(unselectable ? '<span class="ui-state-default">' + printDate.getDate() + '</span>' : '<a class="ui-state-default' +
							(printDate.getTime() == today.getTime() ? ' ui-state-highlight' : '') +
							(printDate.getTime() == currentDate.getTime() ? ' ui-state-active' : '') + // highlight selected day
							(otherMonth ? ' ui-priority-secondary' : '') + // distinguish dates from other months
							'" href="#">' + printDate.getDate() + '</a>')) + '</td>'; // display selectable date
						printDate.setDate(printDate.getDate() + 1);
						printDate = this._daylightSavingAdjust(printDate);
					}
					calender += tbody + '</tr>';
				}
				drawMonth++;
				if (drawMonth > 11) {
					drawMonth = 0;
					drawYear++;
				}
				calender += '</tbody></table>' + (isMultiMonth ? '</div>' + 
							((numMonths[0] > 0 && col == numMonths[1]-1) ? '<div class="ui-datepicker-row-break"></div>' : '') : '');
				group += calender;
			}
			html += group;
		}
		html += buttonPanel + ($.browser.msie && parseInt($.browser.version,10) < 7 && !inst.inline ?
			'<iframe src="javascript:false;" class="ui-datepicker-cover" frameborder="0"></iframe>' : '');
		inst._keyEvent = false;
		return html;
	},

	/* Generate the month and year header. */
	_generateMonthYearHeader: function(inst, drawMonth, drawYear, minDate, maxDate,
			secondary, monthNames, monthNamesShort) {
		var changeMonth = this._get(inst, 'changeMonth');
		var changeYear = this._get(inst, 'changeYear');
		var showMonthAfterYear = this._get(inst, 'showMonthAfterYear');
		var html = '<div class="ui-datepicker-title">';
		var monthHtml = '';
		// month selection
		if (secondary || !changeMonth)
			monthHtml += '<span class="ui-datepicker-month">' + monthNames[drawMonth] + '</span>';
		else {
			var inMinYear = (minDate && minDate.getFullYear() == drawYear);
			var inMaxYear = (maxDate && maxDate.getFullYear() == drawYear);
			monthHtml += '<select class="ui-datepicker-month" ' +
				'onchange="DP_jQuery_' + dpuuid + '.datepicker._selectMonthYear(\'#' + inst.id + '\', this, \'M\');" ' +
			 	'>';
			for (var month = 0; month < 12; month++) {
				if ((!inMinYear || month >= minDate.getMonth()) &&
						(!inMaxYear || month <= maxDate.getMonth()))
					monthHtml += '<option value="' + month + '"' +
						(month == drawMonth ? ' selected="selected"' : '') +
						'>' + monthNamesShort[month] + '</option>';
			}
			monthHtml += '</select>';
		}
		if (!showMonthAfterYear)
			html += monthHtml + (secondary || !(changeMonth && changeYear) ? '&#xa0;' : '');
		// year selection
		if ( !inst.yearshtml ) {
			inst.yearshtml = '';
			if (secondary || !changeYear)
				html += '<span class="ui-datepicker-year">' + drawYear + '</span>';
			else {
				// determine range of years to display
				var years = this._get(inst, 'yearRange').split(':');
				var thisYear = new Date().getFullYear();
				var determineYear = function(value) {
					var year = (value.match(/c[+-].*/) ? drawYear + parseInt(value.substring(1), 10) :
						(value.match(/[+-].*/) ? thisYear + parseInt(value, 10) :
						parseInt(value, 10)));
					return (isNaN(year) ? thisYear : year);
				};
				var year = determineYear(years[0]);
				var endYear = Math.max(year, determineYear(years[1] || ''));
				year = (minDate ? Math.max(year, minDate.getFullYear()) : year);
				endYear = (maxDate ? Math.min(endYear, maxDate.getFullYear()) : endYear);
				inst.yearshtml += '<select class="ui-datepicker-year" ' +
					'onchange="DP_jQuery_' + dpuuid + '.datepicker._selectMonthYear(\'#' + inst.id + '\', this, \'Y\');" ' +
					'>';
				for (; year <= endYear; year++) {
					inst.yearshtml += '<option value="' + year + '"' +
						(year == drawYear ? ' selected="selected"' : '') +
						'>' + year + '</option>';
				}
				inst.yearshtml += '</select>';
				
				html += inst.yearshtml;
				inst.yearshtml = null;
			}
		}
		html += this._get(inst, 'yearSuffix');
		if (showMonthAfterYear)
			html += (secondary || !(changeMonth && changeYear) ? '&#xa0;' : '') + monthHtml;
		html += '</div>'; // Close datepicker_header
		return html;
	},

	/* Adjust one of the date sub-fields. */
	_adjustInstDate: function(inst, offset, period) {
		var year = inst.drawYear + (period == 'Y' ? offset : 0);
		var month = inst.drawMonth + (period == 'M' ? offset : 0);
		var day = Math.min(inst.selectedDay, this._getDaysInMonth(year, month)) +
			(period == 'D' ? offset : 0);
		var date = this._restrictMinMax(inst,
			this._daylightSavingAdjust(new Date(year, month, day)));
		inst.selectedDay = date.getDate();
		inst.drawMonth = inst.selectedMonth = date.getMonth();
		inst.drawYear = inst.selectedYear = date.getFullYear();
		if (period == 'M' || period == 'Y')
			this._notifyChange(inst);
	},

	/* Ensure a date is within any min/max bounds. */
	_restrictMinMax: function(inst, date) {
		var minDate = this._getMinMaxDate(inst, 'min');
		var maxDate = this._getMinMaxDate(inst, 'max');
		var newDate = (minDate && date < minDate ? minDate : date);
		newDate = (maxDate && newDate > maxDate ? maxDate : newDate);
		return newDate;
	},

	/* Notify change of month/year. */
	_notifyChange: function(inst) {
		var onChange = this._get(inst, 'onChangeMonthYear');
		if (onChange)
			onChange.apply((inst.input ? inst.input[0] : null),
				[inst.selectedYear, inst.selectedMonth + 1, inst]);
	},

	/* Determine the number of months to show. */
	_getNumberOfMonths: function(inst) {
		var numMonths = this._get(inst, 'numberOfMonths');
		return (numMonths == null ? [1, 1] : (typeof numMonths == 'number' ? [1, numMonths] : numMonths));
	},

	/* Determine the current maximum date - ensure no time components are set. */
	_getMinMaxDate: function(inst, minMax) {
		return this._determineDate(inst, this._get(inst, minMax + 'Date'), null);
	},

	/* Find the number of days in a given month. */
	_getDaysInMonth: function(year, month) {
		return 32 - this._daylightSavingAdjust(new Date(year, month, 32)).getDate();
	},

	/* Find the day of the week of the first of a month. */
	_getFirstDayOfMonth: function(year, month) {
		return new Date(year, month, 1).getDay();
	},

	/* Determines if we should allow a "next/prev" month display change. */
	_canAdjustMonth: function(inst, offset, curYear, curMonth) {
		var numMonths = this._getNumberOfMonths(inst);
		var date = this._daylightSavingAdjust(new Date(curYear,
			curMonth + (offset < 0 ? offset : numMonths[0] * numMonths[1]), 1));
		if (offset < 0)
			date.setDate(this._getDaysInMonth(date.getFullYear(), date.getMonth()));
		return this._isInRange(inst, date);
	},

	/* Is the given date in the accepted range? */
	_isInRange: function(inst, date) {
		var minDate = this._getMinMaxDate(inst, 'min');
		var maxDate = this._getMinMaxDate(inst, 'max');
		return ((!minDate || date.getTime() >= minDate.getTime()) &&
			(!maxDate || date.getTime() <= maxDate.getTime()));
	},

	/* Provide the configuration settings for formatting/parsing. */
	_getFormatConfig: function(inst) {
		var shortYearCutoff = this._get(inst, 'shortYearCutoff');
		shortYearCutoff = (typeof shortYearCutoff != 'string' ? shortYearCutoff :
			new Date().getFullYear() % 100 + parseInt(shortYearCutoff, 10));
		return {shortYearCutoff: shortYearCutoff,
			dayNamesShort: this._get(inst, 'dayNamesShort'), dayNames: this._get(inst, 'dayNames'),
			monthNamesShort: this._get(inst, 'monthNamesShort'), monthNames: this._get(inst, 'monthNames')};
	},

	/* Format the given date for display. */
	_formatDate: function(inst, day, month, year) {
		if (!day) {
			inst.currentDay = inst.selectedDay;
			inst.currentMonth = inst.selectedMonth;
			inst.currentYear = inst.selectedYear;
		}
		var date = (day ? (typeof day == 'object' ? day :
			this._daylightSavingAdjust(new Date(year, month, day))) :
			this._daylightSavingAdjust(new Date(inst.currentYear, inst.currentMonth, inst.currentDay)));
		return this.formatDate(this._get(inst, 'dateFormat'), date, this._getFormatConfig(inst));
	}
});

/*
 * Bind hover events for datepicker elements.
 * Done via delegate so the binding only occurs once in the lifetime of the parent div.
 * Global instActive, set by _updateDatepicker allows the handlers to find their way back to the active picker.
 */ 
function bindHover(dpDiv) {
	var selector = 'button, .ui-datepicker-prev, .ui-datepicker-next, .ui-datepicker-calendar td a';
	return dpDiv.bind('mouseout', function(event) {
			var elem = $( event.target ).closest( selector );
			if ( !elem.length ) {
				return;
			}
			elem.removeClass( "ui-state-hover ui-datepicker-prev-hover ui-datepicker-next-hover" );
		})
		.bind('mouseover', function(event) {
			var elem = $( event.target ).closest( selector );
			if ($.datepicker._isDisabledDatepicker( instActive.inline ? dpDiv.parent()[0] : instActive.input[0]) ||
					!elem.length ) {
				return;
			}
			elem.parents('.ui-datepicker-calendar').find('a').removeClass('ui-state-hover');
			elem.addClass('ui-state-hover');
			if (elem.hasClass('ui-datepicker-prev')) elem.addClass('ui-datepicker-prev-hover');
			if (elem.hasClass('ui-datepicker-next')) elem.addClass('ui-datepicker-next-hover');
		});
}

/* jQuery extend now ignores nulls! */
function extendRemove(target, props) {
	$.extend(target, props);
	for (var name in props)
		if (props[name] == null || props[name] == undefined)
			target[name] = props[name];
	return target;
};

/* Determine whether an object is an array. */
function isArray(a) {
	return (a && (($.browser.safari && typeof a == 'object' && a.length) ||
		(a.constructor && a.constructor.toString().match(/\Array\(\)/))));
};

/* Invoke the datepicker functionality.
   @param  options  string - a command, optionally followed by additional parameters or
                    Object - settings for attaching new datepicker functionality
   @return  jQuery object */
$.fn.datepicker = function(options){
	
	/* Verify an empty collection wasn't passed - Fixes #6976 */
	if ( !this.length ) {
		return this;
	}
	
	/* Initialise the date picker. */
	if (!$.datepicker.initialized) {
		$(document).mousedown($.datepicker._checkExternalClick).
			find('body').append($.datepicker.dpDiv);
		$.datepicker.initialized = true;
	}

	var otherArgs = Array.prototype.slice.call(arguments, 1);
	if (typeof options == 'string' && (options == 'isDisabled' || options == 'getDate' || options == 'widget'))
		return $.datepicker['_' + options + 'Datepicker'].
			apply($.datepicker, [this[0]].concat(otherArgs));
	if (options == 'option' && arguments.length == 2 && typeof arguments[1] == 'string')
		return $.datepicker['_' + options + 'Datepicker'].
			apply($.datepicker, [this[0]].concat(otherArgs));
	return this.each(function() {
		typeof options == 'string' ?
			$.datepicker['_' + options + 'Datepicker'].
				apply($.datepicker, [this].concat(otherArgs)) :
			$.datepicker._attachDatepicker(this, options);
	});
};

$.datepicker = new Datepicker(); // singleton instance
$.datepicker.initialized = false;
$.datepicker.uuid = new Date().getTime();
$.datepicker.version = "1.8.18";

// Workaround for #4055
// Add another global to avoid noConflict issues with inline event handlers
window['DP_jQuery_' + dpuuid] = $;

})(jQuery);
/*!
 * jQuery UI Draggable 1.8.21
 *
 * Copyright 2012, AUTHORS.txt (http://jqueryui.com/about)
 * Dual licensed under the MIT or GPL Version 2 licenses.
 * http://jquery.org/license
 *
 * http://docs.jquery.com/UI/Draggables
 *
 * Depends:
 *	jquery.ui.core.js
 *	jquery.ui.mouse.js
 *	jquery.ui.widget.js
 */
(function( $, undefined ) {

$.widget("ui.draggable", $.ui.mouse, {
	widgetEventPrefix: "drag",
	options: {
		addClasses: true,
		appendTo: "parent",
		axis: false,
		connectToSortable: false,
		containment: false,
		cursor: "auto",
		cursorAt: false,
		grid: false,
		handle: false,
		helper: "original",
		iframeFix: false,
		opacity: false,
		refreshPositions: false,
		revert: false,
		revertDuration: 500,
		scope: "default",
		scroll: true,
		scrollSensitivity: 20,
		scrollSpeed: 20,
		snap: false,
		snapMode: "both",
		snapTolerance: 20,
		stack: false,
		zIndex: false
	},
	_create: function() {

		if (this.options.helper == 'original' && !(/^(?:r|a|f)/).test(this.element.css("position")))
			this.element[0].style.position = 'relative';

		(this.options.addClasses && this.element.addClass("ui-draggable"));
		(this.options.disabled && this.element.addClass("ui-draggable-disabled"));

		this._mouseInit();

	},

	destroy: function() {
		if(!this.element.data('draggable')) return;
		this.element
			.removeData("draggable")
			.unbind(".draggable")
			.removeClass("ui-draggable"
				+ " ui-draggable-dragging"
				+ " ui-draggable-disabled");
		this._mouseDestroy();

		return this;
	},

	_mouseCapture: function(event) {

		var o = this.options;

		// among others, prevent a drag on a resizable-handle
		if (this.helper || o.disabled || $(event.target).is('.ui-resizable-handle'))
			return false;

		//Quit if we're not on a valid handle
		this.handle = this._getHandle(event);
		if (!this.handle)
			return false;
		
		if ( o.iframeFix ) {
			$(o.iframeFix === true ? "iframe" : o.iframeFix).each(function() {
				$('<div class="ui-draggable-iframeFix" style="background: #fff;"></div>')
				.css({
					width: this.offsetWidth+"px", height: this.offsetHeight+"px",
					position: "absolute", opacity: "0.001", zIndex: 1000
				})
				.css($(this).offset())
				.appendTo("body");
			});
		}

		return true;

	},

	_mouseStart: function(event) {

		var o = this.options;

		//Create and append the visible helper
		this.helper = this._createHelper(event);

		this.helper.addClass("ui-draggable-dragging");

		//Cache the helper size
		this._cacheHelperProportions();

		//If ddmanager is used for droppables, set the global draggable
		if($.ui.ddmanager)
			$.ui.ddmanager.current = this;

		/*
		 * - Position generation -
		 * This block generates everything position related - it's the core of draggables.
		 */

		//Cache the margins of the original element
		this._cacheMargins();

		//Store the helper's css position
		this.cssPosition = this.helper.css("position");
		this.scrollParent = this.helper.scrollParent();

		//The element's absolute position on the page minus margins
		this.offset = this.positionAbs = this.element.offset();
		this.offset = {
			top: this.offset.top - this.margins.top,
			left: this.offset.left - this.margins.left
		};

		$.extend(this.offset, {
			click: { //Where the click happened, relative to the element
				left: event.pageX - this.offset.left,
				top: event.pageY - this.offset.top
			},
			parent: this._getParentOffset(),
			relative: this._getRelativeOffset() //This is a relative to absolute position minus the actual position calculation - only used for relative positioned helper
		});

		//Generate the original position
		this.originalPosition = this.position = this._generatePosition(event);
		this.originalPageX = event.pageX;
		this.originalPageY = event.pageY;

		//Adjust the mouse offset relative to the helper if 'cursorAt' is supplied
		(o.cursorAt && this._adjustOffsetFromHelper(o.cursorAt));

		//Set a containment if given in the options
		if(o.containment)
			this._setContainment();

		//Trigger event + callbacks
		if(this._trigger("start", event) === false) {
			this._clear();
			return false;
		}

		//Recache the helper size
		this._cacheHelperProportions();

		//Prepare the droppable offsets
		if ($.ui.ddmanager && !o.dropBehaviour)
			$.ui.ddmanager.prepareOffsets(this, event);

		
		this._mouseDrag(event, true); //Execute the drag once - this causes the helper not to be visible before getting its correct position
		
		//If the ddmanager is used for droppables, inform the manager that dragging has started (see #5003)
		if ( $.ui.ddmanager ) $.ui.ddmanager.dragStart(this, event);
		
		return true;
	},

	_mouseDrag: function(event, noPropagation) {

		//Compute the helpers position
		this.position = this._generatePosition(event);
		this.positionAbs = this._convertPositionTo("absolute");

		//Call plugins and callbacks and use the resulting position if something is returned
		if (!noPropagation) {
			var ui = this._uiHash();
			if(this._trigger('drag', event, ui) === false) {
				this._mouseUp({});
				return false;
			}
			this.position = ui.position;
		}

		if(!this.options.axis || this.options.axis != "y") this.helper[0].style.left = this.position.left+'px';
		if(!this.options.axis || this.options.axis != "x") this.helper[0].style.top = this.position.top+'px';
		if($.ui.ddmanager) $.ui.ddmanager.drag(this, event);

		return false;
	},

	_mouseStop: function(event) {

		//If we are using droppables, inform the manager about the drop
		var dropped = false;
		if ($.ui.ddmanager && !this.options.dropBehaviour)
			dropped = $.ui.ddmanager.drop(this, event);

		//if a drop comes from outside (a sortable)
		if(this.dropped) {
			dropped = this.dropped;
			this.dropped = false;
		}
		
		//if the original element is no longer in the DOM don't bother to continue (see #8269)
		var element = this.element[0], elementInDom = false;
		while ( element && (element = element.parentNode) ) {
			if (element == document ) {
				elementInDom = true;
			}
		}
		if ( !elementInDom && this.options.helper === "original" )
			return false;

		if((this.options.revert == "invalid" && !dropped) || (this.options.revert == "valid" && dropped) || this.options.revert === true || ($.isFunction(this.options.revert) && this.options.revert.call(this.element, dropped))) {
			var self = this;
			$(this.helper).animate(this.originalPosition, parseInt(this.options.revertDuration, 10), function() {
				if(self._trigger("stop", event) !== false) {
					self._clear();
				}
			});
		} else {
			if(this._trigger("stop", event) !== false) {
				this._clear();
			}
		}

		return false;
	},
	
	_mouseUp: function(event) {
		if (this.options.iframeFix === true) {
			$("div.ui-draggable-iframeFix").each(function() { 
				this.parentNode.removeChild(this); 
			}); //Remove frame helpers
		}
		
		//If the ddmanager is used for droppables, inform the manager that dragging has stopped (see #5003)
		if( $.ui.ddmanager ) $.ui.ddmanager.dragStop(this, event);
		
		return $.ui.mouse.prototype._mouseUp.call(this, event);
	},
	
	cancel: function() {
		
		if(this.helper.is(".ui-draggable-dragging")) {
			this._mouseUp({});
		} else {
			this._clear();
		}
		
		return this;
		
	},

	_getHandle: function(event) {

		var handle = !this.options.handle || !$(this.options.handle, this.element).length ? true : false;
		$(this.options.handle, this.element)
			.find("*")
			.andSelf()
			.each(function() {
				if(this == event.target) handle = true;
			});

		return handle;

	},

	_createHelper: function(event) {

		var o = this.options;
		var helper = $.isFunction(o.helper) ? $(o.helper.apply(this.element[0], [event])) : (o.helper == 'clone' ? this.element.clone().removeAttr('id') : this.element);

		if(!helper.parents('body').length)
			helper.appendTo((o.appendTo == 'parent' ? this.element[0].parentNode : o.appendTo));

		if(helper[0] != this.element[0] && !(/(fixed|absolute)/).test(helper.css("position")))
			helper.css("position", "absolute");

		return helper;

	},

	_adjustOffsetFromHelper: function(obj) {
		if (typeof obj == 'string') {
			obj = obj.split(' ');
		}
		if ($.isArray(obj)) {
			obj = {left: +obj[0], top: +obj[1] || 0};
		}
		if ('left' in obj) {
			this.offset.click.left = obj.left + this.margins.left;
		}
		if ('right' in obj) {
			this.offset.click.left = this.helperProportions.width - obj.right + this.margins.left;
		}
		if ('top' in obj) {
			this.offset.click.top = obj.top + this.margins.top;
		}
		if ('bottom' in obj) {
			this.offset.click.top = this.helperProportions.height - obj.bottom + this.margins.top;
		}
	},

	_getParentOffset: function() {

		//Get the offsetParent and cache its position
		this.offsetParent = this.helper.offsetParent();
		var po = this.offsetParent.offset();

		// This is a special case where we need to modify a offset calculated on start, since the following happened:
		// 1. The position of the helper is absolute, so it's position is calculated based on the next positioned parent
		// 2. The actual offset parent is a child of the scroll parent, and the scroll parent isn't the document, which means that
		//    the scroll is included in the initial calculation of the offset of the parent, and never recalculated upon drag
		if(this.cssPosition == 'absolute' && this.scrollParent[0] != document && $.ui.contains(this.scrollParent[0], this.offsetParent[0])) {
			po.left += this.scrollParent.scrollLeft();
			po.top += this.scrollParent.scrollTop();
		}

		if((this.offsetParent[0] == document.body) //This needs to be actually done for all browsers, since pageX/pageY includes this information
		|| (this.offsetParent[0].tagName && this.offsetParent[0].tagName.toLowerCase() == 'html' && $.browser.msie)) //Ugly IE fix
			po = { top: 0, left: 0 };

		return {
			top: po.top + (parseInt(this.offsetParent.css("borderTopWidth"),10) || 0),
			left: po.left + (parseInt(this.offsetParent.css("borderLeftWidth"),10) || 0)
		};

	},

	_getRelativeOffset: function() {

		if(this.cssPosition == "relative") {
			var p = this.element.position();
			return {
				top: p.top - (parseInt(this.helper.css("top"),10) || 0) + this.scrollParent.scrollTop(),
				left: p.left - (parseInt(this.helper.css("left"),10) || 0) + this.scrollParent.scrollLeft()
			};
		} else {
			return { top: 0, left: 0 };
		}

	},

	_cacheMargins: function() {
		this.margins = {
			left: (parseInt(this.element.css("marginLeft"),10) || 0),
			top: (parseInt(this.element.css("marginTop"),10) || 0),
			right: (parseInt(this.element.css("marginRight"),10) || 0),
			bottom: (parseInt(this.element.css("marginBottom"),10) || 0)
		};
	},

	_cacheHelperProportions: function() {
		this.helperProportions = {
			width: this.helper.outerWidth(),
			height: this.helper.outerHeight()
		};
	},

	_setContainment: function() {

		var o = this.options;
		if(o.containment == 'parent') o.containment = this.helper[0].parentNode;
		if(o.containment == 'document' || o.containment == 'window') this.containment = [
			o.containment == 'document' ? 0 : $(window).scrollLeft() - this.offset.relative.left - this.offset.parent.left,
			o.containment == 'document' ? 0 : $(window).scrollTop() - this.offset.relative.top - this.offset.parent.top,
			(o.containment == 'document' ? 0 : $(window).scrollLeft()) + $(o.containment == 'document' ? document : window).width() - this.helperProportions.width - this.margins.left,
			(o.containment == 'document' ? 0 : $(window).scrollTop()) + ($(o.containment == 'document' ? document : window).height() || document.body.parentNode.scrollHeight) - this.helperProportions.height - this.margins.top
		];

		if(!(/^(document|window|parent)$/).test(o.containment) && o.containment.constructor != Array) {
		        var c = $(o.containment);
			var ce = c[0]; if(!ce) return;
			var co = c.offset();
			var over = ($(ce).css("overflow") != 'hidden');

			this.containment = [
				(parseInt($(ce).css("borderLeftWidth"),10) || 0) + (parseInt($(ce).css("paddingLeft"),10) || 0),
				(parseInt($(ce).css("borderTopWidth"),10) || 0) + (parseInt($(ce).css("paddingTop"),10) || 0),
				(over ? Math.max(ce.scrollWidth,ce.offsetWidth) : ce.offsetWidth) - (parseInt($(ce).css("borderLeftWidth"),10) || 0) - (parseInt($(ce).css("paddingRight"),10) || 0) - this.helperProportions.width - this.margins.left - this.margins.right,
				(over ? Math.max(ce.scrollHeight,ce.offsetHeight) : ce.offsetHeight) - (parseInt($(ce).css("borderTopWidth"),10) || 0) - (parseInt($(ce).css("paddingBottom"),10) || 0) - this.helperProportions.height - this.margins.top  - this.margins.bottom
			];
			this.relative_container = c;

		} else if(o.containment.constructor == Array) {
			this.containment = o.containment;
		}

	},

	_convertPositionTo: function(d, pos) {

		if(!pos) pos = this.position;
		var mod = d == "absolute" ? 1 : -1;
		var o = this.options, scroll = this.cssPosition == 'absolute' && !(this.scrollParent[0] != document && $.ui.contains(this.scrollParent[0], this.offsetParent[0])) ? this.offsetParent : this.scrollParent, scrollIsRootNode = (/(html|body)/i).test(scroll[0].tagName);

		return {
			top: (
				pos.top																	// The absolute mouse position
				+ this.offset.relative.top * mod										// Only for relative positioned nodes: Relative offset from element to offset parent
				+ this.offset.parent.top * mod											// The offsetParent's offset without borders (offset + border)
				- ($.browser.safari && $.browser.version < 526 && this.cssPosition == 'fixed' ? 0 : ( this.cssPosition == 'fixed' ? -this.scrollParent.scrollTop() : ( scrollIsRootNode ? 0 : scroll.scrollTop() ) ) * mod)
			),
			left: (
				pos.left																// The absolute mouse position
				+ this.offset.relative.left * mod										// Only for relative positioned nodes: Relative offset from element to offset parent
				+ this.offset.parent.left * mod											// The offsetParent's offset without borders (offset + border)
				- ($.browser.safari && $.browser.version < 526 && this.cssPosition == 'fixed' ? 0 : ( this.cssPosition == 'fixed' ? -this.scrollParent.scrollLeft() : scrollIsRootNode ? 0 : scroll.scrollLeft() ) * mod)
			)
		};

	},

	_generatePosition: function(event) {

		var o = this.options, scroll = this.cssPosition == 'absolute' && !(this.scrollParent[0] != document && $.ui.contains(this.scrollParent[0], this.offsetParent[0])) ? this.offsetParent : this.scrollParent, scrollIsRootNode = (/(html|body)/i).test(scroll[0].tagName);
		var pageX = event.pageX;
		var pageY = event.pageY;

		/*
		 * - Position constraining -
		 * Constrain the position to a mix of grid, containment.
		 */

		if(this.originalPosition) { //If we are not dragging yet, we won't check for options
		         var containment;
		         if(this.containment) {
				 if (this.relative_container){
				     var co = this.relative_container.offset();
				     containment = [ this.containment[0] + co.left,
						     this.containment[1] + co.top,
						     this.containment[2] + co.left,
						     this.containment[3] + co.top ];
				 }
				 else {
				     containment = this.containment;
				 }

				if(event.pageX - this.offset.click.left < containment[0]) pageX = containment[0] + this.offset.click.left;
				if(event.pageY - this.offset.click.top < containment[1]) pageY = containment[1] + this.offset.click.top;
				if(event.pageX - this.offset.click.left > containment[2]) pageX = containment[2] + this.offset.click.left;
				if(event.pageY - this.offset.click.top > containment[3]) pageY = containment[3] + this.offset.click.top;
			}

			if(o.grid) {
				//Check for grid elements set to 0 to prevent divide by 0 error causing invalid argument errors in IE (see ticket #6950)
				var top = o.grid[1] ? this.originalPageY + Math.round((pageY - this.originalPageY) / o.grid[1]) * o.grid[1] : this.originalPageY;
				pageY = containment ? (!(top - this.offset.click.top < containment[1] || top - this.offset.click.top > containment[3]) ? top : (!(top - this.offset.click.top < containment[1]) ? top - o.grid[1] : top + o.grid[1])) : top;

				var left = o.grid[0] ? this.originalPageX + Math.round((pageX - this.originalPageX) / o.grid[0]) * o.grid[0] : this.originalPageX;
				pageX = containment ? (!(left - this.offset.click.left < containment[0] || left - this.offset.click.left > containment[2]) ? left : (!(left - this.offset.click.left < containment[0]) ? left - o.grid[0] : left + o.grid[0])) : left;
			}

		}

		return {
			top: (
				pageY																// The absolute mouse position
				- this.offset.click.top													// Click offset (relative to the element)
				- this.offset.relative.top												// Only for relative positioned nodes: Relative offset from element to offset parent
				- this.offset.parent.top												// The offsetParent's offset without borders (offset + border)
				+ ($.browser.safari && $.browser.version < 526 && this.cssPosition == 'fixed' ? 0 : ( this.cssPosition == 'fixed' ? -this.scrollParent.scrollTop() : ( scrollIsRootNode ? 0 : scroll.scrollTop() ) ))
			),
			left: (
				pageX																// The absolute mouse position
				- this.offset.click.left												// Click offset (relative to the element)
				- this.offset.relative.left												// Only for relative positioned nodes: Relative offset from element to offset parent
				- this.offset.parent.left												// The offsetParent's offset without borders (offset + border)
				+ ($.browser.safari && $.browser.version < 526 && this.cssPosition == 'fixed' ? 0 : ( this.cssPosition == 'fixed' ? -this.scrollParent.scrollLeft() : scrollIsRootNode ? 0 : scroll.scrollLeft() ))
			)
		};

	},

	_clear: function() {
		this.helper.removeClass("ui-draggable-dragging");
		if(this.helper[0] != this.element[0] && !this.cancelHelperRemoval) this.helper.remove();
		//if($.ui.ddmanager) $.ui.ddmanager.current = null;
		this.helper = null;
		this.cancelHelperRemoval = false;
	},

	// From now on bulk stuff - mainly helpers

	_trigger: function(type, event, ui) {
		ui = ui || this._uiHash();
		$.ui.plugin.call(this, type, [event, ui]);
		if(type == "drag") this.positionAbs = this._convertPositionTo("absolute"); //The absolute position has to be recalculated after plugins
		return $.Widget.prototype._trigger.call(this, type, event, ui);
	},

	plugins: {},

	_uiHash: function(event) {
		return {
			helper: this.helper,
			position: this.position,
			originalPosition: this.originalPosition,
			offset: this.positionAbs
		};
	}

});

$.extend($.ui.draggable, {
	version: "1.8.21"
});

$.ui.plugin.add("draggable", "connectToSortable", {
	start: function(event, ui) {

		var inst = $(this).data("draggable"), o = inst.options,
			uiSortable = $.extend({}, ui, { item: inst.element });
		inst.sortables = [];
		$(o.connectToSortable).each(function() {
			var sortable = $.data(this, 'sortable');
			if (sortable && !sortable.options.disabled) {
				inst.sortables.push({
					instance: sortable,
					shouldRevert: sortable.options.revert
				});
				sortable.refreshPositions();	// Call the sortable's refreshPositions at drag start to refresh the containerCache since the sortable container cache is used in drag and needs to be up to date (this will ensure it's initialised as well as being kept in step with any changes that might have happened on the page).
				sortable._trigger("activate", event, uiSortable);
			}
		});

	},
	stop: function(event, ui) {

		//If we are still over the sortable, we fake the stop event of the sortable, but also remove helper
		var inst = $(this).data("draggable"),
			uiSortable = $.extend({}, ui, { item: inst.element });

		$.each(inst.sortables, function() {
			if(this.instance.isOver) {

				this.instance.isOver = 0;

				inst.cancelHelperRemoval = true; //Don't remove the helper in the draggable instance
				this.instance.cancelHelperRemoval = false; //Remove it in the sortable instance (so sortable plugins like revert still work)

				//The sortable revert is supported, and we have to set a temporary dropped variable on the draggable to support revert: 'valid/invalid'
				if(this.shouldRevert) this.instance.options.revert = true;

				//Trigger the stop of the sortable
				this.instance._mouseStop(event);

				this.instance.options.helper = this.instance.options._helper;

				//If the helper has been the original item, restore properties in the sortable
				if(inst.options.helper == 'original')
					this.instance.currentItem.css({ top: 'auto', left: 'auto' });

			} else {
				this.instance.cancelHelperRemoval = false; //Remove the helper in the sortable instance
				this.instance._trigger("deactivate", event, uiSortable);
			}

		});

	},
	drag: function(event, ui) {

		var inst = $(this).data("draggable"), self = this;

		var checkPos = function(o) {
			var dyClick = this.offset.click.top, dxClick = this.offset.click.left;
			var helperTop = this.positionAbs.top, helperLeft = this.positionAbs.left;
			var itemHeight = o.height, itemWidth = o.width;
			var itemTop = o.top, itemLeft = o.left;

			return $.ui.isOver(helperTop + dyClick, helperLeft + dxClick, itemTop, itemLeft, itemHeight, itemWidth);
		};

		$.each(inst.sortables, function(i) {
			
			//Copy over some variables to allow calling the sortable's native _intersectsWith
			this.instance.positionAbs = inst.positionAbs;
			this.instance.helperProportions = inst.helperProportions;
			this.instance.offset.click = inst.offset.click;
			
			if(this.instance._intersectsWith(this.instance.containerCache)) {

				//If it intersects, we use a little isOver variable and set it once, so our move-in stuff gets fired only once
				if(!this.instance.isOver) {

					this.instance.isOver = 1;
					//Now we fake the start of dragging for the sortable instance,
					//by cloning the list group item, appending it to the sortable and using it as inst.currentItem
					//We can then fire the start event of the sortable with our passed browser event, and our own helper (so it doesn't create a new one)
					this.instance.currentItem = $(self).clone().removeAttr('id').appendTo(this.instance.element).data("sortable-item", true);
					this.instance.options._helper = this.instance.options.helper; //Store helper option to later restore it
					this.instance.options.helper = function() { return ui.helper[0]; };

					event.target = this.instance.currentItem[0];
					this.instance._mouseCapture(event, true);
					this.instance._mouseStart(event, true, true);

					//Because the browser event is way off the new appended portlet, we modify a couple of variables to reflect the changes
					this.instance.offset.click.top = inst.offset.click.top;
					this.instance.offset.click.left = inst.offset.click.left;
					this.instance.offset.parent.left -= inst.offset.parent.left - this.instance.offset.parent.left;
					this.instance.offset.parent.top -= inst.offset.parent.top - this.instance.offset.parent.top;

					inst._trigger("toSortable", event);
					inst.dropped = this.instance.element; //draggable revert needs that
					//hack so receive/update callbacks work (mostly)
					inst.currentItem = inst.element;
					this.instance.fromOutside = inst;

				}

				//Provided we did all the previous steps, we can fire the drag event of the sortable on every draggable drag, when it intersects with the sortable
				if(this.instance.currentItem) this.instance._mouseDrag(event);

			} else {

				//If it doesn't intersect with the sortable, and it intersected before,
				//we fake the drag stop of the sortable, but make sure it doesn't remove the helper by using cancelHelperRemoval
				if(this.instance.isOver) {

					this.instance.isOver = 0;
					this.instance.cancelHelperRemoval = true;
					
					//Prevent reverting on this forced stop
					this.instance.options.revert = false;
					
					// The out event needs to be triggered independently
					this.instance._trigger('out', event, this.instance._uiHash(this.instance));
					
					this.instance._mouseStop(event, true);
					this.instance.options.helper = this.instance.options._helper;

					//Now we remove our currentItem, the list group clone again, and the placeholder, and animate the helper back to it's original size
					this.instance.currentItem.remove();
					if(this.instance.placeholder) this.instance.placeholder.remove();

					inst._trigger("fromSortable", event);
					inst.dropped = false; //draggable revert needs that
				}

			};

		});

	}
});

$.ui.plugin.add("draggable", "cursor", {
	start: function(event, ui) {
		var t = $('body'), o = $(this).data('draggable').options;
		if (t.css("cursor")) o._cursor = t.css("cursor");
		t.css("cursor", o.cursor);
	},
	stop: function(event, ui) {
		var o = $(this).data('draggable').options;
		if (o._cursor) $('body').css("cursor", o._cursor);
	}
});

$.ui.plugin.add("draggable", "opacity", {
	start: function(event, ui) {
		var t = $(ui.helper), o = $(this).data('draggable').options;
		if(t.css("opacity")) o._opacity = t.css("opacity");
		t.css('opacity', o.opacity);
	},
	stop: function(event, ui) {
		var o = $(this).data('draggable').options;
		if(o._opacity) $(ui.helper).css('opacity', o._opacity);
	}
});

$.ui.plugin.add("draggable", "scroll", {
	start: function(event, ui) {
		var i = $(this).data("draggable");
		if(i.scrollParent[0] != document && i.scrollParent[0].tagName != 'HTML') i.overflowOffset = i.scrollParent.offset();
	},
	drag: function(event, ui) {

		var i = $(this).data("draggable"), o = i.options, scrolled = false;

		if(i.scrollParent[0] != document && i.scrollParent[0].tagName != 'HTML') {

			if(!o.axis || o.axis != 'x') {
				if((i.overflowOffset.top + i.scrollParent[0].offsetHeight) - event.pageY < o.scrollSensitivity)
					i.scrollParent[0].scrollTop = scrolled = i.scrollParent[0].scrollTop + o.scrollSpeed;
				else if(event.pageY - i.overflowOffset.top < o.scrollSensitivity)
					i.scrollParent[0].scrollTop = scrolled = i.scrollParent[0].scrollTop - o.scrollSpeed;
			}

			if(!o.axis || o.axis != 'y') {
				if((i.overflowOffset.left + i.scrollParent[0].offsetWidth) - event.pageX < o.scrollSensitivity)
					i.scrollParent[0].scrollLeft = scrolled = i.scrollParent[0].scrollLeft + o.scrollSpeed;
				else if(event.pageX - i.overflowOffset.left < o.scrollSensitivity)
					i.scrollParent[0].scrollLeft = scrolled = i.scrollParent[0].scrollLeft - o.scrollSpeed;
			}

		} else {

			if(!o.axis || o.axis != 'x') {
				if(event.pageY - $(document).scrollTop() < o.scrollSensitivity)
					scrolled = $(document).scrollTop($(document).scrollTop() - o.scrollSpeed);
				else if($(window).height() - (event.pageY - $(document).scrollTop()) < o.scrollSensitivity)
					scrolled = $(document).scrollTop($(document).scrollTop() + o.scrollSpeed);
			}

			if(!o.axis || o.axis != 'y') {
				if(event.pageX - $(document).scrollLeft() < o.scrollSensitivity)
					scrolled = $(document).scrollLeft($(document).scrollLeft() - o.scrollSpeed);
				else if($(window).width() - (event.pageX - $(document).scrollLeft()) < o.scrollSensitivity)
					scrolled = $(document).scrollLeft($(document).scrollLeft() + o.scrollSpeed);
			}

		}

		if(scrolled !== false && $.ui.ddmanager && !o.dropBehaviour)
			$.ui.ddmanager.prepareOffsets(i, event);

	}
});

$.ui.plugin.add("draggable", "snap", {
	start: function(event, ui) {

		var i = $(this).data("draggable"), o = i.options;
		i.snapElements = [];

		$(o.snap.constructor != String ? ( o.snap.items || ':data(draggable)' ) : o.snap).each(function() {
			var $t = $(this); var $o = $t.offset();
			if(this != i.element[0]) i.snapElements.push({
				item: this,
				width: $t.outerWidth(), height: $t.outerHeight(),
				top: $o.top, left: $o.left
			});
		});

	},
	drag: function(event, ui) {

		var inst = $(this).data("draggable"), o = inst.options;
		var d = o.snapTolerance;

		var x1 = ui.offset.left, x2 = x1 + inst.helperProportions.width,
			y1 = ui.offset.top, y2 = y1 + inst.helperProportions.height;

		for (var i = inst.snapElements.length - 1; i >= 0; i--){

			var l = inst.snapElements[i].left, r = l + inst.snapElements[i].width,
				t = inst.snapElements[i].top, b = t + inst.snapElements[i].height;

			//Yes, I know, this is insane ;)
			if(!((l-d < x1 && x1 < r+d && t-d < y1 && y1 < b+d) || (l-d < x1 && x1 < r+d && t-d < y2 && y2 < b+d) || (l-d < x2 && x2 < r+d && t-d < y1 && y1 < b+d) || (l-d < x2 && x2 < r+d && t-d < y2 && y2 < b+d))) {
				if(inst.snapElements[i].snapping) (inst.options.snap.release && inst.options.snap.release.call(inst.element, event, $.extend(inst._uiHash(), { snapItem: inst.snapElements[i].item })));
				inst.snapElements[i].snapping = false;
				continue;
			}

			if(o.snapMode != 'inner') {
				var ts = Math.abs(t - y2) <= d;
				var bs = Math.abs(b - y1) <= d;
				var ls = Math.abs(l - x2) <= d;
				var rs = Math.abs(r - x1) <= d;
				if(ts) ui.position.top = inst._convertPositionTo("relative", { top: t - inst.helperProportions.height, left: 0 }).top - inst.margins.top;
				if(bs) ui.position.top = inst._convertPositionTo("relative", { top: b, left: 0 }).top - inst.margins.top;
				if(ls) ui.position.left = inst._convertPositionTo("relative", { top: 0, left: l - inst.helperProportions.width }).left - inst.margins.left;
				if(rs) ui.position.left = inst._convertPositionTo("relative", { top: 0, left: r }).left - inst.margins.left;
			}

			var first = (ts || bs || ls || rs);

			if(o.snapMode != 'outer') {
				var ts = Math.abs(t - y1) <= d;
				var bs = Math.abs(b - y2) <= d;
				var ls = Math.abs(l - x1) <= d;
				var rs = Math.abs(r - x2) <= d;
				if(ts) ui.position.top = inst._convertPositionTo("relative", { top: t, left: 0 }).top - inst.margins.top;
				if(bs) ui.position.top = inst._convertPositionTo("relative", { top: b - inst.helperProportions.height, left: 0 }).top - inst.margins.top;
				if(ls) ui.position.left = inst._convertPositionTo("relative", { top: 0, left: l }).left - inst.margins.left;
				if(rs) ui.position.left = inst._convertPositionTo("relative", { top: 0, left: r - inst.helperProportions.width }).left - inst.margins.left;
			}

			if(!inst.snapElements[i].snapping && (ts || bs || ls || rs || first))
				(inst.options.snap.snap && inst.options.snap.snap.call(inst.element, event, $.extend(inst._uiHash(), { snapItem: inst.snapElements[i].item })));
			inst.snapElements[i].snapping = (ts || bs || ls || rs || first);

		};

	}
});

$.ui.plugin.add("draggable", "stack", {
	start: function(event, ui) {

		var o = $(this).data("draggable").options;

		var group = $.makeArray($(o.stack)).sort(function(a,b) {
			return (parseInt($(a).css("zIndex"),10) || 0) - (parseInt($(b).css("zIndex"),10) || 0);
		});
		if (!group.length) { return; }
		
		var min = parseInt(group[0].style.zIndex) || 0;
		$(group).each(function(i) {
			this.style.zIndex = min + i;
		});

		this[0].style.zIndex = min + group.length;

	}
});

$.ui.plugin.add("draggable", "zIndex", {
	start: function(event, ui) {
		var t = $(ui.helper), o = $(this).data("draggable").options;
		if(t.css("zIndex")) o._zIndex = t.css("zIndex");
		t.css('zIndex', o.zIndex);
	},
	stop: function(event, ui) {
		var o = $(this).data("draggable").options;
		if(o._zIndex) $(ui.helper).css('zIndex', o._zIndex);
	}
});

})(jQuery);
/*!
 * jQuery UI Resizable 1.8.21
 *
 * Copyright 2012, AUTHORS.txt (http://jqueryui.com/about)
 * Dual licensed under the MIT or GPL Version 2 licenses.
 * http://jquery.org/license
 *
 * http://docs.jquery.com/UI/Resizables
 *
 * Depends:
 *	jquery.ui.core.js
 *	jquery.ui.mouse.js
 *	jquery.ui.widget.js
 */
(function( $, undefined ) {

$.widget("ui.resizable", $.ui.mouse, {
	widgetEventPrefix: "resize",
	options: {
		alsoResize: false,
		animate: false,
		animateDuration: "slow",
		animateEasing: "swing",
		aspectRatio: false,
		autoHide: false,
		containment: false,
		ghost: false,
		grid: false,
		handles: "e,s,se",
		helper: false,
		maxHeight: null,
		maxWidth: null,
		minHeight: 10,
		minWidth: 10,
		zIndex: 1000
	},
	_create: function() {

		var self = this, o = this.options;
		this.element.addClass("ui-resizable");

		$.extend(this, {
			_aspectRatio: !!(o.aspectRatio),
			aspectRatio: o.aspectRatio,
			originalElement: this.element,
			_proportionallyResizeElements: [],
			_helper: o.helper || o.ghost || o.animate ? o.helper || 'ui-resizable-helper' : null
		});

		//Wrap the element if it cannot hold child nodes
		if(this.element[0].nodeName.match(/canvas|textarea|input|select|button|img/i)) {

			//Create a wrapper element and set the wrapper to the new current internal element
			this.element.wrap(
				$('<div class="ui-wrapper" style="overflow: hidden;"></div>').css({
					position: this.element.css('position'),
					width: this.element.outerWidth(),
					height: this.element.outerHeight(),
					top: this.element.css('top'),
					left: this.element.css('left')
				})
			);

			//Overwrite the original this.element
			this.element = this.element.parent().data(
				"resizable", this.element.data('resizable')
			);

			this.elementIsWrapper = true;

			//Move margins to the wrapper
			this.element.css({ marginLeft: this.originalElement.css("marginLeft"), marginTop: this.originalElement.css("marginTop"), marginRight: this.originalElement.css("marginRight"), marginBottom: this.originalElement.css("marginBottom") });
			this.originalElement.css({ marginLeft: 0, marginTop: 0, marginRight: 0, marginBottom: 0});

			//Prevent Safari textarea resize
			this.originalResizeStyle = this.originalElement.css('resize');
			this.originalElement.css('resize', 'none');

			//Push the actual element to our proportionallyResize internal array
			this._proportionallyResizeElements.push(this.originalElement.css({ position: 'static', zoom: 1, display: 'block' }));

			// avoid IE jump (hard set the margin)
			this.originalElement.css({ margin: this.originalElement.css('margin') });

			// fix handlers offset
			this._proportionallyResize();

		}

		this.handles = o.handles || (!$('.ui-resizable-handle', this.element).length ? "e,s,se" : { n: '.ui-resizable-n', e: '.ui-resizable-e', s: '.ui-resizable-s', w: '.ui-resizable-w', se: '.ui-resizable-se', sw: '.ui-resizable-sw', ne: '.ui-resizable-ne', nw: '.ui-resizable-nw' });
		if(this.handles.constructor == String) {

			if(this.handles == 'all') this.handles = 'n,e,s,w,se,sw,ne,nw';
			var n = this.handles.split(","); this.handles = {};

			for(var i = 0; i < n.length; i++) {

				var handle = $.trim(n[i]), hname = 'ui-resizable-'+handle;
				var axis = $('<div class="ui-resizable-handle ' + hname + '"></div>');

				// Apply zIndex to all handles - see #7960
				axis.css({ zIndex: o.zIndex });

				//TODO : What's going on here?
				if ('se' == handle) {
					axis.addClass('ui-icon ui-icon-gripsmall-diagonal-se');
				};

				//Insert into internal handles object and append to element
				this.handles[handle] = '.ui-resizable-'+handle;
				this.element.append(axis);
			}

		}

		this._renderAxis = function(target) {

			target = target || this.element;

			for(var i in this.handles) {

				if(this.handles[i].constructor == String)
					this.handles[i] = $(this.handles[i], this.element).show();

				//Apply pad to wrapper element, needed to fix axis position (textarea, inputs, scrolls)
				if (this.elementIsWrapper && this.originalElement[0].nodeName.match(/textarea|input|select|button/i)) {

					var axis = $(this.handles[i], this.element), padWrapper = 0;

					//Checking the correct pad and border
					padWrapper = /sw|ne|nw|se|n|s/.test(i) ? axis.outerHeight() : axis.outerWidth();

					//The padding type i have to apply...
					var padPos = [ 'padding',
						/ne|nw|n/.test(i) ? 'Top' :
						/se|sw|s/.test(i) ? 'Bottom' :
						/^e$/.test(i) ? 'Right' : 'Left' ].join("");

					target.css(padPos, padWrapper);

					this._proportionallyResize();

				}

				//TODO: What's that good for? There's not anything to be executed left
				if(!$(this.handles[i]).length)
					continue;

			}
		};

		//TODO: make renderAxis a prototype function
		this._renderAxis(this.element);

		this._handles = $('.ui-resizable-handle', this.element)
			.disableSelection();

		//Matching axis name
		this._handles.mouseover(function() {
			if (!self.resizing) {
				if (this.className)
					var axis = this.className.match(/ui-resizable-(se|sw|ne|nw|n|e|s|w)/i);
				//Axis, default = se
				self.axis = axis && axis[1] ? axis[1] : 'se';
			}
		});

		//If we want to auto hide the elements
		if (o.autoHide) {
			this._handles.hide();
			$(this.element)
				.addClass("ui-resizable-autohide")
				.hover(function() {
					if (o.disabled) return;
					$(this).removeClass("ui-resizable-autohide");
					self._handles.show();
				},
				function(){
					if (o.disabled) return;
					if (!self.resizing) {
						$(this).addClass("ui-resizable-autohide");
						self._handles.hide();
					}
				});
		}

		//Initialize the mouse interaction
		this._mouseInit();

	},

	destroy: function() {

		this._mouseDestroy();

		var _destroy = function(exp) {
			$(exp).removeClass("ui-resizable ui-resizable-disabled ui-resizable-resizing")
				.removeData("resizable").unbind(".resizable").find('.ui-resizable-handle').remove();
		};

		//TODO: Unwrap at same DOM position
		if (this.elementIsWrapper) {
			_destroy(this.element);
			var wrapper = this.element;
			wrapper.after(
				this.originalElement.css({
					position: wrapper.css('position'),
					width: wrapper.outerWidth(),
					height: wrapper.outerHeight(),
					top: wrapper.css('top'),
					left: wrapper.css('left')
				})
			).remove();
		}

		this.originalElement.css('resize', this.originalResizeStyle);
		_destroy(this.originalElement);

		return this;
	},

	_mouseCapture: function(event) {
		var handle = false;
		for (var i in this.handles) {
			if ($(this.handles[i])[0] == event.target) {
				handle = true;
			}
		}

		return !this.options.disabled && handle;
	},

	_mouseStart: function(event) {

		var o = this.options, iniPos = this.element.position(), el = this.element;

		this.resizing = true;
		this.documentScroll = { top: $(document).scrollTop(), left: $(document).scrollLeft() };

		// bugfix for http://dev.jquery.com/ticket/1749
		if (el.is('.ui-draggable') || (/absolute/).test(el.css('position'))) {
			el.css({ position: 'absolute', top: iniPos.top, left: iniPos.left });
		}

		this._renderProxy();

		var curleft = num(this.helper.css('left')), curtop = num(this.helper.css('top'));

		if (o.containment) {
			curleft += $(o.containment).scrollLeft() || 0;
			curtop += $(o.containment).scrollTop() || 0;
		}

		//Store needed variables
		this.offset = this.helper.offset();
		this.position = { left: curleft, top: curtop };
		this.size = this._helper ? { width: el.outerWidth(), height: el.outerHeight() } : { width: el.width(), height: el.height() };
		this.originalSize = this._helper ? { width: el.outerWidth(), height: el.outerHeight() } : { width: el.width(), height: el.height() };
		this.originalPosition = { left: curleft, top: curtop };
		this.sizeDiff = { width: el.outerWidth() - el.width(), height: el.outerHeight() - el.height() };
		this.originalMousePosition = { left: event.pageX, top: event.pageY };

		//Aspect Ratio
		this.aspectRatio = (typeof o.aspectRatio == 'number') ? o.aspectRatio : ((this.originalSize.width / this.originalSize.height) || 1);

	    var cursor = $('.ui-resizable-' + this.axis).css('cursor');
	    $('body').css('cursor', cursor == 'auto' ? this.axis + '-resize' : cursor);

		el.addClass("ui-resizable-resizing");
		this._propagate("start", event);
		return true;
	},

	_mouseDrag: function(event) {

		//Increase performance, avoid regex
		var el = this.helper, o = this.options, props = {},
			self = this, smp = this.originalMousePosition, a = this.axis;

		var dx = (event.pageX-smp.left)||0, dy = (event.pageY-smp.top)||0;
		var trigger = this._change[a];
		if (!trigger) return false;

		// Calculate the attrs that will be change
		var data = trigger.apply(this, [event, dx, dy]), ie6 = $.browser.msie && $.browser.version < 7, csdif = this.sizeDiff;

		// Put this in the mouseDrag handler since the user can start pressing shift while resizing
		this._updateVirtualBoundaries(event.shiftKey);
		if (this._aspectRatio || event.shiftKey)
			data = this._updateRatio(data, event);

		data = this._respectSize(data, event);

		// plugins callbacks need to be called first
		this._propagate("resize", event);

		el.css({
			top: this.position.top + "px", left: this.position.left + "px",
			width: this.size.width + "px", height: this.size.height + "px"
		});

		if (!this._helper && this._proportionallyResizeElements.length)
			this._proportionallyResize();

		this._updateCache(data);

		// calling the user callback at the end
		this._trigger('resize', event, this.ui());

		return false;
	},

	_mouseStop: function(event) {

		this.resizing = false;
		var o = this.options, self = this;

		if(this._helper) {
			var pr = this._proportionallyResizeElements, ista = pr.length && (/textarea/i).test(pr[0].nodeName),
				soffseth = ista && $.ui.hasScroll(pr[0], 'left') /* TODO - jump height */ ? 0 : self.sizeDiff.height,
				soffsetw = ista ? 0 : self.sizeDiff.width;

			var s = { width: (self.helper.width()  - soffsetw), height: (self.helper.height() - soffseth) },
				left = (parseInt(self.element.css('left'), 10) + (self.position.left - self.originalPosition.left)) || null,
				top = (parseInt(self.element.css('top'), 10) + (self.position.top - self.originalPosition.top)) || null;

			if (!o.animate)
				this.element.css($.extend(s, { top: top, left: left }));

			self.helper.height(self.size.height);
			self.helper.width(self.size.width);

			if (this._helper && !o.animate) this._proportionallyResize();
		}

		$('body').css('cursor', 'auto');

		this.element.removeClass("ui-resizable-resizing");

		this._propagate("stop", event);

		if (this._helper) this.helper.remove();
		return false;

	},

    _updateVirtualBoundaries: function(forceAspectRatio) {
        var o = this.options, pMinWidth, pMaxWidth, pMinHeight, pMaxHeight, b;

        b = {
            minWidth: isNumber(o.minWidth) ? o.minWidth : 0,
            maxWidth: isNumber(o.maxWidth) ? o.maxWidth : Infinity,
            minHeight: isNumber(o.minHeight) ? o.minHeight : 0,
            maxHeight: isNumber(o.maxHeight) ? o.maxHeight : Infinity
        };

        if(this._aspectRatio || forceAspectRatio) {
            // We want to create an enclosing box whose aspect ration is the requested one
            // First, compute the "projected" size for each dimension based on the aspect ratio and other dimension
            pMinWidth = b.minHeight * this.aspectRatio;
            pMinHeight = b.minWidth / this.aspectRatio;
            pMaxWidth = b.maxHeight * this.aspectRatio;
            pMaxHeight = b.maxWidth / this.aspectRatio;

            if(pMinWidth > b.minWidth) b.minWidth = pMinWidth;
            if(pMinHeight > b.minHeight) b.minHeight = pMinHeight;
            if(pMaxWidth < b.maxWidth) b.maxWidth = pMaxWidth;
            if(pMaxHeight < b.maxHeight) b.maxHeight = pMaxHeight;
        }
        this._vBoundaries = b;
    },

	_updateCache: function(data) {
		var o = this.options;
		this.offset = this.helper.offset();
		if (isNumber(data.left)) this.position.left = data.left;
		if (isNumber(data.top)) this.position.top = data.top;
		if (isNumber(data.height)) this.size.height = data.height;
		if (isNumber(data.width)) this.size.width = data.width;
	},

	_updateRatio: function(data, event) {

		var o = this.options, cpos = this.position, csize = this.size, a = this.axis;

		if (isNumber(data.height)) data.width = (data.height * this.aspectRatio);
		else if (isNumber(data.width)) data.height = (data.width / this.aspectRatio);

		if (a == 'sw') {
			data.left = cpos.left + (csize.width - data.width);
			data.top = null;
		}
		if (a == 'nw') {
			data.top = cpos.top + (csize.height - data.height);
			data.left = cpos.left + (csize.width - data.width);
		}

		return data;
	},

	_respectSize: function(data, event) {

		var el = this.helper, o = this._vBoundaries, pRatio = this._aspectRatio || event.shiftKey, a = this.axis,
				ismaxw = isNumber(data.width) && o.maxWidth && (o.maxWidth < data.width), ismaxh = isNumber(data.height) && o.maxHeight && (o.maxHeight < data.height),
					isminw = isNumber(data.width) && o.minWidth && (o.minWidth > data.width), isminh = isNumber(data.height) && o.minHeight && (o.minHeight > data.height);

		if (isminw) data.width = o.minWidth;
		if (isminh) data.height = o.minHeight;
		if (ismaxw) data.width = o.maxWidth;
		if (ismaxh) data.height = o.maxHeight;

		var dw = this.originalPosition.left + this.originalSize.width, dh = this.position.top + this.size.height;
		var cw = /sw|nw|w/.test(a), ch = /nw|ne|n/.test(a);

		if (isminw && cw) data.left = dw - o.minWidth;
		if (ismaxw && cw) data.left = dw - o.maxWidth;
		if (isminh && ch)	data.top = dh - o.minHeight;
		if (ismaxh && ch)	data.top = dh - o.maxHeight;

		// fixing jump error on top/left - bug #2330
		var isNotwh = !data.width && !data.height;
		if (isNotwh && !data.left && data.top) data.top = null;
		else if (isNotwh && !data.top && data.left) data.left = null;

		return data;
	},

	_proportionallyResize: function() {

		var o = this.options;
		if (!this._proportionallyResizeElements.length) return;
		var element = this.helper || this.element;

		for (var i=0; i < this._proportionallyResizeElements.length; i++) {

			var prel = this._proportionallyResizeElements[i];

			if (!this.borderDif) {
				var b = [prel.css('borderTopWidth'), prel.css('borderRightWidth'), prel.css('borderBottomWidth'), prel.css('borderLeftWidth')],
					p = [prel.css('paddingTop'), prel.css('paddingRight'), prel.css('paddingBottom'), prel.css('paddingLeft')];

				this.borderDif = $.map(b, function(v, i) {
					var border = parseInt(v,10)||0, padding = parseInt(p[i],10)||0;
					return border + padding;
				});
			}

			if ($.browser.msie && !(!($(element).is(':hidden') || $(element).parents(':hidden').length)))
				continue;

			prel.css({
				height: (element.height() - this.borderDif[0] - this.borderDif[2]) || 0,
				width: (element.width() - this.borderDif[1] - this.borderDif[3]) || 0
			});

		};

	},

	_renderProxy: function() {

		var el = this.element, o = this.options;
		this.elementOffset = el.offset();

		if(this._helper) {

			this.helper = this.helper || $('<div style="overflow:hidden;"></div>');

			// fix ie6 offset TODO: This seems broken
			var ie6 = $.browser.msie && $.browser.version < 7, ie6offset = (ie6 ? 1 : 0),
			pxyoffset = ( ie6 ? 2 : -1 );

			this.helper.addClass(this._helper).css({
				width: this.element.outerWidth() + pxyoffset,
				height: this.element.outerHeight() + pxyoffset,
				position: 'absolute',
				left: this.elementOffset.left - ie6offset +'px',
				top: this.elementOffset.top - ie6offset +'px',
				zIndex: ++o.zIndex //TODO: Don't modify option
			});

			this.helper
				.appendTo("body")
				.disableSelection();

		} else {
			this.helper = this.element;
		}

	},

	_change: {
		e: function(event, dx, dy) {
			return { width: this.originalSize.width + dx };
		},
		w: function(event, dx, dy) {
			var o = this.options, cs = this.originalSize, sp = this.originalPosition;
			return { left: sp.left + dx, width: cs.width - dx };
		},
		n: function(event, dx, dy) {
			var o = this.options, cs = this.originalSize, sp = this.originalPosition;
			return { top: sp.top + dy, height: cs.height - dy };
		},
		s: function(event, dx, dy) {
			return { height: this.originalSize.height + dy };
		},
		se: function(event, dx, dy) {
			return $.extend(this._change.s.apply(this, arguments), this._change.e.apply(this, [event, dx, dy]));
		},
		sw: function(event, dx, dy) {
			return $.extend(this._change.s.apply(this, arguments), this._change.w.apply(this, [event, dx, dy]));
		},
		ne: function(event, dx, dy) {
			return $.extend(this._change.n.apply(this, arguments), this._change.e.apply(this, [event, dx, dy]));
		},
		nw: function(event, dx, dy) {
			return $.extend(this._change.n.apply(this, arguments), this._change.w.apply(this, [event, dx, dy]));
		}
	},

	_propagate: function(n, event) {
		$.ui.plugin.call(this, n, [event, this.ui()]);
		(n != "resize" && this._trigger(n, event, this.ui()));
	},

	plugins: {},

	ui: function() {
		return {
			originalElement: this.originalElement,
			element: this.element,
			helper: this.helper,
			position: this.position,
			size: this.size,
			originalSize: this.originalSize,
			originalPosition: this.originalPosition
		};
	}

});

$.extend($.ui.resizable, {
	version: "1.8.21"
});

/*
 * Resizable Extensions
 */

$.ui.plugin.add("resizable", "alsoResize", {

	start: function (event, ui) {
		var self = $(this).data("resizable"), o = self.options;

		var _store = function (exp) {
			$(exp).each(function() {
				var el = $(this);
				el.data("resizable-alsoresize", {
					width: parseInt(el.width(), 10), height: parseInt(el.height(), 10),
					left: parseInt(el.css('left'), 10), top: parseInt(el.css('top'), 10)
				});
			});
		};

		if (typeof(o.alsoResize) == 'object' && !o.alsoResize.parentNode) {
			if (o.alsoResize.length) { o.alsoResize = o.alsoResize[0]; _store(o.alsoResize); }
			else { $.each(o.alsoResize, function (exp) { _store(exp); }); }
		}else{
			_store(o.alsoResize);
		}
	},

	resize: function (event, ui) {
		var self = $(this).data("resizable"), o = self.options, os = self.originalSize, op = self.originalPosition;

		var delta = {
			height: (self.size.height - os.height) || 0, width: (self.size.width - os.width) || 0,
			top: (self.position.top - op.top) || 0, left: (self.position.left - op.left) || 0
		},

		_alsoResize = function (exp, c) {
			$(exp).each(function() {
				var el = $(this), start = $(this).data("resizable-alsoresize"), style = {}, 
					css = c && c.length ? c : el.parents(ui.originalElement[0]).length ? ['width', 'height'] : ['width', 'height', 'top', 'left'];

				$.each(css, function (i, prop) {
					var sum = (start[prop]||0) + (delta[prop]||0);
					if (sum && sum >= 0)
						style[prop] = sum || null;
				});

				el.css(style);
			});
		};

		if (typeof(o.alsoResize) == 'object' && !o.alsoResize.nodeType) {
			$.each(o.alsoResize, function (exp, c) { _alsoResize(exp, c); });
		}else{
			_alsoResize(o.alsoResize);
		}
	},

	stop: function (event, ui) {
		$(this).removeData("resizable-alsoresize");
	}
});

$.ui.plugin.add("resizable", "animate", {

	stop: function(event, ui) {
		var self = $(this).data("resizable"), o = self.options;

		var pr = self._proportionallyResizeElements, ista = pr.length && (/textarea/i).test(pr[0].nodeName),
					soffseth = ista && $.ui.hasScroll(pr[0], 'left') /* TODO - jump height */ ? 0 : self.sizeDiff.height,
						soffsetw = ista ? 0 : self.sizeDiff.width;

		var style = { width: (self.size.width - soffsetw), height: (self.size.height - soffseth) },
					left = (parseInt(self.element.css('left'), 10) + (self.position.left - self.originalPosition.left)) || null,
						top = (parseInt(self.element.css('top'), 10) + (self.position.top - self.originalPosition.top)) || null;

		self.element.animate(
			$.extend(style, top && left ? { top: top, left: left } : {}), {
				duration: o.animateDuration,
				easing: o.animateEasing,
				step: function() {

					var data = {
						width: parseInt(self.element.css('width'), 10),
						height: parseInt(self.element.css('height'), 10),
						top: parseInt(self.element.css('top'), 10),
						left: parseInt(self.element.css('left'), 10)
					};

					if (pr && pr.length) $(pr[0]).css({ width: data.width, height: data.height });

					// propagating resize, and updating values for each animation step
					self._updateCache(data);
					self._propagate("resize", event);

				}
			}
		);
	}

});

$.ui.plugin.add("resizable", "containment", {

	start: function(event, ui) {
		var self = $(this).data("resizable"), o = self.options, el = self.element;
		var oc = o.containment,	ce = (oc instanceof $) ? oc.get(0) : (/parent/.test(oc)) ? el.parent().get(0) : oc;
		if (!ce) return;

		self.containerElement = $(ce);

		if (/document/.test(oc) || oc == document) {
			self.containerOffset = { left: 0, top: 0 };
			self.containerPosition = { left: 0, top: 0 };

			self.parentData = {
				element: $(document), left: 0, top: 0,
				width: $(document).width(), height: $(document).height() || document.body.parentNode.scrollHeight
			};
		}

		// i'm a node, so compute top, left, right, bottom
		else {
			var element = $(ce), p = [];
			$([ "Top", "Right", "Left", "Bottom" ]).each(function(i, name) { p[i] = num(element.css("padding" + name)); });

			self.containerOffset = element.offset();
			self.containerPosition = element.position();
			self.containerSize = { height: (element.innerHeight() - p[3]), width: (element.innerWidth() - p[1]) };

			var co = self.containerOffset, ch = self.containerSize.height,	cw = self.containerSize.width,
						width = ($.ui.hasScroll(ce, "left") ? ce.scrollWidth : cw ), height = ($.ui.hasScroll(ce) ? ce.scrollHeight : ch);

			self.parentData = {
				element: ce, left: co.left, top: co.top, width: width, height: height
			};
		}
	},

	resize: function(event, ui) {
		var self = $(this).data("resizable"), o = self.options,
				ps = self.containerSize, co = self.containerOffset, cs = self.size, cp = self.position,
				pRatio = self._aspectRatio || event.shiftKey, cop = { top:0, left:0 }, ce = self.containerElement;

		if (ce[0] != document && (/static/).test(ce.css('position'))) cop = co;

		if (cp.left < (self._helper ? co.left : 0)) {
			self.size.width = self.size.width + (self._helper ? (self.position.left - co.left) : (self.position.left - cop.left));
			if (pRatio) self.size.height = self.size.width / self.aspectRatio;
			self.position.left = o.helper ? co.left : 0;
		}

		if (cp.top < (self._helper ? co.top : 0)) {
			self.size.height = self.size.height + (self._helper ? (self.position.top - co.top) : self.position.top);
			if (pRatio) self.size.width = self.size.height * self.aspectRatio;
			self.position.top = self._helper ? co.top : 0;
		}

		self.offset.left = self.parentData.left+self.position.left;
		self.offset.top = self.parentData.top+self.position.top;

		var woset = Math.abs( (self._helper ? self.offset.left - cop.left : (self.offset.left - cop.left)) + self.sizeDiff.width ),
					hoset = Math.abs( (self._helper ? self.offset.top - cop.top : (self.offset.top - co.top)) + self.sizeDiff.height );

		var isParent = self.containerElement.get(0) == self.element.parent().get(0),
		    isOffsetRelative = /relative|absolute/.test(self.containerElement.css('position'));

		if(isParent && isOffsetRelative) woset -= self.parentData.left;

		if (woset + self.size.width >= self.parentData.width) {
			self.size.width = self.parentData.width - woset;
			if (pRatio) self.size.height = self.size.width / self.aspectRatio;
		}

		if (hoset + self.size.height >= self.parentData.height) {
			self.size.height = self.parentData.height - hoset;
			if (pRatio) self.size.width = self.size.height * self.aspectRatio;
		}
	},

	stop: function(event, ui){
		var self = $(this).data("resizable"), o = self.options, cp = self.position,
				co = self.containerOffset, cop = self.containerPosition, ce = self.containerElement;

		var helper = $(self.helper), ho = helper.offset(), w = helper.outerWidth() - self.sizeDiff.width, h = helper.outerHeight() - self.sizeDiff.height;

		if (self._helper && !o.animate && (/relative/).test(ce.css('position')))
			$(this).css({ left: ho.left - cop.left - co.left, width: w, height: h });

		if (self._helper && !o.animate && (/static/).test(ce.css('position')))
			$(this).css({ left: ho.left - cop.left - co.left, width: w, height: h });

	}
});

$.ui.plugin.add("resizable", "ghost", {

	start: function(event, ui) {

		var self = $(this).data("resizable"), o = self.options, cs = self.size;

		self.ghost = self.originalElement.clone();
		self.ghost
			.css({ opacity: .25, display: 'block', position: 'relative', height: cs.height, width: cs.width, margin: 0, left: 0, top: 0 })
			.addClass('ui-resizable-ghost')
			.addClass(typeof o.ghost == 'string' ? o.ghost : '');

		self.ghost.appendTo(self.helper);

	},

	resize: function(event, ui){
		var self = $(this).data("resizable"), o = self.options;
		if (self.ghost) self.ghost.css({ position: 'relative', height: self.size.height, width: self.size.width });
	},

	stop: function(event, ui){
		var self = $(this).data("resizable"), o = self.options;
		if (self.ghost && self.helper) self.helper.get(0).removeChild(self.ghost.get(0));
	}

});

$.ui.plugin.add("resizable", "grid", {

	resize: function(event, ui) {
		var self = $(this).data("resizable"), o = self.options, cs = self.size, os = self.originalSize, op = self.originalPosition, a = self.axis, ratio = o._aspectRatio || event.shiftKey;
		o.grid = typeof o.grid == "number" ? [o.grid, o.grid] : o.grid;
		var ox = Math.round((cs.width - os.width) / (o.grid[0]||1)) * (o.grid[0]||1), oy = Math.round((cs.height - os.height) / (o.grid[1]||1)) * (o.grid[1]||1);

		if (/^(se|s|e)$/.test(a)) {
			self.size.width = os.width + ox;
			self.size.height = os.height + oy;
		}
		else if (/^(ne)$/.test(a)) {
			self.size.width = os.width + ox;
			self.size.height = os.height + oy;
			self.position.top = op.top - oy;
		}
		else if (/^(sw)$/.test(a)) {
			self.size.width = os.width + ox;
			self.size.height = os.height + oy;
			self.position.left = op.left - ox;
		}
		else {
			self.size.width = os.width + ox;
			self.size.height = os.height + oy;
			self.position.top = op.top - oy;
			self.position.left = op.left - ox;
		}
	}

});

var num = function(v) {
	return parseInt(v, 10) || 0;
};

var isNumber = function(value) {
	return !isNaN(parseInt(value, 10));
};

})(jQuery);
/*!
 * jQuery UI Selectable 1.8.23
 *
 * Copyright 2012, AUTHORS.txt (http://jqueryui.com/about)
 * Dual licensed under the MIT or GPL Version 2 licenses.
 * http://jquery.org/license
 *
 * http://docs.jquery.com/UI/Selectables
 *
 * Depends:
 *	jquery.ui.core.js
 *	jquery.ui.mouse.js
 *	jquery.ui.widget.js
 */
(function( $, undefined ) {

$.widget("ui.selectable", $.ui.mouse, {
	options: {
		appendTo: 'body',
		autoRefresh: true,
		distance: 0,
		filter: '*',
		tolerance: 'touch'
	},
	_create: function() {
		var self = this;

		this.element.addClass("ui-selectable");

		this.dragged = false;

		// cache selectee children based on filter
		var selectees;
		this.refresh = function() {
			selectees = $(self.options.filter, self.element[0]);
			selectees.addClass("ui-selectee");
			selectees.each(function() {
				var $this = $(this);
				var pos = $this.offset();
				$.data(this, "selectable-item", {
					element: this,
					$element: $this,
					left: pos.left,
					top: pos.top,
					right: pos.left + $this.outerWidth(),
					bottom: pos.top + $this.outerHeight(),
					startselected: false,
					selected: $this.hasClass('ui-selected'),
					selecting: $this.hasClass('ui-selecting'),
					unselecting: $this.hasClass('ui-unselecting')
				});
			});
		};
		this.refresh();

		this.selectees = selectees.addClass("ui-selectee");

		this._mouseInit();

		this.helper = $("<div class='ui-selectable-helper'></div>");
	},

	destroy: function() {
		this.selectees
			.removeClass("ui-selectee")
			.removeData("selectable-item");
		this.element
			.removeClass("ui-selectable ui-selectable-disabled")
			.removeData("selectable")
			.unbind(".selectable");
		this._mouseDestroy();

		return this;
	},

	_mouseStart: function(event) {
		var self = this;

		this.opos = [event.pageX, event.pageY];

		if (this.options.disabled)
			return;

		var options = this.options;

		this.selectees = $(options.filter, this.element[0]);

		this._trigger("start", event);

		$(options.appendTo).append(this.helper);
		// position helper (lasso)
		this.helper.css({
			"left": event.clientX,
			"top": event.clientY,
			"width": 0,
			"height": 0
		});

		if (options.autoRefresh) {
			this.refresh();
		}

		this.selectees.filter('.ui-selected').each(function() {
			var selectee = $.data(this, "selectable-item");
			selectee.startselected = true;
			if (!event.metaKey && !event.ctrlKey) {
				selectee.$element.removeClass('ui-selected');
				selectee.selected = false;
				selectee.$element.addClass('ui-unselecting');
				selectee.unselecting = true;
				// selectable UNSELECTING callback
				self._trigger("unselecting", event, {
					unselecting: selectee.element
				});
			}
		});

		$(event.target).parents().andSelf().each(function() {
			var selectee = $.data(this, "selectable-item");
			if (selectee) {
				var doSelect = (!event.metaKey && !event.ctrlKey) || !selectee.$element.hasClass('ui-selected');
				selectee.$element
					.removeClass(doSelect ? "ui-unselecting" : "ui-selected")
					.addClass(doSelect ? "ui-selecting" : "ui-unselecting");
				selectee.unselecting = !doSelect;
				selectee.selecting = doSelect;
				selectee.selected = doSelect;
				// selectable (UN)SELECTING callback
				if (doSelect) {
					self._trigger("selecting", event, {
						selecting: selectee.element
					});
				} else {
					self._trigger("unselecting", event, {
						unselecting: selectee.element
					});
				}
				return false;
			}
		});

	},

	_mouseDrag: function(event) {
		var self = this;
		this.dragged = true;

		if (this.options.disabled)
			return;

		var options = this.options;

		var x1 = this.opos[0], y1 = this.opos[1], x2 = event.pageX, y2 = event.pageY;
		if (x1 > x2) { var tmp = x2; x2 = x1; x1 = tmp; }
		if (y1 > y2) { var tmp = y2; y2 = y1; y1 = tmp; }
		this.helper.css({left: x1, top: y1, width: x2-x1, height: y2-y1});

		this.selectees.each(function() {
			var selectee = $.data(this, "selectable-item");
			//prevent helper from being selected if appendTo: selectable
			if (!selectee || selectee.element == self.element[0])
				return;
			var hit = false;
			if (options.tolerance == 'touch') {
				hit = ( !(selectee.left > x2 || selectee.right < x1 || selectee.top > y2 || selectee.bottom < y1) );
			} else if (options.tolerance == 'fit') {
				hit = (selectee.left > x1 && selectee.right < x2 && selectee.top > y1 && selectee.bottom < y2);
			}

			if (hit) {
				// SELECT
				if (selectee.selected) {
					selectee.$element.removeClass('ui-selected');
					selectee.selected = false;
				}
				if (selectee.unselecting) {
					selectee.$element.removeClass('ui-unselecting');
					selectee.unselecting = false;
				}
				if (!selectee.selecting) {
					selectee.$element.addClass('ui-selecting');
					selectee.selecting = true;
					// selectable SELECTING callback
					self._trigger("selecting", event, {
						selecting: selectee.element
					});
				}
			} else {
				// UNSELECT
				if (selectee.selecting) {
					if ((event.metaKey || event.ctrlKey) && selectee.startselected) {
						selectee.$element.removeClass('ui-selecting');
						selectee.selecting = false;
						selectee.$element.addClass('ui-selected');
						selectee.selected = true;
					} else {
						selectee.$element.removeClass('ui-selecting');
						selectee.selecting = false;
						if (selectee.startselected) {
							selectee.$element.addClass('ui-unselecting');
							selectee.unselecting = true;
						}
						// selectable UNSELECTING callback
						self._trigger("unselecting", event, {
							unselecting: selectee.element
						});
					}
				}
				if (selectee.selected) {
					if (!event.metaKey && !event.ctrlKey && !selectee.startselected) {
						selectee.$element.removeClass('ui-selected');
						selectee.selected = false;

						selectee.$element.addClass('ui-unselecting');
						selectee.unselecting = true;
						// selectable UNSELECTING callback
						self._trigger("unselecting", event, {
							unselecting: selectee.element
						});
					}
				}
			}
		});

		return false;
	},

	_mouseStop: function(event) {
		var self = this;

		this.dragged = false;

		var options = this.options;

		$('.ui-unselecting', this.element[0]).each(function() {
			var selectee = $.data(this, "selectable-item");
			selectee.$element.removeClass('ui-unselecting');
			selectee.unselecting = false;
			selectee.startselected = false;
			self._trigger("unselected", event, {
				unselected: selectee.element
			});
		});
		$('.ui-selecting', this.element[0]).each(function() {
			var selectee = $.data(this, "selectable-item");
			selectee.$element.removeClass('ui-selecting').addClass('ui-selected');
			selectee.selecting = false;
			selectee.selected = true;
			selectee.startselected = true;
			self._trigger("selected", event, {
				selected: selectee.element
			});
		});
		this._trigger("stop", event);

		this.helper.remove();

		return false;
	}

});

$.extend($.ui.selectable, {
	version: "1.8.23"
});

})(jQuery);
/*!
 * jQuery UI Slider 1.8.21
 *
 * Copyright 2012, AUTHORS.txt (http://jqueryui.com/about)
 * Dual licensed under the MIT or GPL Version 2 licenses.
 * http://jquery.org/license
 *
 * http://docs.jquery.com/UI/Slider
 *
 * Depends:
 *	jquery.ui.core.js
 *	jquery.ui.mouse.js
 *	jquery.ui.widget.js
 */
(function( $, undefined ) {

// number of pages in a slider
// (how many times can you page up/down to go through the whole range)
var numPages = 5;

$.widget( "ui.slider", $.ui.mouse, {

	widgetEventPrefix: "slide",

	options: {
		animate: false,
		distance: 0,
		max: 100,
		min: 0,
		orientation: "horizontal",
		range: false,
		step: 1,
		value: 0,
		values: null
	},

	_create: function() {
		var self = this,
			o = this.options,
			existingHandles = this.element.find( ".ui-slider-handle" ).addClass( "ui-state-default ui-corner-all" ),
			handle = "<a class='ui-slider-handle ui-state-default ui-corner-all' href='#'></a>",
			handleCount = ( o.values && o.values.length ) || 1,
			handles = [];

		this._keySliding = false;
		this._mouseSliding = false;
		this._animateOff = true;
		this._handleIndex = null;
		this._detectOrientation();
		this._mouseInit();

		this.element
			.addClass( "ui-slider" +
				" ui-slider-" + this.orientation +
				" ui-widget" +
				" ui-widget-content" +
				" ui-corner-all" +
				( o.disabled ? " ui-slider-disabled ui-disabled" : "" ) );

		this.range = $([]);

		if ( o.range ) {
			if ( o.range === true ) {
				if ( !o.values ) {
					o.values = [ this._valueMin(), this._valueMin() ];
				}
				if ( o.values.length && o.values.length !== 2 ) {
					o.values = [ o.values[0], o.values[0] ];
				}
			}

			this.range = $( "<div></div>" )
				.appendTo( this.element )
				.addClass( "ui-slider-range" +
				// note: this isn't the most fittingly semantic framework class for this element,
				// but worked best visually with a variety of themes
				" ui-widget-header" + 
				( ( o.range === "min" || o.range === "max" ) ? " ui-slider-range-" + o.range : "" ) );
		}

		for ( var i = existingHandles.length; i < handleCount; i += 1 ) {
			handles.push( handle );
		}

		this.handles = existingHandles.add( $( handles.join( "" ) ).appendTo( self.element ) );

		this.handle = this.handles.eq( 0 );

		this.handles.add( this.range ).filter( "a" )
			.click(function( event ) {
				event.preventDefault();
			})
			.hover(function() {
				if ( !o.disabled ) {
					$( this ).addClass( "ui-state-hover" );
				}
			}, function() {
				$( this ).removeClass( "ui-state-hover" );
			})
			.focus(function() {
				if ( !o.disabled ) {
					$( ".ui-slider .ui-state-focus" ).removeClass( "ui-state-focus" );
					$( this ).addClass( "ui-state-focus" );
				} else {
					$( this ).blur();
				}
			})
			.blur(function() {
				$( this ).removeClass( "ui-state-focus" );
			});

		this.handles.each(function( i ) {
			$( this ).data( "index.ui-slider-handle", i );
		});

		this.handles
			.keydown(function( event ) {
				var index = $( this ).data( "index.ui-slider-handle" ),
					allowed,
					curVal,
					newVal,
					step;
	
				if ( self.options.disabled ) {
					return;
				}
	
				switch ( event.keyCode ) {
					case $.ui.keyCode.HOME:
					case $.ui.keyCode.END:
					case $.ui.keyCode.PAGE_UP:
					case $.ui.keyCode.PAGE_DOWN:
					case $.ui.keyCode.UP:
					case $.ui.keyCode.RIGHT:
					case $.ui.keyCode.DOWN:
					case $.ui.keyCode.LEFT:
						event.preventDefault();
						if ( !self._keySliding ) {
							self._keySliding = true;
							$( this ).addClass( "ui-state-active" );
							allowed = self._start( event, index );
							if ( allowed === false ) {
								return;
							}
						}
						break;
				}
	
				step = self.options.step;
				if ( self.options.values && self.options.values.length ) {
					curVal = newVal = self.values( index );
				} else {
					curVal = newVal = self.value();
				}
	
				switch ( event.keyCode ) {
					case $.ui.keyCode.HOME:
						newVal = self._valueMin();
						break;
					case $.ui.keyCode.END:
						newVal = self._valueMax();
						break;
					case $.ui.keyCode.PAGE_UP:
						newVal = self._trimAlignValue( curVal + ( (self._valueMax() - self._valueMin()) / numPages ) );
						break;
					case $.ui.keyCode.PAGE_DOWN:
						newVal = self._trimAlignValue( curVal - ( (self._valueMax() - self._valueMin()) / numPages ) );
						break;
					case $.ui.keyCode.UP:
					case $.ui.keyCode.RIGHT:
						if ( curVal === self._valueMax() ) {
							return;
						}
						newVal = self._trimAlignValue( curVal + step );
						break;
					case $.ui.keyCode.DOWN:
					case $.ui.keyCode.LEFT:
						if ( curVal === self._valueMin() ) {
							return;
						}
						newVal = self._trimAlignValue( curVal - step );
						break;
				}
	
				self._slide( event, index, newVal );
			})
			.keyup(function( event ) {
				var index = $( this ).data( "index.ui-slider-handle" );
	
				if ( self._keySliding ) {
					self._keySliding = false;
					self._stop( event, index );
					self._change( event, index );
					$( this ).removeClass( "ui-state-active" );
				}
	
			});

		this._refreshValue();

		this._animateOff = false;
	},

	destroy: function() {
		this.handles.remove();
		this.range.remove();

		this.element
			.removeClass( "ui-slider" +
				" ui-slider-horizontal" +
				" ui-slider-vertical" +
				" ui-slider-disabled" +
				" ui-widget" +
				" ui-widget-content" +
				" ui-corner-all" )
			.removeData( "slider" )
			.unbind( ".slider" );

		this._mouseDestroy();

		return this;
	},

	_mouseCapture: function( event ) {
		var o = this.options,
			position,
			normValue,
			distance,
			closestHandle,
			self,
			index,
			allowed,
			offset,
			mouseOverHandle;

		if ( o.disabled ) {
			return false;
		}

		this.elementSize = {
			width: this.element.outerWidth(),
			height: this.element.outerHeight()
		};
		this.elementOffset = this.element.offset();

		position = { x: event.pageX, y: event.pageY };
		normValue = this._normValueFromMouse( position );
		distance = this._valueMax() - this._valueMin() + 1;
		self = this;
		this.handles.each(function( i ) {
			var thisDistance = Math.abs( normValue - self.values(i) );
			if ( distance > thisDistance ) {
				distance = thisDistance;
				closestHandle = $( this );
				index = i;
			}
		});

		// workaround for bug #3736 (if both handles of a range are at 0,
		// the first is always used as the one with least distance,
		// and moving it is obviously prevented by preventing negative ranges)
		if( o.range === true && this.values(1) === o.min ) {
			index += 1;
			closestHandle = $( this.handles[index] );
		}

		allowed = this._start( event, index );
		if ( allowed === false ) {
			return false;
		}
		this._mouseSliding = true;

		self._handleIndex = index;

		closestHandle
			.addClass( "ui-state-active" )
			.focus();
		
		offset = closestHandle.offset();
		mouseOverHandle = !$( event.target ).parents().andSelf().is( ".ui-slider-handle" );
		this._clickOffset = mouseOverHandle ? { left: 0, top: 0 } : {
			left: event.pageX - offset.left - ( closestHandle.width() / 2 ),
			top: event.pageY - offset.top -
				( closestHandle.height() / 2 ) -
				( parseInt( closestHandle.css("borderTopWidth"), 10 ) || 0 ) -
				( parseInt( closestHandle.css("borderBottomWidth"), 10 ) || 0) +
				( parseInt( closestHandle.css("marginTop"), 10 ) || 0)
		};

		if ( !this.handles.hasClass( "ui-state-hover" ) ) {
			this._slide( event, index, normValue );
		}
		this._animateOff = true;
		return true;
	},

	_mouseStart: function( event ) {
		return true;
	},

	_mouseDrag: function( event ) {
		var position = { x: event.pageX, y: event.pageY },
			normValue = this._normValueFromMouse( position );
		
		this._slide( event, this._handleIndex, normValue );

		return false;
	},

	_mouseStop: function( event ) {
		this.handles.removeClass( "ui-state-active" );
		this._mouseSliding = false;

		this._stop( event, this._handleIndex );
		this._change( event, this._handleIndex );

		this._handleIndex = null;
		this._clickOffset = null;
		this._animateOff = false;

		return false;
	},
	
	_detectOrientation: function() {
		this.orientation = ( this.options.orientation === "vertical" ) ? "vertical" : "horizontal";
	},

	_normValueFromMouse: function( position ) {
		var pixelTotal,
			pixelMouse,
			percentMouse,
			valueTotal,
			valueMouse;

		if ( this.orientation === "horizontal" ) {
			pixelTotal = this.elementSize.width;
			pixelMouse = position.x - this.elementOffset.left - ( this._clickOffset ? this._clickOffset.left : 0 );
		} else {
			pixelTotal = this.elementSize.height;
			pixelMouse = position.y - this.elementOffset.top - ( this._clickOffset ? this._clickOffset.top : 0 );
		}

		percentMouse = ( pixelMouse / pixelTotal );
		if ( percentMouse > 1 ) {
			percentMouse = 1;
		}
		if ( percentMouse < 0 ) {
			percentMouse = 0;
		}
		if ( this.orientation === "vertical" ) {
			percentMouse = 1 - percentMouse;
		}

		valueTotal = this._valueMax() - this._valueMin();
		valueMouse = this._valueMin() + percentMouse * valueTotal;

		return this._trimAlignValue( valueMouse );
	},

	_start: function( event, index ) {
		var uiHash = {
			handle: this.handles[ index ],
			value: this.value()
		};
		if ( this.options.values && this.options.values.length ) {
			uiHash.value = this.values( index );
			uiHash.values = this.values();
		}
		return this._trigger( "start", event, uiHash );
	},

	_slide: function( event, index, newVal ) {
		var otherVal,
			newValues,
			allowed;

		if ( this.options.values && this.options.values.length ) {
			otherVal = this.values( index ? 0 : 1 );

			if ( ( this.options.values.length === 2 && this.options.range === true ) && 
					( ( index === 0 && newVal > otherVal) || ( index === 1 && newVal < otherVal ) )
				) {
				newVal = otherVal;
			}

			if ( newVal !== this.values( index ) ) {
				newValues = this.values();
				newValues[ index ] = newVal;
				// A slide can be canceled by returning false from the slide callback
				allowed = this._trigger( "slide", event, {
					handle: this.handles[ index ],
					value: newVal,
					values: newValues
				} );
				otherVal = this.values( index ? 0 : 1 );
				if ( allowed !== false ) {
					this.values( index, newVal, true );
				}
			}
		} else {
			if ( newVal !== this.value() ) {
				// A slide can be canceled by returning false from the slide callback
				allowed = this._trigger( "slide", event, {
					handle: this.handles[ index ],
					value: newVal
				} );
				if ( allowed !== false ) {
					this.value( newVal );
				}
			}
		}
	},

	_stop: function( event, index ) {
		var uiHash = {
			handle: this.handles[ index ],
			value: this.value()
		};
		if ( this.options.values && this.options.values.length ) {
			uiHash.value = this.values( index );
			uiHash.values = this.values();
		}

		this._trigger( "stop", event, uiHash );
	},

	_change: function( event, index ) {
		if ( !this._keySliding && !this._mouseSliding ) {
			var uiHash = {
				handle: this.handles[ index ],
				value: this.value()
			};
			if ( this.options.values && this.options.values.length ) {
				uiHash.value = this.values( index );
				uiHash.values = this.values();
			}

			this._trigger( "change", event, uiHash );
		}
	},

	value: function( newValue ) {
		if ( arguments.length ) {
			this.options.value = this._trimAlignValue( newValue );
			this._refreshValue();
			this._change( null, 0 );
			return;
		}

		return this._value();
	},

	values: function( index, newValue ) {
		var vals,
			newValues,
			i;

		if ( arguments.length > 1 ) {
			this.options.values[ index ] = this._trimAlignValue( newValue );
			this._refreshValue();
			this._change( null, index );
			return;
		}

		if ( arguments.length ) {
			if ( $.isArray( arguments[ 0 ] ) ) {
				vals = this.options.values;
				newValues = arguments[ 0 ];
				for ( i = 0; i < vals.length; i += 1 ) {
					vals[ i ] = this._trimAlignValue( newValues[ i ] );
					this._change( null, i );
				}
				this._refreshValue();
			} else {
				if ( this.options.values && this.options.values.length ) {
					return this._values( index );
				} else {
					return this.value();
				}
			}
		} else {
			return this._values();
		}
	},

	_setOption: function( key, value ) {
		var i,
			valsLength = 0;

		if ( $.isArray( this.options.values ) ) {
			valsLength = this.options.values.length;
		}

		$.Widget.prototype._setOption.apply( this, arguments );

		switch ( key ) {
			case "disabled":
				if ( value ) {
					this.handles.filter( ".ui-state-focus" ).blur();
					this.handles.removeClass( "ui-state-hover" );
					this.handles.propAttr( "disabled", true );
					this.element.addClass( "ui-disabled" );
				} else {
					this.handles.propAttr( "disabled", false );
					this.element.removeClass( "ui-disabled" );
				}
				break;
			case "orientation":
				this._detectOrientation();
				this.element
					.removeClass( "ui-slider-horizontal ui-slider-vertical" )
					.addClass( "ui-slider-" + this.orientation );
				this._refreshValue();
				break;
			case "value":
				this._animateOff = true;
				this._refreshValue();
				this._change( null, 0 );
				this._animateOff = false;
				break;
			case "values":
				this._animateOff = true;
				this._refreshValue();
				for ( i = 0; i < valsLength; i += 1 ) {
					this._change( null, i );
				}
				this._animateOff = false;
				break;
		}
	},

	//internal value getter
	// _value() returns value trimmed by min and max, aligned by step
	_value: function() {
		var val = this.options.value;
		val = this._trimAlignValue( val );

		return val;
	},

	//internal values getter
	// _values() returns array of values trimmed by min and max, aligned by step
	// _values( index ) returns single value trimmed by min and max, aligned by step
	_values: function( index ) {
		var val,
			vals,
			i;

		if ( arguments.length ) {
			val = this.options.values[ index ];
			val = this._trimAlignValue( val );

			return val;
		} else {
			// .slice() creates a copy of the array
			// this copy gets trimmed by min and max and then returned
			vals = this.options.values.slice();
			for ( i = 0; i < vals.length; i+= 1) {
				vals[ i ] = this._trimAlignValue( vals[ i ] );
			}

			return vals;
		}
	},
	
	// returns the step-aligned value that val is closest to, between (inclusive) min and max
	_trimAlignValue: function( val ) {
		if ( val <= this._valueMin() ) {
			return this._valueMin();
		}
		if ( val >= this._valueMax() ) {
			return this._valueMax();
		}
		var step = ( this.options.step > 0 ) ? this.options.step : 1,
			valModStep = (val - this._valueMin()) % step,
			alignValue = val - valModStep;

		if ( Math.abs(valModStep) * 2 >= step ) {
			alignValue += ( valModStep > 0 ) ? step : ( -step );
		}

		// Since JavaScript has problems with large floats, round
		// the final value to 5 digits after the decimal point (see #4124)
		return parseFloat( alignValue.toFixed(5) );
	},

	_valueMin: function() {
		return this.options.min;
	},

	_valueMax: function() {
		return this.options.max;
	},
	
	_refreshValue: function() {
		var oRange = this.options.range,
			o = this.options,
			self = this,
			animate = ( !this._animateOff ) ? o.animate : false,
			valPercent,
			_set = {},
			lastValPercent,
			value,
			valueMin,
			valueMax;

		if ( this.options.values && this.options.values.length ) {
			this.handles.each(function( i, j ) {
				valPercent = ( self.values(i) - self._valueMin() ) / ( self._valueMax() - self._valueMin() ) * 100;
				_set[ self.orientation === "horizontal" ? "left" : "bottom" ] = valPercent + "%";
				$( this ).stop( 1, 1 )[ animate ? "animate" : "css" ]( _set, o.animate );
				if ( self.options.range === true ) {
					if ( self.orientation === "horizontal" ) {
						if ( i === 0 ) {
							self.range.stop( 1, 1 )[ animate ? "animate" : "css" ]( { left: valPercent + "%" }, o.animate );
						}
						if ( i === 1 ) {
							self.range[ animate ? "animate" : "css" ]( { width: ( valPercent - lastValPercent ) + "%" }, { queue: false, duration: o.animate } );
						}
					} else {
						if ( i === 0 ) {
							self.range.stop( 1, 1 )[ animate ? "animate" : "css" ]( { bottom: ( valPercent ) + "%" }, o.animate );
						}
						if ( i === 1 ) {
							self.range[ animate ? "animate" : "css" ]( { height: ( valPercent - lastValPercent ) + "%" }, { queue: false, duration: o.animate } );
						}
					}
				}
				lastValPercent = valPercent;
			});
		} else {
			value = this.value();
			valueMin = this._valueMin();
			valueMax = this._valueMax();
			valPercent = ( valueMax !== valueMin ) ?
					( value - valueMin ) / ( valueMax - valueMin ) * 100 :
					0;
			_set[ self.orientation === "horizontal" ? "left" : "bottom" ] = valPercent + "%";
			this.handle.stop( 1, 1 )[ animate ? "animate" : "css" ]( _set, o.animate );

			if ( oRange === "min" && this.orientation === "horizontal" ) {
				this.range.stop( 1, 1 )[ animate ? "animate" : "css" ]( { width: valPercent + "%" }, o.animate );
			}
			if ( oRange === "max" && this.orientation === "horizontal" ) {
				this.range[ animate ? "animate" : "css" ]( { width: ( 100 - valPercent ) + "%" }, { queue: false, duration: o.animate } );
			}
			if ( oRange === "min" && this.orientation === "vertical" ) {
				this.range.stop( 1, 1 )[ animate ? "animate" : "css" ]( { height: valPercent + "%" }, o.animate );
			}
			if ( oRange === "max" && this.orientation === "vertical" ) {
				this.range[ animate ? "animate" : "css" ]( { height: ( 100 - valPercent ) + "%" }, { queue: false, duration: o.animate } );
			}
		}
	}

});

$.extend( $.ui.slider, {
	version: "1.8.21"
});

}(jQuery));
function CountDown (date, endCallback, parent) {
	
	// we make a public setter so we can databind the date in the generator
	var d = date;
	this.setDate = function(newDate) {
		if (d != newDate && newDate != undefined) {
			d = newDate;
			startCounting(newDate);
		}
	};
    
    // use a container, because the .html method is called later,
    // otherwise you might wipe data the caller prepended to the parent.
    var container = $('<div>');
    parent.append(container);
    
    function startCounting(capturedDate) {
    	// if the date has changed, this timer is old and should stop
    	if (capturedDate != d) { return; }
        //count down
        var now = new Date();
        var dif = d.getTime() - now.getTime();
        dif = Math.floor(dif/1000);
        var check = dif;
        
        var days = Math.floor(dif/86400);
        dif = dif%86400;
        
        var hours = Math.floor(dif/3600);
        dif = dif%3600;
        
        var minutes = Math.floor(dif/60);
        dif = dif%60;
        var seconds = Math.floor(dif);
        
        if(check > 0) {
        	// the date is still in the future
        	// update the counter and start a new timer
        	displayCounter(days, hours, minutes, seconds);
            setTimeout(function(){startCounting(capturedDate);}, 1000);
        } else {
            endCallback();
        }
    };
    
    /**
     * Replaces the containers contents by the given parameters, formatted like:
     * days "days" hours ":" minutes ":" seconds (without the quotes)
     */
    function displayCounter(days, hours, minutes, seconds) {
        container.html(days + " days " + normalize(hours) + " : " + normalize(minutes) + " : " + normalize(seconds));
    };
    
    /**
     * Pads s with a leading 0 if it is a single digit number.
     * @param s the number (or String parseable to number).
     * @returns s or a String representing s with a leading 0 if s < 10.
     */
    function normalize(s) {
        return s < 10 ? "0" + s : s; 
    }
    
    if (d != undefined) { startCounting(d); }
}

/**
 * Draws a date picker where a Company can mark slots as being free and/or having a discount.
 * 
 * @param container the jQuery DOM element where the picker will be added to.
 * @param slotSize the size of the blocks (slots) that can be selected (in minutes).
 * @param startTime the start time where the drawing of slots should begin (in whole hours).
 * @param endTime the end time where the drawing of slots should end (in whole hours).
 */
function clientDatePicker(container, slotSize, startTime, endTime, list, date, showDates, dayNames) {
    this.container = container;
    this.slotSize = slotSize;

    this.startTime = startTime;
    this.endTime = endTime;
	this.list = list;
	
	//set date to monday
	date.setDate(date.getDate() - (date.getDay() + 6) %7);
	this.monday = date;
	//TODO set these names if dayNames is not set
    //this.weekDays = ["maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"];
	this.weekDays = ["Ma", "Di", "Wo", "Do", "Vr", "Za", "Zo"];

	this.showDates = showDates;
    this.dContainer = $("<div class='sim-ui-super-container' style=\"height:100%;position:relative;\">");
    this.container.append(this.dContainer);

    this.numSlotsPerDay = Math.floor((this.endTime * 60 - this.startTime * 60) / this.slotSize);

    this.draw();
}

// draws the actual picker
clientDatePicker.prototype.draw = function() {

	var slotHeight = 22;
	var slotWidth = 62;

	var slotList = this.list;
	var superContainer = this.dContainer;
    this.dContainer.html('');
    var tableContainer = $('<div class="sim-ui-dayselection-container">');
    var dayTable = $("<table class='sim-ui-dayselection-daytable'>");
    var table = $("<table class='pickerTable right_calendar'>");
	var monday = this.monday;
    tableContainer.html(table);
	
	var startTime = this.startTime;
    var hour;
    var minute;

	//set jquery draggable and resizeable options
	var resizeOptions = {
		// the slot is resizable in a downward (south) direction 
		handles		: 's',
		// and should not leave the timeline (and thus slotsContainer)
		containment	: superContainer,
		// resize at slotDuration minute intervals
		grid		: [60, 21 * minuteHeight],
		// update the endtime of the slot on resize
		resize: function(){
			//TODO save in Item
		},
		// a slot can never be smaller than the slotDuration
		minHeight	: 21,
		minWidth :60,
		maxWidth :60,
		start : function(event) {
			// console.log(list.unwrap());
			// var tmpHour = (($(this).position().top - 2 - 17) / 22) * 15 / 60 + startTime;
			// var tmpMin = ($(this).position().top - 2 - 17) / 22 * 15;
			// timeObj = {
				// start : {
					// hour : Math.floor(tmpHour),
					// minutes :  tmpMin % 60
				// },
				// end : {
					// hour : Math.floor((($(this).height() + 1) / 22) * 15 / 60 + tmpHour),
					// minutes : ((($(this).height() + 1) / 22) * 15 + tmpMin) % 60
				// }
			// };
			updateList();
		},
		// update the slots
		stop : function(event) {
			var rest = $(this).height() % 22;
			if(rest < 11)
				$(this).height($(this).height() - (rest + 1));
			else
				$(this).height($(this).height() + (21 - rest));
			updateList();
		}
	};
	
	var draggableOptions = {
		// only drag vertical
		axis 		: 'y',
		// drag in 5 minute intervals
//				grid 		: [50, 5 * minuteHeight],
		// snapping to edges of slotcontainer
		snap		: '.sim-ui-super-container',//+cssSlot,
		snapMode 	: 'both',
		snapTolerance:3*minuteHeight,
		// placeholder for the containment area
		containment	: 'parent',
		// update the times when the slot is being dragged
		drag : function() {
			if($(this).position().top < 19) {
				$(this).css('top', 19);
				return;
			}
			//TODO update items
		},
		// update the boundaries of previous and next slots
		stop : function(event) {
			var rest = $(this).position().top % 22;
			if(rest < 11)
				$(this).css('top', ($(this).position().top - (rest + 3)));
			else
				$(this).css('top', ($(this).position().top + (21 - rest - 2)));

			updateList();
		}
	};
	
    this.dContainer.append(dayTable);
    this.dContainer.append(tableContainer);

    var clickFunction = this.onClick;

    // matrix representing whether a slot is selected as being free
    var freeCells = Array(7);
    // matrix representing whether a slot is selected as having a discount
    var discountCells = Array(7);
    
    // initialize all matrices
    // y and x are reversed!
    for(var y = 0; y < 7; y++) {
        freeCells[y] = Array(this.numSlotsPerDay);
        discountCells[y] = Array(this.numSlotsPerDay);
    }

	//print first row
	var row = $('<tr>');
	table.append(row);
	for(var x = 0; x < 8; x++) {
		var col = $('<td>');
		if(x == 0)
			row.addClass('first_right');
		row.append(col);
	}
	
    //start drawing
    for(var x = 0; x < this.numSlotsPerDay; x++) {
		
        var row = $("<tr>");
		if(x % 2 == 0)
			row.addClass('dotted_line');
        table.append(row);
       
        for(var col = 0; col < 8; col++) {
            var cel = $("<td>");
            row.append(cel);

            // first column is empty for styling purposes
            if(col == 0){
                cel.addClass("first_right");
                minute = Math.floor((this.startTime * 60 + x * this.slotSize) % 60);
                hour = Math.floor((this.startTime * 60 + x * this.slotSize) / 60);
                cel.html(this.addLeadingZero(hour) + ":" + this.addLeadingZero(minute));
            }
        }
    }
	
	var sunday = new Date();
	sunday.setDate(monday.getDate() + 7);
	sunday.setHours(0,0,0,0);
	console.log(sunday);
	
	for(var i = 0; i < slotList.size(); i++) {
		if(slotList.get(i).getDate().get() >= monday && slotList.get(i).getDate().get() < sunday) {
			var day = (slotList.get(i).getDate().get().getDay() + 6) % 7;
			for(var j = 0; j < slotList.get(i).getSlots().size(); j++) {
				console.log(Math.abs((45 - 60) % 60));
				var top = (slotList.get(i).getSlots().get(j).getStart_time().getHours().get() - startTime) * 22 * 4 + 18;
				top += (slotList.get(i).getSlots().get(j).getStart_time().getMinutes().get() / 15) * 22 + 1;
				var left = day * 61 + 62;
				var minutesStart = slotList.get(i).getSlots().get(j).getStart_time().getHours().get() * 60;
				minutesStart += slotList.get(i).getSlots().get(j).getStart_time().getMinutes().get();
				var minutesEnd = slotList.get(i).getSlots().get(j).getEnd_time().getHours().get() * 60;
				minutesEnd += slotList.get(i).getSlots().get(j).getEnd_time().getMinutes().get();
				var minutesDiff = minutesEnd - minutesStart;
				var height = minutesDiff / 15 * 22 - 1;
				if(height == 0)
					height = 21;
				var newDiv = $('<div class="sillyGoose" style="width:60px;height:'+height+'px;position:absolute;top:'+top+'px;left:'+left+'px;background:#6CF;">');
				superContainer.append(newDiv);
				newDiv.resizable(resizeOptions);
				newDiv.draggable(draggableOptions);
			}
		}
	}
	
	var mouseDown = false;
	
	//temp variable for storing the start and end data of a slot.
	//	also stores the current div for stretching.
	var tmpMemory = {
		date : null,
		start : {
			cell : null,
			row : null
		},
		end : {
			cell : null,
			row : null
		},
		div: null
	};
	var minuteHeight = Math.floor(21 / 60);
	$('.right_calendar td').mousedown(function() {
		mouseDown = true;
		var rows = $(this).parents('tr');
		var cellIndex = this.cellIndex;
		var rowIndex = rows[0].rowIndex;
		
		if(rowIndex > 0 && cellIndex > 0) {
			var top = rowIndex * 22 - 3;
			var left = cellIndex * 61 + 1;
			var newDiv = $('<div class="sillyGoose" style="width:60px;height:21px;position:absolute;top:'+top+'px;left:'+left+'px;background:#6CF;">');
			newDiv.mouseup(passThrough);
			newDiv.mousedown(passThrough);
			newDiv.mousemove(passThrough);
			superContainer.append(newDiv);
			tmpMemory.start.cell = cellIndex;
			tmpMemory.start.row = rowIndex;
			tmpMemory.div = newDiv;
			
		}
	});
	
	$('.right_calendar td').mousemove(function(event) {
		if(mouseDown) {
			var rows = $(this).parents('tr');
			var cellIndex = this.cellIndex;
			var rowIndex = rows[0].rowIndex;
			
			if(rowIndex > 0 && cellIndex > 0) {
				var tmpRow = rowIndex - tmpMemory.start.row;
				if(tmpRow >= 0)
					tmpMemory.div.css('height', (21 + tmpRow * 22) + 'px');
			}
			
		}
	});
	
	$('.right_calendar td').mouseup(function() {
		mouseDown = false;
		var rows = $(this).parents('tr');
		var cellIndex = this.cellIndex;
		var rowIndex = rows[0].rowIndex;
		
		if(tmpMemory.div != null) {
			var timeObj = {
				start : {
					hour : Math.floor((tmpMemory.start.row - 1) * 15 / 60 + startTime),
					minutes :  ((tmpMemory.start.row - 1) * 15) % 60
				},
				end : {
					hour : Math.floor(rowIndex * 15 / 60 + startTime),
					minutes : (cellIndex * 15) % 60
				}
			};
			updateList();
			
			//unbind so people can do other mouse events in the future
			tmpMemory.div.unbind('mousedown');
			tmpMemory.div.unbind('mousemove');
			tmpMemory.div.unbind('mouseup');
			
			
			tmpMemory.div.resizable(resizeOptions);
			tmpMemory.div.draggable(draggableOptions);
			tmpMemory.div = null;
		}
	});
	
	function updateList() {
		var imAdjustingVisibleSlots = false;
		if (!imAdjustingVisibleSlots) {
			imAdjustingTheSlotList = true;
			//list.clear();
			
			var sunday = new Date();
			sunday.setDate(monday.getDate() + 7);
			sunday.setHours(0,0,0,0);
			console.log(sunday);
			//clear this week
			for(var i = 0; i < slotList.size(); i++) {
				if(slotList.get(i).getDate().get() >= monday && slotList.get(i).getDate().get() < sunday) {
					slotList.get(i).getSlots().clear();
				}
			}
			
			// split long slots in smaller slots with length = slotDuration
			$('.sillyGoose').each(function(i, el){
				var slot = $(el);
				
				var tmpHour = ((slot.position().top - 2 - 17) / 22) * 15 / 60 + startTime;
				var tmpMin = (slot.position().top - 2 - 17) / 22 * 15;
				
				//calculate out the day, 0 = monday, 6 = sunday
				var day = new Date()
				day.setDate(monday.getDate() + (slot.position().left - 1) / 61 - 1);
				//set time to midnight for easy comparison
				day.setHours(0,0,0,0);
				
				if(slotList.size() > 0) {
					var isHit = false;
					for(var i = 0; i < slotList.size(); i++){
						if(slotList.get(i).getDate().compareTo(new Item(day)) == 0) {
							slotList.get(i).getSlots().add(new Item({
									start_time : {
									hours : Math.floor(tmpHour),
									minutes : tmpMin % 60
								},
								end_time : {
									hours : Math.floor((($(this).height() + 1) / 22) * 15 / 60 + tmpHour),
									minutes : ((($(this).height() + 1) / 22) * 15 + tmpMin) % 60
								}
							}));
							isHit = true;
							break;
						}
					}
					if(!isHit) {
						var item = new Item({
							date : day,
							slots : []
						});
						
						item.getSlots().add(
							new Item({
									start_time : {
									hours : Math.floor(tmpHour),
									minutes : tmpMin % 60
								},
								end_time : {
									hours : Math.floor((($(this).height() + 1) / 22) * 15 / 60 + tmpHour),
									minutes : ((($(this).height() + 1) / 22) * 15 + tmpMin) % 60
								}
							})
						);
						
						slotList.add(item);
					}
				} else {
					var item = new Item({
						date : day,
						slots : []
					});
					
					console.log(item.getSlots());
					item.getSlots().add(
						new Item({
								start_time : {
								hours : Math.floor(tmpHour),
								minutes : tmpMin % 60
							},
							end_time : {
								hours : Math.floor((($(this).height() + 1) / 22) * 15 / 60 + tmpHour),
								minutes : ((($(this).height() + 1) / 22) * 15 + tmpMin) % 60
							}
						})
					);
					slotList.add(item);
				}
			});
			imAdjustingTheSlotList = false;
		}
	}
	
	//passThrough function for mouse events
	function passThrough(e) {
		$(".right_calendar td").each(function() {
			// check if clicked point (taken from event) is inside element
			var mouseX = e.pageX;
			var mouseY = e.pageY;
			var offset = $(this).offset();
			var width = $(this).width();
			var height = $(this).height();
		   
			if (mouseX > offset.left && mouseX < offset.left+width && 
				mouseY > offset.top && mouseY < offset.top+height) {
				switch(e.handleObj.type) {
					case 'mousedown':
						$(this).mousedown();
						break;
					case 'mouseup':
						$(this).mouseup();
						break;
					case 'mousemove':
						$(this).mousemove();
						break;
					default:
						$(this).click();
				}
			}
		});
	}
	
};

clientDatePicker.prototype.setDate = function(date) {
	date.setDate(date.getDate() - (date.getDay() + 6) %7);
	this.monday = date;
	this.draw();
}


clientDatePicker.prototype.addLeadingZero = function(int) {
    return int > 9 ? int : "0" + int;
};

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
function clientTimeList(slotList, container, product, day, timelineStartHour, timelineEndHour) {
	// constants
	var emptySlotHeight = 82; // Note: this should include borders!
	var emptySlotWidth = 100; // Note: this should include borders!
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
/**
 * Draws a date picker where a Company can mark slots as being free and/or having a discount.
 * 
 * @param container the jQuery DOM element where the picker will be added to.
 * @param slotSize the size of the blocks (slots) that can be selected (in minutes).
 * @param startTime the start time where the drawing of slots should begin (in whole hours).
 * @param endTime the end time where the drawing of slots should end (in whole hours).
 */
function datePicker2(container, slotSize, startTime, endTime) {
    this.container = container;
    this.slotSize = slotSize;

    this.startTime = startTime;
    this.endTime = endTime;
    this.weekDays = ["maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"];

    this.dContainer = $("<div style=\"height:100%;\">");
    this.container.append(this.dContainer);

    this.numSlotsPerDay = Math.floor((this.endTime * 60 - this.startTime * 60) / this.slotSize);

    this.draw();
}

// draws the actual picker
datePicker2.prototype.draw = function() {
    this.dContainer.html('');
    var tableContainer = $('<div class="sim-ui-dayselection-container">');
    var dayTable = $("<table class='sim-ui-dayselection-daytable'>");
    var table = $("<table class='pickerTable'>");
    tableContainer.html(table);
    var hour;
    var minute;

    this.dContainer.append(dayTable);
    this.dContainer.append(tableContainer);

    var clickFunction = this.onClick;

    var preTR = $("<tr>");
    dayTable.append(preTR);

    //draw the top row wich will tell the current days 
    for(var x = 0; x < 8; x++) {
        var cel = $("<td>");
        preTR.append(cel);

        if(x > 0) {
            cel.addClass("sim-ui-pickertable-infoslot");
            cel.html(this.weekDays[x - 1] + "<br />");
        } else {
            cel.addClass("sim-ui-pickertable-timeslot");
        }
    }
    
    // matrix representing whether a slot is selected as being free
    var freeCells = Array(7);
    // matrix representing whether a slot is selected as having a discount
    var discountCells = Array(7);
    
    // initialize all matrices
    // y and x are reversed!
    for(var y = 0; y < 7; y++) {
        freeCells[y] = Array(this.numSlotsPerDay);
        discountCells[y] = Array(this.numSlotsPerDay);
    }

    //start drawing
    for(var x = 0; x < this.numSlotsPerDay; x++) {
        var row = $("<tr>");
        table.append(row);
       
        for(var col = 0; col < 8; col++) {
            var cel = $("<td>");
            var celSpan = $("<div>");
            cel.html(celSpan);
            row.append(cel);
            var celNBSP = $('<div>');
            celNBSP.html('&nbsp;');
            cel.append(celNBSP);

            // first column is empty for styling purposes
            if(col != 0){
            	cel.addClass("pickerCellNo");
            } else {
                cel.addClass("sim-ui-pickertable-timeslot");
                minute = Math.floor((this.startTime * 60 + x * this.slotSize) % 60);
                hour = Math.floor((this.startTime * 60 + x * this.slotSize) / 60);
                cel.html(this.addLeadingZero(hour) + ":" + this.addLeadingZero(minute));
            }
        }
    }

};

datePicker2.prototype.addLeadingZero = function(int) {
    return int > 9 ? int : "0" + int;
};

/**
 * Binds the given boolean literal to a checkbox.
 * If the value of the given item is not true, it will be assumed to be false (and set to be sure).
 * However, if the checkbox is unchecked by a user operation, the item's value will be set to false.
 */
var checkboxField = function(bindItem, container, label) {
	// precondition check:
	if ( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for a checkboxField."; }
	if ( container == undefined ) { throw "The container parameter is NOT optional for a checkboxField."; }
	
	// the checkbox
	var box = $('<input type="checkbox"/>');
	container.append(box);
	
	// the label
	if (label != undefined) {
		var labelSpan = $('<span>').append(label);
		labelSpan.click(function() { box.trigger('click'); });
		container.append(labelSpan);
	}
	
	// function to update the checked state of the checkbox, based on the bindItem's value
	function setChecked() {
		box.prop('checked', bindItem.get() == true? true : false);
	}
	
	// make the checkbox update when the bindItem changes
	bindItem.addObserver(function(x) { setChecked(); });
	// make the bindItem update when the checkbox changes
	box.change(function(){ bindItem.set(box.prop('checked')); });
	
	// initialize the bindItem's value (to disallow null)
	bindItem.set(bindItem.get() ? true : false);
	// initialize the checkbox
	setChecked();
};
/**
 * A widget which creates an input field and binds it to a Date literal.
 * It uses the jQuery UI datepicker.
 * @param bindItem the date literal.
 * @param container the DOM element to append the input field to.
 */
function dateField(bindItem, container) {
	// precondition check:
	if ( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for a dateField."; }
	if ( container == undefined ) { throw "The container parameter is NOT optional for a dateField."; }
	
	// format for displaying dates in the input field
	var dateFormat = "dd-mm-yy"; // e.g. 01-03-2012
	
	// the input element
	var input = $('<input type="text">');
	
	// append it before you call .datepicker otherwise it won't work (jQuery UI datepicker requirement)
	container.append(input);
	// add the datepicker functionality
	input.datepicker({dateFormat : dateFormat});
	
	// function to update the value of the input field to the value of the literal
	function updateDate() {
		input.val($.datepicker.formatDate(dateFormat, bindItem.get()));
	}
	
	// make the input field change when the literal changes
	bindItem.addObserver(function(){updateDate();});
	// make literal change when the value of the input field changes
	input.change(function(){bindItem.set(input.datepicker('getDate'));});
	
	// initialize the value of the input field
	updateDate();
}
/**
 * Appends an input field for the given email literal to the container. 
 * @param bindItem the email literal.
 * @param container the DOM element to append the input field to.
 * @param options an object holding the (optional) values for the various options.
 */
function emailField(bindItem, container, options) {
	options = options || {};
	options.placeholder = options.placeholder || "";

	// precondition check:
	if ( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for an emailField."; }
	if ( container == undefined ) { throw "The container parameter is NOT optional for an emailField."; }
	
    // the input field
    var field = $(document.createElement('input'));
    field.attr("type", "text");
    if (options.name != undefined) {
    	field.attr('name', options.name);
    }
    if( options.length != undefined ) {
    	field.attr("maxlength", options.length);
    }
    container.append(field);

    // use the GenericInputField as super
    var Super = GenericInputField;
    
    // on focus we remove the placeholder
    field.focus(function() {
    	field.addClass(Super.cssActive);
    	Super.removePlaceHolder(field);
    });

    // on blur we check the validity of the value and add the placeholder again
    field.blur(function() { doBlur(); });

    if( options.onSubmit != undefined ) {
	    field.keypress(
	    	function(e) {
		    	var val = field.val();
	    		if( e.which == 13 && !field.hasClass(Super.cssPlaceholder) ) {
	    			if( isValidEmail(val) ) {
		        		bindItem.set(val);
		    			options.onSubmit();
	    			}
	    			doBlur();
	    		}
	    	}
	    );
    }


    /*
     *  +---------------------+
     *  |  Private Functions  |
     *  +---------------------+
     */

    // checks if the field's value is a proper email address 
    function isValidEmail(string) {
    	return null !== string.match(/^((([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*)|((\x22)((((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(([\x01-\x08\x0b\x0c\x0e-\x1f\x7f]|\x21|[\x23-\x5b]|[\x5d-\x7e]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(\\([\x01-\x09\x0b\x0c\x0d-\x7f]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))))*(((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(\x22)))@((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))$/i);
    }

    function doBlur() {
    	var val = field.val();
    	field.removeClass(Super.cssActive);
    	field.css("border", ( val == "" || isValidEmail(val) ) ? "" : "2px inset red");
        Super.addPlaceHolder(field, options.placeholder);
    }

    // updates the value of the bindItem to the input field's value if it is valid
    function updateBindItem() {
    	var val = field.val();
    	if ( !field.hasClass(Super.cssPlaceholder) && isValidEmail(val) ) {
    		bindItem.set(val);
    	}
    }

    /*
     *  +---------------+
     *  |  Databinding  |
     *  +---------------+
     */
    
    // if the bindItem changes, we need to update the input field's value  
    bindItem.addObserver(function() {
    	Super.removePlaceHolder(field);
    	field.val(bindItem.get());
    	Super.addPlaceHolder(field, options.placeholder);
    });

    // if the value of the input changes, we need to update the bindItem
    field.change(updateBindItem);
    //field.keyup(updateBindItem);

    /*
     *  +------------------------+
     *  |  Field Initialization  |
     *  +------------------------+
     */
    field.val(bindItem.get());
    Super.addPlaceHolder(field, options.placeholder);
}
/**
 * Creates an enumField for selecting an enumeration literal.
 * @param bindItem the item to bind to (should be a numerical Literal).
 * @param container the container to append the numField to. 
 */
function enumField(bindItem, container, enum_) {
	// precondition check:
	if ( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for an enumField."; }
	if ( container == undefined ) { throw "The container parameter is NOT optional for an enumField."; }
	
    // the input field:
    var field = $(document.createElement('select'));
    for( var i = 0; i < enum_.length; i++ ) {
    	var option = $(document.createElement('option'));
    	option.attr('value', enum_[i].name);
    	option.text(enum_[i].description);
    	field.append(option);
    }
    container.append(field);

	// make the input change if the bindItem changes:
    bindItem.addObserver(function(){ field.val(bindItem.get()); });
    // make the bindItem change if the input field changes ( also listen to keyup )
    field.change(function() { bindItem.set(field.val()); });
    field.keyup(function()  { bindItem.set(field.val()); });

    // initialize the value of the field:
    field.val(bindItem.get());
    /*
     * FIXME  initialization does not work if bound value is null (workaround: always initialize)
     */

    return field;
}
GenericInputField = {
	// css class to indicate that the input field has a place holder
	cssPlaceHolder : "sim-ui-widgets-inputfield-placeholder",
	
	// css class to indicate that the input field is selected (i.e. active)
	cssActive : "sim-ui-widgets-inputfield-active",
	
	// adds a given place holder to the given input field if it is empty
	addPlaceHolder : function(input, placeHolder) {
		if ( input != undefined && placeHolder != undefined ) {
			if ( !input.hasClass(this.cssPlaceholder) && input.val() == "" && !input.hasClass(this.cssActive)) {
				input.val(placeHolder);
				input.addClass(this.cssPlaceHolder);
			}
		}
    },
    
    // removes the place holder if the css class is set
    removePlaceHolder : function(input) {
    	if ( input != undefined && input.hasClass(this.cssPlaceHolder) ) {
    		input.val("");
    		input.removeClass(this.cssPlaceholder);
    	}
    }

	
};
/**
 * Appends an input field for the given integer literal to the container. 
 * @param bindItem the integer literal.
 * @param container the DOM element to append the input field to.
 * @param placeholder a placeholder to put in the input field if no value is present.
 * @param length the maximum length of the content of the input field.
 */
function integerField(bindItem, container, placeholder, length) {
	// precondition check:
	if ( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for an integerField."; }
	if ( container == undefined ) { throw "The container parameter is NOT optional for an integerField."; }

	// use the GenericInputField as super
	var Super = GenericInputField;
	
	// create the input field
    var field = $(document.createElement('input'));
    field.attr("type","text");
    if ( length != undefined ) {
    	field.attr("maxlength", length);
    }
    container.append(field);

    field.focus(function() {
    	field.addClass(Super.cssActive);
    	Super.removePlaceHolder(field);
    });

    field.blur(function(){
    	field.removeClass(Super.cssActive);

    	// remove all other characters except numbers and dashes (minus signs):
    	var newVal = convertedValue();
        if ( newVal != field.val() ) {
        	field.val(newVal);
        	// wake up the databound properties
        	field.trigger('change');
        }

        Super.addPlaceHolder(field, placeholder);
    });

    /*
     *  +---------------------+
     *  |  Private Functions  |
     *  +---------------------+
     */
    function convertedValue() {
    	return field.val().replace(/[^\d-]+/g, '');
    }
    
    /*
     *  +---------------+
     *  |  Databinding  |
     *  +---------------+
     */ 
    
    // change the field's value if the bindItem changes
    bindItem.addObserver(function(){
    	Super.removePlaceHolder(field);
    	field.val(bindItem.get());
    	Super.addPlaceHolder(field, placeholder);
    });
    
    // update the bindItem if the input changes
    field.change(function(){
    	var value = convertedValue();
    	if (isNum(value)) {
    		bindItem.set(value);
    	}
    });
    /*field.keyup(function(){
    	var value = convertedValue();
    	if (isNum(value)) {
    		bindItem.set(value);
    	}
    });*/
    
    /*
     *  +------------------------+
     *  |  Field Initialization  |
     *  +------------------------+
     */
    field.val(bindItem.get());
    Super.addPlaceHolder(field, placeholder);
}
/**
 * Creates a numField, which removes all non numerical characters on blur.
 * It changes the first comma or dot to a dot and removes any subsequent dots or commas.
 * This way the value after a blur will always be a numerical value (with a possible decimal).
 * @param bindItem the item to bind to (should be a numerical Literal).
 * @param placeholder the text to display if no value is entered yet (may be null). 
 * @param container the container to append the numField to. 
 */
function numField(bindItem, container, placeholder, length) {
	// precondition check:
	if ( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for a numField."; }
	if ( container == undefined ) { throw "The container parameter is NOT optional for a numField."; }
    
    // the input field
    var field = $(document.createElement('input'));
    field.attr("type","text");
    if ( length != undefined ) {
    	field.attr("maxlength", length);
    }
    container.append(field);

    // use the GenericInputField as super
	var Super = GenericInputField;
	
    // on focus, remove the place holder if present
    field.focus(function(){
    	field.addClass(Super.cssActive);
        Super.removePlaceHolder(field);
    });

    // on blur, process contents and add the place holder if no value is present
    field.blur(function(){
    	field.removeClass(Super.cssActive);

    	// convert the value
    	var newVal = convertValue(field.val());
    	
    	// if the content changed, replace the value of the field
        if (newVal != field.val()) {
        	field.val(newVal);
        	field.trigger('change');
        }
        
        // add a placeholder if necessary
        Super.addPlaceHolder(field, placeholder);
    });

    // converts the given string to a number representation
    function convertValue(value) {
    	// variable to hold the converted value
    	var newVal = value;
    	
    	// replace all commas with dots and remove non-numerical and non-dot values
    	newVal = newVal.replace(/,/g, '.').replace(/[^\d\.-]+/g, '');
    	
    	// index of the first dot, which should be preserved
    	var firstDot = newVal.indexOf('.');
    	// remove all dots after the first one
    	newVal = firstDot > -1? newVal.substring(0, firstDot+1).concat(newVal.substring(firstDot).replace(/\.+/g, '')) : newVal;
    	return newVal;
    }
    
    /*
     *  +---------------+
     *  |  Databinding  |
     *  +---------------+
     */
    
    // make the input change if the bindItem changes
    bindItem.addObserver(function(){
    	Super.removePlaceHolder(field);
    	field.val(bindItem.get());
    	Super.addPlaceHolder(field, placeholder);
    });
    // make the bindItem change if the input field changes ( also listen to keyup )
    field.change(function() {
    	var value = convertValue(field.val());
    	if (isNum(value)) {
    		bindItem.set(value);
    	}
    });
    /*field.keyup(function()  {
    	var value = convertValue(field.val());
    	if (isNum(value)) {
    		bindItem.set(value);
    	}
    });*/
    
    /*
     *  +------------------------+
     *  |  Field Initialization  |
     *  +------------------------+
     */
    
    field.val(bindItem.get());
    Super.addPlaceHolder(field, placeholder);
}
/**
 * Creates a passField.
 * @param bindItem the item to bind to (should be a textual Literal).
 * @param container the container to append the passField to. 
 * @param placeholder the text to display if no value is entered yet (may be null).
 * @param length optional maximum length of the input field's value.
 */
function passField(bindItem, container, placeholder, length) {
	// precondition check:
	if ( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for a passField."; }
	if ( container == undefined ) { throw "The container parameter is NOT optional for a passField."; }
	
	// the input field
    var field = $(document.createElement('input'));
    field.attr("type","password");
    if ( length != undefined ) {
    	field.attr("maxlength", length);
    }
    container.append(field);

    // use the GenericInputField as super
	var Super = GenericInputField;
	
    field.focus(function(){
    	field.addClass(Super.cssActive);
    	Super.removePlaceHolder(field);
    });

    field.blur(function(){
    	field.removeClass(Super.cssActive);
        Super.addPlaceHolder(field, placeholder);
    });

    /*
     *  +---------------+
     *  |  Databinding  |
     *  +---------------+
     */
    // make the input change if the bindItem changes
    bindItem.addObserver(function(){
    	Super.removePlaceHolder(field);
    	field.val(bindItem.get());
    	Super.addPlaceHolder(field, placeholder);
    });
    // make the bindItem change if the input field changes ( also listen to keyup )
    field.change(function() { bindItem.set(field.val()); });
    field.keyup(function()  { bindItem.set(field.val()); });
    
    /*
     *  +------------------------+
     *  |  Field Initialization  |
     *  +------------------------+
     */
    field.val(bindItem.get());
    Super.addPlaceHolder(field, placeholder);
}
/**
 * A div with 2 radio buttons, a true and a false button.
 * If none are selected, it represents null.
 * 
 * It should be bound to a Literal. 
 */
function radioButtonField(bindItem, container, trueLabel, falseLabel) {
	// make sure we have a really unique name
	var uniqueId = 'sim-ui-radio-button-number-' + this.amount + '-unique-name';
	radioButtonField.prototype.amount = this.amount + 1;
	
	// containers:
	var div = $('<div>');

	// radio button for 'true':
	var selectTrue = $('<input type="radio" name="sim-ui-boolean-radio-' + uniqueId + '">');
	// listen to it being changed and propagate the event:
	selectTrue.change(function() { div.trigger('change'); });

	// radio button for 'false':
	var selectFalse = $('<input type="radio" name="sim-ui-boolean-radio-' + uniqueId + '">');
	// listen to it being changed and propagate the event:
	selectFalse.change(function() { div.trigger('change'); });

	// label for the 'true' radio button:
	var labelTrue = $('<span>').append(trueLabel);
	// make it clickable (using the value method):
	labelTrue.click(function() { value(true); });

	// label for the 'false' radio button:
	var labelFalse = $('<span>').append(falseLabel);
	// make it clickable (using the value method)
	labelFalse.click(function() { value(false); });
	
	// append the buttons and labels to the container:
	div.append(selectTrue).append(labelTrue);
	// TODO  add a spacer
	div.append(selectFalse).append(labelFalse);
	container.append(div);

	// getter and setter function of the container:
	function value (a) {
		if (a === undefined) {
			// dealing with the getter
			if (selectTrue.is(':checked')) {return true;}
			if (selectFalse.is(':checked')){return false;}
			// default to null if both unchecked
			return null;
		} else {
			// dealing with the setter
			if (a === null) {
				if (selectTrue.prop('checked') == true || selectFalse.prop('checked') == true) {
					// something changed
					selectTrue.prop('checked', false); selectFalse.prop('checked', false);
					div.trigger('change');
				}
			}
			if (a === true) {
				if (selectTrue.prop('checked') == false) {
					// something changed
					selectTrue.prop('checked', true);
					div.trigger('change');
				}
			}
			if (a === false){
				if (selectFalse.prop('checked') == false) {
					// something changed
					selectFalse.prop('checked', true);
					div.trigger('change');
				}
			}
		}
	};
	
	// take care of the databinding
	bindItem.addObserver(function(x){value(x.get());});
	div.change(function(){bindItem.set(value());});
	value(bindItem.get());
	return div;
}

/**
 * The amount of radioButtonFields.
 * We need this to be able to create a unique name for the radio group.
 */
radioButtonField.prototype.amount = 0;
/**
 * Creates a select tag for selecting a structure from a list of structures.
 * @param bindItem the item to bind to (should be a structure).
 * @param container the container to append the select tag to.
 * @param sources the list of items containing the structures to choose from. 
 */
function selectField(bindItem, container, sources, displayFunction, placeholder) {
	// precondition check:
	if ( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for a selectField."; }
	if ( container == undefined ) { throw "The container parameter is NOT optional for a selectField."; }
	if ( sources == undefined ) { throw "The sources parameter is NOT optional for a selectField."; }
	if ( displayFunction == undefined ) { throw "The displayFunction parameter is NOT optional for a selectField."; }
	
	var placeholderStruct = bindItem.unwrap();
	
    // the select field:
    var field = $(document.createElement('select'));
    container.append(field);
    
    // add the structures as options
    var optionStructures = sources.toArray();
    
    /*
     *  +---------------------+
     *  |  Private Functions  |
     *  +---------------------+
     */
    // updates the children of the selectfield to correspond to the optionStructures variable
    function updateOptions() {
    	// add the new options
    	field.html('');
    	if (placeholder != undefined) {
    		var option = $(document.createElement('option'));
    		option.attr('value', -1);
    		option.text(placeholder);
    		field.append(option);
    	}
    	for (var i = 0; i < optionStructures.length; i++) {
    		var option = $(document.createElement('option'));
    		option.attr('value', i);
    		option.text(displayFunction(optionStructures[i]));
    		field.append(option);
    	}
    	// select the option that was previously selected
    	// or update the bindItem to point to the first structure in the list
    	if (optionStructures.length > 0) {
    		var initIndex = getBindItemStructureIndex();
    		if (initIndex == null) {
    			if (placeholder == undefined) {
    				bindItem.load(sources.get(0).unwrap());
    			}
    		} else {
    			field.val(initIndex);
    		}
    	}
    }

    // returns the index of the structure whose value equals the bindItem, or null
    function getBindItemStructureIndex() {
    	for (var i = 0; i < optionStructures.length; i++) {
    		if ( bindItem.compareTo(optionStructures[i]) == 0 ) {
    			return i;
    		}
    	}
    	return null;
    }
    
    /*
     *  +---------------+
     *  |  Databinding  |
     *  +---------------+
     */
    // listen to changes in the bindItem
    bindItem.addObserver(function(){
    	var selectedIndex = getBindItemStructureIndex();
    	if (selectedIndex == null) {
    		if (placeholder != undefined && bindItem.compareTo(new Item(placeholderStruct)) == 0) {
    			field.val(-1);
    		} else if (!sources.isEmpty()){
    			throw "The structure of this selectField changed to something outside of the given collection of possibilities.";
    		}
    	} else {
    		field.val(selectedIndex);
    	}
    });
    
    // listen to changes in the select field
    field.change(function() {
    	var val = field.val();
    	if (val == -1) {
    		bindItem.load(placeholderStruct);
    	} else {
    		bindItem.load(optionStructures[field.val()].unwrap());
    	}
    });
    
    // listen to changes in the sources list
    sources.addObserver(function(){
    	optionStructures = sources.toArray();
    	updateOptions();
    });

    /*
     *  +------------------------+
     *  |  Field Initialization  |
     *  +------------------------+
     */
    updateOptions();
    
    /*
     * Brainstorm:
     * 
     * To be able to react when the bindItem changes, we need to be able to do the following:
     * 1.)	when the bindItem changes, it should change to a structure from sources.
     * 	If it doesn't, we can't update the select tag.
     * 	TODO how do we handle this? 
     * 	If it happens, it's probably a result of bad sim-ui design:
     * 	why would you offer the user to change the value to something from an explicit collection
     * 	and then change it to something outside of the given collection?
     * 	The value you set it to should then have been contained in the collection.
     * 
     *  Therefore I think it should just never occur and we can throw an error, 
     *  interrupting the flow of the rest of the application.
     *  TODO is it possible to add a validation for this?
     *  
     * 
     * 2.)	we need to be able to retrieve a structure from sources by the changed bindItem.
     * 	The structure in sources will not be the same object as the bindItem,
     * 	unless the bindItem itself was part of sources.
     * 	Therefore we will need to use the Item.compareTo function to check equality of value.
     * 
     * 
     * To be able to react when the user selects another option, we need to be able to do the following
     * 1.)	we need to be able to retrieve a structure from sources by the selected value.
     * 	Easy approach:
     * 	copy the structures from sources into an array and record the index in the value of the option tag.
     * 
     * 
     * To be able to work with a placeholder, we need to be able to do the following:
     * 1.)	add a placeholder option
     * 2.)	TODO define behavior for when the placeholder is selected:
     * 	We could remember the value of the bindItem at initialization,
     *  and set that when the placeholder is selected.
     *  We could also just ignore the placeholder, but that would probably be unwanted if you:
     *  select an item, select the placeholder (bindItem is still the previous selected item).
     * 
     * 
     * TODO Do we plan on allowing the sources to change?
     * If so, how do we handle the situation where a user has selected an option, 
     * but that option is not in the new sources list?
     * Easy approach: don't support this yet.
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */
}
/**
 * Creates a stringField.
 * @param bindItem the item to bind to (should be a textual Literal).
 * @param container the container to append the stringField to.
 * @param placeholder the text to display if no value is entered yet (may be null).
 * @param length optional maximum length of the input field's value.
 */
function stringField(bindItem, container, length, options) {
	// precondition check:
	if( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for a stringField."; }
	if( container == undefined ) { throw "The container parameter is NOT optional for a stringField."; }

	options = options? options : {};
	options.placeholder = options.placeholder ||  "";
	
	var events = options && options.events != null && $.isArray(options.events) ? options.events : [];
	if (!events.contains('change')) {events.push('change');}
	
	var name = options && options.name ? options.name : undefined;
	
	// the input field
    var field = $(document.createElement('input'));
    field.attr("type","text");
    if (name) {
    	field.attr("name", name);
    }
    if( length != undefined && length > 0) {
    	field.attr("maxlength", length);
    }
    container.append(field);

    // use the GenericInputField as super
	var Super = GenericInputField;
	
    field.focus(function(){
    	// For some weird reason DO NOT switch the order of these two.
    	// sounds like a fail in the jQuery removeClass method...
    	Super.removePlaceHolder(field);
    	field.addClass(Super.cssActive);
    });

    field.blur(function(){
    	field.removeClass(Super.cssActive);
        Super.addPlaceHolder(field, options.placeholder);
    });

    /*
     *  +---------------+
     *  |  Databinding  |
     *  +---------------+
     */
    // make the input change if the bindItem changes
    bindItem.addObserver(function(){
    	Super.removePlaceHolder(field);
    	field.val(bindItem.get());
    	Super.addPlaceHolder(field, options.placeholder);
    });
    // make the bindItem change if the input field changes ( also listen to keyup )
    for (var i = 0; i < events.length; i++) {
    	field.bind(events[i], function() { bindItem.set(field.val()); });
    }
    
    /*
     *  +------------------------+
     *  |  Field Initialization  |
     *  +------------------------+
     */
    field.val(bindItem.get());
    Super.addPlaceHolder(field, options.placeholder);
}
/**
 * Creates a textField.
 * @param bindItem the item to bind to (should be a textual Literal).
 * @param container the container to append the textField to.
 * @param placeholder the text to display if no value is entered yet (may be null).
 * @param rows optional number of rows of the text area.
 * @param columns optional number of columns of the text area.
 */
function textField(bindItem, container, placeholder, rows, columns) {
	// precondition check:
	if( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for a textField."; }
	if( container == undefined ) { throw "The container parameter is NOT optional for a textField."; }
	
	// the input field
    var field = $(document.createElement('textarea'));
    if( rows != undefined ) {
    	field.attr("rows", rows);
    }
    if( columns != undefined ) {
    	field.attr("columns", columns);
    }
    container.append(field);

    // use the GenericInputField as super
	var Super = GenericInputField;
	
    field.focus(function(){
    	field.addClass(Super.cssActive);
    	Super.removePlaceHolder(field);
    });

    field.blur(function(){
    	field.removeClass(Super.cssActive);
        Super.addPlaceHolder(field, placeholder);
    });

    /*
     *  +---------------+
     *  |  Databinding  |
     *  +---------------+
     */
    // make the input change if the bindItem changes
    bindItem.addObserver(function(){
    	Super.removePlaceHolder(field);
    	field.val(bindItem.get());
    	Super.addPlaceHolder(field, placeholder);
    });
    // make the bindItem change if the input field changes ( also listen to keyup )
    field.change(function() { bindItem.set(field.val()); });
    //field.keyup(function()  { bindItem.set(field.val()); });
    
    /*
     *  +------------------------+
     *  |  Field Initialization  |
     *  +------------------------+
     */
    field.val(bindItem.get());
    Super.addPlaceHolder(field, placeholder);
}
var LoadSymbol = new function() {
	
	this.show = function(container)	 {
		container.html('<div id="loadSymbolDiv" style="text-align:center;margin:auto;"><img src="lib/sim-lib/images/ajax-loader.gif" /></div>');
	}
	
	this.hide = function() {
		$('#loadSymbolDiv').remove();
	}
	
}
var Modal = new function() {

	var inModal = false;

	this.showModal = function(viewable, persistent) {
        if(inModal) {
            return false;
        } else {
            inModal = true;
            $("#_modalBackground").css({
                display: "block",
                opacity: 0.5
            });
            $("#_modal").css({
                display: "block"
            });
            var modalWidth = $("#_modal").width();

            $("#_modal").css({
                "left" : "50%",
                "z-index"	: 100000,
                "margin-left": "-" + modalWidth / 2 + "px"
            });

            if(!persistent){
                var exitButtonContainer = $("<div id='_modalExitContainer'>");
                $("#_modalContent").append(exitButtonContainer);
                var exitButton = $('<input type="button" class="_modal-exit-button">');
                exitButtonContainer.append(exitButton);

                exitButton.click(this.exitModal);
            }
            return true;
        }
	};

	this.exitModal = function() {
		if( inModal ) {
			// TODO
            $("#_modalContent").html("");
            $("#_modal").css("display", "none");
            $("#_modalBackground").css("display", "none");
            inModal = false;
		}
	};

    this.isActive = function() {
        return inModal;
    };

};
/**
 * COMPONENT
 * 
 * Renders a tabset which looks like a progress bar in the given parent.
 * 
 * @param tabs the Tab objects to render in the tabset.
 * @param parentJQuery the jQuery element to which the tabset should be appended.
 * @returns a controller for this tabset.
 * The controller has a previous and a next function to change the active tab.
 */
function ProgressbarTabset(tabs, parentJQuery) {
	// Non-observable vars like Num or String should always be wrapped
	var varactivetab = new Item(-1);
	
	// The tabs' titles container
	var barContainer = $('<div class="progressBar"/>');
	
	// The tabs' content container
	var tabsContainer = $('<div style="width:100%;"/>');
	
	// Adding the tabs
	for (var i = 0; i < tabs.length; i++) {
		// Tab title, css should be separated in real code
		var optionContainer = $('<div class="option"/>');
		optionContainer.css('width', 100/tabs.length+'%');
		var numberContainer = $('<div class="num"/></div>');
		var number = $('<span>' + (i + 1) + '</span>');
		numberContainer.append(number);
		optionContainer.append(numberContainer);
		var nameContainer = $('<div class="optionName"/>');

		nameContainer.append(tabs[i].title());
		
		optionContainer.append(nameContainer);
		leftBar = $('<div class="bar barLeft"/>');
		optionContainer.append(leftBar);
		rightBar = $('<div class="bar barRight"/>');
		optionContainer.append(rightBar);
		
		// Tab content
		var tabContainer = $('<div style="width:100%"/>');
		tabs[i].tab(tabContainer);
		
		// Adjust the activetab variable when a tab is clicked
		// We're looping, so variables should be captured by executing a function
		numberContainer.click(function(i){return function(){varactivetab.set(i);};}(i));
		
		// Buttons
		prevButton = $('<div/>').addClass('prevButton');
		if (tabs[i].prev == undefined) {
			prevButton.click(function(){varactivetab.set(varactivetab.get() - 1);});
		} else {
			prevButton.click(tabs[i].prev);
		}
		nextButton = $('<div/>').addClass('nextButton');
		if (tabs[i].next == undefined) {
			nextButton.click(function(){varactivetab.set(varactivetab.get() + 1);});
		} else {
			nextButton.click(tabs[i].next);
		}
		buttonContainer = $('<div/>').addClass('buttonContainer');
		if (i > 0 || tabs[i].prev != undefined) {buttonContainer.append(prevButton);}
		if (i < tabs.length - 1 || tabs[i].next != undefined) {buttonContainer.append(nextButton);}
		tabContainer.append(buttonContainer);
		
		// Append the tabs title and content
		barContainer.append(optionContainer);
		tabsContainer.append(tabContainer);
		
		// Visibility and css changes when activetab changes
		// again, we're capturing loop variables' values by calling a function
		varactivetab.addObserver(function(numberContainer, leftBar, rightBar, tabContainer, i){ return function(){
			if (varactivetab.get() >= i) {
				numberContainer.removeClass('num').addClass('numActive');
				leftBar.addClass('barActive');
				if (varactivetab.get() > i) { 
					rightBar.addClass('barActive'); 
				} else {
					rightBar.removeClass('barActive');
				}
			} else {
				numberContainer.removeClass('numActive').addClass('num');
				leftBar.removeClass('barActive');
				rightBar.removeClass('barActive');
			}
			if (varactivetab.get() === i) {
				tabsContainer.children('div').css('display', 'none');
				tabContainer.css('display', 'block');
			}
		};}(numberContainer, leftBar, rightBar, tabContainer, i));
		
	}
	
	// after all observers are declared, we set the default value for activetab
	varactivetab.set(0);
	
	// Append the tabset to the parent element
	parentJQuery.append(barContainer);
	parentJQuery.append(tabsContainer);
	
	function controller() {
		this.next = function(){
			if (varactivetab.get() < tabs.length - 1) {
				varactivetab.set(varactivetab.get()+1);
			}
		};
		
		this.previous = function() {
			if (varactivetab.get() > 0) {
				varactivetab.set(varactivetab.get()-1);
			}
		};
	}
	
	return new controller();
}

/**
 * CONSTRUCTOR
 * 
 * A tab consists of a title and tab.
 * Note that it is a normal, unobservable object.
 * 
 * @param title the title or name of the tab. 
 * It should be a function with no arguments, returning a div.
 * @param tab the (wrapped or simplified) component that should be displayed
 * if the tab is selected.
 * It should be of the form function(container), so any other parameters should be wrapped
 * in a simpler function.
 * @param prev the function to be executed when the prev button on this tab is pressed.
 * If no prev is given, it will be the default switch to previous tab.
 * @param next same as prev, only for next button.
 * 
 * Example:
 * var component = function(a, b, container) {container.append(a);};
 * var tab = function(container){var a="a val"; var b="bval"; component(a,b,container);}
 */ 

ProgressbarTab = function(title, tab, prev, next) {
	var default_title = function() { return $('<div>'); };
	var default_tab = function(container){container.append("Inhoud");};
	if (title == undefined) { title = default_title; }
	if (tab == undefined) { tab = default_tab; }
	this.title = title;
	this.tab = tab;
	this.prev = prev;
	this.next = next;
};
