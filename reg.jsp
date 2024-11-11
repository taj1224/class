<html>
<head>
  <title>Registration</title>
</head>
<body>
  <h2>Registration</h2>
  <p>Username: <%= request.getParameter("username") %></p>
  <p>Email: <%= request.getParameter("email") %></p>
  <p>Password: <%= request.getParameter("password") %></p>
</body>
</html>
