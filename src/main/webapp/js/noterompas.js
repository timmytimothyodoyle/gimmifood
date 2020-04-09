function notify(message) {
	M.toast(message, 4000);
};

function toAutocompleteMap(elements) {
	var data = {};
	for (var i = 0; i < elements.length; i++) {
		data[elements[i]] = null;
	}
	return data;
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
		console.log(toAutocompleteMap(data));
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