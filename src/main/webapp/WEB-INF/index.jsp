<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 12/17/2021
  Time: 7:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%--The time interval in which two systems(i.e. the client and the server) communicate with each other can be termed as a session.--%>
<%--In simpler terms, a session is a state consisting of several requests and response between the client and the server.--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Boot First App</title>
</head>
<body>
<form action="servletOne" method="POST">
Username:<input type="text" name="user">
Password:<input type="password" name="pass">
    <input type="submit" value="Login">
</form>
<form action="sessionM" method="POST">
    Name:<input type="text" name="name">
    Grade:<input type="text" name="grad">
    Teacher:<input type="text" name="teach">
    <input type="submit" value="Save Session">
</form>
<form action="sessionM"method="get">
    <input type="submit" value="Invalidate">
</form>
<form method="post" action="hoo">
   Name: <input type="text" name="user">
   Pass: <input type="password" name="pass">
    <input type="submit" value="Login With Cookie">
</form>
<form method="post" action="jac">
    <input type="submit" value="Delete Cookie">
</form>
</body>
</html>
