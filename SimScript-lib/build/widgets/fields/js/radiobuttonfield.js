/**
 * A div with 2 radio buttons, a true and a false button.
 * If none are selected, it represents null.
 * 
 * It should be bound to a Literal. 
 */
function radioButtonField(bindItem, container, trueLabel, falseLabel) {
	// make sure we have a really unique name
	var uniqueId = 'sim-ui-radio-button-number-' + this.amount + '-unique-name';
	radioButtonField.prototype.amount = this.amount + 1;
	
	// containers:
	var div = $('<div>');

	// radio button for 'true':
	var selectTrue = $('<input type="radio" name="sim-ui-boolean-radio-' + uniqueId + '">');
	// listen to it being changed and propagate the event:
	selectTrue.change(function() { div.trigger('change'); });

	// radio button for 'false':
	var selectFalse = $('<input type="radio" name="sim-ui-boolean-radio-' + uniqueId + '">');
	// listen to it being changed and propagate the event:
	selectFalse.change(function() { div.trigger('change'); });

	// label for the 'true' radio button:
	var labelTrue = $('<span>').append(trueLabel);
	// make it clickable (using the value method):
	labelTrue.click(function() { value(true); });

	// label for the 'false' radio button:
	var labelFalse = $('<span>').append(falseLabel);
	// make it clickable (using the value method)
	labelFalse.click(function() { value(false); });
	
	// append the buttons and labels to the container:
	div.append(selectTrue).append(labelTrue);
	// TODO  add a spacer
	div.append(selectFalse).append(labelFalse);
	container.append(div);

	// getter and setter function of the container:
	function value (a) {
		if (a === undefined) {
			// dealing with the getter
			if (selectTrue.is(':checked')) {return true;}
			if (selectFalse.is(':checked')){return false;}
			// default to null if both unchecked
			return null;
		} else {
			// dealing with the setter
			if (a === null) {
				if (selectTrue.prop('checked') == true || selectFalse.prop('checked') == true) {
					// something changed
					selectTrue.prop('checked', false); selectFalse.prop('checked', false);
					div.trigger('change');
				}
			}
			if (a === true) {
				if (selectTrue.prop('checked') == false) {
					// something changed
					selectTrue.prop('checked', true);
					div.trigger('change');
				}
			}
			if (a === false){
				if (selectFalse.prop('checked') == false) {
					// something changed
					selectFalse.prop('checked', true);
					div.trigger('change');
				}
			}
		}
	};
	
	// take care of the databinding
	bindItem.addObserver(function(x){value(x.get());});
	div.change(function(){bindItem.set(value());});
	value(bindItem.get());
	return div;
}

/**
 * The amount of radioButtonFields.
 * We need this to be able to create a unique name for the radio group.
 */
radioButtonField.prototype.amount = 0;