 document.addEventListener('DOMContentLoaded', function() {
	  var options = {
	  	data: {
		  "Pan": null,
		  "Harina": null,
		  "Caca": null
		  	},
		  	
	  onAutocomplete: function(texto){
	  ingredientes.innerHTML += `<div class="chip">
			${texto} <i class="close material-icons">close</i>
		</div>`	
	  }	 	
	  }
	var elems = document.querySelectorAll('.autocomplete');
    var instances = M.Autocomplete.init(elems, options);
  });
  
  var ingredientes = document.querySelector("#selected-ingredients");
  
  