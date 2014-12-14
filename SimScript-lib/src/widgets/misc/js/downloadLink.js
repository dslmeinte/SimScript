function downloadLink(container, url, argument, title) {

	$('<button>').text(title || 'Download').click(function () {
		// kludge since triggering a download is not really an unload:
		window.preventUserFromExiting = function () {
			return false;
		}
		window.location = url;
		setTimeout(function () {
			window.preventUserFromExiting = undefined;
		}, 500);
	}).appendTo(container);

	// see also: http://stackoverflow.com/questions/11620698/how-to-trigger-a-file-download-when-clicking-an-html-button-or-javascript
	// alternative: construct a Form

}
