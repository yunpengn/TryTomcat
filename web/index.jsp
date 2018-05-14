<%--
  Created by IntelliJ IDEA.
  User: yunpeng
  Date: 14/05/18
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <% out.println("Hello, Tomcat!\n"); %>
  <form action="LoginFormServlet" method="post">
    <label for="email">Email Address</label>
    <input type="email" name="email" id="email"><br>
    <label for="password">Password</label>
    <input type="password" name="password" id="password"><br>
    <input type="submit">
  </form>
  </body>
</html>
