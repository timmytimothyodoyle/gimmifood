let ingrediente = [];

$('#search-btn').click(function(event) {
	$.post('/food', {
		popo : 'aasdsd',
		term : $('#autocomplete-input').val()
	}).done(function(data) {
		success(data);
	}).fail(function(data) {
		error(data);
	});
});

$(document).ready(function(){     
      $("#autocomplete-input").keypress(function(e) {
        if(e.which == 13) {
      $.post('/food', {
		popo : 'aasdsd',
		term : $('#autocomplete-input').val()
	}).done(function(data) {
		success(data);
	}).fail(function(data) {
		error(data);
	});
        }
      });
});


function success(data) {

	let foods = JSON.parse(data);
	console.log(data);
	console.log(JSON.stringify(JSON.parse(data)[0].name));
	for(let i=0; i<foods.length; i++){
	if(!ingrediente.includes(JSON.stringify(foods[i].name))){
		ingrediente.push(JSON.stringify(foods[i].name));
	 $('#selected-ingredients').append("<div class='chip' id='"+"ingredient"+foods[i].id+"'>"+foods[i].name+" <i class='close material-icons'>close</i></div>");
	}
		}
		
};

	
function error(data) {
	console.log("culo");
	console.log(JSON.stringify(data));
};




 //	$('#selected-ingredients').append("<div class='chip'>"+foods[i].name+" <i class='close material-icons'>close</i></div>");
 