<%--
  Created by IntelliJ IDEA.
  User: rafau
  Date: 01.05.18
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Lists of Spots</title>
    <style>

        table, td, th, tr {

            border: 1px solid black;

            border-collapse: collapse;

        }

        th {

            background-color: #ccc;

        }

    </style>
</head>
<body>


<table>

    <tr>

        <th>F54 Spot Name</th>
        <th>X</th>
        <th>Y</th>
        <th>Z</th>

    </tr>

    <%--@elvariable id="book" type="pl.rafalab.model.SpotPointF54"--%>

    <c:forEach items="${f54SpotPoints}" var="f54Spot">

        <tr>
            <td>${f54Spot.getSpotName()}</td>
            <td>${f54Spot.getPointX()}</td>
            <td>${f54Spot.getPointY()}</td>
            <td>${f54Spot.getPointZ()}</td>
        </tr>

    </c:forEach>

</table>
<br>

<table>

    <tr>

        <th>F55 Spot Name</th>
        <th>X</th>
        <th>Y</th>
        <th>Z</th>

    </tr>

    <%--@elvariable id="book" type="pl.rafalab.model.SpotPointF55"--%>

    <c:forEach items="${f55SpotPoints}" var="f55Spot">

        <tr>
            <td>${f55Spot.getSpotName()}</td>
            <td>${f55Spot.getPointX()}</td>
            <td>${f55Spot.getPointY()}</td>
            <td>${f55Spot.getPointZ()}</td>
        </tr>

    </c:forEach>

</table>
<br>


<table>

    <tr>

        <th>F56 Spot Name</th>
        <th>X</th>
        <th>Y</th>
        <th>Z</th>

    </tr>

    <%--@elvariable id="book" type="pl.rafalab.model.SpotPointF56"--%>

    <c:forEach items="${f55SpotPoints}" var="f55Spot">

        <tr>
            <td>${f55Spot.getSpotName()}</td>
            <td>${f55Spot.getPointX()}</td>
            <td>${f55Spot.getPointY()}</td>
            <td>${f55Spot.getPointZ()}</td>
        </tr>

    </c:forEach>

</table>



</body>
</html>
