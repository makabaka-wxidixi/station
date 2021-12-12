<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2021/12/12
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="css/hello_jsp.css" type="text/css" rel="stylesheet">
</head>
<body>
<%--<h1 align="center">hello Jsp</h1>--%>
<table align="center">
    <tr>
    <th>序号</th>
    <th>系列</th>
    <th>型号</th>
    <th>价格</th>
    <th>品牌</th>
    <th width="200px">品牌描述</th>
    <th>操作</th>
    </tr>
    <c:forEach items="${phoneList}" var="good" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${good.series}</td>
            <td>${good.model}</td>
            <td>${good.price}</td>
            <td>${good.brand}</td>
            <td>${good.describe}</td>
            <td><a href="#">添加</a>/<a href="#">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
