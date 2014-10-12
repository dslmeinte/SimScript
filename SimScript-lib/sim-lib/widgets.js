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
