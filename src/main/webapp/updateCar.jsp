<%@ page import="com.infoshare.academy.car.CarRepositoryDaoBeen" %>
<%@ page import="com.infoshare.academy.car.Car" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="javax.persistence.Id" %>
<%@ page import="com.infoshare.academy.car.CarsRepositoryDao" %>
<%@ page import="com.infoshare.academy.user.UsersRepositoryDaoBean" %>
<!DOCTYPE html>
<html lang="pl"></html>
<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>


<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Rezerwacja samochodów">
    <meta name="keywords" content="samochód, rezerwacja">
    <meta name="author" content="CSS Group">
    <meta http-equiv="X-Ua-Compatible" content="IE=edge">

    <title>CarSharingSystem</title>

    <!-- Styles - Bootstrap core and custom -->
    <link href="css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/css/main.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700&amp;subset=latin-ext" rel="stylesheet">

</head>

<body>

<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top">
    <div class="container">
        <a class="navbar-brand" href="#"><img src="css/img/css-logo.png" width="35" height="35"
                                              class="d-inline-block mr-1" alt=""> CarSharingSystem</a>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Start
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Logowanie</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Rezerwacja</a>
                </li>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Opłaty</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Kontakt</a>
                </li>
            </ul>
        </div>
    </div>
</nav>


<!-- Page Content -->
<div class="container">
    <form method="get" action="updateCar.jsp">
        <h2>Aktualizacja danych samochodu</h2>

        Podaj id samochodu<input type="text" name="id">
        <input type="submit" value="POBIERZ"><br/>
        <input type="text" value="<%%>">


</form>


    <br/>
    <input type="submit" value="ZAPISZ">
    </form>
</div>
<!-- /.container -->

<!-- Footer -->
<footer class="py-3 bg-dark">
    <div class="container">
        <p class="m-0 text-center text-white"><img src="css/img/css-logo.png" width="35" height="35"
                                                   class="d-inline-block mr-1" alt=""> Copyright &copy;
            2018-2019 by CSS Group</p>
    </div>
    <!-- /.container -->
</footer>

<!-- Bootstrap core JavaScript -->
<script src="css/vendor/jquery/jquery.min.js"></script>
<script src="css/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</htm