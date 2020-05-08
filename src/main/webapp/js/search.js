const EMPTY = '';

var _autocompleteData;

function get_autocomplete_options() {
	var options = {};
	for(i = 0; i < _autocompleteData.length; i++) {
		options[_autocompleteData[i].name] = EMPTY;
	}
	return options;
};

function select_ingredient(name) {
	for (i = 0; i < _autocompleteData.length; i++) {
		if (_autocompleteData[i].name === name) {
			add_ingredient(_autocompleteData[i]);
		}
	}
};

function success_recipe(data) {
	clear_recipes();
};

function success_ingredient(data, field) {
	_autocompleteData = JSON.parse(data);
	$(field).autocomplete('updateData', get_autocomplete_options());
	$(field).autocomplete('open');
};

function error(data) {
	console.log(JSON.stringify(data));
};

$('.autocomplete').each(function() {
	let self = this;
	$(this).autocomplete({
		data: {},
		onAutocomplete: function(val) {
			select_ingredient(val);
			// clear field
			$(self).val(EMPTY);
		}
	});
	$(this).on('input change', function() {
		var text = $(this).val();
		if (text !== undefined && text.length == 2) {
			$.post('/food', {
				term : text
			}).done(function(data) {
				if(data) success_ingredient(data, self);
			}).fail(function(data) {
				error(data);
			});
		}
	});
});

$('.search-recipes').click(function(event) {
	$.post('/recipe', {
		term : get_ingredients()
	}).done(function(data) {
		success_recipe(data);
	}).fail(function(data) {
		error(data);
	});
});