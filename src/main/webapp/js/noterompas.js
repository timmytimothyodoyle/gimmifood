function notify(message) {
	M.toast(message, 4000);
};

function getAutocomplete() {
	var geturl = '/getingredients';
	return $.ajax({
		url : geturl,
		type : 'GET',
		error : function(data) {
			notify('algo fallo');
		}
	});
};

document.addEventListener('DOMContentLoaded', function() {
	
	$.when(getAutocomplete()).done(function(data) {
		console.log(data);
		var options = { data : {
			"Uno" : null,
			"Dos" : null,
			"Tres": null,
			"Cuatro": null
		} };
		var elems = document.querySelectorAll('.autocomplete');
		M.Autocomplete.init(elems, options);
	});
});