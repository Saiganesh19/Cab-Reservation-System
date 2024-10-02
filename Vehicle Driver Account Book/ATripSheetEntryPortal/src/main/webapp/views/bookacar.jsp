<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
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
           
           
           
           
           
           <form action="bookacar" method="post">
           
          <table>
<tr>
<td>From Location</td>
<td><input type="text" name="fromLocation"></td>
</tr>


<tr>
<td>To Location</td>
<td><input type="text" name="toLocation"></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="next"></td>
</tr>
</table>
           </form>
           
           
           
           
           
      <h2 class="h">Booking List</h2>
      <h2>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <table border="2">
     <tr>
         <th>vehicle</th>
         <th>driver</th>
         <th>startdatetime</th>
          <th>enddatetime</th>
      </tr>
      <c:forEach items="${list}" var="v">
      <tr>
           <td>${v.vehicle}</td>
           <td>${v.driver}</td>
           <td>${v.startdatetime}</td>
           <td>${v.enddatetime}</td>
           
      </tr>
      </c:forEach>                  
      </table>     
      </h2>
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
      <div class="footer-dark" id="footer">
            <footer>
              <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-md-3 item">
                        <h3>Social Media Profiles</h3>
                        
                            <a href="#" class="fa fa-facebook"   style="text-decoration: none;"></a>
                            <a href="#" class="fa fa-instagram" style="text-decoration: none;"></a>
                            <a href="#" class="fa fa-twitter" style="text-decoration: none;"></a>
                        
                    </div>
                    <div class="col-sm-6 col-md-3 item">
                        <h3>Service</h3>
                        
                            <a href="adminhome" style="text-decoration: none;">HOME</a><br>
                            <a href="vehiclelist" style="text-decoration: none;">VEHICLE</a><br>
                            <a href="driverlist" style="text-decoration: none;">DRIVER</a><br>
                            <a href="bookinglist" style="text-decoration: none;">BOOKING</a><br>
                            <a href="aboutus" style="text-decoration: none;">ABOUT US</a>
                        
                    </div>
                    <div class="col-md-6 item text">
                        <h3>GAAP Travels</h3>
                        <i>We provide car rental service with <b>smiling</b> prices. We vanish the <b>GAAP</b> between the locations, by riding our cars on roads. 
                        Your <b>SAFETY</b> is our first priority. Book the best cars for the best journey from our GAAP Travels with affordable prices, and make your rides memorable.</i>
                <p class="copyright">GAAP Travels © 2022</p>
            </div>
            </footer>
          </div>
</body>
</html>