<%--
  Created by IntelliJ IDEA.
  User: Jingyu An
  Date: 2022-10-21
  Time: 10:22 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>User Registration Form</title>
    <style type="text/css">

      body {
        display: flex;
        justify-content: center;
      }

      #main {
        margin: 0 auto;
        max-width: 50%;
      }

      button {
        padding: 10px;
        background-color: forestgreen;
        color: white;
        border: none;
      }

      .error {
        color: red;
        font-style: italic;
      }

      form {
        display: table;
      }

      form div {
        display: table-row;
      }

      label, input, span, select {
        display: table-cell;
        margin: 5px;
        text-align: left;
      }

      label {
        width: 200px;
        text-align: right;
      }

      input[type=text], input[type=password], input[type=number] {
        width: 300px;
        height: 25px;
        margin: 5px;
        border-radius: 5px;
        border: 1px solid gray;
      }

      false {
        margin: 0 auto;
      }

      form div div {
        display: table-cell;
      }

      .required {
        display: inline-table;
        color: red;
      }
    </style>
  </head>
  <body>
    <div id="main">
      <h1>USER REGISTRATION</h1>
      <p>Field marked <span class="required">*</span> are required.</p>

      <form:form action="register" method="post" modelAttribute="user">
        <div>
          <form:label path="email">Email<span class="required">*</span></form:label>
          <form:input path="email"/>
          <form:errors path="email" cssClass="error"/>
        </div>
        <div>
          <form:label path="password">Password<span class="required">*</span></form:label>
          <form:password path="password"/>
          <form:errors path="password" cssClass="error"/>
        </div>
        <div>
          <form:label path="rePassword">Retype Password<span class="required">*</span></form:label>
          <form:password path="rePassword"/>
          <form:errors path="rePassword" cssClass="error"/>
        </div>
        <div>
          <form:label path="firstName">First Name<span class="required">*</span></form:label>
          <form:input path="firstName"/>
          <form:errors path="firstName" cssClass="error"/>
        </div>
        <div>
          <form:label path="lastName">Last Name<span class="required">*</span></form:label>
          <form:input path="lastName"/>
          <form:errors path="lastName" cssClass="error"/>
        </div>
        <div>
          <form:label path="phone">Phone Number<span class="required">*</span></form:label>
          <form:input path="phone" type="number"/>
          <form:errors path="phone" cssClass="error"/>
        </div>
        <div>
          <form:label path="address">Address<span class="required">*</span></form:label>
          <form:input path="address"/>
          <form:errors path="address" cssClass="error"/>
        </div>
        <div>
          <form:label path="addressAdd"></form:label>
          <form:input path="addressAdd"/>
          <form:errors path="addressAdd" cssClass="error"/>
        </div>
        <div>
          <form:label path="town">Town<span class="required"></span></form:label>
          <form:input path="town"/>
          <form:errors path="town" cssClass="error"/>
        </div>
        <div>
          <form:label path="region">Region<span class="required">*</span></form:label>
          <form:input path="region"/>
          <form:errors path="region" cssClass="error"/>
        </div>
        <div>
          <form:label path="postcode">Postcode / Zip<span class="required">*</span></form:label>
          <form:input path="postcode"/>
          <form:errors path="postcode" cssClass="error"/>
        </div>
        <div>
          <form:label path="country">Country<span class="required">*</span></form:label>
          <form:input path="country"/>
          <form:errors path="country" cssClass="error"/>
        </div>
        <div>
          <div></div>
          <div><form:button>Register</form:button></div>
          <div></div>
        </div>
      </form:form>
      <p style="text-align: right">Jingyu An / 2228416</p>
    </div>
  </body>
</html>