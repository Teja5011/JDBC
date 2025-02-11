<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
    body {  
        font-family: Arial, sans-serif;
        background: radial-gradient(skyblue, red);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .container {
        background-color: #fff;
        padding: 20px 30px;
        border-radius: 10px;
        box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        width: 100%;
        max-width: 400px;
    }

    .container h2 {
        margin-bottom: 20px;
        color: #333;
    }

    .form-group {
        margin-bottom: 15px;
    }

    .form-group label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
    }

    .form-group input {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 16px;
    }

    .form-group input:focus {
        border-color: #007BFF;
        outline: none;
    }

    .btn {
        width: 100%;
        padding: 10px;
        background-color: #007BFF;
        border: none;
        border-radius: 5px;
        color: white;
        font-size: 16px;
        cursor: pointer;
    }

    .btn:hover {
        background-color: #0056b3;
    }

    .toggle {
        text-align: center;
        margin-top: 15px;
    }

    .toggle a {
        color: #007BFF;
        text-decoration: none;
    }

    .toggle a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
    <div class="container">
    <center>
        <h1>
      	  <span style="color: red;">L</span>
   		  <span style="color: blue;">O</span>
    	  <span style="color: green;">G</span>
 	      <span style="color: orange;">I</span>
   		  <span style="color: purple;">N</span> 
       </h1>
    </center>
        <form action="LoginServlet" method="post">
            <div class="form-group">
                <label for="loginUsername">Username</label>
                <input type="text" id="loginUsername" name="username" placeholder="Enter your username" required>
            </div>
            <div class="form-group">
                <label for="loginPassword">Password</label>
                <input type="password" id="loginPassword" name="password" placeholder="Enter your password" required>
            </div>
            <button type="submit" class="btn">Login</button>
        </form>
        <div class="toggle">
            <p><a href="forgetpassword.jsp" name="forget password">Forget Password</a></p>
        </div>
        <div class="toggle">
            <p>Don't have an account? <a href="signup.jsp">Sign Up</a></p>
        </div>
    </div>
</body>
</html>
