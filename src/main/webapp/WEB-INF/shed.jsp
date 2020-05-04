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

Kunne du tænke dig en carport med eller uden et skur til?

<br> <br>

<button>
    <a href="FrontController?target=redirect&destination=roof">Med skur</a>
</button>

<button>
    <a href="FrontController?target=redirect&destination=roof">Uden skur</a>
</button>

</body>

<!-- Footer -->
<%@include file="/header/footer.inc"%>

</html>
