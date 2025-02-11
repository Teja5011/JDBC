<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<style>
		
		fieldset
		{
			width:30%;
			height:50%;
			margin-top:10%;
		}
</style>

</head>
<body>
<center>
<fieldset>

	<form action="login">
		<center>
			<h1>
			<h1>
	      	  <span style="color: red;">L</span>
	   		  <span style="color: blue;">O</span>
	    	  <span style="color: green;">G</span>
	 	      <span style="color: orange;">I</span>
	   		  <span style="color: purple;">N</span>
			</h1>
			<br>
			
			<label for="loginUsername">Username</label>
            <input type="email" id="loginUsername" name="username" placeholder="Enter your username" required>
			<br><br>
			
			<label for="loginpassword">password:</label>
			<input type="password" id="loginpassword" name="password" placeholder="enter the password" required>
			<br><br>
			
			<button>Login</button>
		</center>
	</form>

</fieldset>
</center>
</body>
</html>