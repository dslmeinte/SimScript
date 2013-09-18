package nl.dslmeinte.simscript.generator.ui.js;

public enum ViewableInvocationTypes {

	topLevel("$('#_content')"), nested("container"), modal("$('#_modalContent')");

	private String jsExpression;

	private ViewableInvocationTypes(String jsExpression) {
		this.jsExpression = jsExpression;
	}

	public String getJsExpression() {
		return jsExpression;
	}

}
