<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/2
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>show</title>
</head>
<body>
<center>
    <h1 align="center">${news.newsTitle}</h1>
    <p align="center">${news.newsPostTime}</p>
    <hr/>
</center>
<p>${news.newsContent}</p>
<p align="center">
    <input type="button" value="返回" onclick="window.history.back();">
</p>
</body>
</html>
