


document.querySelector('#autocomplete-input').addEventListener('keypress', function (e) {
    if (e.key === 'Enter') {
    let name = document.querySelector("#autocomplete-input").value;
      let data = {
      "food": name
    }
    console.log(data);
	load2(data);
    }
});

  
  

// TODO TIRA ESTO, A VOS TE ANDA? Uncaught SyntaxError:function 
function load2(data){
console.log(data);
alert(JSON.stringify(data));
fetch("/food",{
   "method": "POST",
    "mode": 'cors',
    "headers": { "Content-Type": "application/json" },
    "body": JSON.stringify(data)
}
).then(function(r){
   return r.json()
})
.then(function(json) {
alert(JSON.stringify(json));
})
.catch(function(e){
   console.log(e)
})
}
