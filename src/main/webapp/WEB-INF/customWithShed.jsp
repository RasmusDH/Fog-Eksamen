<%@ page import="UtilClass.Initializer" %><%--
  Created by IntelliJ IDEA.
  User: emilie
  Date: 20/04/2020
  Time: 10.59
  To change this template use File | Settings | File Templates.
--%>

<!-- Design-side med skur uden tag -->

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
                <label>Vælg længde</label>
                <select name="length" class="form-control">
                    <option selected disabled>Vælg længde </option>
                    <option value="1">120</option>
                    <option value="2">160</option>
                    <option value="3">200</option>
                    <option value="4">220</option>
                    <option value="5">260</option>
                    <option value="6">300</option>
                    <option value="7">320</option>
                    <option value="8">360</option>
                    <option value="9">400</option>
                    <option value="10">420</option>
                </select>
            </div>
        </div>


        <div class="col-md-5 school-options-dropdown text-center">
            <div class="form-group">
                <label>Vælg bredde</label>
                <select name="width" class="form-control">
                    <option selected disabled>Vælg bredde </option>
                    <option value="1">120</option>
                    <option value="2">160</option>
                    <option value="3">200</option>
                    <option value="4">220</option>
                    <option value="5">260</option>
                    <option value="6">300</option>
                    <option value="7">320</option>
                    <option value="8">360</option>
                    <option value="9">400</option>
                    <option value="10">420</option>
                </select>
            </div>
        </div>

        <div class="col-md-5 school-options-dropdown text-center">
            <div class="form-group">
                <label>Vælg materiale</label>
                <select name="quantity" class="form-control">
                    <option selected disabled>Vælg materiale </option>
                    <option value="1">Mahogany</option>
                    <option value="2">Eg</option>
                    <option value="3">Birk</option>
                </select>
            </div>
        </div>

        <div class="col-md-5 school-options-dropdown text-center">
            <div class="form-group">
                <label>Vælg materiale til tag</label>
                <select name="quantity" class="form-control">
                    <option selected disabled>Vælg materiale </option>
                    <option value="1">Plastik</option>
                    <option value="2">Metal</option>
                </select>
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
</html>