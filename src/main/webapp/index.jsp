<html>

<head>
<jsp:include page="headlibs.jsp" />
</head>

<body>

<div class="container">
<a class="waves-effect waves-light btn">A�adir ingrediente</a>

     <div class="collection">
        <a href="#!" class="collection-item">Alvin</a>
        <a href="#!" class="collection-item active">Alvin</a>
        <a href="#!" class="collection-item">Alvin</a>
        <a href="#!" class="collection-item">Alvin</a>
      </div>
	<div class="container-fluid">
		<jsp:include page="/components/navbar.jsp" />
		<div class="container">
		<jsp:include page="/components/ingredients.jsp" />

		<jsp:include page="/components/receipts.jsp" />
		</div>
	</div>
</body>

<jsp:include page="footerlibs.jsp" />
</html>
