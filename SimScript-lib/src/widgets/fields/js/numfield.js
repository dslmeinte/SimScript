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
