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
		height:450px;
		background:linear-gradient(red,blue);	
		boder:10px;
		margin-top:8%;
		margin-left:30%;
	}
	
	h1{
		margin-left:6%;
	}
	
	input{
		color:blue;
		box-shadow:2px 2px 2px lawngreen, -2px -2px 0px lawngreen;
	}
</style>

</head>
<body>

<fieldset style="boder:boder-collapse 10px solid black;">
<center>
<legend><h1>REGISTRATION <br>FORM</h1></legend>

<form action="register" style="5px solid black;">
	<input type="text"  placeholder="enter first Name" name="fname" required>
	<br><br>
		
	<input type="text"  placeholder="enter last Name"  name="lname" required>
	<br><br>
	
	<input type="email" placeholder="enter ur email"   name="email" required>
	<br><br>
	
	<input type="tel"   placeholder="enter ur phone"   name="phone" required>
	<br><br>
	
	<input type="pwd"   placeholder="enter password"   name="pwd"   required>
	<br><br>
	
	<input type="text"  placeholder="enter the role"   name="role" required>
	<br><br>
	
	<input type="radio" name="gender">Male
	<input type="radio" name="gender">Female
	<input type="radio" name="gender">Others
	<br><br>
	
	<input type="submit">
	</center>
</form>
</fieldset>


</body>
</html>