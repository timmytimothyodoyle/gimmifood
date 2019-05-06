<html>

<head>
<jsp:include page="headlibs.jsp" />
</head>

<body>
	<div class="container">
		<div class="row">
			<h3 class="header">Gimmi Food</h3>

			<p>Aca vo selecciona toda la mierda que tengas en la heladera y
				no este vencida, y que quieras usar para cocinar, por ejemplo si
				tenes alfajores en la heladera mas vale no usarlos como ingrediente
				para cocinar porque si lo haces considerate un come mierda completo.</p>
			<p>En el panel de la izquierda podes buscar/filtrar y seleccionar
				los ingredientes que vas a usar, y en el de la derecha se muestran
				los ingredientes ya seleccionados. Una vez terminado hacer click en
				Food!</p>
		</div>

		<div class="row">
			<div class="col l9">
				<p>Seleccione ingredientes</p>
				<div class="input-field col l9">
					<input placeholder="e.x Bife de Chorizo" id="search_field"
						type="text" class="validate"> <label for="search_field">Search
						by term</label>
				</div>

				<div class="input-field col l3">
					<select>
						<option value="" disabled selected>Choose your option</option>
						<option value="1">Meats</option>
						<option value="2">Vegetables</option>
						<option value="3">Fruits</option>
						<option value="4">Pasta</option>
					</select> <label>Category</label>
				</div>

				<div class="col s12">
					<div class="chip">
						<i class="material-icons">add</i> Jane Doe
					</div>
					<div class="chip">Patas de pollo</div>
					<div class="chip">Alas de pollo</div>
				</div>
			</div>

			<div class="col l3">
				<p>Ingredientes seleccionados</p>

				<div class="col s12">
					<div class="chip">Papas</div>
					<div class="chip">Tomate</div>
				</div>
			</div>
		</div>

		<div class="row">
			<a class="waves-effect waves-light btn-large ingrediente"><i
				class="material-icons left">cloud</i>Food!</a>
		</div>
	</div>
</body>

<jsp:include page="footerlibs.jsp" />
</html>
