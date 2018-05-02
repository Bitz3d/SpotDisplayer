<%--
  Created by IntelliJ IDEA.
  User: rafau
  Date: 02.05.18
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration Page</title>
    <style type="text/css">

        .error {

            color: red;
            background-color: black;

        }

    </style>

</head>
<body>
<%--@elvariable id="book" type="pl.rafalab.model.User"--%>

<form:form method="post" modelAttribute="user">

    <label>User Name:<br> <form:input path="userName" name="userName"/> </label><form:errors path="userName"
                                                                                             cssClass="error"/><br>
    <label>Email:<br> <form:input path="email" name="email"/> </label><form:errors path="email"
                                                                                             cssClass="error"/><br>
    <label>Password:<br> <form:input path="password" name="password" type="password"/></label><form:errors path="password"
                                                                                           cssClass="error"/><br>
    <label>Confirm Password:<br> <form:input path="confirmPassword" name="confirmPassword" type="password"/></label><form:errors
        path="confirmPassword"
        cssClass="error"/><br>


    <input type="submit" value="Send"/>

</form:form>




</body>
</html>
