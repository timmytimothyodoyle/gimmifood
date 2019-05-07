function queryIngredients(category, query) {
	var geturl = '/ingredients';
	return $.ajax({
		url : geturl,
		data : {category : category, query : query },
		type : 'GET',
		error : function(data) {
			M.toast({html: 'Mayaaaa muerta no ando!'});
		}
	});
};

function queryRecipes(ingredients) { 
	$.post('/recipes', {
		ingredients : ingredients
	}).done(function(data) {
		M.toast({html: 'Ando nomas ' + data});
	}).fail(function() {
		M.toast({html: 'Mayaaaa muerta no ando!'});
	});
};

$('.category-select').change(function(event) {
	var query = $('#search_field').text() + ' ';
	var category = this.value;
	// check if parameters are valid
	$.when(queryIngredients(category, query)).done(function(ingredients) {
		$('.chip-select').empty();
		for (var i = 0; i < ingredients.length; i++) {
			var icon = ingredients[i].image != null ? '<img src="' + ingredients[i].image + '">' : '';
			$('.chip-select').append('<div class="chip" data-id="' + ingredients[i].id + '">' + icon + ingredients[i].name + '</div>');
		}
	});
});

$('.cook-recipes').click(function(event) {
	var ingredients = [];
	$('.chip-selected .chip').each(function(index, value) {
		ingredients.push($(value).data('id'));
	});
	queryRecipes(ingredients);
});

$("body").on("click", ".chip-select .chip", function(event) {
	$('.chip-selected').append('<div class="chip" data-id="' + $(this).data("id") + '">' + 
			this.innerText + '<i class="close material-icons">close</i></div>');
});

$(document).ready(function() {
	$('select').formSelect();
});