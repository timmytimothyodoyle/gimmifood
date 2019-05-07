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
				
				<div class="input-field col l3">
					<select class="category-select">
						<option value="" disabled selected>Choose your option</option>
						<option value="carnes">Carnes</option>
						<option value="vegetales">Vegetales</option>
						<option value="frutas">Frutas</option>
						<option value="pescados">Pescados</option>
						<option value="bebidas">Bebidas</option>
					</select> <label>Categoria</label>
				</div>
								
				<div class="input-field col l9">
					<input placeholder="e.x Bife de Chorizo" id="search_field"
						type="text" class="validate"> 
					<label for="search_field">Buscar por termino</label>
				</div>

				<div class="col s12 chip-select">
				</div>
			</div>

			<div class="col l3">
				<p>Ingredientes seleccionados</p>

				<div class="col s12 chip-selected">
					<div class="chip" data-id="lapapa">Papas<i class="close material-icons">close</i></div>
					<div class="chip" data-id="lacebolla">Cebolla<i class="close material-icons">close</i></div>
				</div>
				
				<div>
					<button class="btn waves-effect waves-light center-align cook-recipes" type="submit"
						name="action">
						Cook <i class="material-icons right">send</i>
					</button>
				</div>

			</div>
		</div>
	</div>
</body>

<jsp:include page="footerlibs.jsp" />
</html>
