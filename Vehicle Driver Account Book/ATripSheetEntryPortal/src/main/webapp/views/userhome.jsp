<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="/views/loginn.css">
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
         <script src="https://kit.fontawesome.com/79ee646b23.js" crossorigin="anonymous"></script>
         <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
</head>
<body>
       <body>
        <header>
            <div class="container">
                <div class="row">
                    <div class="col-md-4 col-sm-12 col-12">
                     <div class="btn-grp">
                         <button class="btn border dropdown-toggle my-md4 my-2 text-white" data-toggle="dropdown" aria-haspopup="true"
                         aria-expanded="false">INR</button>
                         <div class="dropdown-menu">
                             <a href="#" class="dropdown-item">INR-Rupee</a>
                         </div>
                     </div>   
                    </div>
                    <div class="col-md-4 col-12 text-center">
                      <h2 class="my-md-3 site-title text-white" style="color: black; font-family: Arial, Helvetica, sans-serif;"><b>GAAP Travels</b></h2>  
                    </div>
                    <div class="col-md col-12 text-right">
                        <p class="my-md-4 header-links">
                          <a href="l.html" class="px-2" style="text-decoration: none; color: white;">Sign In</a>
                          <a href="l.html" class="px-1" style="text-decoration: none; color: white;">Create an Account</a>  
                        </p>
                    </div>
                </div>
            </div>
            <div class="container-fluid p-0">
              <nav class="navbar navbar-expand-lg navbar-light bg-white">
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                  <ul class="navbar-nav">
                    <li class="nav-item">
                      <a class="nav-link active" aria-current="page" href="userhome">HOME</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="bookacar">BOOK A CAR</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="collection.html">OFFERS</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="aboutus">ABOUT US</a>
                    </li>
                  </ul>
                </div>
                    
                <div class="navbar-nav">
                  <li class="nav-item border rounded-circle mx-2 search-icon">
                      <form id="form"> 
                          <input type="search" id="query" name="q" placeholder="Search...">
                          <button><i class="fas fa-search p-2"></i></button>
                      </form>
                  </li>
                  <a href="cart.html"><li class="nav-item border rounded-circle mx-2 basket-icon">
                      <i class="fas fa-shopping-basket p-2"></i></a>
                      </li>
              </div>
                </div>
                  </nav>
            </div>
        </header>
            <div class="image">
                <div class="images">
                <h1 id="quo"><b><i>Best Cars for <br>
                the Best Journey</i></b></h1>
                  <img src="/views/carrental.jpeg" class="img-fluid" alt="pic">
                  
        
                </div>
            </div>    
        <div class="sfh">
          <p>BOOK<br>
          FROM<br>
        HOME</p>
        <img src="/views/2.jpeg" alt="pic">
        </div>
        <div class="bottom">
        </div>
        <div class="c">
        <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
          <div class="carousel-inner">
            <div class="carousel-item active">
              <h4 class="middle">MINI</h4><a href="shop.html"><img src="/views/mini.png" class="d-block" alt="..."></a>
            </div>
            <div class="carousel-item">
              <h4 class="middle">SEDAN</h4><a href="shop.html"><img src="/views/prime-sedan.png" class="d-block" alt="..."></a>
            </div>
            <div class="carousel-item">
              <h4 class="middle">SUV</h4><a href="shop.html"><img src="/views/prime-suv.png" class="d-block" alt="..."></a>
            </div>
          </div>
          <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
          </button>
          <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
          </button>
        </div>
        </div>
        <div class="footer-dark">
          <footer>
            <div class="container">
              <div class="row">
                  <div class="col-sm-6 col-md-3 item">
                      <h3>Social Media Profiles</h3>
                      <ul>
                          <li><a href="#" style="text-decoration: none;">FACEBOOK</a></li>
                          <li><a href="#" style="text-decoration: none;">INSTAGRAM</a></li>
                          <li><a href="#" style="text-decoration: none;">TWITTER</a></li>
                      </ul>
                  </div>
                  <div class="col-sm-6 col-md-3 item">
                      <h3>Menu</h3>
                      <ul>
                          <li><a href="login.html" style="text-decoration: none;">HOME</a></li>
                          <li><a href="features.html" style="text-decoration: none;">FLASH SALE</a></li>
                          <li><a href="collection.html" style="text-decoration: none;">OFFERS</a></li>
                          <li><a href="shop.html" style="text-decoration: none;">SHOP</a></li>
                          <li><a href="aboutus.html" style="text-decoration: none;">ABOUT US</a></li>
                      </ul>
                  </div>
                  <div class="col-md-6 item text">
                      <h3>OWNER 2 CUSTOMER</h3>
                      <p>The main aim of the company is to reduce the cost of the goods.<br>
                         In this website Owners/Farmers can sell their goods to customers directly.
                         So that price of the goods will be reduced when it reaches to customer. </p>
              <p class="copyright">Owner 2 Customer © 2021</p>
          </div>
          </footer>
        </div>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>
        <div class="myclass"></div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
        <script type="text/javascript" src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
        <script src="/views/z.js"></script>
    </body>

</body>
</html>