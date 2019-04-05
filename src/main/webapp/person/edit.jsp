<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/2
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>个人修改</title>
    <link rel="stylesheet" href="../css/all.css" type="text/css"/>
</head>
<body>
<form method="post" action="RcPersonAction!edit.action" target="content">
    <input type="hidden" name="person.userId" value="${user.userId}">
    <table class="mytable2" align="center" cellspacing="0" cellpadding="2">
        <tr>
            <th>用户名</th>
            <td><input type="text" name="person.userName" size="18" value="${person.userName}"/></td>
        </tr>
        <tr>
            <th>密码</th>
            <td><input type="password" name="person.userPwd" size="18"></td>
        </tr>
        <tr>
            <th>确认密码</th>
            <td><input type="password" name="userPwd1" size="18"></td>
        </tr>
        <tr>
            <th>真实姓名</th>
            <td><input type="text" name="person.perRealName" size="31" value="${person.perRealName}"></td>
        </tr>
        <tr>
            <th>性别</th>
            <td><s:radio name="person.perSex" list="{'男','女'}" value="#session.user.perSex"/>
            </td>
        </tr>
        <tr>
            <th>出生日期</th>
            <td><input type="text" name="person.perBirthDate" size="70" value="${user.perBirthDate}"></td>
        </tr>
        <tr>
            <th>户口所在地</th>
            <td><input type="text" name="person.perRegResidence" size="70" value="${user.perRegResidence}"></td>
        </tr>
        <tr>
            <th>身份证号码</th>
            <td><input type="text" name="person.perIDCard" size="36" value="${user.perIDCard}"></td>
        </tr>
        <tr>
            <th>民族</th>
            <td><s:select name="person.perNature" list="{'汉族','满族','回族','维吾尔族','其他少数民族'}"
                          value="#session.user.perNature"/></td>
        </tr>
        <tr>
            <th>婚姻状况</th>
            <td><s:select name="person.perMarried" list="{'未婚','已婚'}" value="#session.user.perMarried"/></td>
        </tr>
        <tr>
            <th>教育程度</th>
            <td>
                <s:select name="person.perEducation" list="{'本科','硕士','博士','专科','高中','中专'}"
                          value="#session.user.perEducation"/>
            </td>
        </tr>
        <tr>
            <th>毕业学校</th>
            <td><input type="text" name="person.perSchool" size="44" value="${user.perSchool}"></td>
        </tr>
        <tr>
            <th>联系电话</th>
            <td><input type="text" name="person.perTel" size="20" value="${user.perTel}"></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><input type="text" name="person.perEmail" size="53" value="${user.perEmail}"></td>
        </tr>
        <tr>
            <th>联系地址</th>
            <td><input type="text" name="person.perAddr" size="70" value="${user.perAddr}"></td>
        <tr>
            <th>简历</th>
            <td><textarea rows="6" name="person.perResume" cols="55" value="${user.perResume}"></textarea></td>
        </tr>
        <tr>
            <th>求职意向</th>
            <td><input type="text" name="person.perJobTarget" size="70" value="${user.perJobTarget}"></td>
        </tr>
    </table>
    <p align="center">
        <input type="submit" value="提交">
        <input type="button" value="取消" onclick="window.history.back();">
    </p>
</form>

</body>
</html>
