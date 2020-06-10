var _ingredients = [];

function add_ingredient(data) {
	_ingredients.push(data);
	$('.chips').chips('addChip', {
		tag : data.name,
		image : '',
	});
};

// No se como agregarle a cada 'x' de los chips cuando se clickea se debe eliminar el ingrediente de la lista _ingredients
function delete_ingredient(data) {
	_ingredients.splice(_ingredients.indexOf(data), _ingredients.indexOf(data));
}

function get_ingredients() {
	let _ingredientsName = []; 
	for (let i=0; i<_ingredients.length; i++){
	_ingredientsName.push(_ingredients[i].name);
	} 
	return _ingredientsName;
};

function clear_recipes() {
	$('.recipes-container').empty();
};

function add_recipe() {
	
};