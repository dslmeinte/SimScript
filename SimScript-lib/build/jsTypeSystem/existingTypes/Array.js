Array.prototype.insert = function(idx, item) {
  this.splice(idx, 0, item);
};

Array.prototype.get = function(idx) {
  return this[idx];
};

Array.prototype.one = function(callback) {
  if(this.length === 0) {
    callback(null);
  } else {
    callback(this[0]);
  }
};



/**
 * Returns all elements that match the filter function.
 * @param filterFunc function that accepts an element of the array and
 * returns true if the element matches and false otherwise.
 * @return an array of all elements that match the given function.
 * Can be an empty array.
 */
Array.prototype.filter = function(filterFunc) {
	var ret = [];
	for(var i = 0; i < this.length; i++) {
		if(filterFunc(this[i])) {
			ret.push(this[i]);
		}
	}
	return ret;
};

Array.prototype.contains = function(el) {
  for(var i = 0; i < this.length; i++) {
    if(this[i] === el) {
      return true;
    }
  }
  return false;
};

Array.prototype.remove = function(el) {
  for(var i = 0; i < this.length; i++) {
    if(this[i] === el) {
      this.splice(i, 1);
      return true;
    }
  }
  return false;
};

Array.prototype.removeAllOccurences = function(el) {
	var foundOne = false;
	while (this.remove(el)) {
		foundOne = true;
	}
	return foundOne;
};

