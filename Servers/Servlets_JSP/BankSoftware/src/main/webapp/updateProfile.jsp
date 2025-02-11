<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Profile</title>
<style>
		body
		{
		  background-color:grey;
		}
		fieldset
		{
			width:290px;
			height:390px;
			margin-top:8%;
			margin-left:39%;
			background-color:red;
			box-shadow:5px 5px 5px #0ef, -5px -5px 0px orange;
		}
		
</style>

</head>
<body>
<fieldset>
<h2>Update Profile</h2>
<form action="UpdateProfileController" method="post">
<table>
   <tr>
   		<th><label for="username">Username:</label></th>
   		<td><input type="text" id="username" name="username" value="<%= session.getAttribute("username") %>" readonly><br><br></td>
   </tr>
   <tr>
   		<th><label for="email">Email:</label></th>
   		<td><input type="email" id="email" name="email" value="<%= session.getAttribute("email") %>" readonly><br><br></td>
   </tr>
   <tr>
   		<th><label for="phone">Phone Number:</label></th>
   		<td><input type="text" id="phone" name="phone" value="<%= session.getAttribute("phone") %>" readonly><br><br>
   		</td>
   </tr>
   <tr>
   		<th><label for="address">Address:</label></th>
   		<td> <textarea id="address" name="address" readonly><%= session.getAttribute("address") %></textarea><br><br></td>
   </tr>
   <tr>
   		<th><label for="password">New Password:</label></th>
   		<td><input type="password" id="password" name="password" required><br><br></td>
   </tr>
   <tr>
   		<th><label for="confirmPassword">Confirm Password:</label></th>
   		<td><input type="password" id="confirmPassword" name="confirmPassword" required><br><br></td>
   </tr>
   <tr>
   		<th></th>
   		<td> <button type="submit"><strong>Update</strong></button></td>
   </tr> 
</table>
</form>
</fieldset>

</body>
</html>