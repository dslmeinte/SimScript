// Accepts a list of slots: {day:Date}
function ActivityList(parent, list) {
    this.container = $("<div>");
    parent.append(this.container);

    this.weekDays = ["zondag", "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag"];
    this.months = ["januari", "februari", "maart", "april", "mei", "juni",
                   "juli", "augustus", "september", "oktober", "november", "december"];
    this.setList(list);
}

ActivityList.prototype.setList = function(list) {
	this.list = list;
	this.sortList();
	this.observeList();
    this.draw();
};

ActivityList.prototype.sortList = function() {
	this.list.incognito = true;
	this.list.sort(function(slot){
        return slot.getDay(); 
    });
	this.list.incognito = false;
};

ActivityList.prototype.observeList = function() {
	var self = this;
	this.list.addObserver(function(){
		self.sortList();
		self.draw();
	});
};

ActivityList.prototype.setAfterDelete = function(func) {
    this.afterDelete = func;
};

ActivityList.prototype.draw = function() {
    this.container.html("");
    var self = this;
    for(var i = 0; i < this.list.size(); i++) {
        (function(i, container, list, weekDays, months, addLeadingZero) {
        	var slot = list.get(i);
        	var startTime = slot.getStart_time().unwrap();
        	var date = slot.getDay().get();
            var block = $('<div class="sim-ui-dayselect-activity">');
            container.append(block);
        
            var text = weekDays[date.getDay()];
            text = text + " " + date.getDate();
            text = text + " " + months[date.getMonth()];
            text = text + "<br />" + startTime.hours;
            text = text + ":" + addLeadingZero(startTime.minutes);

            block.html(text);
            var delButton = ($('<input type="button" class="delete_button" value="x" />'));
            delButton.click(function(){
                list.removeAt(i);
                self.draw();
                self.afterDelete(slot);
            });
            block.append(delButton);
        })(i, this.container, this.list, this.weekDays, this.months, this.addLeadingZero);
    }
};

ActivityList.prototype.addLeadingZero = function(int) {
    return int > 9 ? int : "0" + int;
};
