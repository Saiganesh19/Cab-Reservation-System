<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link href="views/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="form">
${message}
<h1></h1>

<div>
<h3>Registration Page</h3>
<form action="registration" method="post">

<table>
<tr>
<td>User Id</td>
<td><input type="number" name="id"></td>
</tr>


<tr>
<td>User Name</td>
<td><input type="text" name="username"></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td>Email</td>
<td><input type="email" name="email"></td>
</tr>

<tr>
<td>Mobile</td>
<td><input type="number" name="mobile"></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="Register"></td>
</tr>
</table>



</form>

Do you have account ? <a href="index">login</a>
</div>
</div>

</body>
</html>