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

<svg  xmlns="http://www.w3.org/2000/svg"
      xmlns:xlink="http://www.w3.org/1999/xlink"
      width="780" height="600" viewBox="-100 80 900 500">
    <rect x="-100" y="-20" height="1000" width="900"
          style="stroke:white; fill: white"/>
    <rect x="0" y="0" height="600" width="780"
          style="stroke:black; fill: white"/>
    <!--Spær-->
    <rect x="0" y="0" height="600" width="7"
          style="stroke:black; fill: none"/>
    <rect x="771" y="0" height="600" width="7"
          style="stroke:black; fill: none"/>
    <!--Remme-->
    <rect x="7" y="30" height="7" width="763"
          style="stroke:black; fill: none"/>
    <rect x="7" y="570" height="7" width="763"
          style="stroke:black; fill: none"/>
    <!--Krydset-->
    <line x1="7"  y1="30" x2="600"   y2="570"
          style="stroke:black; stroke-dasharray: 10 5"/>
    <line x1="50"  y1="570" x2="600"   y2="30"
          style="stroke:black; stroke-dasharray: 10 5"/>
    <!--Stolperne-->
    <rect x="48" y="28" height="12" wid

</body>
    <div class="col-md-6 text-center">
        <a href="FrontController?target=redirect&destination=receipt"
           class="btn btn-dark mt-4" role="button" aria-pressed="true">Tilbage</a>
    </div>


<!-- Footer -->
<%@include file="/header/footer.inc"%>

</html>



