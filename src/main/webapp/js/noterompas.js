  $(document).ready(function(){
    $('select').formSelect();
  });
  
   $(document).ready(function(){
    $('input.autocomplete').autocomplete({
      data: {
        "Apple": null,
        "Microsoft": null,
        "Google": 'https://placehold.it/250x250'
      },
      
      onAutocomplete: function(texto){
      var newRow = tabla.insertRow(1);
      var cel1 = newRow.insertCell(0);
      var cel2 = newRow.insertCell(1);
      cel1.innerHTML = texto;
     cel2.innerHTML = '1.0';
      }

    });
  });
  
  //const ingredientes = document.querySelector('#listado_ingredientes');
  const tabla = document.getElementsByTagName('table')[0]; 