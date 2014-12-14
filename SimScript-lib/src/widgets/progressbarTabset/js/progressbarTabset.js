/**
 * COMPONENT
 * 
 * Renders a tabset which looks like a progress bar in the given parent.
 * 
 * @param tabs the Tab objects to render in the tabset.
 * @param parentJQuery the jQuery element to which the tabset should be appended.
 * @returns a controller for this tabset.
 * The controller has a previous and a next function to change the active tab.
 */
function ProgressbarTabset(tabs, parentJQuery) {
	// Non-observable vars like Num or String should always be wrapped
	var varactivetab = new Item(-1);
	
	// The tabs' titles container
	var barContainer = $('<div class="progressBar"/>');
	
	// The tabs' content container
	var tabsContainer = $('<div style="width:100%;"/>');
	
	// Adding the tabs
	for (var i = 0; i < tabs.length; i++) {
		// Tab title, css should be separated in real code
		var optionContainer = $('<div class="option"/>');
		optionContainer.css('width', 100/tabs.length+'%');
		var numberContainer = $('<div class="num"/></div>');
		var number = $('<span>' + (i + 1) + '</span>');
		numberContainer.append(number);
		optionContainer.append(numberContainer);
		var nameContainer = $('<div class="optionName"/>');

		nameContainer.append(tabs[i].title());
		
		optionContainer.append(nameContainer);
		leftBar = $('<div class="bar barLeft"/>');
		optionContainer.append(leftBar);
		rightBar = $('<div class="bar barRight"/>');
		optionContainer.append(rightBar);
		
		// Tab content
		var tabContainer = $('<div style="width:100%"/>');
		tabs[i].tab(tabContainer);
		
		// Adjust the activetab variable when a tab is clicked
		// We're looping, so variables should be captured by executing a function
		numberContainer.click(function(i){return function(){varactivetab.set(i);};}(i));
		
		// Buttons
		prevButton = $('<div/>').addClass('prevButton');
		if (tabs[i].prev == undefined) {
			prevButton.click(function(){varactivetab.set(varactivetab.get() - 1);});
		} else {
			prevButton.click(tabs[i].prev);
		}
		nextButton = $('<div/>').addClass('nextButton');
		if (tabs[i].next == undefined) {
			nextButton.click(function(){varactivetab.set(varactivetab.get() + 1);});
		} else {
			nextButton.click(tabs[i].next);
		}
		buttonContainer = $('<div/>').addClass('buttonContainer');
		if (i > 0 || tabs[i].prev != undefined) {buttonContainer.append(prevButton);}
		if (i < tabs.length - 1 || tabs[i].next != undefined) {buttonContainer.append(nextButton);}
		tabContainer.append(buttonContainer);
		
		// Append the tabs title and content
		barContainer.append(optionContainer);
		tabsContainer.append(tabContainer);
		
		// Visibility and css changes when activetab changes
		// again, we're capturing loop variables' values by calling a function
		varactivetab.addObserver(function(numberContainer, leftBar, rightBar, tabContainer, i){ return function(){
			if (varactivetab.get() >= i) {
				numberContainer.removeClass('num').addClass('numActive');
				leftBar.addClass('barActive');
				if (varactivetab.get() > i) { 
					rightBar.addClass('barActive'); 
				} else {
					rightBar.removeClass('barActive');
				}
			} else {
				numberContainer.removeClass('numActive').addClass('num');
				leftBar.removeClass('barActive');
				rightBar.removeClass('barActive');
			}
			if (varactivetab.get() === i) {
				tabsContainer.children('div').css('display', 'none');
				tabContainer.css('display', 'block');
			}
		};}(numberContainer, leftBar, rightBar, tabContainer, i));
		
	}
	
	// after all observers are declared, we set the default value for activetab
	varactivetab.set(0);
	
	// Append the tabset to the parent element
	parentJQuery.append(barContainer);
	parentJQuery.append(tabsContainer);
	
	function controller() {
		this.next = function(){
			if (varactivetab.get() < tabs.length - 1) {
				varactivetab.set(varactivetab.get()+1);
			}
		};
		
		this.previous = function() {
			if (varactivetab.get() > 0) {
				varactivetab.set(varactivetab.get()-1);
			}
		};
	}
	
	return new controller();
}

/**
 * CONSTRUCTOR
 * 
 * A tab consists of a title and tab.
 * Note that it is a normal, unobservable object.
 * 
 * @param title the title or name of the tab. 
 * It should be a function with no arguments, returning a div.
 * @param tab the (wrapped or simplified) component that should be displayed
 * if the tab is selected.
 * It should be of the form function(container), so any other parameters should be wrapped
 * in a simpler function.
 * @param prev the function to be executed when the prev button on this tab is pressed.
 * If no prev is given, it will be the default switch to previous tab.
 * @param next same as prev, only for next button.
 * 
 * Example:
 * var component = function(a, b, container) {container.append(a);};
 * var tab = function(container){var a="a val"; var b="bval"; component(a,b,container);}
 */ 

ProgressbarTab = function(title, tab, prev, next) {
	var default_title = function() { return $('<div>'); };
	var default_tab = function(container){container.append("Inhoud");};
	if (title == undefined) { title = default_title; }
	if (tab == undefined) { tab = default_tab; }
	this.title = title;
	this.tab = tab;
	this.prev = prev;
	this.next = next;
};