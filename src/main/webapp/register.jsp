<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Register</title>
  <meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="register.css">

</head>
<body>
 <div class="container div1 ">	
 	<div class="form">
	 <span class="glyphicon glyphicon-remove span1" class="span1"></span>
	  <div class="page-header">
    <center>
	        <b><h1 class="h_1">Sign Up</h1></b></center>
      </div>
<form action="User.fm" method="post">
   <div>
       <label for="email">Email:</label>  <input type="text" name="email" placeholder="Email" required><br>
      <label for="password">Password:</label>  <input type="password" name="password" placeholder="Password" required><br>
      <label for="name">Name:</label>  <input type="text" name="name"  placeholder="Name" required><br>
    
      <label for="age">Age:</label> 
      <select name="age" required id="cars" class="selectbox">
			<% for(int a=12;a<=99;a++) { %>
				<option value="<%=a %>"><%=a %></option>
			<% } %>
			</select>
  <br>
   
   <label for="gender" >Gender:</label>
    <select name="gender" class="selectbox" id="cars">
    <option value="male">Male</option>
    <option value="female">Female</option>
     </select>
     <br>
     <label for="phone" >Mobile Number:</label>
  <input class="selectbox" type="tel" id="phone" name="mobile" placeholder="1234545678" pattern="[0-9]{10}" required>


       <button type="submit" class="btn btn-primary btn-block btn-lg button1"> Sign Up </button><br>
   </div>
   <div>
     <span><a href="help.jsp"    class="acr1"> Need help?  </a></span>
     <span><a href="login.jsp" class="acr2"> Log in!</a> <br></span>
   </div>
  <button type="button"  class="btn button2"> Cancel </button>
  </form></div>
</div>
</body>
</html>