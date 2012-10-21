/**
 * An implementation of the java List interface.
 * It also extends Obersvable, so Observers will be
 * notified when the list changes.
 * 
 * If the elements in the list are not Observable,
 * they are assumed to be simple immutable objects.
 * If this is not the case, we cannot guarantee reactiveness.
 */
function List(initialObjectArray) {
	/*
	 * Brainstorm (not sure if I'm right here):
	 * an object is constructed by calling a constructor with the 'new' operator
	 * any function not assigned specifically to an object will not have an object in
	 * its scope (other than the global object DOMWindow), 
	 * since new is not defined on an object.
	 * Therefore any private functions of a constructor will allways have this===window
	 * unless 'this' is called/applied.
	 * 
	 * To counter this, I'll use self=this in the constructor and use self in the
	 * private functions. 'this' in a constructor, and therefore self, refers to the
	 * newly created object, unless your constructor returns an Object. 
	 * In that case self will point to an object you won't be able to reach anymore. 
	 */
	
	// Make the List extend a new Observable.
	//
	// The scope of vars (like observers) is the function, so
	// all instances of List should have a new instance of Observable
	// as their prototype. Otherwise they will share the same Observable
	// as prototype and will therefore share the same observers.
	//
	// By making this call, the next call to new List() will 
	// have this new Observable() as prototype.
	List.prototype=new Observable();
	
	// self points to the List instance that will be created in this constructor.
	var self = this;
	var array = [];
	
	// Observer updateFunction.
	var updateFunction = function(observable, arg) {
		// apparently one of our items changed, let's notify the Observers
		self._setChanged(true);
		self.notifyObservers(arg);
	};
	
	// Observe a new element if possible.
	function observeIt(newElement) {
		if (newElement instanceof Observable && !self.contains(newElement)) {
			newElement.addObserver(updateFunction);
		}
	};
	
	// Observe all new elements in the array if possible.
	function observeThem(elementsArray) {
		var processed = [];
		for (var i = 0; i < elementsArray.length; i++) {
			var item = elementsArray[i];
			if (!processed.contains(item)) {
				observeIt(item);
				processed.push(item);
			}
		}
	};
	
	// Stop observing the element.
	function stopObservingIt(element) {
		if (element instanceof Observable && !self.contains(element)) {
			element.deleteObserver(updateFunction);
		}
	}
	
	// Stop observing all the elements in the array.
	function stopObservingThem(elementsArray) {
		for (var i = 0; i < elementsArray.length; i++) {
			var item = elementsArray[i];
			stopObservingIt(item);
		}
	}
	
	/**
	 * If 1 argument is given: add(Object o)
	 * Appends the specified element to the end of this list.
	 * 
	 * If 2 arguments are given: add(int index, Object element)
	 * Inserts the element at the given index in this list.
	 * The index should be an existing index!
	 */
	this.add = function() {
		var item;
		if (arguments.length === 1) {
			item = arguments[0];
			observeIt(item);
			array.push(item);
		} else if (arguments.length === 2) {
			var index = arguments[0];
			item = arguments[1];
			observeIt(item);
			var tempArray = array.slice(0, index);
			tempArray.push(item);
			array = tempArray.concat(array.slice(index));
		} else {
			throw "Wrong number of arguments.";
		}
		this._setChanged(true);
		this.notifyObservers();
	};
    
	/**
     * If 1 argument is given: addAll(Array c)
     * Appends all of the elements in the specified Array to the end of this list, 
     * in the order that they are found in c.
	 * 
	 * If 2 arguments are given: addAll(int index, Array c)
	 * Inserts all of the elements in the specified Array into this list 
	 * at the specified position.
	 */
	this.addAll = function() {
		var items;
		if (arguments.length === 1) {
			items = arguments[0];
			observeThem(items);
			array = array.concat(items);
		} else if (arguments.length === 2) {
			var index = arguments[0];
			items = arguments[1];
			observeThem(items);
			array = array.slice(0, index).concat(items).concat(array.slice(index));
		} else {
			throw "Wrong number of arguments.";
		}
		this._setChanged(true);
		this.notifyObservers();
	};
	
	/**
	 * Removes all of the elements from this list.
	 */
	this.clear = function() {
		for (var i = 0; i < array.length; i++) {
			array[i].deleteObserver(updateFunction);
		}
		array = [];
		this._setChanged(true);
		this.notifyObservers();
	};
	
	/**
	 * Returns true if this list contains the specified element.
	 * Uses contains of existingTypes.Array's Array functionality extension.
	 */
    this.contains = function(element) {
        for(var i = 0; i < array.length; i++) {
            if(array[i].compareTo(element) == 0) {
                return true;
            }
        }
    	return false;
    };
   
    /**
     * Returns true if this list contains all of the elements of the specified collection.
     * Uses contains of existingTypes.Array's Array functionality extension.
     */
    this.containsAll = function(arrayArray) {
    	for (var i = 0; i < arrayArray.length; i++) {
    		if (!array.contains(arrayArray[i])) {
    			return false;
    		}
    	}
    	return true;
    };

    /**
     * Returns the element at the specified position in this list.
     */
    this.get = function(indexNum) {
    	return array[indexNum];
    };

    /**
     * Returns the index in this list of the first occurrence 
     * of the specified element, 
     * or -1 if this list does not contain this element.
     * 
     * Uses the '===' operator for comparison.
     */
    this.indexOf = function(element) {
    	for (var i = 0; i < array.length; i++) {
    		if (array[i].compareTo(element) == 0) {
    			return i;
    		}
    	}
    	return -1;
    };

    /**
     * Returns the index in this list of the last occurrence 
     * of the specified element, 
     * or -1 if this list does not contain this element.
     * 
     * Uses the '===' operator for comparison.
     */
    this.lastIndexOf = function(element) {
    	for (var i = array.length - 1; i >= 0; i--) {
    		if (array[i] === element) {
    			return i;
    		}
    	}
    	return -1;
    };
    
    /**
     * Returns true if this list contains no elements.
     */
    this.isEmpty = function() {
    	return array.length < 1;
    };

    /**
     * Returns a copy of this list's underlying array.
     * It's a copy so we can maintain reactiveness.
     */
    this.toArray = function() {
    	return [].concat(array);
    };
    
    /**
     * Removes the element at the specified position in this list.
     * @returns the element that was removed.
     */
    this.removeAt = function(indexNum) {
    	removed = array.splice(indexNum, 1)[0];
    	stopObservingIt(removed);
    	this._setChanged(true);
    	this.notifyObservers();
    	return removed;
    };

    /**
     * Removes the first occurrence in this list of the specified element
     * 
     * Uses the compareTo function for comparison.
     * 
     * @returns true iff the list contained the element.
     */
    this.remove = function(element) {
    	/*var found = array.remove(element);
    	if (found) {
    		stopObservingIt(element);
        	this._setChanged(true);
        	this.notifyObservers();
    	}*/

        var found = false;
        for(var i = 0; i < array.length; i++) {
            
            if(array[i].compareTo(element) == 0) {
                this.removeAt(i);                
                found = true;
                break;
            }
        }
    	return found;
    };
    
    /**
     * Removes from this list all the elements that are contained 
     * in the specified collection.
     * 
     * Uses the '===' operator for comparison.
     * 
     * @returns true iff the List changed as a result of the call.
     */
    this.removeAll = function(arrayArray) {
    	var bool = false;
    	for (var i = 0 ; i < arrayArray.length; i++) {
    		var item = arrayArray[i];
    		if (array.removeAllOccurences(item)) {
    			bool = true;
    			stopObservingIt(item);
    		}
    	}
    	if (bool) {
    		this._setChanged(true);
        	this.notifyObservers();
    	}
    	return bool;
    };
    
    /**
     * Retains only the elements in this list that are contained 
     * in the specified collection.
     * 
     * Uses the '===' operator for comparison.
     */
    this.retainAll = function(arrayArray) {
    	var toBeRemoved = [];
    	for (var i = 0; i < array.length; i++) {
    		if (!arrayArray.contains(array[i])) { 
    			toBeRemoved.push(array[i]);
    		}
    	}
    	this.removeAll(toBeRemoved);
    	return toBeRemoved.length > 0;
    };
    
    /**
     * Replaces the element at the specified position 
     * in this list with the specified element.
     * 
     * @returns the element previously at the position.
     */
    this.set = function(indexNum, element) {
    	var old = array[indexNum];
    	if (old !== element) {
    		observeIt(element);
    		array[indexNum] = element;
    		stopObservingIt(old);
    		this._setChanged(true);
        	this.notifyObservers();
    	}
    	return old;
    };
    
    /**
     * Returns the number of elements in this list.
     */
    this.size = function() {
    	return array.length;
    };
    
    /**
     * Returns a view of the portion of this list 
     * between the specified fromIndex, inclusive, and toIndex, exclusive.
     */
	this.subList = function(fromIndexNum, toIndexNum) {
		var list = new List();
		list.addAll(array.slice(fromIndexNum, toIndexNum));
		return list;
	};
    
	/**
	 * Executes the given function for all items in this List.
	 * The argFunction should accept an Item as argument.
	 * Any modifications made to the Item in argFunction will be reflected in this List.
	 * If the argFuntion returns true for an Item, the other Items won't be checked anymore.
	 * 
	 * Returns true if the function was executed for all items (i.e. if it was not stopped prematurely by the argFunction returning true);
	 */
	this.forAll = function(argFunction) {
		if (!$.isFunction(argFunction)) { throw "List.forAll called with an argument that is not a function."; }
		for (var i = 0; i < array.length; i++) {
			if (argFunction(array[i]) === true) {
				return false;
			}
		}
		return true;
	};
	
	/**
	 * Executes the given argFunction for all elements in the list, until it returns true for an element.
	 * If the argFunction returns true for an element, this method returns true, false otherwise.
	 */
	this.exists = function(argFunction) {
		if (!$.isFunction(argFunction)) { throw "List.exists called with an argument that is not a function."; }
		for (var i = 0; i < array.length; i++) {
			if (argFunction(array[i])) { return true; };
		}
		return false;
	};
	
	/**
	 * Returns a normal non-observable version of this object
	 * Note that it uses the toData function of other types and Lists.
	 * Any other Observable object will remain observable and will keep its functions.
	 * Changing such an object will affect this object as well.
	 */
	this.toData = function() {
		var obj = [];
		var items = self.toArray();
		for (var i = 0; i < items.length; i++) {
			if (items[i] instanceof Observable && $.isFunction(items[i].toData)) {
				obj.push(items[i].toData());
			} else if (!$.isFunction(items[i])) {
				obj.push(items[i]);
			}
		}
		return obj;
	};
	
	/**
	 * Unwraps all the Items in this list and returns them as a normal Array.
	 */
	this.unwrap = function() {
		var obj = [];
		var items = self.toArray();
		for (var i = 0; i < items.length; i++) {
			obj.push(items[i].unwrap());
		}
		return obj;
	};
	
	/**
	 * Loads the given data array in this List.
	 * Make sure the given data is an array with normal javascript objects.
	 * @param data the new data. Make sure it's a plain javasript array with plain objects.
	 */
	this.load = function(dataArray) {
		if (!$.isArray(dataArray)){throw "Won't load a non-array in this List.";}
		self.incognito = true;
		self.clear();
		self.addAll(toItemArray(dataArray));
		self.incognito = false;
		self._setChanged(true);
		self.notifyObservers();
	};
	
	// add the initialItems
	if ($.isArray(initialObjectArray)) {
		self.addAll(toItemArray(initialObjectArray));
	}
	
	// wraps all objects in the array in Items and returns the array of Items.
	function toItemArray(objectArray) {
		var itemArray = [];
		for (var i = 0; i < objectArray.length; i++) {
			itemArray.push(new Item(objectArray[i]));
		}
		return itemArray;
	}
	
	/**
	 * Compares the given Observable item's value with this Lists's value.
	 * @param item an Observable which can be unwrapped.
	 * @return 0, or something else.
	 */
	this.compareTo = function(item) {
		if (!item instanceof Observable || !$.isFunction(item.unwrap)) {
			throw "Equals method of a List should only be passed Observables which can be unwrapped.";
		}
		var other = item.unwrap();
		// since we need to cope with Meinte's change to represent optional attributes as null,
		// a null value will now be considered equal to an empty list. (GROSS)
		if (other == null && array.length == 0) {return 0;}
		if (!$.isArray(other)) {return 2;}
		if (other.length != array.length) { return other.length>array.length?-1:1; }
		var otherList = new List(other);
		for (var i = 0; i < array.length; i++) {
			// ensures that items can't be matched by the same element:
			// array: [1,2,2]  other: [1,2,3] should not match
			if (!otherList.remove(array[i])) { return 2; }
		}
		return 0;
	};
	
	/**
	 * Removes items from the array where argFunc returns true
	 * @param argFunc, a function that should return true or false
	 */
    this.removeWhen = function(argFunc) {
        var indexes = [];
        for(var i = 0; i < array.length; i++) {
            if(argFunc(array[i])) {
                console.log("index: " + i + ", in array");
                indexes.push(i);
            }
        }
        indexes.sort(function(a,b){return b - a;});
        console.log("found indexes: " + indexes);
        for(var i = 0; i < indexes.length; i++) {
            console.log("index: " + i + ", in array");
            this.removeAt(indexes[i]);
        }
    };
    
    /**
     * Sorts by using the sortBy function reference
     * @param sortBy, a sorting function
     */
    this.sort = function (sortBy) {
        var tmp;
        
        for(var i = 0; i < array.length; i++) {
            for(var j = 1; j < array.length - i; j++) {
                if(sortBy(array[j - 1]).compareTo(sortBy(array[j])) == 1) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        self._setChanged(true);
		self.notifyObservers();
    };

};
//Make the List extend a new Observable.
List.prototype=new Observable();

