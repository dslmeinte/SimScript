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
