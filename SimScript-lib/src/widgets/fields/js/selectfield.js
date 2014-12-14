/**
 * Creates a select tag for selecting a structure from a list of structures.
 * @param bindItem the item to bind to (should be a structure).
 * @param container the container to append the select tag to.
 * @param sources the list of items containing the structures to choose from. 
 */
function selectField(bindItem, container, sources, displayFunction, placeholder) {
	// precondition check:
	if ( bindItem == undefined ) { throw "The bindItem parameter is NOT optional for a selectField."; }
	if ( container == undefined ) { throw "The container parameter is NOT optional for a selectField."; }
	if ( sources == undefined ) { throw "The sources parameter is NOT optional for a selectField."; }
	if ( displayFunction == undefined ) { throw "The displayFunction parameter is NOT optional for a selectField."; }
	
	var placeholderStruct = bindItem.unwrap();
	
    // the select field:
    var field = $(document.createElement('select'));
    container.append(field);
    
    // add the structures as options
    var optionStructures = sources.toArray();
    
    /*
     *  +---------------------+
     *  |  Private Functions  |
     *  +---------------------+
     */
    // updates the children of the selectfield to correspond to the optionStructures variable
    function updateOptions() {
    	// add the new options
    	field.html('');
    	if (placeholder != undefined) {
    		var option = $(document.createElement('option'));
    		option.attr('value', -1);
    		option.text(placeholder);
    		field.append(option);
    	}
    	for (var i = 0; i < optionStructures.length; i++) {
    		var option = $(document.createElement('option'));
    		option.attr('value', i);
    		option.text(displayFunction(optionStructures[i]));
    		field.append(option);
    	}
    	// select the option that was previously selected
    	// or update the bindItem to point to the first structure in the list
    	if (optionStructures.length > 0) {
    		var initIndex = getBindItemStructureIndex();
    		if (initIndex == null) {
    			if (placeholder == undefined) {
    				bindItem.load(sources.get(0).unwrap());
    			}
    		} else {
    			field.val(initIndex);
    		}
    	}
    }

    // returns the index of the structure whose value equals the bindItem, or null
    function getBindItemStructureIndex() {
    	for (var i = 0; i < optionStructures.length; i++) {
    		if ( bindItem.compareTo(optionStructures[i]) == 0 ) {
    			return i;
    		}
    	}
    	return null;
    }
    
    /*
     *  +---------------+
     *  |  Databinding  |
     *  +---------------+
     */
    // listen to changes in the bindItem
    bindItem.addObserver(function(){
    	var selectedIndex = getBindItemStructureIndex();
    	if (selectedIndex == null) {
    		if (placeholder != undefined && bindItem.compareTo(new Item(placeholderStruct)) == 0) {
    			field.val(-1);
    		} else if (!sources.isEmpty()){
    			throw "The structure of this selectField changed to something outside of the given collection of possibilities.";
    		}
    	} else {
    		field.val(selectedIndex);
    	}
    });
    
    // listen to changes in the select field
    field.change(function() {
    	var val = field.val();
    	if (val == -1) {
    		bindItem.load(placeholderStruct);
    	} else {
    		bindItem.load(optionStructures[field.val()].unwrap());
    	}
    });
    
    // listen to changes in the sources list
    sources.addObserver(function(){
    	optionStructures = sources.toArray();
    	updateOptions();
    });

    /*
     *  +------------------------+
     *  |  Field Initialization  |
     *  +------------------------+
     */
    updateOptions();
    
    /*
     * Brainstorm:
     * 
     * To be able to react when the bindItem changes, we need to be able to do the following:
     * 1.)	when the bindItem changes, it should change to a structure from sources.
     * 	If it doesn't, we can't update the select tag.
     * 	TODO how do we handle this? 
     * 	If it happens, it's probably a result of bad sim-ui design:
     * 	why would you offer the user to change the value to something from an explicit collection
     * 	and then change it to something outside of the given collection?
     * 	The value you set it to should then have been contained in the collection.
     * 
     *  Therefore I think it should just never occur and we can throw an error, 
     *  interrupting the flow of the rest of the application.
     *  TODO is it possible to add a validation for this?
     *  
     * 
     * 2.)	we need to be able to retrieve a structure from sources by the changed bindItem.
     * 	The structure in sources will not be the same object as the bindItem,
     * 	unless the bindItem itself was part of sources.
     * 	Therefore we will need to use the Item.compareTo function to check equality of value.
     * 
     * 
     * To be able to react when the user selects another option, we need to be able to do the following
     * 1.)	we need to be able to retrieve a structure from sources by the selected value.
     * 	Easy approach:
     * 	copy the structures from sources into an array and record the index in the value of the option tag.
     * 
     * 
     * To be able to work with a placeholder, we need to be able to do the following:
     * 1.)	add a placeholder option
     * 2.)	TODO define behavior for when the placeholder is selected:
     * 	We could remember the value of the bindItem at initialization,
     *  and set that when the placeholder is selected.
     *  We could also just ignore the placeholder, but that would probably be unwanted if you:
     *  select an item, select the placeholder (bindItem is still the previous selected item).
     * 
     * 
     * TODO Do we plan on allowing the sources to change?
     * If so, how do we handle the situation where a user has selected an option, 
     * but that option is not in the new sources list?
     * Easy approach: don't support this yet.
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */
}
