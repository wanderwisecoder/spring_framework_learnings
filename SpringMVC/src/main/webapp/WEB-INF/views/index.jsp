<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is our home page</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>

	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	Integer age = (Integer) request.getAttribute("age");
	%>
	
	<h1>Name is <%=name%>. </h1>
	<h1>My Id is <%=id%>.</h1>
	<h1>My age is <%=age%>.</h1>
</body>
</html>