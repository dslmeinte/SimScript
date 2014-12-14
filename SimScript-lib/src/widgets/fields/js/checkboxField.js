/**
 * Binds the given boolean literal to a checkbox.
 * If the value of the given item is not true, it will be assumed to be false (and set to be sure).
 * However, if the checkbox is unchecked by a user operation, the item's value will be set to false.
 */
var checkboxField = function(bindItem, container, label) {
	// precondition check:
	if ( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for a checkboxField."; }
	if ( container == undefined ) { throw "The container parameter is NOT optional for a checkboxField."; }
	
	// the checkbox
	var box = $('<input type="checkbox"/>');
	container.append(box);
	
	// the label
	if (label != undefined) {
		var labelSpan = $('<span>').append(label);
		labelSpan.click(function() { box.trigger('click'); });
		container.append(labelSpan);
	}
	
	// function to update the checked state of the checkbox, based on the bindItem's value
	function setChecked() {
		box.prop('checked', bindItem.get() == true? true : false);
	}
	
	// make the checkbox update when the bindItem changes
	bindItem.addObserver(function(x) { setChecked(); });
	// make the bindItem update when the checkbox changes
	box.change(function(){ bindItem.set(box.prop('checked')); });
	
	// initialize the bindItem's value (to disallow null)
	bindItem.set(bindItem.get() ? true : false);
	// initialize the checkbox
	setChecked();
};