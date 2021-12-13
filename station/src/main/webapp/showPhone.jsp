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
    <link href="css/showPhone.css" type="text/css" rel="stylesheet">
</head>
<body>
<div class="handle"><input id="add" type="button" value="上架"></div>
<br/>
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
            <td><a href="/station/showSelectedPhoneData?id=${good.id}">修改</a>/<a id="delete"
                                                                                 href="javascript:deleteBtn(123)">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<script type="text/javascript"></script>
<script>
    let addButton = document.getElementById("add");
    addButton.onclick = function () {
        location.href = "/station/addPhone.jsp";
    }

    let deleteA = document.getElementById("delete");
    deleteA.onclick = function () {
        confirm("确定要删除吗?");
        return false;
        // console.log(event.target);
        // return false;
    }

    function deleteBtn(productName){
        alert(productName);
        location.href = "...";
    }
</script>

</body>
</html>
