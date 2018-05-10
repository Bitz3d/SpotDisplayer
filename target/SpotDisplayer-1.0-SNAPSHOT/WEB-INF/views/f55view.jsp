<%--
  Created by IntelliJ IDEA.
  User: rafau
  Date: 09.05.18
  Time: 10:53
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
<a href="generateF55Model"><button>Generate model</button></a>

<table>

    <tr>

        <th>F55 Spot Name</th>
        <th>X</th>
        <th>Y</th>
        <th>Z</th>
        <th>Robot</th>
        <th>Line</th>

    </tr>

    <%--@elvariable id="book" type="pl.rafalab.model.SpotPointF55"--%>

    <c:forEach items="${f55SpotPoints}" var="f55Spot">

        <tr>
            <td>${f55Spot.getSpotName()}</td>
            <td>${f55Spot.getPointX()}</td>
            <td>${f55Spot.getPointY()}</td>
            <td>${f55Spot.getPointZ()}</td>
            <td>${f55Spot.getRobName()}</td>
            <td>${f55Spot.getLine()}</td>
            <td><a href="F55ShowSpecificPoint/${f55Spot.getId()}"><button>Show point on model</button></a></td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
