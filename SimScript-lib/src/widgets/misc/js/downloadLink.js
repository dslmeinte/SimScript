function downloadLink(container, url, argument, title) {

	$('<button>').text(title || 'Download').click(function () {
		window.location = url;
	}).appendTo(container);

}
