<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Registration form</title>

<style>
		body
		{
		  background-color:grey;
		}
		fieldset
		{
			width:350px;
			height:540px;
			margin-top:5%;
			margin-left:35%;
			background-color:red;
			box-shadow:5px 5px 5px #0ef, -5px -5px 0px orange;
		}
		
</style>
</head>
<body>
<fieldset>
<h2 style="color:wheat;">New User Registration</h2>
<form action="RegisterUserController" method="post">
<table>
	<tr>
		<th><label for="newUsername">Username:</label></th>
		<td> <input type="text" id="newUsername" name="username" required><br><br></td>
	</tr>

	<tr>
		<th><label for="newEmail">Email:</label></th>
		<td><input type="email" id="newEmail" name="email" required><br><br></td>
	</tr>

	<tr>
		<th><label for="newPassword">Password:</label></th>
		<td> <input type="password" id="newPassword" name="password" required><br><br></td>
	</tr>

	<tr>
		<th><label for="confirmPassword">Confirm Password:</label></th>
		<td><input type="password" id="confirmPassword" name="confirmPassword" required><br><br></td>
	</tr>
	
	<tr>
		<th><label for="phone">Phone Number:</label></th>
		<td><input type="text" id="phone" name="phone" required><br><br></td>
	</tr>

	<tr>
		<th><label for="address">Address:</label></th>
		<td><textarea id="address" name="address" rows="3" required></textarea><br><br></td>
	</tr>
	
	<tr>
		<th><label for="dob">Date of Birth:</label></th>
		<td><input type="date" id="dob" name="dob" required><br><br></td>
	</tr>

    <tr>
		<th></th>
		<td><button type="submit"><strong>Register</strong></button></td>
	</tr>    
</table>
</form>

</fieldset>

</body>
</html>