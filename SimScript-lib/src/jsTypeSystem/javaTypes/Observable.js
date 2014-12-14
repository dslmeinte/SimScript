/**
 * Constructs an Observable object.
 * It represents the Java Observable class with a small change:
 * the Observers are not objects implementing the Observer interface, but are functions 
 * representing the Java Observer interface's update(Observable, Object) method.
 * 
 * Be careful when using the 'this' keyword in an Observer, 
 * as it will point to the Observable.
 * The Observer function can modify a var, so 'var self=this' will solve this problem.
 */
function Observable() {
	// The Observers of this Observable.
	var observers = [];
	
	// Boolean indicating whether this Observable has changed.
	var changed = false;	
	
	// Private function to call all observers with the given arguments.
	function notify(observable, argumentObject) {
		for (var i = 0; i < observers.length; i++) {
			observers[i](observable, argumentObject);
		}
	};
	
	// PUBLIC
	/**
	 * If this object has changed, as indicated by the hasChanged method, 
	 * then notify all of its observers and then call the clearChanged method 
	 * to indicate that this object has no longer changed.
	 * If incognito is set to true, observers will not be notified and 
	 * clearChanged will not be called.
	 * 
	 * Each observer is called with two arguments: 
	 * this observable object and the argumentObject argument.
	 * 
	 * @param argumentObject any Object. 
	 * If it is undefined or null, the observers will be called
	 * with this Observable and null.
	 */
	this.notifyObservers = function(argumentObject) {
		if (!this.incognito && this.hasChanged()) {
			if (argumentObject === undefined) {
				notify(this, null);
			} else {
				notify(this, argumentObject);
			}
			this._clearChanged();
		}
	};
	
	this.addObserver = function(updateFunction) {
		observers.push(updateFunction);
	};
	
	this.countObservers = function() {
		return observers.length;
	};
	
	this.deleteObserver = function(updateFunction) {
		observers.remove(updateFunction);
	};
	
	this.deleteObservers = function() {
		observers = [];
	};
	
	this.hasChanged = function() {
		return changed;
	};
	
	/**
	 * If incognito = true, Observers will not be notified.
	 * Even if _setChanged and notifyObservers have been called.
	 */
	this.incognito = false;
	
	// PROTECTED
	this._setChanged = function(changedBool) {
		changed = changedBool;
	};
	
	this._clearChanged = function() {
		changed = false;
	};

}

