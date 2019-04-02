<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>

  <form action="register" method="post">
  username:
  <input type="text" name="username">   <br>
  password: 
  <input type="text" name="username">     <br>
  
  <input type="checkbox" name="sex" value="male"> male  <br>
  <input type="checkbox" name="sex" value="female"> female  <br>
  <input type="submit" value="Register"/>
  
  </form>


</body>
</html>