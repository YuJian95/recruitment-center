<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/4
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加新闻</title>
    <link rel="stylesheet" href="../css/all.css">
</head>
<body>
<form method="post" action="/rc/RcNewsAction.action!add.action">
    <table class="mytablel" align="center" cellspacing="0" cellpadding="4">
        <tr>
            <th>标题</th>
            <td><input type="text" name="news.newsTitile"/></td>
        </tr>
        <tr>
            <th>内容</th>
            <td><textarea name="news.newsContent" rows="6" cols="55"></textarea></td>
        </tr>
    </table>
    <p align="center">
        <input type="submit" value="提交">
        <input type="button" value="取消" onclick="window.history.back();">
    </p>
</form>
</body>
</html>
