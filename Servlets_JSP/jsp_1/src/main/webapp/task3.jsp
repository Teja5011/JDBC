<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%! String message="happy new year in advance" ;%>
<%
	for(int i=0;i<=5;i++)
	{
%>
	<h1 style="color:red;"><%= message %></h1>
<%
	}
%>

</body>
</html>