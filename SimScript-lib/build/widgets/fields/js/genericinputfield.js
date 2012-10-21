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