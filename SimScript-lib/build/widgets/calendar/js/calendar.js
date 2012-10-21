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
