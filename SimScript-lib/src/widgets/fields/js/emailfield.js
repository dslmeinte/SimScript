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
