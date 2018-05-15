<%--
  Created by IntelliJ IDEA.
  User: rafau
  Date: 15.05.18
  Time: 08:53
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
<a href="/files"><button>Add Next Robot</button></a>
<a href="center"><button>Back to center</button></a>
<a href="generateTestModel"><button>Generate model</button></a>
<table>

    <tr>

        <th>Test Spot Name</th>
        <th>X</th>
        <th>Y</th>
        <th>Z</th>
        <th>Robot</th>
        <th>Line</th>

    </tr>

    <%--@elvariable id="book" type="pl.rafalab.model.TestSpotPoint"--%>

    <c:forEach items="${testSpotPoint}" var="TestSpot">

        <tr>
            <td>${TestSpot.getSpotName()}</td>
            <td>${TestSpot.getPointX()}</td>
            <td>${TestSpot.getPointY()}</td>
            <td>${TestSpot.getPointZ()}</td>
            <td>${TestSpot.getRobName()}</td>
            <td>${TestSpot.getLine()}</td>
        </tr>

    </c:forEach>

</table>



</body>
</html>
