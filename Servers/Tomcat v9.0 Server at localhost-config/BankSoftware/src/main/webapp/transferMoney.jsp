<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Transfer Money</title>
<style>
		body
		{
		  display:flex;
		  background:linear-gradient(75deg,lime,lime,yellow,yellow,yellow,lime,lime,yellow,yellow,yellow);
		  repeat:no-repeat;
		}
		fieldset
		{
			width:340px;
			height:400px;
			margin-top:10%;
			margin-left:39%;
			background-color:wheat;
			box-shadow:5px 5px 5px #0ef, -5px -5px 0px orange;
		}
		button
		{
			width:100px;
			box-shadow:4px 4px 4px white,-3px -3px 0px white;
		}
		button:hover
		{
			color:black;
			background-color:red;
		
		}
</style>
</head>
<body>
<fieldset>
<h2>Transfer Money</h2>
<p><strong>Sender Details:</strong></p>
<ul>
    <li><strong>Username:</strong> <%= session.getAttribute("username") %></li>
    <li><strong>Account Number:</strong> <%= session.getAttribute("accountNumber") %></li>
    <li><strong>Current Balance:</strong> ₹<%= session.getAttribute("balance") %></li>
</ul>
<form action="TransferMoneyController" method="post">
<table>
      <tr>
      	 <th><label for="account">Recipient Account:</label></th>
      	 <td><input type="text" id="account" name="account" required><br><br></td>
      </tr>
      <tr>
      	 <th><label for="recipientName">Recipient Name:</label></th>
      	 <td><input type="text" id="recipientName" name="recipientName" required><br><br></td>
      </tr>
      <tr>
      	 <th><label for="amount">Amount:</label></th>
      	 <td><input type="number" id="amount" name="amount" required><br><br></td>
      </tr>
      <tr>
      	 <th><label for="transferReason">Reason for Transfer:</label></th>
      	 <td> <input type="text" id="transferReason" name="transferReason" required><br><br></td>
      </tr>
      <br>
      <tr>
      	 <th></th>
      	 <td><button type="submit"><strong>Transfer</strong></button></td>
      </tr>
      
</table>
</form>
</fieldset>

</body>
</html>