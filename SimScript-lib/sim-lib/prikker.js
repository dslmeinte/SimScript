/**
 * Draws a date picker where the user can select slots of slotSize minutes from the startTime until the endTime.
 * 
 * @param container the jQuery DOM element where the picker will be added to.
 * @param slotSize the size of the blocks (slots) that can be selected (in minutes).
 * @param maxPeople the maximum amount of people who can join on 1 slot.
 * @param startTime the start time where the drawing of slots should begin.
 * @param endTime the end time where the drawing of slots should end.
 * @param day a Date, which determines which week should be displayed in the picker.
 * @param data a list of activities organized by day (type [AZactivitiesByDay] from AZ.sim_struct).
 * 	Used to determine how many people are already attending activities planned on the slots.
 * @param onClick onclick which is called when a slot is clicked. It will be given the following arguments:
 * 	1.	a List of ExtendedActivities (see AZ.sim_struct) on the selected slots.
 * 	2.	the date representing the start time of the slot (both day and time).
 * 	3.	the AZslot that just got clicked.
 */
function datePicker2(container, slotSize, maxPeople, startTime, endTime, day, data, onClick) {
    this.container = container;
    this.slotSize = slotSize;
    this.maxPeople = maxPeople;
    this.attendees = 1;

    this.startTime = startTime;
    this.endTime = endTime;
    this.weekDays = ["maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag", "zondag"];
    this.months = ["januari", "februari", "maart", "april", "mei", "juni",
                   "juli", "augustus", "september", "oktober", "november", "december"];
    this.today = day;
    this.data = data;
    this.dContainer = $("<div style=\"height:100%;\">");
    this.container.append(this.dContainer);
    this.onClick = onClick;

    //retrieve from global var
    // FIXME get rid of this, it really destroys any generality.
    this.activeSlots = yourSimData && yourSimData.selectedDays && yourSimData.selectedDays.cells ? yourSimData.selectedDays.cells : new List();
    this.selectableAZslots = new Array(7);

    this.loopLimit = Math.floor((this.endTime * 60 - this.startTime * 60) / this.slotSize);
    this.slotList = new List();
    this.draw();
}

// setter for the list of slots that should be loaded into the picker.
datePicker2.prototype.setSlotList = function(slotList) {
    this.slotList = slotList;
    this.draw();
};

// setter to determine which week should be displayed. Will use the week of the date.
datePicker2.prototype.setDate = function (date, data) {
    this.today = date;
    this.draw();
};

// setter for the amount of attendees that want to pick a slot.
// if there is not enough space left on the slot for all attendees to attend, it will no longer be selectable.
datePicker2.prototype.setAttendees = function(attendees) {
    this.attendees = attendees;
    this.draw();
};

// setter for the list of activities by day (see constructor docs for details).
datePicker2.prototype.setData = function(data) {
    this.data = data;
    this.draw();
};

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

    // determine which week to display
    var daysSinceMonday = eval((this.today.getDay() + 6) % 7);
    var weekDay = new Date();
    weekDay.setTime(Date.parse(this.today) - daysSinceMonday * 86400000);
    var monday = new Date(weekDay.setHours(0,0,0,0));
    var nextMonday = new Date(weekDay.setHours(0,0,0,0));
    nextMonday.setDate(monday.getDate() + 7);

    //draw the top row wich will tell the current days 
    for(var x = 0; x < 8; x++) {
        var cel = $("<td>");
        preTR.append(cel);

        if(x > 0) {
            cel.addClass("sim-ui-pickertable-infoslot");
            cel.html(this.weekDays[x - 1] + "<br />" + weekDay.getDate() + " " + this.months[weekDay.getMonth()]);
            weekDay.setTime(weekDay.valueOf() + 86400000);
        } else {
            cel.addClass("sim-ui-pickertable-timeslot");
        }
    }
    
    // matrix representing the amount of people attending activities on the slots
    var test = Array(7);
    // matrix representing whether a slot is selected (true, otherwise false);
    var selectedCells = Array(7);
    // matrix representing whether a slot can be selected (0 if not, 1 if selectable, 2 if selectable and has deals)
    var activeCells = Array(7);
    // matrix representing the deals (as string) on the selectable slots
    var deals = Array(7);
    
    // initialize all matrices
    // y and x are reversed!
    for(var y = 0; y < 7; y++) {
        test[y] = Array(this.loopLimit);
        selectedCells[y] = Array(this.loopLimit);
        activeCells[y] = Array(this.loopLimit);
        deals[y] = Array(this.loopLimit);
        this.selectableAZslots[y] = Array(this.loopLimit);
    }
    for(var x = 0; x < this.loopLimit; x++) {
        for(var y = 0; y < 7; y++) {
            test[y][x] = 0;
            selectedCells[y][x] = false;
            activeCells[y][x] = 0;
            deals[y][x] = "";
            this.selectableAZslots[y][x] = null;
        }
    }

    // process the the given slots to properly fill the matrices.
    for(var i = 0; i < this.slotList.size(); i++) {
        var time = this.slotList.get(i).getSlot().getStart_time();
        var index = parseInt(time.getHours().get(), 10) * 60 - this.startTime * 60;
        index += parseInt(time.getMinutes().get(), 10);
        index = Math.floor(index / this.slotSize);

        var weekDay = (this.slotList.get(i).getSlot().getDay().get().getDay() + 6) % 7;
        
        this.selectableAZslots[weekDay][index] = this.slotList.get(i);
        if(this.slotList.get(i).getDiscount().get() != null) {
        	// 2 means deal present
            activeCells[weekDay][index] = 2;
            deals[weekDay][index] = this.slotList.get(i).getDiscount().get();
         } else
        	// 1 means normal cell (default = 0)
            activeCells[weekDay][index] = 1;
    }

    // select any slots that were previously selected FIXME part of a quick and dirty workaround to make a backbutton work
    for(var i = 0; i < this.activeSlots.size(); i++) {
        if(this.activeSlots.get(i).get().getTime() >= monday.getTime() && this.activeSlots.get(i).get().getTime() < nextMonday.getTime()){
        
            var index = parseInt(this.activeSlots.get(i).get().getHours(), 10) * 60 - this.startTime * 60;
            index += parseInt(this.activeSlots.get(i).get().getMinutes(), 10);
            index = index / this.slotSize;

            var weekDay = (this.activeSlots.get(i).get().getDay() + 6) % 7;
            selectedCells[weekDay][index] = true;
        }
    }

    // process the data variable with all activities ordered by day to determine the amount of people who already planned something on the slots.   
    for(var i = 0; i < this.data.size(); i++) {
        for(var j = 0; j < this.data.get(i).getActivities().size(); j++) {
            var index = parseInt(this.data.get(i).getActivities().get(j).getStartTime().getHours().get(), 10) * 60 - this.startTime * 60;
            index += parseInt(this.data.get(i).getActivities().get(j).getStartTime().getMinutes().get(), 10);
            index = index / this.slotSize;
            
            // contains the amount of attendees attending at slot [dayIndex][timeIndex] 
            test[(this.data.get(i).getDay().get().getDay() + 6) % 7][index] += parseInt(this.data.get(i).getActivities().get(j).getActivity().getAttendees().get(), 10);
        }
    }
    
    //start drawing
    for(var x = 0; x < this.loopLimit; x++) {
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
            	// if the cell is selectable
                if(activeCells[col - 1][x] > 0) {
                    var percentage = test[col - 1][x] / this.maxPeople;
                    celSpan.html(test[col - 1][x] + "/" + this.maxPeople);
                    
                    // if no one is attending at that slot yet
                    if(test[col - 1][x] == 0) {
                        cel.addClass("pickerCell0");
                        celSpan.css("display", "none");  
                        cel.hover(function() {
                            $(this).children().toggle();
                        });
                    } else if(percentage > 0 && percentage < 0.2){
                        cel.addClass("pickerCell20");
                    } else if(percentage >= 0.2 && percentage < 0.4) {
                        cel.addClass("pickerCell40");
                    } else if(percentage >= 0.4 && percentage < 0.6) {
                        cel.addClass("pickerCell60");
                    } else if(percentage >= 0.6 && percentage < 0.8) {
                        cel.addClass("pickerCell80");
                    } else {
                        cel.addClass("pickerCell100");
                    }

                    // if there is also a deal on the slot
                    if(activeCells[col -1][x] > 1) {
                        cel.addClass("pickerCellDeal");
                        cel.qtip({
                            content: {
                                prerender : true,
                                text: deals[col - 1][x] + "% korting"
                            }
                        });
                        
                    }

                    // if there is still room for the attendees that want to join
                    if(this.maxPeople - test[col - 1][x] >= this.attendees)
                        cel.addClass("sim-ui-pickertable-attendees");
                    else
                        cel.removeClass("sim-ui-pickertable-attendees");

                    // display selected slots with some special styling
                    if(selectedCells[col -1][x])
                        cel.addClass("sim-ui-pickertable-activeslot");

                    // trigger the onclick when a slot is clicked
                    if(this.onClick != undefined) { 
                        (function (col, row, data, slotSize, startTime, monday, activeSlots, selectableAZslots) {
                            cel.click(function(){
                                if($(this).hasClass("sim-ui-pickertable-attendees")){
                                	// will be filled with extended activities on the clicked slot
                                    var returnList = new List();
                                    var date;
                                    // data contains extendedActivities
                                    for(var i = 0; i < data.size(); i ++) {
                                    	// look for the correct weekdayIndex (-1 because of empty first cell in weekdays row)
                                        if((data.get(i).getDay().get().getDay() + 6) % 7 == col - 1) {
                                        	// process all activities on the given day
                                            for(var j = 0; j < data.get(i).getActivities().size(); j++) {
                                                var eHour = parseInt(data.get(i).getActivities().get(j).getStartTime().getHours().get(), 10);
                                                var eMin = parseInt(data.get(i).getActivities().get(j).getStartTime().getMinutes().get(), 10);
                                                // (60/slotSize) = amount of slots in 1 hour
                                                // row (i.e. slot number starting at 0) / amount of slots per hour = amount of hours since starttime
                                                var hour = Math.floor(row / (60 / slotSize) + startTime);
                                                // what doesn't fit in hour should go into minute
                                                var min  = (row * slotSize) % 60;

                                                // add the activity if it fits on the slot
                                                if (eHour == hour && eMin == min) {
                                                    returnList.add(data.get(i).getActivities().get(j));
                                                }
                                            }
                                        }
                                    }

                                    date = new Date(Date.parse(monday)); 
                                    // 86400000 = 1 day in millis
                                    date.setTime(monday.getTime() + (col - 1) * 86400000);
                                    date.setHours(Math.floor(row / (60 / slotSize) + startTime),(row * slotSize) % 60,0,0);

                                    var dateItem = new Item(date);
    
                                    if(activeSlots.contains(dateItem)) {
                                    	activeSlots.remove(dateItem);
                                    } else {
                                    	activeSlots.add(dateItem);
                                    }

                                    $(this).toggleClass("sim-ui-pickertable-activeslot");
                                    
                                    clickFunction(returnList, date, selectableAZslots[col-1][row]);
                                }
                            });
                        }(col, x, this.data, this.slotSize, this.startTime, monday, this.activeSlots, this.selectableAZslots));
                    }
                } else {
                    cel.addClass("pickerCellNo");
                }
            } else {
                cel.addClass("sim-ui-pickertable-timeslot");
                minute = (this.startTime * 60 + x * this.slotSize) % 60;
                hour = Math.floor((this.startTime * 60 + x * this.slotSize) / 60);
                cel.html(this.addLeadingZero(hour) + ":" + this.addLeadingZero(minute));
            }
        }
    }


    //$(".pickerCell0").hover(function (){
    //    $(this).children().toggle();
    //});
};

datePicker2.prototype.addLeadingZero = function(int) {
    return int > 9 ? int : "0" + int;
};

datePicker2.prototype.deselect= function(slot) {
	var startTime = slot.getStart_time().unwrap();
	var date = slot.getDay().get();
	date.setMinutes(startTime.hours * 60 + parseInt(startTime.minutes));
    this.activeSlots.remove(new Item(date));
    this.draw();
};
