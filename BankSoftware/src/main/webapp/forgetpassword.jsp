<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
    body {
      font-family: Arial, sans-serif;
      background:radial-gradient(skyblue,red);
      margin: 0;
      padding: 0;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }
    .container {
      background: #fff;
      padding: 20px 30px;
      border-radius: 8px;
      box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
      width: 300px;
      text-align: center;
    }
    h2 {
      margin-bottom: 20px;
      color: #333;
    }
    input[type="email"] {
      width: 100%;
      padding: 10px;
      margin-bottom: 15px;
      border: 1px solid #ccc;
      border-radius: 5px;
      font-size: 14px;
    }
    button {
      background-color: #007bff;
      color: white;
      border: none;
      padding: 10px 15px;
      border-radius: 5px;
      cursor: pointer;
      font-size: 14px;
      width: 100%;
    }
    button:hover {
      background-color: #0056b3;
    }
    .message {
      margin-top: 15px;
      font-size: 14px;
      color: #28a745;
      display: none;
    }
     
  </style>
</head>
<body>

<body>
<form action="forget password">
  <div class="container">
    <h2>
    	  <span style="color: blue;">F</span>
   		  <span style="color: red;">o</span>
    	  <span style="color: green;">r</span>
 	      <span style="color: orange;">g</span>
   		  <span style="color: purple;">e</span>
   		  <span style="color: red;">t</span>
   		  
   		  <span style="color: blue;">P</span>
   		  <span style="color: red;">a</span>
    	  <span style="color: green;">s</span>
 	      <span style="color: orange;">s</span>
   		  <span style="color: purple;">w</span>
   		  <span style="color: yellow;">o</span>
   		  <span style="color: blue;">r</span>
   		  <span style="color: red;">d</span>
    	  
   		
    </h2>
    <form id="forgotPasswordForm">
      <input type="email" id="email" placeholder="Enter your email" required>
      <button type="submit">Reset Password</button>
      <p class="message" id="message">Password reset link sent to your email!</p>
    </form>
  </div>

  <script>
    document.getElementById('forgotPasswordForm').addEventListener('submit', function(event) {
      event.preventDefault();
      const email = document.getElementById('email').value;

      // Simple client-side validation
      if (!email) {
        alert('Please enter your email.');
        return;
      }

      // Simulate an API call (you would replace this with an actual fetch/AJAX request)
      setTimeout(() => {
        document.getElementById('message').style.display = 'block';
        document.getElementById('email').value = ''; // Clear the email field
      }, 1000);
    });
  </script>

</form>
</body>
</html>