const EMPTY = '';

var _autocompleteData;
var _recipesData;

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
	console.log("LLEGO A SUCCES");
	clear_recipes();
	_recipesData = JSON.parse(data);
	for (let i = 0; i < _recipesData.length; i++){
		$('.recipes-container')
				.append(
						"<div class='col s12 m6'> <div class='card'><div class='card-image'><img src='images/"
								+ _recipesData[i].id
								+ ".jpg'> <a class='btn-floating halfway-fab waves-effect waves-light red'><i class='material-icons'>add</i></a> </div><div class='card-content'><span class='card-title'>"
								+ _recipesData[i].name
								+ "</span> <p>"
								+ _recipesData[i].description
								+ "</p><ul class='collection' id='ingredients"
								+ _recipesData[i].id + "'></ul></div> </div> </div>");
		for (let e = 0; e < _recipesData[i].ingredients.length; e++) {
			$('#ingredients' + _recipesData[i].id).append(
					"<li class='collection-item'>"
							+ _recipesData[i].ingredients[e].raw.name + "</li>")
		}
	}
	
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
let ingredients = get_ingredients();
console.log("ESTOOOO" + ingredients);
	$.post('/recipe', {
		term : ingredients,
	}).done(function(data) {
		success_recipe(data);
	}).fail(function(data) {
		error(data);
	});
});