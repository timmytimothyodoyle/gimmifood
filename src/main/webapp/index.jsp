<html>

<head>
  <jsp:include page="headlibs.jsp" />
</head>

<body>
  <div class="container-fluid">
	<!-- header of application, on mobile should hide on scroll down, show on up  -->
    <jsp:include page="/components/header.jsp" />    

	<div class="container">	
      <jsp:include page="/components/search.jsp" />
      <jsp:include page="/components/recipes.jsp" />
    </div>
  </div>
</body>

<jsp:include page="footerlibs.jsp" />
</html>
