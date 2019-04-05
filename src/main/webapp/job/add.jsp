<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 2019/4/4
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加职位</title>
    <link rel="stylesheet" href="../css/all.css">
</head>
<body>
<br/>
<form method="post" action="/rc/RcJobAction!add.action">
    <table class="mytablel" align="center" cellpadding="4" cellspacing="0">
        <tr>
            <th>职位名称</th>
            <td><input type="text" name="job.jobTitle"></td>
        </tr>
        <tr>
            <th>职业类别</th>
            <td><select size="1" name="job.jobType">
                <option value="计算机">计算机</option>
                <option value="会计">会计</option>
                <option value="金融">金融</option>
            </select></td>
        </tr>
        <tr>
            <th>学历要求</th>
            <td><select size="1" name="job.jobEducation">
                <option value="无要求">无要求</option>
                <option value="本科">本科</option>
                <option value="大专">大专</option>
                <option value="硕士">硕士</option>
                <option value="博士">博士</option>
                <option value="高中">高中</option>
                <option value="中职">中职</option>
            </select></td>
        </tr>
        <tr>
            <th>性别要求</th>
            <td><select size="1" name="job.jobSex">
                <option value="无要求">无要求</option>
                <option value="男">男</option>
                <option value="女">女</option>
            </select></td>
        </tr>
        <tr>
            <th>年龄要求</th>
            <td><select size="1" name="job.jobAge">
                <option value="18岁以上">18岁以上</option>
                <option value="18到25岁">18到25岁</option>
                <option value="25到40岁">25到40岁</option>
            </select></td>
        </tr>
        <tr>
            <th>工作年限</th>
            <td><select size="1" name="job.jobWorkTime">
                <option value="无要求">无要求</option>
                <option value="一年">一年</option>
                <option value="一年到三年">一到三年</option>
                <option value="三年以上">三年以上</option>
            </select></td>
        </tr>
        <tr>
            <th>招聘人数</th>
            <td><input type="text" name="job.jobNum"></td>
        </tr>
        <tr>
            <th>工作地区</th>
            <td><input type="text" name="job.jobWorkPlace"></td>
        </tr>
        <tr>
            <th>截止时间</th>
            <td><input type="text" name="job.jobEndTime"></td>
        </tr>
        <tr>
            <th>具体要求</th>
            <td><textarea rows="6" name="job.jobComment" cols="55"></textarea></td>
        </tr>
    </table>
    <p align="center">
        <input type="submit" value="提交">
        <input type="button" value="取消" onclick="window.history.back();">
    </p>
</form>

</body>
</html>
