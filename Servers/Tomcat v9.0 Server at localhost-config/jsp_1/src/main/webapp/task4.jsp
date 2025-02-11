<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int []a={2,3,2,6,7,3,6,8,0}; %>
<%
	if(a%2==0)
	{
%>
	<h1><%out.println(a);%></h1>
<%
	else
	{
%>
	<h1><%out.println(a); %></h1>
<%
	}
%>

</body>
</html>