<%--
  Created by IntelliJ IDEA.
  User: emilie
  Date: 14/05/2020
  Time: 18.16
  To change this template use File | Settings | File Templates.
--%>

<!-- Design-side uden skur uden taghældning -->
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

    <!-- Stylesheet -->
    <link rel = "stylesheet"
          type = "text/css"
          href = "css/dropdown.css" />

    <%

    %>

    <title>Carport design</title>
</head>
<body>
<h1>Lav din egen carport</h1>

Her kan du designe din egen carport med dine egne mål og tilføjelser.
Vælg nedenfor hvilke ting du ønsker til din carport:
Med skur uden taghældning

<!-- Dropdowns -->

<form action="FrontController" method="post">
    <input type="hidden" name="target" value="customOrderWithShed">

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
                <label>Vælg længde på skur:</label>
                <select class="form-control" name="del 3">
                    <option selected disabled>Skur længde</option>
                    <c:forEach var="measureShedLength" items="${applicationScope.measurementList}">
                        <option name="del 3">${measureShedLength.measurement}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="col-md-5 school-options-dropdown text-center">
            <div class="form-group">
                <label>Vælg bredde på skur:</label>
                <select class="form-control" name="del 4">
                    <option selected disabled>Skur bredde</option>
                    <c:forEach var="measureShedWidth" items="${applicationScope.measurementList}">
                        <option name="del 4">${measureShedWidth.measurement}</option>
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
                <label>Vælg materiale til tag</label>
                <select class="form-control" name="del 5">
                    <option selected disabled>Carport tag materiale</option>
                    <c:forEach var="material" items="${applicationScope.materialList}">
                    <option name="del 5">${material.name}</option>
                    </c:forEach>
            </div>
        </div>

        <div class="col-md-5 school-options-dropdown text-center">
            <div class="form-group">
                <label>Vælg tag hældning</label>
                <select class="form-control" name="del 5">
                    <option selected disabled>Tag hældning</option>
                    <c:forEach var="material" items="${applicationScope.materialList}">
                    <option name="del 5">${material.name}</option>
                    </c:forEach>
            </div>
        </div>

    </div>

    <b2> Indtast personlige oplysninger, så vi kan sende dig et tilbud</b2>

    <div class="col-md-5 school-options-dropdown text-center">
        <form action="/action_page.php">
            <label for="name">Navn:</label><br>
            <input type="text" id="name" name="name" value="navn"><br>
            <label for="email">Email:</label><br>
            <input type="text" id="email" name="email" value="email"><br><br>
        </form>
    </div>

    <div class="col-md-4 text-center mt-3 mb-3">
        <a href="FrontController?target=redirect&destination=receipt"
           button type="submit" class="btn btn-dark mt-4 mb-3">Bestil</a>
    </div>
    </div>
</form>
</div>



</body>
<!-- Footer -->
<%@include file="/header/footer.inc"%>
