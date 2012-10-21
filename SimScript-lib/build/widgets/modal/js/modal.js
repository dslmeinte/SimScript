var Modal = new function() {

	var inModal = false;

	this.showModal = function(viewable, persistent) {
        if(inModal) {
            return false;
        } else {
            inModal = true;
            $("#_modalBackground").css({
                display: "block",
                opacity: 0.5
            });
            $("#_modal").css({
                display: "block"
            });
            var modalWidth = $("#_modal").width();

            $("#_modal").css({
                "left" : "50%",
                "z-index"	: 100000,
                "margin-left": "-" + modalWidth / 2 + "px"
            });

            if(!persistent){
                var exitButtonContainer = $("<div id='_modalExitContainer'>");
                $("#_modalContent").append(exitButtonContainer);
                var exitButton = $('<input type="button" class="_modal-exit-button">');
                exitButtonContainer.append(exitButton);

                exitButton.click(this.exitModal);
            }
            return true;
        }
	};

	this.exitModal = function() {
		if( inModal ) {
			// TODO
            $("#_modalContent").html("");
            $("#_modal").css("display", "none");
            $("#_modalBackground").css("display", "none");
            inModal = false;
		}
	};

    this.isActive = function() {
        return inModal;
    };

};
