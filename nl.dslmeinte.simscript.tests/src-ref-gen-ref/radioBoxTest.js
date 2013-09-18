var radioBoxTest = new function() {
	var globalModuleAuthenticationInfo = null;

	// screen form:
	this.form = function (container) {
		container.html("");
		var varWb = new Item({
			/* features that were not explicitly assigned will be set to default values */
			'bool' : null, 
				id : null
			/* features that were assigned values: */
		}
		);
		radioBoxTest.subForm(varWb, container);
	
	};
	
	// component subForm:
	this.subForm = function (varWb, container) {
		var varDisplayBool = new Item(true);
		var d1 = $('<div />');
		d1.addClass('sim-ui-block');
		var d1TitleDiv = $('<div/>');
		d1TitleDiv.addClass('sim-ui-block-title');
		var d1HeaderTempContainer = container;
		container = d1TitleDiv;
		container.append(document.createTextNode(new Item("Sub form").print()));
		container = d1HeaderTempContainer;
		d1.append(d1TitleDiv);
		var d1ContentDiv = $('<div/>');
		d1ContentDiv.addClass('sim-ui-block-body');
		d1.append(d1ContentDiv);
		container.append(d1);
		var d1BodyTempContainer = container;
		container = d1ContentDiv;
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
		tableLabel1.append("Display bool?");
		tableLeftCol1.append(tableLabel1);
		
		var tableRightCol1 = $('<div/>');
		tableRightCol1.addClass('sim-ui-table-elements-container');
		tableRow1.append(tableRightCol1);
		
		var tableRowTempContainer1 = container;
		container = tableRightCol1;
		
		new checkboxField(varDisplayBool, container);
		
		container = tableRowTempContainer1;
		
		var tableFirstInput1 = tableRightCol1.find('input:first');
		if (tableFirstInput1.length > 0) {
			tableFirstInput1.attr('id', 'radioBoxTest-tableId-1');
			// WORKAROUND FOR DATEPICKER PLUGIN
			// http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/
			if (tableFirstInput1.data('datepicker')) {
				tableFirstInput1.data('datepicker').id = 'radioBoxTest-tableId-1';
			}
			// END WORKAROUND
			tableLabel1.attr('for', 'radioBoxTest-tableId-1');
		}
		
		
		container = tableTempContainer1;
		// Begin When Element
		var when1 = $('<div>');
		function whenFunction1() { when1.toggle(varDisplayBool.unwrap()); }
		varDisplayBool.addObserver(whenFunction1);
		whenFunction1();
		container.append(when1);
		var whenTempContainer1 = container;
		container = when1;
		var table2 = $('<div/>');
		table2.addClass("sim-ui-table");
		container.append(table2);
		
		var tableTempContainer2 = container;
		container = table2;
		var tableRow2 = $('<div/>');
		tableRow2.addClass("sim-ui-table-row");
		container.append(tableRow2);
		
		var tableLeftCol2 = $('<div/>');
		tableLeftCol2.addClass("sim-ui-table-label-container");
		tableRow2.append(tableLeftCol2);
		
		var tableLabel2 = $('<label/>');
		tableLabel2.append("bool?:");
		tableLeftCol2.append(tableLabel2);
		
		var tableRightCol2 = $('<div/>');
		tableRightCol2.addClass('sim-ui-table-elements-container');
		tableRow2.append(tableRightCol2);
		
		var tableRowTempContainer2 = container;
		container = tableRightCol2;
		
		new radioButtonField(varWb.getBool(), container, 'true', 'false');
		container.append(document.createTextNode(new Item(" Unfortunately, this works...").print()));
		
		container = tableRowTempContainer2;
		
		var tableFirstInput2 = tableRightCol2.find('input:first');
		if (tableFirstInput2.length > 0) {
			tableFirstInput2.attr('id', 'radioBoxTest-tableId-2');
			// WORKAROUND FOR DATEPICKER PLUGIN
			// http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/
			if (tableFirstInput2.data('datepicker')) {
				tableFirstInput2.data('datepicker').id = 'radioBoxTest-tableId-2';
			}
			// END WORKAROUND
			tableLabel2.attr('for', 'radioBoxTest-tableId-2');
		}
		
		
		container = tableTempContainer2;
		container = whenTempContainer1;
		// End When Element
		container = d1BodyTempContainer;
	
	};
	
	// screen uniqueIdTest:
	this.uniqueIdTest = function (container) {
		container.html("");
		var varMeting = new Item(null);
		radioBoxTest.radioButton(varMeting, container);
	
		radioBoxTest.radioButton(varMeting, container);
	
	};
	
	// component radioButton:
	this.radioButton = function (varMeting, container) {
		new radioButtonField(varMeting, container, 'ja', 'nee');
	
	};
	



	this.enter = function(authenticationInfo) {
		globalModuleAuthenticationInfo = authenticationInfo;
		this.form( $('#_content'));
	};
}();
