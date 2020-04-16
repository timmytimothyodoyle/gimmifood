$('#search-btn').click(function(event) {
	$.post('/food', {
		popo : 'aasdsd',
		term : $('#search-input').val()
	}).done(function(data) {
		success(data);
	}).fail(function(error) {
		error(error);
	});
});

function success(data) {
	console.log("sorete");
	console.log(JSON.stringify(data));
};

function error(error) {
	console.log("culo");
	console.log(JSON.stringify(error));
};