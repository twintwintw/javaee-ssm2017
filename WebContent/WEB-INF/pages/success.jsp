<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	</head>
	Success
	<img  src="resource/img/a1.jpg" height="60px" width="300px">
	 
	
	<br>
	
	username:${user.username }
	<br>
	password:${user.password }
	<br>
	
	name:<%=request.getAttribute("name") %>
	
</html>
