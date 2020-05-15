<%--
  Created by IntelliJ IDEA.
  User: emilie
  Date: 27/04/2020
  Time: 11.15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Header -->
    <%@include file="/header/header.inc"%>

    <!-- Required meta tags -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Vælg skur</title>
</head>
<body>



<br> <br>



<div style="text-align: center">

    <h3> Hvordan skal din carport være? </h3>

<div class="btn-group-vertical">

    <button>
        <a class="btn btn-dark" href="FrontController?target=redirect&destination=customCarport">Uden skur med vinkeltag</a>
    </button>

    <br>

    <button>
    <a class="btn btn-dark" href="FrontController?target=redirect&destination=customWithShed">Med skur med fladt tag</a>
    </button>

    <br>

    <button>
    <a class="btn btn-dark" href="FrontController?target=redirect&destination=customWithout">Uden skur med fladt tag</a>
    </button>

    <br>

    <button>
    <a class="btn btn-dark" href="FrontController?target=redirect&destination=customWithShedSlope">Med skur med vinkeltag</a>
    </button>

</div>

</div>

</body>

<!-- Footer -->
<%@include file="/header/footer.inc"%>

</html>
