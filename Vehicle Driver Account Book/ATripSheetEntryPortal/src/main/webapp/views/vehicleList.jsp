<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vehicle List</title>
<link href="views/a.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="views/login.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<!-- <script src="https://kit.fontawesome.com/79ee646b23.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css"
	href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css" />
	<script type="text/javascript">
        function preventBack() {
            window.history.forward();
        }
          
        setTimeout("preventBack()", 0);
          
        window.onunload = function () { null };
    </script> -->
</head>
<body>
	<header>


		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand" id="home" href="adminhome">GAAP Travels</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown"
					aria-controls="navbarNavDarkDropdown" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
					<ul class="navbar-nav">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Vehicle </a>

							<ul class="dropdown-menu dropdown-menu-dark">
								<li><a class="dropdown-item" href="vehicle">Add Vehicle</a></li>
								<li><a class="dropdown-item" href="updatevehicle">Update
										Vehicle</a></li>
								<li><a class="dropdown-item" href="deletevehicle">Delete
										Vehicle</a></li>
								<li><a class="dropdown-item" href="vehiclelist">Vehicle
										List</a></li>
							</ul></li>
					</ul>
				</div>

				<div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
					<ul class="navbar-nav">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Driver </a>
							<ul class="dropdown-menu dropdown-menu-dark">
								<li><a class="dropdown-item" href="driver">Add Driver</a></li>
								<li><a class="dropdown-item" href="deleteDriver">Delete
										Driver</a></li>
								<li><a class="dropdown-item" href="driverlist">Driver
										List</a></li>
							</ul></li>
					</ul>
				</div>


				<div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
					<ul class="navbar-nav">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> Booking </a>
							<ul class="dropdown-menu dropdown-menu-dark">
								<li><a class="dropdown-item" href="booking">Add Booking</a></li>
								<li><a class="dropdown-item" href="bookinglist">Booking
										List</a></li>
								<li><a class="dropdown-item" href="updatebooking">Update
										Booking</a></li>
							</ul></li>
					</ul>
				</div>

				<div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
					<ul class="navbar-nav">
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> My Profile </a>
							<ul class="dropdown-menu dropdown-menu-dark">
								<li><a class="dropdown-item" href="my">My account</a></li>
								<li><a class="dropdown-item" href="aboutus">About us</a></li>
								<li><a class="dropdown-item" href="so">Sign-Out</a></li>
							</ul></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>






	<div class="tb" id="tbb">
	<div class="wrapper" id="wrap">
		<h2 class="h">Vehicle List</h2>

		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<table class="content-table" id="tb" border="2">
			<tr>
				<th>Registration No</th>
				<th>Model Name</th>
				<th>Vehicle Type</th>
				<th>Number Of Seat</th>
				<th>AC Available</th>
			</tr>
			<c:forEach items="${vehicle}" var="v">
				<tr>
					<td>${v.registrationNo}</td>
					<td>${v.modelName}</td>
					<td>${v.vehicleType}</td>
					<td>${v.numberOfSeat}</td>
					<td>${v.acAvailable}</td>
				</tr>
			</c:forEach>
		</table>

		<form action="/vbydate" method="post" id="std">
			<table>
				<tr>
					<td><b>Start Date Time</b></td>
					<td><input type="datetime-local" name="startdatetime" title="Enter dd-mm-yyyy hh:mm" required/></td>
					<td><input type="submit" value="search"></td>

				</tr>
			</table>
		</form>
	</div>


</div>

	<div class="footer-dark" id="footer">
		<footer>
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-md-3 item">
						<h3>Social Media Profiles</h3>

						<a href="#" class="fa fa-facebook" style="text-decoration: none;"></a>
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
						<i>We provide car rental service with <b>smiling</b> prices.
							We vanish the <b>GAAP</b> between the locations, by riding our
							cars on roads. Your <b>SAFETY</b> is our first priority. Book the
							best cars for the best journey from our GAAP Travels with
							affordable prices, and make your rides memorable.
						</i>
						<p class="copyright">GAAP Travels � 2022</p>
					</div>
		</footer>
	</div>

</body>


</html>