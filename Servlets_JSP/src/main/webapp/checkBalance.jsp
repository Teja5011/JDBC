<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check Balance</title>
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
</style>

</head>
<body>

<fieldset>
<h2>Check Balance</h2>
<p><strong>Username:</strong> <%= session.getAttribute("username") %></p>
<p><strong>Email:</strong> <%= session.getAttribute("email") %></p>
<p><strong>Account Number:</strong> <%= session.getAttribute("accountNumber") %></p>
<p><strong>Account Type:</strong> <%= session.getAttribute("accountType") %></p>
<p><strong>Current Balance:</strong> ₹<%= session.getAttribute("balance") %></p>
<p><strong>Last Transaction:</strong> ₹<%= session.getAttribute("lastTransaction") %> on <%= session.getAttribute("lastTransactionDate") %></p>
<p><strong>Branch:</strong> <%= session.getAttribute("branch") %></p>
</fieldset>

</body>
</html>