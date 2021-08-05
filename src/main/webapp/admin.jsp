<%@page import="com.assessment.bean.QuestionBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin's Page</title>
</head>
<body>

<% List<QuestionBean> questions = (List<QuestionBean>) request.getAttribute("QUIZ"); %>
<table border="2" >
<% for(QuestionBean q : questions) { %>

<tr>
<div class="container">
<form action="Admin.fm">

	<td><%= q.getQuestion() %></td><br>
	<td><%= q.getOption_a() %></td><br>
	<td><%= q.getOption_b() %></td><br>
	<td><%= q.getOption_c() %></td><br>
	<td><%= q.getOption_d() %></td> <br>
	<td><%=q.getAnswer() %></td><br>
    <td><input type="hidden" name="id" value=<%=q.getId() %> />
		<button type="submit">Delete Question</button> </td>
	
</form>
</div>
</tr>
<% } %>
<hr>
      <a href="addques.jsp">Add Question</a>  <br> 
  <a href="feedback.jsp">See User Details And Their Feedbacks</a>
</body>
</html>







