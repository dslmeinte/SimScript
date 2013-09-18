var calendarmockup = new function() {
	var globalModuleAuthenticationInfo = null;

	// screen root:
	this.root = function (container) {
		container.html("");
		var varCurrentDate = new Item(DateUtil.today());
		var calendar1 = $('<div>');
		calendar1.datepicker({
			/*TODO onselect and allowfrom*/
			onSelect : function(dateText, inst) {
				if (!DateUtil.dateEquals($(this).datepicker('getDate'), varCurrentDate.unwrap())) {
					varCurrentDate.set($(this).datepicker('getDate'));
				}
				new function(selection) {
				varCurrentDate.load(selection.unwrap());
				}
				();
			}
		});
		varCurrentDate.addObserver(function(a){
			if (!DateUtil.dateEquals(calendar1.datepicker('getDate'), a.get())) {
				calendar1.datepicker('setDate', a.get());
			}
		});
		container.append(calendar1);
	
		calendarmockup.plannedStuffList(varCurrentDate, container);
	
	};
	
	// component plannedStuffList:
	this.plannedStuffList = function (varDate, container) {
		var varThingies = new Item([]);
		function updateFunctionVarThingies() {
			getStuff(
				new Item({
					/* features that were not explicitly assigned will be set to default values */
						id : null, 
					/* features that were assigned values: */
					'date' : varDate.unwrap()
				}
				),
				globalModuleAuthenticationInfo,
				function(response, error) {varThingies.load(response.unwrap());},
				function() {} /* no error callback for InterfaceCallExpression */
			);
		};
		updateFunctionVarThingies();
		// Begin ListElement
		var listDiv1 = $('<div>');
		container.append(listDiv1);
		function list1(varI, varThingy) {
			var container = listDiv1;
			container.append(document.createTextNode(varThingy.getSomeInfo().print()));
			// Begin ListElement
			var listDiv2 = $('<div>');
			container.append(listDiv2);
			function list2(varJ, varFish) {
				var container = listDiv2;
				container.append(document.createTextNode(varFish.getName().print()));
				new checkboxField(varFish.getBubbleBlower(), container);
			}
			var listOldCount2 = varThingy.getFishes().size();
			varThingy.getFishes().addObserver(function() {
				if (varThingy.getFishes().size() != listOldCount2) {
					listOldCount2 = varThingy.getFishes().size();
					listDiv2.html(''); $(varThingy.getFishes().toArray()).each(list2);
				} 
			});
			
			listDiv2.html('');
			$(varThingy.getFishes().toArray()).each(list2);
			// End ListElement
		}
		var listOldCount1 = varThingies.size();
		varThingies.addObserver(function() {
			if (varThingies.size() != listOldCount1) {
				listOldCount1 = varThingies.size();
				listDiv1.html(''); $(varThingies.toArray()).each(list1);
			} 
		});
		
		listDiv1.html('');
		$(varThingies.toArray()).each(list1);
		// End ListElement
	
	};
	

	// interface getStuff:
	function getStuff(input, auth, callback, errCallback) {
		var data = {authenticationInfo : auth.unwrap()};
		data = $.extend(data, { 'wrappedDate' : ItemSerializer.serialize(input) });
		$.ajax({
			url: 'http://fb.DSLConsultancy.com/api/getStuff',
			data: data,
			dataType:'json',
			type:'GET',
			cache: false,
			success: function(aObj) {
				var a = new Item(aObj);
				if (aObj.length > 0) {
					var aList = [];
					for (var i = 0; i < aObj.length; i++) {
						aList.push(ThingyToFullItemFunction(aObj[i]));
					}
					a = new Item(aList);
					a.forAll(ThingyDateParseFunction);
				}
				callback(a);
			},
			error : function() { if(arguments[2]) { errCallback(null, new Item(arguments[2])); } else { errCallback(null, new Item('Unknown Failure!')); } }
		});
	}
	


	this.enter = function(authenticationInfo) {
		globalModuleAuthenticationInfo = authenticationInfo;
		this.root( $('#_content'));
	};
}();
