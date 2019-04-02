<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Mybatis+Spring MVC集成</title>
	
  <body>
    This is my JSP page. <br>
    
    <a href="user">user</a>
    
    Login
    <form action="login.do" method="post">
    username:<input type="text" name="username">
    password:<input type="password" name="password">
    <input type="submit" value="Login">
    </form>
    
    <br>
    
    <a href="a">a</a>
    
    <br>
    <a href="register">register</a>
    <br>

    <a href="testEL">testEL</a>
    
    <p>Test.....</p>
    <form action="b" method="post">
    username:<input type="text" name="username">
    password:<input type="password" name="password">
    <input type="submit" value="Login">
    </form>
    
  </body>
</html>
