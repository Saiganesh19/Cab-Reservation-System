<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login and Registration </title>
      <link rel="stylesheet" href="views/login.css" type="text/css">

<!-- <script type="text/javascript">  
      window.history.forward();
        function noBack() {  
	          window.history.forward();
	        }    </script>
 -->
 
 <script type="text/javascript">
        function preventBack() {
            window.history.forward();
        }
          
        setTimeout("preventBack()", 0);
          
        window.onunload = function () { null };
    </script>

</head>
<body>

   <body>
      <div class="wrapper">
      <h4 style="color:red; text-align:center;">${errMsg}</h4>
       <h5 style="color:red; text-align:center;">${sry}</h5>
       <h5 style="color:red; text-align:center;">${m}</h5>
        <h5 style="color:red; text-align:center;">${ma}</h5>
      <h4>${message}</h4>
         <div class="title-text">
            <div class="title login">
               Login Form
            </div>
            <div class="title signup">
               Signup Form
            </div>
         </div>
         <div class="form-container">
            <div class="slide-controls">
               <input type="radio" name="slide" id="login" checked>
               <input type="radio" name="slide" id="signup">
               <label for="login" class="slide login">Login</label>
               <label for="signup" class="slide signup">Signup</label>
               <div class="slider-tab"></div>
            </div>
            <div class="form-inner">
               <form  class="login" action="home" method="post">
                  <div class="field">
                     <input type="text" placeholder="User Name" name="username" pattern="^[a-z]{1}[a-z0-9_-]{5,15}$" title="Username should not start with special char, number, capital. It is an alpa_numeric" required>
                  </div>
                  <div class="field">
                     <input type="password" placeholder="Password" id="psw" name="password" pattern="(?![ \n])(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number, one uppercase, lowercase letter, one special char, and at least 8 or more characters" required>
                     Show Password<input type="checkbox" onclick="myFunction()" id="check">
                  </div>
                  <div class="field btn" id="btn">
                     <div class="btn-layer"></div>
                     <input type="submit" value="Login">
                  </div>
                  <div class="signup-link">
                     Not a member? <a href="">Signup now</a>
                  </div>
               </form>
               <form action="registrationn" class="signup" method="post">
                  <!--  <div class="field">
                     <input type="number" placeholder="id" name="id" required>
                  </div>-->
                  <div class="field">
                     <input type="text"  placeholder="Username" name="username" pattern="^[a-z]{1}[a-z0-9_-]{5,15}$" title="Username should not start with special char, number, capital. It is an alpa_numeric" required>
                  </div>
                  <div class="field">
                     <input type="password" placeholder="Password" id="ps" name="password" pattern="(?![ \n])(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number, one uppercase, lowercase letter, one special char, and at least 8 or more characters" required>
                  <p  id="togglePasswor" class="para" style="cursor: pointer;">show Password</p>
                  </div>               
                  <div class="field" id="btn">
                     <input type="email" placeholder="Email Address" name="email" pattern="^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$" title="Email should be in the format abc@xyz.com or abc@xyz.in" required>
                  </div>           
                  <div class="field">
                     <input type="tel" placeholder="Mobile Number" name="mobile" pattern="[6-9]{1}[0-9]{9}" title="Enter 10 digit mobile number"required>
                  </div>
                  <div class="field btn">
                     <div class="btn-layer"></div>
                     <input type="submit" value="Signup">
                  </div>
               </form>
            </div>
         </div>
      </div>
      <script>
         const loginText = document.querySelector(".title-text .login");
         const loginForm = document.querySelector("form.login");
         const loginBtn = document.querySelector("label.login");
         const signupBtn = document.querySelector("label.signup");
         const signupLink = document.querySelector("form .signup-link a");
         signupBtn.onclick = (()=>{
           loginForm.style.marginLeft = "-50%";
           loginText.style.marginLeft = "-50%";
         });
         loginBtn.onclick = (()=>{
           loginForm.style.marginLeft = "0%";
           loginText.style.marginLeft = "0%";
         });
         signupLink.onclick = (()=>{
           signupBtn.click();
           return false;
         });
         
         
         
         
         
         
         function myFunction() {
        	  var x = document.getElementById("psw");
        	  if (x.type === "password") {
        	    x.type = "text";
        	  } else {
        	    x.type = "password";
        	  }
        	}
         
         
         
         
         
         
         
         const togglePassword = document.querySelector('#togglePasswor');
         const password = document.querySelector('#ps');



        togglePassword.addEventListener('click', function (e) {
         
           const type = password.getAttribute('type') === 'password' ? 'text' : 'password';
           password.setAttribute('type', type);
        
           this.classList.toggle('fa-eye-slash');
       });
      </script>
   </body>

</body>
</html>