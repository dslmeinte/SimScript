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

