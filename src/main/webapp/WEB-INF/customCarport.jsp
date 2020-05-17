<%@ page import="UtilClass.Initializer" %><%--
  Created by IntelliJ IDEA.
  User: emilie
  Date: 20/04/2020
  Time: 10.59
  To change this template use File | Settings | File Templates.
--%>

<!-- Design-side uden skur med taghældning -->

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
        /*  if (request.getServletContext().getAttribute("materialList") == null){
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
          }*/
        if (request.getServletContext().getAttribute("roofList") == null){
            request.getServletContext().setAttribute("roofList", Initializer.initRoofList());
        }
    %>

    <%  String besked = (String) request.getAttribute("message");
        String status = (String) request.getAttribute("status");
        if (besked != null && status != null) {
            String alert = "";
            if (status.equals("ok")) {
                alert = "<div class=\"alert alert-success\">_message_</div>";
            } else {
                alert = "<div class=\"alert alert-danger\">_message_</div>";
            }
            alert = alert.replace("_message_", besked);
            out.println(alert);
        }
    %>

    <title>Carport design</title>
</head>
<body>

Her kan du designe din egen carport med dine egne mål og tilføjelser.<br>
Vælg nedenfor hvilke ting du ønsker til din carport:

<!-- Dropdowns -->

<form action="FrontController" method="post">
    <input type="hidden" name="target" value="custom">

    <div class="row mt-4">

        <div class="col-md-5 school-options-dropdown text-center">
            <div class="form-group">
                <label>Vælg længde</label>
                <select name="quantity" class="form-control">
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
                <select name="quantity" class="form-control">
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

        <div class="col-md-5 school-options-dropdown text-center">
            <div class="form-group">
                <label>Vælg hældning på tag:</label>
                <select class="form-control" name="slope">
                <option selected disabled>Hældning</option>
             <c:forEach var="slope" items="${applicationScope.roofList}">
               <option name="del 7">${slope.slope}</option>
             </c:forEach></select>

    </div>
        </div>
    </div>


    <b2> Indtast personlige oplysninger, så vi kan sende dig et tilbud</b2>
    <div class="row mt-3">

        <div class="col-md-5 text-center">
            <div class="form-group">
            <label for="name">Navn</label><br>
            <input type="text" id="name" name="name" value=""><br>
            <label for="email">Email</label><br>
            <input type="text" id="email" name="email" value=""><br><br>
    </div>

        <div class="col-md-5 text-center">
        <a href="FrontController?target=redirect&destination=receipt"
           button type="submit" class="btn btn-dark mt-4 mb-3">Bestil</a>
    </div>
    </div>
</div>

</body>
<!-- Footer -->
<%@include file="/header/footer.inc"%>
</html>
