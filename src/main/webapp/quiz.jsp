<%@page import="com.assessment.bean.QuestionBean"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Quiz</title>
</head>
<body>
<jsp:include page="banner.jsp" />
<h1>QUIZ</h1>

<form action="User.fm" method="post">
<% List<QuestionBean> quiz = (List<QuestionBean>) request.getAttribute("QUIZ"); %>

<% for(QuestionBean q: quiz) { %>
  <p><%= q.getQuestion() %></p>
  <input type="radio"  name="<%= q.getId() %>" value="<%= q.getOption_a() %>">
  <label for="a"><%= q.getOption_a() %></label><br>
  <input type="radio"  name="<%= q.getId() %>" value="<%= q.getOption_b() %>">
  <label for="a"><%= q.getOption_b() %></label><br>
  <input type="radio"  name="<%= q.getId() %>" value="<%= q.getOption_c() %>">
  <label for="a"><%= q.getOption_c() %></label><br>
  <input type="radio" name="<%= q.getId() %>" value="<%= q.getOption_d() %>">
  <label for="a"><%= q.getOption_d() %></label>
	<% } %>	

<br>

<button type="submit" values="quizAns">Submit</button>
</form>
</body>
</html>>