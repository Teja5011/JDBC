<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Profile</title>
<style>
		body
		{
		  background-color:grey;
		}
		fieldset
		{
			width:340px;
			height:290px;
			margin-top:10%;
			margin-left:39%;
			background-color:wheat;
			box-shadow:5px 5px 5px #0ef, -5px -5px 0px orange;
		}
		button
		{
			display:flex;
			box-shadow:5px 5px 5px yellow, -3px -3px 0px yellow;
		}
		button:hover
		{
		  background-color:#0ef;
		}
		
</style>

</head>
<body>
<fieldset>

<h2>Delete Profile</h2>
<p>Are you sure you want to delete your profile? This action cannot be undone.</p>

<form action="DeleteProfileController" method="post">
    <label for="reason">Reason for Deletion (optional):</label>
    <textarea id="reason" name="reason" style="width:80%;height:50px;"></textarea><br><br>
    <center>
    		<button type="submit" style="margin-right:31px;">Yes, Delete</button>
    </center>
</form>
</fieldset>

</body>
</html>