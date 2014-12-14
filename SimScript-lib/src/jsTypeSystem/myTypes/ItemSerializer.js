ItemSerializer = {
	serialize : function(item) {
		/*
		 * Returns a new obj representing the given obj.
		 * All null values of the object are removed.
		 * For all objects contained in obj, this function is called
		 * recursively to delete all null values.
		 * 
		 * Returns null if obj was undefined or a null literal.
		 * 
		 * Ignores functions and prototype's properties.
		 * 
		 * Obj itself is not modified.
		 * 
		 * @param obj the object to be stripped of null values.
		 */
		function deleteNulls(obj) {
			if (obj == undefined) { return null; }
			if (isSimpleLiteral(obj)) { return obj; }
			var retObj = $.isArray(obj) ? [] : {};
			for (var p in obj) {
				// skip prototype, null and functions
				if (obj.hasOwnProperty(p) && obj[p] != undefined && !$.isFunction(obj[p])) {
					// recursive call on children
					var temp = deleteNulls(obj[p]);
					// add non-null, processed children
					if (temp != null) {
						if ($.isArray(retObj)) { 
							retObj.push(temp); 
						} else {
							retObj[p] = temp;
						}
					}
				}
			}
			return retObj;
		}

		function stringifyDates(obj) {
			if (obj == undefined)		{ return null; }
			if (isDate(obj)) 			{ return DateUtil.format(obj); }
			if (isSimpleLiteral(obj))	{ return obj; }
			var retObj = $.isArray(obj) ? [] : {};
			for (var p in obj) {
				if (obj.hasOwnProperty(p) && !$.isFunction(obj[p])) {
					// recursive call on children
					var temp = stringifyDates(obj[p]);
					// add non-null, processed children
					if (temp != null) {
						if ($.isArray(retObj)) { 
							retObj.push(temp); 
						} else {
							retObj[p] = temp;
						}
					}
				}
			}
			return retObj;
		}
		return stringifyDates(deleteNulls(item.unwrap()));
	}
};

