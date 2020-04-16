


document.querySelector("#js_search").addEventListener("load2");
let name = document.querySelector("#autocomplete-input").value;
  
  
  let data = {
    "thing": {
      "nombre": name
    }
// TODO TIRA ESTO, A VOS TE ANDA? Uncaught SyntaxError: Unexpected token 'function'
function load2(){
fetch("/food",{
   method: 'POST', 
   headers: {
       'Content-Type': 'application/json'
   },
   body: JSON.stringify(data)
}).then(function(r){
   return r.json()
})
.then(function(json) {
alert(JSON.stringify(json));
})
.catch(function(e){
   console.log(e)
})
}
