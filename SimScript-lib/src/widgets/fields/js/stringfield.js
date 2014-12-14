/**
 * Creates a stringField.
 * @param bindItem the item to bind to (should be a textual Literal).
 * @param container the container to append the stringField to.
 * @param placeholder the text to display if no value is entered yet (may be null).
 * @param length optional maximum length of the input field's value.
 */
function stringField(bindItem, container, length, options) {
	// precondition check:
	if( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for a stringField."; }
	if( container == undefined ) { throw "The container parameter is NOT optional for a stringField."; }

	options = options? options : {};
	options.placeholder = options.placeholder ||  "";
	
	var events = options && options.events != null && $.isArray(options.events) ? options.events : [];
	if (!events.contains('change')) {events.push('change');}
	
	var name = options && options.name ? options.name : undefined;
	
	// the input field
    var field = $(document.createElement('input'));
    field.attr("type","text");
    if (name) {
    	field.attr("name", name);
    }
    if( length != undefined && length > 0) {
    	field.attr("maxlength", length);
    }
    container.append(field);

    // use the GenericInputField as super
	var Super = GenericInputField;
	
    field.focus(function(){
    	// For some weird reason DO NOT switch the order of these two.
    	// sounds like a fail in the jQuery removeClass method...
    	Super.removePlaceHolder(field);
    	field.addClass(Super.cssActive);
    });

    field.blur(function(){
    	field.removeClass(Super.cssActive);
        Super.addPlaceHolder(field, options.placeholder);
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
    	Super.addPlaceHolder(field, options.placeholder);
    });
    // make the bindItem change if the input field changes ( also listen to keyup )
    for (var i = 0; i < events.length; i++) {
    	field.bind(events[i], function() { bindItem.set(field.val()); });
    }
    
    /*
     *  +------------------------+
     *  |  Field Initialization  |
     *  +------------------------+
     */
    field.val(bindItem.get());
    Super.addPlaceHolder(field, options.placeholder);
}
