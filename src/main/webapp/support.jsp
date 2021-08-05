<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="support.css">
    <script src="login.js"></script>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <style>
        body {
          background-image: url('2.jpg');
          background-repeat: no-repeat;
          background-attachment: fixed;
          background-size: cover;
        }
        </style>

    <title>Contact Us</title>
</head>
<body>
            <div class="container" > 
                <div class="row">
                        <h1>Contact Us</h1>
                </div>
                <div class="row">
                        <h4 style="text-align:center">We'd love to hear from you!</h4>
                </div>
                <div class="row input-container">
                        <div class="col-xs-12">
                            <div class="styled-input wide">
                                <input type="text" required />
                                <label>Name</label> 
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-12">
                            <div class="styled-input">
                                <input type="text" required />
                                <label>Email</label> 
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-12">
                            <div class="styled-input" style="float:right;">
                                <input type="text" required />
                                <label>Phone Number</label> 
                            </div>
                        </div>
                        <div class="col-xs-12">
                            <div class="styled-input wide">
                                <textarea required></textarea>
                                <label>Message</label>
                            </div>
                        </div>
                        <div class="col-xs-12">
                            <div class="btn-lrg submit-btn">Send Message</div>
                        </div>
                </div>
            </div>
    
</body>
</html>