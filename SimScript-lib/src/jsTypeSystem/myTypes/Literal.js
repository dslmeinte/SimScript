/**
 * CONSTRUCTOR
 * 
 * A Literal wraps a SimpleLiteral (see isSimpleLiteral) to make it observable.
 * 
 * The Literal will have a get() method and a set(value) method to either get or set
 * the value of the underlying literal.
 * 
 * The Literal has a databind(element, events) method, 
 * which will call the set(element.val()) method
 * when one of the given events occurs on the given element.
 * When no array of events is given (or an empty one), the default ['change', 'keyup'] is used. 
 * 
 * It also has an unwrap() method, which will return the underlying literal itself.
 * 
 * @param literalIn a SimpleLiteral (see isSimpleLiteral) to be wrapped.
 */
function Literal(literalIn) {
	// precondition: literalIn should be a literal
	if (!isSimpleLiteral(literalIn)) { throw "Will only construct a Literal for a literal. Not for " + literalIn; }

	var literal = literalIn;
	var self = this;

	/**
	 * Returns this Literal's literal.
	 */
	this.get = function() {
		return literal;
	};

	/**
	 * Sets this Literal's literal to the given value if
	 * newLiteral is a SimpleLiteral and different from the current literal.
	 */
	this.set = function(newLiteral) {
		if (isSimpleLiteral(newLiteral) && newLiteral != literal) {
			literal = newLiteral;
			self._setChanged(true);
			self.notifyObservers();
		}
	};

	/**
	 * Binds this Literal's literal to the given jQuery element
	 * when one of the given events occur.
	 * 
	 * This means the value of the element will be updated when this Literal changes
	 * and this Literal will be updated with the element's value when the given events occur. 
	 * 
	 * @param elementJQuery a jQuery element.
	 * @param eventsArray (optional). An Array of jQuery event strings (e.g. 'click' or 'keyup').
	 * Defaults to ['change', 'keyup'].
	 */
	this.databind = function(elementJQuery, eventsArray) {
		if (!eventsArray || eventsArray.length < 1) {
			eventsArray = ['change', 'keyup'];
		}
		for (var i = 0; i < eventsArray.length; i++) {
			elementJQuery.bind(eventsArray[i], function(){self.set($(this).val());});
		}
		
		self.addObserver(function(){
			if (elementJQuery.val() != self.get()) {
				elementJQuery.val(self.get());
			}
		});
		elementJQuery.val(self.get());
	};

	/**
	 * Returns the normal value of the literal.
	 * It's the same as get(), but is here as convenience method,
	 * because Items and Lists also have unwrap. 
	 */
	this.unwrap = function() {
		return literal;
	};

	/**
	 * Loads the given data object in this Literal.
	 * Make sure the given data is a Literal.
	 * Note: this does exactly the same as the set() function.
	 * @param data the new data object. Make sure it's a plain javascript literal.
	 */
	this.load = function(data) {
		if (!isSimpleLiteral(data)) {
			throw "Won't load non-literal in a Literal.";
		}
		self.set(data);
	};

	/**
	 * Compares the given Observable item's value with this Literal's value.
	 * Uses == operator.
	 * @param item an Observable which can be unwrapped.
	 * @return < 0 if the given literal is bigger than this literal, > 0 if the given literal is smaller
	 * or 0 if they are the same.
	 * If the bigger or smaller thing doesn't make sense anything that isn't 0 is returned.
	 */
	this.compareTo = function(item) {
		if (!item instanceof Observable || !$.isFunction(item.unwrap)) {
			throw "Equals method of a Literal should only be passed Observables which can be unwrapped.";
		}
		if (isDate(literal)) {
			return DateUtil.compare(literal, item.unwrap());
		}
		if (literal == item.unwrap()) {return 0;};
		if (literal < item.unwrap()) {return -1;}
		if (literal > item.unwrap()) {return 1;}
		// should never happen:
		return NaN;
	};

    this.print = function(dateFormat) {
        dateFormat = dateFormat == null ? "dd-mm-yy" : dateFormat;
        if(isDate(literal))
            return $.datepicker.formatDate(dateFormat, literal);
        return literal;
    };

	Literal.prototype = new Observable();	// (probably unnecessary)

}
Literal.prototype = new Observable();

