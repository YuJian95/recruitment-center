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
    <title>个人注册</title>
    <link rel="stylesheet" href="../css/all.css" type="text/css"/>
</head>
<body>
<form method="post" action="RcPersonAction!add.action" enctype="multipart/form-data">
    <table class="mytable2" align="center" cellspacing="0" cellpadding="2">
        <tr>
            <th>用户名</th>
            <td><input type="text" name="person.userName" size="18"/></td>
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
            <td><input type="text" name="person.perRealName" size="31"></td>
        </tr>
        <tr>
            <th>性别</th>
            <td><input type="radio" checked name="person.perSex" value="男">男
                <input type="radio" name="person.perSex" value="女">女
            </td>
        </tr>
        <tr>
            <th>出生日期</th>
            <td><input type="text" name="person.perBirthDate" size="70"></td>
        </tr>
        <tr>
            <th>户口所在地</th>
            <td><input type="text" name="person.perRegResidence" size="70"></td>
        </tr>
        <tr>
            <th>身份证号码</th>
            <td><input type="text" name="person.perIDCard" size="36"></td>
        </tr>
        <tr>
            <th>民族</th>
            <td><select size="1" name="person.perNature">
                <option selected value="汉族">汉族</option>
                <option value="满族">满族</option>
                <option value="回族">回族</option>
                <option value="维吾尔族">维吾尔族</option>
                <option value="其他少数民族">其他少数民族</option>
            </select></td>
        </tr>
        <tr>
            <th>婚姻状况</th>
            <td><select size="1" name="person.perMarried">
                <option selected value="未婚">未婚</option>
                <option value="已婚">已婚</option>
                <option value="离异">离异</option>
            </select></td>
        </tr>
        <tr>
            <th>教育程度</th>
            <td>
                <select size="1" name="person.perEducation">
                    <option selected value="本科">本科</option>
                    <option value="硕士">硕士</option>
                    <option value="博士">博士</option>
                    <option value="专科">专科</option>
                    <option value="高中">高中</option>
                    <option value="中专">中专</option>
                </select>
            </td>
        </tr>
        <tr>
            <th>毕业学校</th>
            <td><input type="text" name="person.perSchool" size="44"></td>
        </tr>
        <tr>
            <th>联系电话</th>
            <td><input type="text" name="person.perTel" size="20"></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><input type="text" name="person.perEmail" size="53"></td>
        </tr>
        <tr>
            <th>联系地址</th>
            <td><input type="text" name="person.perAddr" size="70"></td>
        </tr>
        <tr>
            <th>照片</th>
            <td><input type="file" name="upload" size="50"></td>
        </tr>
        <tr>
            <th>简历</th>
            <td><textarea rows="6" name="person.perResume" cols="55"></textarea></td>
        </tr>
        <tr>
            <th>求职意向</th>
            <td><input type="text" name="person.perJobTarget" size="70"></td>
        </tr>
    </table>
    <p align="center">
        <input type="submit" value="提交">
        <input type="button" value="取消" onclick="window.history.back();">
    </p>
</form>

</body>
</html>
