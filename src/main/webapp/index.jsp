<html>

<head>
<jsp:include page="headlibs.jsp" />
</head>

<body>

	<div class="container">
		<h2>Seba Sucks!</h2>

		<blockquote>No se como corno usar materializeeeee.</blockquote>

		<div class="row section">
			<div class="col s6  teal lighten-5">
				<div class="row">
					<div class="input-field col s12">
						<select>
							<option value="" selected>Seleccione dificultad</option>
							<option value="1">Option 1</option>
							<option value="2">Option 2</option>
							<option value="3">Option 3</option>
						</select> <label>Dificultad</label>
						
					</div>
				</div>
				<div class="row">
					<div class="input-field col s6">
						<i class="material-icons prefix">search</i> <input type="text"
							id="autocomplete-input" class="autocomplete"> <label
							for="autocomplete-input">Buscar</label>
					</div>
					<div class="input-field col s3">
						<input placeholder="Cantidad" id="cantidad_form" type="number"
							class="validate"> <label for="cantidad_form">Cantidad</label>
					</div>
					<div class="col s1">
					<button class="btn">+</button>
						</div>
				</div>
				
			</div>
	
		
		<div class="col s6 purple lighten-5">
			<p>INGREDIENTES DISPONIBLES</p>

			<table>
				<thead>
					<tr>
						<th>Qué</th>
						<th>Cuánto</th>
					</tr>
				</thead>

				<tbody>


				</tbody>
			</table>

		</div>
	</div>
	</div>







</body>

<jsp:include page="footerlibs.jsp" />
</html>
