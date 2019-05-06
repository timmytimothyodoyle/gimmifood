function addIngredient(ingredient) {
	$.post('/ingrediente', {
		action : ingredient
	}).done(function(data) {
		Materialize.toast('Good algo');
	}).fail(function() {
		Materialize.toast('Everything failed, life has no meaning.', 4000);
	});
};

$('.ingrediente').click(function(event) {
	addIngredient('yoquese');
});

$(document).ready(function() {
	$('select').formSelect();
});