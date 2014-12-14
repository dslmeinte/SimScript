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