<%@ page import="UtilClass.Initializer" %><%--
  Created by IntelliJ IDEA.
  User: emilie
  Date: 20/04/2020
  Time: 10.59
  To change this template use File | Settings | File Templates.
--%>

<!-- Design-side UDEN skur -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <!-- Header -->
    <%@include file="/header/header.inc"%>

    <%
        if (request.getServletContext().getAttribute("materialList") == null){
            request.getServletContext().setAttribute("materialList", Initializer.initMaterialList());
        }
        if (request.getServletContext().getAttribute("measurementList") == null){
            request.getServletContext().setAttribute("measurementList", Initializer.getMeasurementShedWidth());
        }
        if (request.getServletContext().getAttribute("measurementList") == null){
            request.getServletContext().setAttribute("measurementList", Initializer.getMeasurementShedLength());
        }
        if (request.getServletContext().getAttribute("measurementList") == null){
            request.getServletContext().setAttribute("measurementList", Initializer.getMeasurementWidth());
        }
        if (request.getServletContext().getAttribute("measurementList") == null){
            request.getServletContext().setAttribute("measurementList", Initializer.getMeasurementLength());
        }
    %>

    <title>Carport design</title>
</head>
<body>
<h1>Lav din egen carport</h1>

Her kan du designe din egen carport med dine egne mål og tilføjelser.
Vælg nedenfor hvilke ting du ønsker til din carport:

<!-- Dropdowns -->

<form action="FrontController" method="post">
    <input type="hidden" name="target" value="custom">

    <div class="row mt-4">

        <div class="col-md-5 school-options-dropdown text-center">
            <div class="form-group">
                <label>Vælg Carport længde:</label>
                <select class="form-control" name="del 1">
                    <option selected disabled>Carport længde</option>
                    <c:forEach var="measureLength" items="${applicationScope.measurementList}">
                        <option name="del 1">${measureLength.measurement}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="col-md-5 school-options-dropdown text-center">
            <div class="form-group">
                <label>Vælg Carport bredde:</label>
                <select class="form-control" name="del 2">
                    <option selected disabled>Carport bredde</option>
                    <c:forEach var="measureWidth" items="${applicationScope.measurementList}">
                        <option name="del 2">${measureWidth.measurement}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="col-md-5 school-options-dropdown text-center">
            <div class="form-group">
                <label>Vælg materiale til carport</label>
                <select class="form-control" name="del 5">
                    <option selected disabled>Carport materiale</option>
                    <c:forEach var="material" items="${applicationScope.materialList}">
                        <option name="del 5">${material.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="col-md-5 school-options-dropdown text-center">
            <div class="form-group">
                <label>Vælg hældning på tag:</label>
                <select class="form-control" name="slope">
                    <option selected disabled>Hældning</option>
                    <c:forEach var="slope" items="${slope}">
                        <option name="slope">${slope.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="col-md-5 school-options-dropdown text-center">
            <div class="form-group">
                <label>Vælg materiale til tag</label>
                <select class="form-control" name="del 6">
                    <option selected disabled>Tag materiale</option>
                    <c:forEach var="material" items="${materials}">
                        <option name="del 6">${material.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6 text-center">
            <a href="FrontController?target=redirect&destination=plantegning"
               class="btn btn-dark mt-4" role="button" aria-pressed="true">Se plantegning af carport</a>
        </div>

        <div class="col-md-6 text-center">
            <a href="FrontController?target=redirect&destination=basket"
               class="btn btn-dark mt-4" role="button" aria-pressed="true">Tilføj til kurv</a>
        </div>

        <div class="col-md-6 text-center">
            <a href="FrontController?target=redirect&destination=basket"
               class="btn btn-dark mt-4" role="button" aria-pressed="true">Gå til kurv</a>
        </div>
    </div>
</form>
</div>


</body>
<!-- Footer -->
<%@include file="/header/footer.inc"%>
</html>