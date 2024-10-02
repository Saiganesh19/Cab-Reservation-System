<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="views/style.css" rel="stylesheet" type="text/css">
</head>
<body>
    
    <div class="form">
    <h4 class="error">${errMsg}</h4>
<h3>Login Page</h3>
<form action="home" method="post" >

<table>
<tr>
<td>User Name</td>
<td><input type="text" name="username" pattern="^[a-z]{1}[a-z0-9_-]{5,15}$" title="Username should not start with special char, number, capital. It is an alpa_numeric" required></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password" id="psw" name="password" pattern="(?![ \n])(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number, one uppercase, lowercase letter, one special char, and at least 8 or more characters" required></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Login"></td>
</tr>
</table>



</form>

Not Registered Yet? <a href="register">Create account here</a>
</div>

</body>
</html>