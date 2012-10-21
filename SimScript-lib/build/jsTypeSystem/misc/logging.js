// IE proof logging function, which can be used during debugging, without the risk of ruining stuff when you forget about it.
function LOG(a, b) {
	if (window.console && console.log) {
		if (a) {
			console.log(a);
		}
		if (b) {
			console.log(b);
		}
	}
}