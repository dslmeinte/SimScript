/**
 * Checks if the given object is a boolean, string, date, number or null.
 * @param o the 'object'/variable to check.
 * @returns {Boolean} true iff o is a number, string or boolean or null.
 */
function isSimpleLiteral(o) {
	return o === null || isNum(o) || isString(o) || isBool(o) || isDate(o);
}

/**
 * Checks if a given object is a number by negating the isNaN result.
 * 
 * @param n the number to test.
 * @returns {Boolean} true iff n != NaN
 */
function isNum(n) {
	return n != null && $.isNumeric(n);
}

/**
 * Checks if a given object is a String by testing if the
 * toLowerCase function is present.
 * 
 * Note that this will cause wrong results when s has a toLowerCase function,
 * but is not actually a String.
 * @param s the string to check.
 * @returns {Boolean} true iff s has a toLowerCase function.
 */
function isString(s) {
	return s != null && $.isFunction(s.toLowerCase);
}

/**
 * Checks if the given object is a boolean by type safe comparing it with
 * the two possible boolean values (true and false).
 * @param b the boolean to check.
 * @returns {Boolean} true iff b is true or false.
 */
function isBool(b) {
	return b != null && (b === true || b === false);
}

/**
 * Checks if the given object is a Date by using instanceof.
 * @param d the Date to check.
 * @returns {Boolean} true iff d is instaceof Date
 */
function isDate(d) {
	// Note: doesn't work across frame boundaries.
	return d!=null && d instanceof Date;
}

