<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
		background-color:lawngreen;
	}
	
	fieldset{
		width:30%;
		height:300px;
		background:linear-gradient(red,blue);	
		boder:10px;
		margin-top:10%;
		margin-left:31%;
	}
	
	input{  
		width:45%;
		height:25px;
		box-shadow:2px 2px 2px grey,-2px -2px 0px grey;
	}
</style>
</head>
<body>

<% String msg=(String)request.getAttribute("message");
if(msg!=null)
{
%>
<h1 style="color:red";><%=msg %></h1>
<% 
}
%>

<fieldset style="boder:boder-collapse 25px solid blue;">
	<form action="login" method="Post">
		<center>
		<legend><h1>LOGIN PAGE</h1></legend>
		
		
		<input type="email"  placeholder="enter email"  name="email">
		<br><br>
		
		<input type="pwd"   placeholder="entert password" name="pwd">
		<br><br>
		
		<input type="submit" value="SIGN IN">
		</center>
	</form>
</fieldset>	
</body>
</html>