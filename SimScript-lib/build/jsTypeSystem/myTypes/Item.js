/**
 * CONSTRUCTOR
 * 
 * Wraps the given object and its properties in an new observable Item, Literal or List.
 * If obj is: 
 *  - an Array: a List will be returned.
 *  - a SimpleLiteral (see isSimpleLiteral): a Literal will be returned.
 *  - an Object (i.e. not an Array or SimpleLiteral): an Item will be returned.
 *  
 * An Item will have a getPropname and setPropname method for every propname:propvalue pair in obj. 
 * Excluding properties of its prototype and properties that are functions.
 * 
 * It will also have an unwrap method, which unwraps the Item and returns a normal object, with normal properties.
 * 
 * @param obj the object to wrap.
 * It should be a normal object. If it is already wrapped it will have only functions and 
 * as functions are ignored, it will therefore be turned into an empty object.
 * 
 * @returns an Item, Literal or List. 
 */
function Item(obj) {
	// since this constructor involves (possible) calls to new calls to this constructor
	// we have to refresh the prototype at the start of the call.
	Item.prototype = new Observable();

	// Check if we're dealing with a literal (String or Num) or an Array
	// They require 'special' wrapping
	if (isSimpleLiteral(obj)) {
		return new Literal(obj);
	} else if ($.isArray(obj)) {
		return new List(obj);
	}
	
	// obj is a normal Object, let's wrap it
	var self = this;
	var _data = {};
	
	// Observer update function.
	function updateFunction(observable, arg) {
		// When our attributes change, the change is already made in _data,
		// since the attributes are mutable (getter returns a reference).
		// So just notify our Observers.
		self._setChanged(true);
		self.notifyObservers(arg);
	}
	
	for (var i in obj) {
		var prop = obj[i];
		// this is a data wrapper, so no wrapping of functions
		// also, we choose to skip the prototype's properties.
		if (obj.hasOwnProperty(i) && !$.isFunction(prop)) {
			// wrap children if needed
			_data[i] = prop instanceof Observable? prop : new Item(prop);
			// Define getter and setter functions.
			var propFirstUpper = i.replace(/(.)/, function(match){return match.toUpperCase();}); 
			this['get' + propFirstUpper] = createGetter(i);
			this['set' + propFirstUpper] = createSetter(i);
			_data[i].addObserver(updateFunction);
		}
	}
	
	// We need these functions to prevent all getters and setters
	// from pointing to the same prop var.
	function createGetter(propName) {
		return function() {
			return _data[propName];
		};
	}
	function createSetter(propName) {
		return function(newVal) {
			if (newVal !== _data[propName]) {
				var oldVal = _data[propName];
				// Remove the old Observer				
				oldVal.deleteObserver(updateFunction);
				// Observe the new property
				newVal.addObserver(updateFunction);
				_data[propName] = newVal;
				// Notify observers
				self._setChanged(true);
				self.notifyObservers(newVal);
			}
		};
	}
	
	/**
	 * Unwraps this Item's properties and returns them in a normal Object.
	 */
	this.unwrap = function() {
		var obj = {};
		for (var i in _data) {
			obj[i] = _data[i].unwrap();
		}
		return obj;
	};
	
	/**
	 * Loads the given data object in this Item.
	 * Make sure the given data has the same attributes (i.e. is of the same 'class')
	 * as the old data.
	 * @param data the new data object. Make sure it's a plain object of the same 'class'
	 * as the old data that was wrapped in this Item. 
	 */
	this.load = function(data) {
		self.incognito = true;
		for (var i in _data) {
			if (_data.hasOwnProperty(i) && data.hasOwnProperty(i)) {
				_data[i].load(data[i]);
			}
		}
		self.incognito = false;
		self._setChanged(true);
		self.notifyObservers();
	};
	
	/**
	 * Compares the given Observable item's value with this Item's value.
	 * @param item an Observable which can be unwrapped.
	 * @return 0 if they are the same, anything that isn't 0 otherwise.
	 */
	this.compareTo = function(item) {
		if (!item instanceof Observable || !$.isFunction(item.unwrap)) {
			throw "Equals method of an Item should only be passed Observables which can be unwrapped.";
		}
		var other = item.unwrap();
		var myvalue = self.unwrap();
		if ( (myvalue == null && other != null) || (other == null && myvalue != null) ) { return 2; }
		if (myvalue == null && other == null) { return 0; }
		for (var i in myvalue) {
			if (myvalue.hasOwnProperty(i)) {
				if (!other.hasOwnProperty(i) || !propsMatch(myvalue[i], other[i])) { return 2; }
			}
		}
		for (var i in other) {
			if (other.hasOwnProperty(i)) {
				if (!myvalue.hasOwnProperty(i) || !propsMatch(other[i], myvalue[i])) { return 2; }
			}
		}
		
		function propsMatch(p1, p2) {
			if (isSimpleLiteral(p1) && !isDate(p1)) {
				if (p1 != p2) {return false;}
			} else {
				if (new Item(p1).compareTo(new Item(p2)) != 0) {
					return false;
				}
			}
			return true;
		}
		
		return 0;
	};
}
Item.prototype = new Observable();

