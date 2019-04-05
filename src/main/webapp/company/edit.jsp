<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  com: max
  Date: 2019/4/2
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>企业信息修改</title>
    <link rel="stylesheet" href="../css/all.css" type="text/css"/>
</head>
<body>
<form method="post" action="RcCompanyAction!edit.action">
    <table class="mytable2" align="center" cellspacing="0" cellpadding="2">
        <tr>
            <th>用户名</th>
            <td><input type="text" name="company.userName" size="18" value="${company.userName}"></td>
        </tr>
        <tr>
            <th>密码</th>
            <td><input type="password" name="company.userPwd" size="18"></td>
        </tr>
        <tr>
            <th>确认密码</th>
            <td><input type="password" name="userPwd1" size="18"></td>
        </tr>
        <tr>
            <th>公司名称</th>
            <td><input type="text" name="company.comName" size="31" value="${company.comName}"></td>
        </tr>
        <tr>
            <th>公司类型</th>
            <td><s:select name="company.comType" list="{'国有企业','独资企业','合资企业','股份制企业','私营企业','其他类型'}"
                          value="#session.company.comType"/></td>
        </tr>

        <tr>
            <th>创办时间</th>
            <td><input type="text" name="company.comCreateTime" size="70" value="company.comCreateTime"></td>
        </tr>
        <tr>
            <th>联系人</th>
            <td><input type="text" name="company.comContactor" size="70" value="company.comContactor"></td>
        </tr>
        <tr>
            <th>员工人数</th>
            <td><input type="text" name="company.comEmpNum" size="36" value="company.comEmpNum"></td>
        </tr>

        <tr>
            <th>电话</th>
            <td><input type="text" name="company.comTel" size="18" value="company.comTel"></td>
        </tr>
        <tr>
            <th>传真</th>
            <td><input type="text" name="company.comFex" size="18" value="company.comFex"></td>
        </tr>
        <tr>
            <th>地址</th>
            <td><input type="text" name="company.comAddr" size="44" value="company.comAddr"></td>
        </tr>

        <tr>
            <th>邮编</th>
            <td><input type="text" name="company.comZip" size="20" value="company.comZip"></td>
        </tr>
        <tr>
            <th>公司主页</th>
            <td><input type="text" name="company.comHomepage" size="70" value="company.comHomepage"></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><input type="text" name="company.comEmail" size="53" value="company.comEmail"></td>
        </tr>
        <tr>
            <th>简介</th>
            <td><textarea rows="6" name="company.comDesc" cols="55">${company.comDesc}</textarea></td>
        </tr>
    </table>
    <p align="center">
        <input type="submit" value="提交">
        <input type="button" value="取消" onclick="window.history.back();">
    </p>
</form>

</body>
</html>
