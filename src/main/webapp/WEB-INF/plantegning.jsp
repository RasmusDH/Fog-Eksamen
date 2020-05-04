<%--
  Created by IntelliJ IDEA.
  User: emilie
  Date: 23/04/2020
  Time: 13.13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<!-- Required meta tags -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
      integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<!-- Header -->
<%@include file="/header/header.inc"%>

<head>
    <title>Plantegning</title>
</head>
<body>
Her kommer plantegningen af din carport

<div class="row">
    <div class="col-md-6 text-center">
        <a href="FrontController?target=redirect&destination=basket"
           class="btn btn-dark mt-4" role="button" aria-pressed="true">Tilføj til kurv</a>
    </div>
    <div class="col-md-6 text-center">
        <a onclick="goBack()" class="btn btn-dark mt-4" style="color:white"
           class="btn btn-dark mt-4" role="button" aria-pressed="true" >Vælg andre mål til carporten</a>
        <script>
            function goBack() {
                window.history.back();
            }
        </script>
    </div>


</div>
</body>

<!-- Footer -->
<%@include file="/header/footer.inc"%>

</html>



