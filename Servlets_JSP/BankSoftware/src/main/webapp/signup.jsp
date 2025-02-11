<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
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
    
     .letter-g { color: #4285F4; } /* Blue */
    .letter-o1 { color: #EA4335; } /* Red */
    .letter-o2 { color: #FBBC05; } /* Yellow */
    .letter-g2 { color: #4285F4; } /* Blue */
    .letter-l { color: #34A853; } /* Green */
    .letter-e { color: #EA4335; } /* Red */
</style>
</head>
<body>
    <div class="container">
        <h2>
        	<span class="letter-g">C</span>
            <span class="letter-o1">r</span>
            <span class="letter-o2">e</span>
            <span class="letter-g2">a</span>
            <span class="letter-l">t</span>
            <span class="letter-e">e</span>
            <span> </span>
            <span class="letter-g">N</span>
            <span class="letter-o1">e</span>
            <span class="letter-o2">w</span>
            <span> </span>
            <span class="letter-g">A</span>
            <span class="letter-o1">c</span>
            <span class="letter-o2">c</span>
            <span class="letter-g2">o</span>
            <span class="letter-l">u</span>
            <span class="letter-e">n</span>
            <span class="letter-o1">t</span>
        </h2>
        <form action="SignUp" method="post">
            <div class="form-group">
                <label for="signUpUsername">Username</label>
                <input type="text" id="signUpUsername" name="username" placeholder="Choose a username" required>
            </div>
            <div class="form-group">
                <label for="signUpEmail">Email</label>
                <input type="email" id="signUpEmail" name="email" placeholder="Enter your email" required>
            </div>
            <div class="form-group">
                <label for="signUpPassword">Password</label>
                <input type="password" id="signUpPassword" name="password" placeholder="Create a password" required>
            </div>
            <div class="form-group">
                <label for="address">phone</label>
                <input type="tel" id="phone" name="phone" placeholder="Enter ur phone" required>
            </div>
            <a href="login.jsp">
            <button type="submit" class="btn">Sign Up </button>
            </a>
        </form>
        <div class="toggle">
            <p>Already have an account? <a href="login.jsp">Sign In</a></p>
        </div>
    </div>
</body>
</html>
