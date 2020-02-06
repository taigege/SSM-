<%--
  Created by IntelliJ IDEA.
  User: Qing
  Date: 2020/2/6
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">测试</a>
    <br/>

    <h3>test</h3>

    <form action="account/save" method="post">
        姓名：<input type="text" name="name"/><br/>
        金额：<input type="text" name="money"/><br/>
        <input type="submit" value="保存" /><br/>
    </form>
</body>
</html>
