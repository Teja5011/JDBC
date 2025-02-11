<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to bottom, #ff7e5f, #feb47b);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .dashboard {
            text-align: center;
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 700px;
        }
        .dashboard h1 {
            font-size: 24px;
            margin-bottom: 20px;
        }
        .dashboard button {
            background: #4caf50;
            color: #fff;
            border: none;
            padding: 10px;
            border-radius: 5px;
            margin: 10px;
            width: 100%;
            cursor: pointer;
        }
        .dashboard button:hover {
            background: #45a049;
        }
        .dashboard .danger {
            background: #f44336;
        }
        .dashboard .danger:hover {
            background: #e53935;
        }
    </style>
</head>
<body>
    <div class="dashboard">
        <h1>Welcome to Dashboard!</h1>
        <p>Manage and modify your account details!</p>
        <form action="OperationsController" method="post">
        	<button type="submit" name="operation" value="myProfile">My Profile</button>
        	<button type="submit" name="operation" value="newUserRegister">New User Register</button>
            <button type="submit" name="operation" value="editprofile">Edit Profile</button>
            <button type="submit" name="operation" value="updateProfile">Update Profile</button>
            <button type="submit" name="operation" value="deleteProfile" class="danger">Delete Profile</button>  
            <button type="submit" name="operation" value="checkBalance">Check Balance</button>
            <button type="submit" name="operation" value="transferMoney" class="danger">Transfer Money</button>
            <button type="submit" name="operation" value="logout">Logout</button>
        </form>
    </div>
        <div id="formContainer">
            <% String operation = request.getParameter("operation"); %>
            <% if (operation != null) { %>
                <% if (operation.equals("editprofile")) { %>
                    <%@ include file="editprofile.jsp" %>
                <% } else if (operation.equals("updateProfile")) { %>
                    <%@ include file="updateProfile.jsp" %>
                <% } else if (operation.equals("transferMoney")) { %>
                    <%@ include file="transferMoney.jsp" %>
                <% } else if (operation.equals("deleteProfile")) { %>
                    <%@ include file="deleteProfile.jsp" %>
                <% } else if (operation.equals("myProfile")) { %>
                    <%@ include file="myProfile.jsp" %>
                <% } else if (operation.equals("checkBalance")) { %>
                    <%@ include file="checkBalance.jsp" %>
                <% } else if (operation.equals("newUserRegister")) { %>
                    <%@ include file="newUserRegister.jsp" %>
                <% } %>
            <% } %>
        </div>
    </div>
    
</body>