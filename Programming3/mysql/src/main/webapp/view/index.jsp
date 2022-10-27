<%--
  Created by IntelliJ IDEA.
  User: Jingyu An
  Date: 2022-10-20
  Time: 9:49 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  </head>
  <body>
    <form action="welcome" method="post" onsubmit="return validate()">
      <label>Input name: </label>
      <input type="text" name="name"><br>
      <label>Input address: </label>
      <input type="text" name="address"><br>
      <input type="submit" value="Save">
    </form>
  </body>
</html>