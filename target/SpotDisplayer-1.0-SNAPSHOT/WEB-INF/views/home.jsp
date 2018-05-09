<%--
  Created by IntelliJ IDEA.
  User: rafau
  Date: 01.05.18
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Please chose files</h1>

<br>

<form method="POST" action="/files" enctype="multipart/form-data">
    File to upload: <input type="file" name="file" accept=".zip,.rar" multiple><br /><br />
    <input type="submit" value="Upload"> Press here to upload the file!
</form>
</body>
</html>
