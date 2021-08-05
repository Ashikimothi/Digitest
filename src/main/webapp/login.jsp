<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="ISO-8859-1">
<head>
  <title>Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="login.css">
</head>
<body>
	<div class="container">
	 <% if(request.getParameter("invalid") != null) { %>
			<span id="err">Invalid Email ID/Password</span>
		<% } %>
		<div class="form">
			<fieldset class="field_set">
				<h1 class="h_1"><font size="6">Hello!<br></font></h1>
				<h5 class="h_4">Please Login To Your Account</h5>
				
    <form action="User.fm">
				<label for="email" class="label1"> Username</label><br>
				<input type="text" name="email"><br>
				<label for="psw" class="label2"> Password</label><br>
				<input type="password" name="password"><br>
				<button type="submit" class="btn btn-primary btn-xs button1"><span class="glyphicon glyphicon-lock"></span> Sign In</button>
				  <div class="checkbox" >		
				  <label for="Remember" class="label3"><span class="glyphicon glyphicon-check"></span>Remember Me</label><br>
				  </div>
				   <div class="page-header div1"></div>
				   	<a href="forgot.jsp" class="acr1">Forgot Password?</a>
				   	<a href="register.jsp" class="acr2">Create Account</a>
				</form>
			</fieldset>	
	</div>
	</div>
</body>		
</html>