<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Profile</title>
<style>
		body
		{
		  background:radial-gradient(lime,yellow);
		}
		fieldset
		{
			width:200px;
			height:490px;
			margin-top:6%;
			margin-left:39%;
			background-color:red;
			box-shadow:5px 5px 5px #0ef, -5px -5px 0px orange;
		}
		h1
		{
		 color:white;
		 
		}
		
</style>
</head>
<body>
<fieldset>
<center>
<h1>Edit Profile</h1>
</center>
<form action="UpdateProfileController" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" value="<%= session.getAttribute("username") %>" required><br><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" value="<%= session.getAttribute("email") %>" required><br><br>
    <label for="phone">Phone Number:</label>
    <input type="text" id="phone" name="phone" value="<%= session.getAttribute("phone") %>" required><br><br>
    <label for="address">Address:</label>
    <textarea id="address" name="address" rows="3" required><%= session.getAttribute("address") %></textarea><br><br>
    <label for="dob">Date of Birth:</label>
    <input type="date" id="dob" name="dob" value="<%= session.getAttribute("dob") %>" required><br><br>
    <label for="balance">Account Balance:</label>
    <input type="text" id="balance" name="balance" value="<%= session.getAttribute("balance") %>" readonly><br><br>
    <button type="submit">Save Changes</button>
</form>
</fieldset>

</body>
</html>