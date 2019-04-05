<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/2
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改密码</title>
    <link rel="stylesheet" href="../css/all.css" type="text/css"/>
</head>
<body>
<form method="post" action="RcAdminAction.action!edit.action" target="content">
    <table class="mytable2" align="center" cellspacing="0" cellpadding="2">
        <tr>
            <th>原密码</th>
            <td><input type="password" name="userPwd" size="18"></td>
        </tr>
        <tr>
            <th>新密码</th>
            <td><input type="password" name="admin.userPwd" size="18"></td>
        </tr>
        <tr>
            <th>确认密码</th>
            <td><input type="password" name="admin.userPwd1" size="18"></td>
        </tr>
    </table>
    <p align="center">
        <input type="submit" value="提交">
        <input type="button" value="取消" onclick="window.history.back();">
    </p>
</form>
</body>
</html>
