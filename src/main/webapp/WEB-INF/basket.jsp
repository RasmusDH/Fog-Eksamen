<%--
  Created by IntelliJ IDEA.
  User: emilie
  Date: 21/04/2020
  Time: 11.15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Header -->
    <%@include file="/header/header.inc"%>
    <title>Title</title>
</head>
<body>

Din bestilling:
Indsæt bestillingen her + billede


<div class="col-md-6 text-center">
    <a href="FrontController?target=redirect&destination=basket"
       class="btn btn-dark mt-4" role="button" aria-pressed="true">Bestil carport</a>
</div>

</body>
<!-- Footer -->
<%@include file="/header/footer.inc"%>
</html>
