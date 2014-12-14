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

