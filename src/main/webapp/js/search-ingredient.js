$('#search-btn').click(function(event) {
	$.post('/food', {
		popo : 'aasdsd',
		term : $('#search-input').val()
	}).done(function(data) {
		success(data);
	}).fail(function(data) {
		error(data);
	});
});

function success(data) {
	console.log("sorete");
	console.log(JSON.stringify(data));
};

function error(data) {
	console.log("culo");
	console.log(JSON.stringify(data));
};