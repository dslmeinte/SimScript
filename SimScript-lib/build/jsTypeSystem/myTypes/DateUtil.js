DateUtil = {
	apiDateFormat	: "dayOfMonth(2 digits):monthInYear(2 digits):yearAD(4 digits):hoursInDay(2 digits):minutesInHour(2 digits):secondsInMinute(2 digits)", 
	format			: function(date) {
			if (!isDate(date)) { throw "DateUtil.format won't format something that isn't a date: "+typeof date; }
			function p(n) { return ( n < 10 ? '0' : '' ) + n; };
			return ""
				+ p(date.getDate()) + ":"
				+ p(date.getMonth() + 1) + ":"
				+ date.getFullYear() + ":"
				+ p(date.getHours()) + ":"
				+ p(date.getMinutes())
				+ ":00";
		},
	parse			: function(string) {
			DateUtil.checkDateFormat(string);
			var date = new Date();
			date.setFullYear(string.slice(6, 10), string.slice(3, 5) - 1, string.slice(0, 2));
			date.setHours(string.slice(11, 13), string.slice(14, 16), string.slice(17, 19), 0);
			return date;
		},
	dateEquals : function(date1, date2) {
		return date1.getDate() == date2.getDate()
			&& date1.getMonth() == date2.getMonth()
			&& date1.getFullYear() == date2.getFullYear();
		},
	compare : function(date1, date2) {
		if (date1.getTime() < date2.getTime()) {
			return -1;
		} else if (date1.getTime() === date2.getTime()) {
			return 0;
		} else if (date1.getTime() > date2.getTime()) {
			return 1;
		}
		// should never happen:
		return NaN;
	},
	checkDateFormat : function(string) {
		if (string == undefined) {
			throw "DateUtil.checkDateFormat: no string given to check the dateformat.";
		}
		if (string.length < 19) { 
			throw "DateUtil.checkDateFormat: given string is too short to be of the proper format (see DateUtil.apiDateFormat).";
		}
		if (string.length > 19) {
			throw "DateUtil.checkDateFormat: given string is too long to be of the proper format (see DateUtil.apiDateFormat).";
		}
		var errorMessage = "";
		var separator = ':';
		var dayOfMonth = string.slice(0, 2);
		var dayMonthSeparator = string.charAt(2);
		var monthInYear = string.slice(3, 5);
		var monthYearSeparator = string.charAt(5);
		var yearAD = string.slice(6, 10);
		var yearHourSeparator = string.charAt(10);
		var hoursInDay = string.slice(11, 13);
		var hourMinuteSeparator = string.charAt(13);
		var minutesInHour = string.slice(14, 16);
		var minuteSecondSeparator = string.charAt(16);
		var secondsInMinute = string.slice(17, 19);
		
		if (!$.isNumeric(dayOfMonth)) {
			errorMessage = errorMessage + " -- dayOfMonth ("+dayOfMonth+") is not numeric -- ";
		}
		if ( dayMonthSeparator != separator) {
			errorMessage = errorMessage + " -- separator between day and month (" + dayMonthSeparator
			+ ") is not a proper separator("+separator+") --\n";
		}
		if (!$.isNumeric(monthInYear)) {
			errorMessage = errorMessage + " -- monthInYear ("+monthInYear+") is not numeric --\n";
		}
		if (monthYearSeparator != separator) {
			errorMessage = errorMessage + " -- separator between month and year (" + monthYearSeparator
			+ ") is not a proper separator("+separator+") --\n";
		}
		if (!$.isNumeric(yearAD)) {
			errorMessage = errorMessage + " -- yearAD ("+yearAD+") is not numeric --\n";
		}
		if (yearHourSeparator != separator)	{
			errorMessage = errorMessage + " -- separator between year and hours (" + yearHourSeparator
			+ ") is not a proper separator("+separator+") --\n";
		}
		if (!$.isNumeric(hoursInDay)) {
			errorMessage = errorMessage + " -- hoursInDay ("+hoursInDay+") is not numeric --\n";
		}
		if (hourMinuteSeparator != separator) {
			errorMessage = errorMessage + " -- separator between hours and minutes (" + hourMinuteSeparator
			+ ") is not a proper separator("+separator+") --\n";
		}
		if (!$.isNumeric(minutesInHour)) {
			errorMessage = errorMessage + " -- minutesInHour ("+minutesInHour+") is not numeric --\n";
		}
		if (minuteSecondSeparator != separator)	{
			errorMessage = errorMessage + " -- separator between minutes and seconds (" + minuteSecondSeparator
			+ ") is not a proper separator("+separator+") --\n";
		}
		if (!$.isNumeric(secondsInMinute)) {
			errorMessage = errorMessage + " -- secondsInMinute ("+secondsInMinute+") is not numeric --\n";
		}
		
		if (errorMessage != "") { throw "DateUtil.checkDateFormat: incorrect dateformat:\n" + errorMessage; }
		return true;
	},
	today: function() {
		return new Date(new Date().setHours(0, 0, 0, 0));
	}
};

