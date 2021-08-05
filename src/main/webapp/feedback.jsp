<%@page import="com.assessment.bean.FeedbackBean"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Feedbacks</title>
</head>
<body>
<jsp:include page="banner.jsp" />
<h1>QUIZ</h1>

<form action="Admin.fm" method="post">
<% List<FeedbackBean> feed = (List<FeedbackBean>) request.getAttribute("FEED"); %>

	
<% for(FeedbackBean q: feed) { %>
  <tr>

	<td><%= q.getEmail() %></td><br>
	
	<td><%= q.getName() %></td><br>
	<td><%= q.getFeedback() %></td><br>
	<% } %>
  <br>
<button type="submit" values="feedback">Submit</button>
</form>
</html>