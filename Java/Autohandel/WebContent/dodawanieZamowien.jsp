<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<head>
     <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Dodaj zamówienie</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/img/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700" rel="stylesheet" />
        <link href="https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic" rel="stylesheet" type="text/css" />
        <!-- Third party plugin CSS-->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="style/css/styles.css" rel="stylesheet" />
</head>
 
</head>
<body>
   <nav class="navbar navbar-expand-lg navbar-light fixed-top py-3" id="mainNav">
            <div class="container">
               <a class="navbar-brand js-scroll-trigger" href="index.jsp">Autohandel VAG</a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto my-2 my-lg-0">
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="kontakt.jsp">Kontakt </a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="listaZamowien">Lista zamówień</a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="listaModeli">Lista Wspieranych Modeli</a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="listaKlientow">Lista Klientow</a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="listaCzesci">Lista Części</a></li>
                         <li class="nav-item"><a class="nav-link js-scroll-trigger" href="listaStanu">Niedostępne</a></li>
                    </ul>
                </div>
            </div>
        </nav>

  <header class="masthead">
            <div class="container h-100">
                <div class="row h-100 align-items-center justify-content-center text-center">
                    <div class="col-lg-10 align-self-end">
                        <h1 class="text-uppercase text-white font-weight-bold">Dodaj zamówienie</h1>
                        <hr class="divider my-4" />
                    </div>
                    <div class="col-lg-8 align-self-baseline">
                        <p class="text-white-75 font-weight-light mb-5">

    <h3>Czy chcesz dodać noweg zamówienie??</h3>
    <form action = "Obsluga" method = "get">
   		nr_zamowienia: <input type = "text" name = "nr_zamowienia" id="nr_zamowienia"> <br/>
        id_klienta:   <select name="wynik_zamowienia">
            <c:forEach var="el" items="${lkl}">
                <option value="${el.id_klienta}">${el.id_klienta} </option>
            </c:forEach>
        </select><br>
        ilosc: <input type = "text" name = "ilosc" id="ilosc"> <br/>
        kwota: <input type = "text" name = "kwota" id="kwota"> <br />
        numer: <input type = "text" name = "numer" id="numer"> <br />
        sposob_odbioru: <input type = "text" name = "sposob_odbioru" id="sposob_odbioru"> <br/>
        czy_zaplacono: <input type = "text" name = "czy_zaplacono" id="czy_zaplacono"> <br />
       
  
        <br />
        <input type = "submit" value = " Dodaj zamówienie " /><p>${wynik_zamowienia}</p>
</form>


<div class="widok">
    <h3>Tu możesz usunąć zamówienie</h3>
    <form action = "Obsluga" method = "get">
        Zamówienia:
        <select name="zamow_usun">
            <c:forEach var="el" items="${lza}">
                <option value="${el.nr_zamowienia}">${el.nr_zamowienia} </option>
            </c:forEach>
        </select>
        <input type = "submit" value = " Usuń " /><p>${usun_za}</p>
    </form>

</div>


</div>
</div>
<footer class="bg-light py-5">
            <div class="container"><div class="small text-center text-muted">Copyright © 2020 - Start Bootstrap</div></div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Third party plugin JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
        </body>
</html>
