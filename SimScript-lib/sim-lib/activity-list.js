function ActivityList(parent, list) {
    this.list = list;
    
    this.container = $("<div>");
    parent.append(this.container);

    this.weekDays = ["zondag", "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag"];
    this.months = ["januari", "februari", "maart", "april", "mei", "juni",
                   "juli", "augustus", "september", "oktober", "november", "december"];
    
    this.draw();
}

ActivityList.prototype.setList = function(list) {
    this.list = list;
    this.list.sort(function(date){
        return date; 
    });
    this.draw();
};

ActivityList.prototype.draw = function() {
    this.container.html("");

    for(var i = 0; i < this.list.size(); i++) {
        var block = $('<div class="sim-ui-dayselect-activity">');
        this.container.append(block);
        
        var text = this.weekDays[this.list.get(i).get().getDay()];
        text = text + " " + this.list.get(i).get().getDate();
        text = text + " " + this.months[this.list.get(i).get().getMonth()];
        text = text + "<br />" + this.list.get(i).get().getHours();
        text = text + ":" + this.addLeadingZero(this.list.get(i).get().getMinutes());

        block.html(text);
    }
};

ActivityList.prototype.addLeadingZero = function(int) {
    return int > 9 ? int : "0" + int;
};
