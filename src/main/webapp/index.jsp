<%@ page import="UtilClass.Initializer" %><%--
  Created by IntelliJ IDEA.
  User: emilie
  Date: 20/04/2020
  Time: 12.17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%!
        @Override
        public void jspInit(){
            //Initializer.initMaterialList();
            // Initializer.initMeasurements();
        }

    %>

    <%
        // request.setAttribute("materials", Initializer.initMaterialList());
        // request.setAttribute("measureWidths", Initializer.getMeasurementWidth());
        // request.setAttribute("measureLengths", Initializer.getMeasurementLength());
        //request.setAttribute("measureShedLengths", Initializer.getMeasurementShedLength());
        // request.setAttribute("measureShedWidths", Initializer.getMeasurementShedWidth());
    %>
    <!-- Header -->
    <%@include file="header/header.inc"%>

    <link rel = "stylesheet"
          type = "text/css"
          href = "css/center.css" />

    <!-- Required meta tags -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Fog</title>
</head>
<body>

<br>
        <a href="FrontController?target=redirect&destination=options" class="btn btn-secondary btn-lg active" role="button" aria-pressed="true">
            Tryk her for at designe din carport
        </a>

</body>
</html>

<!-- Footer -->
<%@include file="/header/footer.inc"%>

