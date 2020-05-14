<%--
  Created by IntelliJ IDEA.
  User: emilie
  Date: 14/05/2020
  Time: 17.39
  To change this template use File | Settings | File Templates.
--%>
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
<html>
<head>
    <title>Carport design</title>
</head>
<body>

<b2> Indtast personlige oplysninger</b2>

<form action="/action_page.php">
    <label for="name">Navn:</label><br>
    <input type="text" id="name" name="name" value="navn"><br>
    <label for="email">Email:</label><br>
    <input type="text" id="email" name="email" value="email"><br><br>
    <input type="submit" value="Bestil carport">
</form>
</body>
</html>
