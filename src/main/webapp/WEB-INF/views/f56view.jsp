<%--
  Created by IntelliJ IDEA.
  User: rafau
  Date: 09.05.18
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
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
<a href="/"><button>Add Next Robot</button></a>
<a href="center"><button>Back to center</button></a>
<table>

    <tr>

        <th>F56 Spot Name</th>
        <th>X</th>
        <th>Y</th>
        <th>Z</th>
        <th>Robot</th>
        <th>Line</th>

    </tr>

    <%--@elvariable id="book" type="pl.rafalab.model.SpotPointF56"--%>

    <c:forEach items="${f56SpotPoints}" var="f56Spot">

        <tr>
            <td>${f56Spot.getSpotName()}</td>
            <td>${f56Spot.getPointX()}</td>
            <td>${f56Spot.getPointY()}</td>
            <td>${f56Spot.getPointZ()}</td>
            <td>${f56Spot.getRobName()}</td>
            <td>${f56Spot.getLine()}</td>
        </tr>

    </c:forEach>

</table>



</body>
</html>
