var LoadSymbol = new function() {
	
	this.show = function(container)	 {
		container.html('<div id="loadSymbolDiv" style="text-align:center;margin:auto;"><img src="lib/sim-lib/images/ajax-loader.gif" /></div>');
	}
	
	this.hide = function() {
		$('#loadSymbolDiv').remove();
	}
	
}