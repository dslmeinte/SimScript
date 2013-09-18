var valuesBindingTest = new function() {
	var globalModuleAuthenticationInfo = null;

	// screen root:
	this.root = function (container) {
		container.html("");
		var varA = new Item(1);
		var varI = new Item(null);
		function derivedValueFunction1() { varI.load(UndefinedUtil.normalizeComparison(varA.compareTo(new Item(37)), function(ds) { return( ds <= 0 ); })); }
		varA.addObserver(derivedValueFunction1);
		derivedValueFunction1();
		var varJ = new Item({
			/* features that were not explicitly assigned will be set to default values */
			'bool' : null, 
				id : null
			/* features that were assigned values: */
		}
		);
		var varStuff = new Item({
			/* features that were not explicitly assigned will be set to default values */
			'num' : null, 
				id : null, 
			/* features that were assigned values: */
			'date' : DateUtil.today()
		}
		);
		var varComp1 = new Item(null);
		function derivedValueFunction2() { varComp1.load(UndefinedUtil.normalizeComparison(varStuff.getNum().compareTo(new Item(0)), function(ds) { return( ds > 0 ); })); }
		varStuff.getNum().addObserver(derivedValueFunction2);
		derivedValueFunction2();
		var varComp2 = new Item(null);
		function derivedValueFunction3() { varComp2.load((varStuff.getNum().unwrap() != null)); }
		varStuff.getNum().addObserver(derivedValueFunction3);
		derivedValueFunction3();
		var varL = new Item(null);
		var varS = new Item("");
		var table1 = $('<div/>');
		table1.addClass("sim-ui-table");
		container.append(table1);
		
		var tableTempContainer1 = container;
		container = table1;
		var tableRow1 = $('<div/>');
		tableRow1.addClass("sim-ui-table-row");
		container.append(tableRow1);
		
		var tableLeftCol1 = $('<div/>');
		tableLeftCol1.addClass("sim-ui-table-label-container");
		tableRow1.append(tableLeftCol1);
		
		var tableLabel1 = $('<label/>');
		tableLabel1.append("a:");
		tableLeftCol1.append(tableLabel1);
		
		var tableRightCol1 = $('<div/>');
		tableRightCol1.addClass('sim-ui-table-elements-container');
		tableRow1.append(tableRightCol1);
		
		var tableRowTempContainer1 = container;
		container = tableRightCol1;
		
		numField(varA, container, "some Integer");
		
		container = tableRowTempContainer1;
		
		var tableFirstInput1 = tableRightCol1.find('input:first');
		if (tableFirstInput1.length > 0) {
			tableFirstInput1.attr('id', 'valuesBindingTest-tableId-1');
			// WORKAROUND FOR DATEPICKER PLUGIN
			// http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/
			if (tableFirstInput1.data('datepicker')) {
				tableFirstInput1.data('datepicker').id = 'valuesBindingTest-tableId-1';
			}
			// END WORKAROUND
			tableLabel1.attr('for', 'valuesBindingTest-tableId-1');
		}
		
		var tableRow2 = $('<div/>');
		tableRow2.addClass("sim-ui-table-row");
		container.append(tableRow2);
		
		var tableLeftCol2 = $('<div/>');
		tableLeftCol2.addClass("sim-ui-table-label-container");
		tableRow2.append(tableLeftCol2);
		
		var tableLabel2 = $('<label/>');
		tableLabel2.append("i:");
		tableLeftCol2.append(tableLabel2);
		
		var tableRightCol2 = $('<div/>');
		tableRightCol2.addClass('sim-ui-table-elements-container');
		tableRow2.append(tableRightCol2);
		
		var tableRowTempContainer2 = container;
		container = tableRightCol2;
		
		var bindingSpan1 = $('<span/>');
		var bindingFunction1 = function() { bindingSpan1.html('' + varI.unwrap()); };
		varI.addObserver(bindingFunction1);
		bindingFunction1();
		container.append(bindingSpan1);
		
		container = tableRowTempContainer2;
		
		var tableFirstInput2 = tableRightCol2.find('input:first');
		if (tableFirstInput2.length > 0) {
			tableFirstInput2.attr('id', 'valuesBindingTest-tableId-2');
			// WORKAROUND FOR DATEPICKER PLUGIN
			// http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/
			if (tableFirstInput2.data('datepicker')) {
				tableFirstInput2.data('datepicker').id = 'valuesBindingTest-tableId-2';
			}
			// END WORKAROUND
			tableLabel2.attr('for', 'valuesBindingTest-tableId-2');
		}
		
		var tableRow3 = $('<div/>');
		tableRow3.addClass("sim-ui-table-row");
		container.append(tableRow3);
		
		var tableLeftCol3 = $('<div/>');
		tableLeftCol3.addClass("sim-ui-table-label-container");
		tableRow3.append(tableLeftCol3);
		
		var tableLabel3 = $('<label/>');
		tableLabel3.append("j:");
		tableLeftCol3.append(tableLabel3);
		
		var tableRightCol3 = $('<div/>');
		tableRightCol3.addClass('sim-ui-table-elements-container');
		tableRow3.append(tableRightCol3);
		
		var tableRowTempContainer3 = container;
		container = tableRightCol3;
		
		new radioButtonField(varJ.getBool(), container, 'yes', 'no');
		
		container = tableRowTempContainer3;
		
		var tableFirstInput3 = tableRightCol3.find('input:first');
		if (tableFirstInput3.length > 0) {
			tableFirstInput3.attr('id', 'valuesBindingTest-tableId-3');
			// WORKAROUND FOR DATEPICKER PLUGIN
			// http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/
			if (tableFirstInput3.data('datepicker')) {
				tableFirstInput3.data('datepicker').id = 'valuesBindingTest-tableId-3';
			}
			// END WORKAROUND
			tableLabel3.attr('for', 'valuesBindingTest-tableId-3');
		}
		
		var tableRow4 = $('<div/>');
		tableRow4.addClass("sim-ui-table-row");
		container.append(tableRow4);
		
		var tableLeftCol4 = $('<div/>');
		tableLeftCol4.addClass("sim-ui-table-label-container");
		tableRow4.append(tableLeftCol4);
		
		var tableLabel4 = $('<label/>');
		tableLabel4.append("w(n):");
		tableLeftCol4.append(tableLabel4);
		
		var tableRightCol4 = $('<div/>');
		tableRightCol4.addClass('sim-ui-table-elements-container');
		tableRow4.append(tableRightCol4);
		
		var tableRowTempContainer4 = container;
		container = tableRightCol4;
		
		numField(varStuff.getNum(), container, "(wrapped Number)");
		
		container = tableRowTempContainer4;
		
		var tableFirstInput4 = tableRightCol4.find('input:first');
		if (tableFirstInput4.length > 0) {
			tableFirstInput4.attr('id', 'valuesBindingTest-tableId-4');
			// WORKAROUND FOR DATEPICKER PLUGIN
			// http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/
			if (tableFirstInput4.data('datepicker')) {
				tableFirstInput4.data('datepicker').id = 'valuesBindingTest-tableId-4';
			}
			// END WORKAROUND
			tableLabel4.attr('for', 'valuesBindingTest-tableId-4');
		}
		
		var tableRow5 = $('<div/>');
		tableRow5.addClass("sim-ui-table-row");
		container.append(tableRow5);
		
		var tableLeftCol5 = $('<div/>');
		tableLeftCol5.addClass("sim-ui-table-label-container");
		tableRow5.append(tableLeftCol5);
		
		var tableLabel5 = $('<label/>');
		tableLabel5.append("w(d):");
		tableLeftCol5.append(tableLabel5);
		
		var tableRightCol5 = $('<div/>');
		tableRightCol5.addClass('sim-ui-table-elements-container');
		tableRow5.append(tableRightCol5);
		
		var tableRowTempContainer5 = container;
		container = tableRightCol5;
		
		dateField(varStuff.getDate(), container);
		
		container = tableRowTempContainer5;
		
		var tableFirstInput5 = tableRightCol5.find('input:first');
		if (tableFirstInput5.length > 0) {
			tableFirstInput5.attr('id', 'valuesBindingTest-tableId-5');
			// WORKAROUND FOR DATEPICKER PLUGIN
			// http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/
			if (tableFirstInput5.data('datepicker')) {
				tableFirstInput5.data('datepicker').id = 'valuesBindingTest-tableId-5';
			}
			// END WORKAROUND
			tableLabel5.attr('for', 'valuesBindingTest-tableId-5');
		}
		
		var tableRow6 = $('<div/>');
		tableRow6.addClass("sim-ui-table-row");
		container.append(tableRow6);
		
		var tableLeftCol6 = $('<div/>');
		tableLeftCol6.addClass("sim-ui-table-label-container");
		tableRow6.append(tableLeftCol6);
		
		var tableLabel6 = $('<label/>');
		tableLabel6.append("w(n) > 0");
		tableLeftCol6.append(tableLabel6);
		
		var tableRightCol6 = $('<div/>');
		tableRightCol6.addClass('sim-ui-table-elements-container');
		tableRow6.append(tableRightCol6);
		
		var tableRowTempContainer6 = container;
		container = tableRightCol6;
		
		var bindingSpan2 = $('<span/>');
		var bindingFunction2 = function() { bindingSpan2.html('' + varComp1.unwrap()); };
		varComp1.addObserver(bindingFunction2);
		bindingFunction2();
		container.append(bindingSpan2);
		container.append(document.createTextNode(new Item(" Note: comparison to initially-undefined value yields <tt>false<\/tt>.").print()));
		
		container = tableRowTempContainer6;
		
		var tableFirstInput6 = tableRightCol6.find('input:first');
		if (tableFirstInput6.length > 0) {
			tableFirstInput6.attr('id', 'valuesBindingTest-tableId-6');
			// WORKAROUND FOR DATEPICKER PLUGIN
			// http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/
			if (tableFirstInput6.data('datepicker')) {
				tableFirstInput6.data('datepicker').id = 'valuesBindingTest-tableId-6';
			}
			// END WORKAROUND
			tableLabel6.attr('for', 'valuesBindingTest-tableId-6');
		}
		
		var tableRow7 = $('<div/>');
		tableRow7.addClass("sim-ui-table-row");
		container.append(tableRow7);
		
		var tableLeftCol7 = $('<div/>');
		tableLeftCol7.addClass("sim-ui-table-label-container");
		tableRow7.append(tableLeftCol7);
		
		var tableLabel7 = $('<label/>');
		tableLabel7.append("w(n) is set");
		tableLeftCol7.append(tableLabel7);
		
		var tableRightCol7 = $('<div/>');
		tableRightCol7.addClass('sim-ui-table-elements-container');
		tableRow7.append(tableRightCol7);
		
		var tableRowTempContainer7 = container;
		container = tableRightCol7;
		
		var bindingSpan3 = $('<span/>');
		var bindingFunction3 = function() { bindingSpan3.html('' + varComp2.unwrap()); };
		varComp2.addObserver(bindingFunction3);
		bindingFunction3();
		container.append(bindingSpan3);
		container.append(document.createTextNode(new Item(" Note: actually reflects whether w(n) is set").print()));
		
		container = tableRowTempContainer7;
		
		var tableFirstInput7 = tableRightCol7.find('input:first');
		if (tableFirstInput7.length > 0) {
			tableFirstInput7.attr('id', 'valuesBindingTest-tableId-7');
			// WORKAROUND FOR DATEPICKER PLUGIN
			// http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/
			if (tableFirstInput7.data('datepicker')) {
				tableFirstInput7.data('datepicker').id = 'valuesBindingTest-tableId-7';
			}
			// END WORKAROUND
			tableLabel7.attr('for', 'valuesBindingTest-tableId-7');
		}
		
		var tableRow8 = $('<div/>');
		tableRow8.addClass("sim-ui-table-row");
		container.append(tableRow8);
		
		var tableLeftCol8 = $('<div/>');
		tableLeftCol8.addClass("sim-ui-table-label-container");
		tableRow8.append(tableLeftCol8);
		
		var tableLabel8 = $('<label/>');
		tableLabel8.append("l:");
		tableLeftCol8.append(tableLabel8);
		
		var tableRightCol8 = $('<div/>');
		tableRightCol8.addClass('sim-ui-table-elements-container');
		tableRow8.append(tableRightCol8);
		
		var tableRowTempContainer8 = container;
		container = tableRightCol8;
		
		integerField(varL, container, undefined);
		
		container = tableRowTempContainer8;
		
		var tableFirstInput8 = tableRightCol8.find('input:first');
		if (tableFirstInput8.length > 0) {
			tableFirstInput8.attr('id', 'valuesBindingTest-tableId-8');
			// WORKAROUND FOR DATEPICKER PLUGIN
			// http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/
			if (tableFirstInput8.data('datepicker')) {
				tableFirstInput8.data('datepicker').id = 'valuesBindingTest-tableId-8';
			}
			// END WORKAROUND
			tableLabel8.attr('for', 'valuesBindingTest-tableId-8');
		}
		
		var tableRow9 = $('<div/>');
		tableRow9.addClass("sim-ui-table-row");
		container.append(tableRow9);
		
		var tableLeftCol9 = $('<div/>');
		tableLeftCol9.addClass("sim-ui-table-label-container");
		tableRow9.append(tableLeftCol9);
		
		var tableLabel9 = $('<label/>');
		tableLabel9.append("l is set");
		tableLeftCol9.append(tableLabel9);
		
		var tableRightCol9 = $('<div/>');
		tableRightCol9.addClass('sim-ui-table-elements-container');
		tableRow9.append(tableRightCol9);
		
		var tableRowTempContainer9 = container;
		container = tableRightCol9;
		
		var bindingSpan4 = $('<span/>');
		var bindingFunction4 = function() { bindingSpan4.html('' + (varL.unwrap() != null)); };
		varL.addObserver(bindingFunction4);
		bindingFunction4();
		container.append(bindingSpan4);
		
		container = tableRowTempContainer9;
		
		var tableFirstInput9 = tableRightCol9.find('input:first');
		if (tableFirstInput9.length > 0) {
			tableFirstInput9.attr('id', 'valuesBindingTest-tableId-9');
			// WORKAROUND FOR DATEPICKER PLUGIN
			// http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/
			if (tableFirstInput9.data('datepicker')) {
				tableFirstInput9.data('datepicker').id = 'valuesBindingTest-tableId-9';
			}
			// END WORKAROUND
			tableLabel9.attr('for', 'valuesBindingTest-tableId-9');
		}
		
		var tableRow10 = $('<div/>');
		tableRow10.addClass("sim-ui-table-row");
		container.append(tableRow10);
		
		var tableLeftCol10 = $('<div/>');
		tableLeftCol10.addClass("sim-ui-table-label-container");
		tableRow10.append(tableLeftCol10);
		
		var tableLabel10 = $('<label/>');
		tableLabel10.append("s:");
		tableLeftCol10.append(tableLabel10);
		
		var tableRightCol10 = $('<div/>');
		tableRightCol10.addClass('sim-ui-table-elements-container');
		tableRow10.append(tableRightCol10);
		
		var tableRowTempContainer10 = container;
		container = tableRightCol10;
		
		stringField(varS, container, "(a hint)");
		
		container = tableRowTempContainer10;
		
		var tableFirstInput10 = tableRightCol10.find('input:first');
		if (tableFirstInput10.length > 0) {
			tableFirstInput10.attr('id', 'valuesBindingTest-tableId-10');
			// WORKAROUND FOR DATEPICKER PLUGIN
			// http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/
			if (tableFirstInput10.data('datepicker')) {
				tableFirstInput10.data('datepicker').id = 'valuesBindingTest-tableId-10';
			}
			// END WORKAROUND
			tableLabel10.attr('for', 'valuesBindingTest-tableId-10');
		}
		
		
		container = tableTempContainer1;
	
		// method doSomething:
		function doSomething() {
		var varB = varA;
		return( UndefinedUtil.normalizeComparison(varB.compareTo(varA), function(ds) { return( ds == 0 ); }) );
		}
		
	
	};
	



	this.enter = function(authenticationInfo) {
		globalModuleAuthenticationInfo = authenticationInfo;
		this.root( $('#_content'));
	};
}();
