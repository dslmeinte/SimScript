/**
 * Creates an enumField for selecting an enumeration literal.
 * @param bindItem the item to bind to (should be a numerical Literal).
 * @param container the container to append the numField to. 
 */
function enumField(bindItem, container, enum_) {
	// precondition check:
	if ( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for an enumField."; }
	if ( container == undefined ) { throw "The container parameter is NOT optional for an enumField."; }
	
    // the input field:
    var field = $(document.createElement('select'));
    for( var i = 0; i < enum_.length; i++ ) {
    	var option = $(document.createElement('option'));
    	option.attr('value', enum_[i].name);
    	option.text(enum_[i].description);
    	field.append(option);
    }
    container.append(field);

	// make the input change if the bindItem changes:
    bindItem.addObserver(function(){ field.val(bindItem.get()); });
    // make the bindItem change if the input field changes ( also listen to keyup )
    field.change(function() { bindItem.set(field.val()); });
    field.keyup(function()  { bindItem.set(field.val()); });

    // initialize the value of the field:
    field.val(bindItem.get());
    /*
     * FIXME  initialization does not work if bound value is null (workaround: always initialize)
     */

    return field;
}
