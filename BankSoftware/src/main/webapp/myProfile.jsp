<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Profile</title>

<style>
		body
		{
		  background:radial-gradient(orange,orangered);
		}
		fieldset
		{
			width:250px;
			height:350px;
			margin-top:10%;
			margin-left:42%;
			background-color:whitesmoke;
			box-shadow:5px 5px 5px #0ef, -5px -5px 0px #0ef;
		}
		h1
		{
			color:#0ef;
			background-color:red;	
		}
		
</style>

</head>

<body>
<fieldset>
 	<h1>Welcome, ${user.name != null ? user.name : "User"}</h1> 
    <p><strong>Email:</strong> ${user.email != null ? user.email : "Not available"}</p> 
    <p><strong>Account Balance:</strong> ₹${user.balance != null ? user.balance : "Not available"}</p> 
    <p><strong>Full Name:</strong> ${user.fullName != null ? user.fullName : "Not available"}</p> 
    <p><strong>Phone Number:</strong> ${user.phoneNumber != null ? user.phoneNumber : "Not available"}</p>
    <p><strong>Address:</strong> ${user.address != null ? user.address : "Not available"}</p> 
    <p><strong>Account Type:</strong> ${user.accountType != null ? user.accountType : "Not available"}</p> 
    <p><strong>Last Login:</strong> ${user.lastLogin != null ? user.lastLogin : "Not available"}</p>

    

 
    <form action="OperationsController" method="post">
        <button type="submit" name="operation" value="editprofile">Edit Profile</button>
        <button type="submit" name="operation" value="updateProfile">Update Profile</button>
    </form>
</fieldset>
</body>
</html>