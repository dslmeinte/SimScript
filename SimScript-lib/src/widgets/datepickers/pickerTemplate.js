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

