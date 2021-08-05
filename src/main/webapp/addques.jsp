<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@import=" %>
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
<form action="Admin.fm" method="post">
 <label for="id">Question id: </label>
        <br>
        <input type="text" name="id" id="id" placeholder="enter ques id" required >
        
        <br>
        <br>
        <label for="option_a">Option A</label>
        <br>
        <input type="text" name="option_a" id="option_a" placeholder="Option A" required>
        <br><br>
       
       <br>
        <br>
        <label for="option_b">Option B</label>
        <br>
        <input type="text" name="option_b" id="option_b" placeholder="Option B" required>
        <br><br>
        <br>
        <br>
        <label for="option_c">Option C</label>
        <br>
        <input type="text" name="option_c" id="option_c" placeholder="Option C" required>
        <br><br>
        <br>
        <br>
        <label for="option_d">Option D</label>
        <br>
        <input type="text" name="option_d" id="option_d" placeholder="Option D" required>
        <br><br>
       
        <br>
        <br>
        <label for="answer">Answer</label>
        <br>
        <input type="text" name="answer" id="answer" placeholder="Answer" required>
        <br><br>
     
        
       <button type="submit" class="btn btn-primary btn-block btn-lg button1"> Add Question </button><br>
       
</form>
      
      
      
      
   </div>
 </div>
</div>
</body>
</html>