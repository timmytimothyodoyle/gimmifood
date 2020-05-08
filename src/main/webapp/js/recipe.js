var _ingredients = [];

function add_ingredient(data) {
	_ingredients.push(data);
	$('.chips').chips('addChip', {
		tag : data.name,
		image : '',
	});
};

function get_ingredients() {
	
};

function clear_recipes() {
	$('.recipes-container').empty();
};

function add_recipe() {
	
};