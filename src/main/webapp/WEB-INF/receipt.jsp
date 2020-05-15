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

    <title>Fog Quickbyg</title>
</head>

Tak for bestillingen. Der vil inden længe komme et estimeret pris på din email. <br>
Kunne du tænke dig at se plantegningen af carporten kan du se et udkast nedenfor

        <div class="col-md-6 text-center">
            <a href="FrontController?target=redirect&destination=plantegning"
               class="btn btn-dark mt-4" role="button" aria-pressed="true">Se plantegning af carport</a>
        </div>
<br>

        <form name="goBack" action="FrontController" method="POST">
            <input type="hidden" name="target" value="goBack">
            <button id="recieptGoBackTwo" class="btn btn-dark mt-4" type="submit" value="Tilbage">Tilbage</button>
        </form>


</div>
</body>
</html>

<!-- Footer -->
<%@include file="/header/footer.inc"%>