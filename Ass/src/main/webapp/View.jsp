<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.Advajava.Ass.Model,java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style.css">

<title>Insert title here</title>
</head>
<body>
<table border=2>
<tr>
	<td>UID</td>
	<td>Age</td>
	<td>Name</td>
</tr>
<%
Model u=(Model)request.getAttribute("userlist");

%>
	<tr>
	<td><% out.println(u.getUid()); %></td>
	<td><% out.println(u.getAge()); %></td>
	<td><% out.println(u.getUsername()); %></td>
	</tr>



</table>
</body>
</html>