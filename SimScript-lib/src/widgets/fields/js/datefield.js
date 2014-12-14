/**
 * A widget which creates an input field and binds it to a Date literal.
 * It uses the jQuery UI datepicker.
 * @param bindItem the date literal.
 * @param container the DOM element to append the input field to.
 */
function dateField(bindItem, container) {
	// precondition check:
	if ( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for a dateField."; }
	if ( container == undefined ) { throw "The container parameter is NOT optional for a dateField."; }
	
	// format for displaying dates in the input field
	var dateFormat = "dd-mm-yy"; // e.g. 01-03-2012
	
	// the input element
	var input = $('<input type="text">');
	
	// append it before you call .datepicker otherwise it won't work (jQuery UI datepicker requirement)
	container.append(input);
	// add the datepicker functionality
	input.datepicker({dateFormat : dateFormat});
	
	// function to update the value of the input field to the value of the literal
	function updateDate() {
		input.val($.datepicker.formatDate(dateFormat, bindItem.get()));
	}
	
	// make the input field change when the literal changes
	bindItem.addObserver(function(){updateDate();});
	// make literal change when the value of the input field changes
	input.change(function(){bindItem.set(input.datepicker('getDate'));});
	
	// initialize the value of the input field
	updateDate();
}