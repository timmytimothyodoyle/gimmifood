<h5>Search</h5>
<div class="row search-container">
	<div class="col s12">
		<div class="input-field col s10">
			<input type="text" id="search-autocomplete" class="autocomplete">
			<label for="search-autocomplete">Agregar ingredientes</label>
		</div>
	</div>
	<div class="col s10 query-container chips"></div>
</div>
<h5>Filters</h5>
<div class="row">
	<div class="col m12 l2">
		<label><input type="checkbox"/><span>Vegetariano</span></label>
	</div>
	<div class="col m12 l2">
		<label><input type="checkbox"/><span>Sin Extra</span></label>
	</div>
	<div class="input-field col m12 l4">
		<select multiple>
			<option value="" disabled selected>Seleccione una o mas opciones</option>
			<option value="1">Mariscos</option>
			<option value="2">Celiaco</option>
			<option value="3">Maia</option>
		</select> <label>Alergias</label>
	</div>
	<div class="center col s12 m12 l12">
		<a class="col s8 offset-s2 search-recipes waves-effect waves-light btn">Buscar</a>
	</div>
</div>