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
<div style="text-align: center"><h1>${username}，欢迎您</h1></div>
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
            <td><input type="button" value="修改" onclick="updateBtn('${good.model}','${good.id}')">/<input type="button"
                                                                                                          value="删除"
                                                                                                          onclick="deleteBtn('${good.model}','${good.id}')"
                                                                                                          id="delete"/>
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

    function updateBtn(productName, productId) {
        if (confirm("确定要修改" + productName + "吗?")) {
            location.href = "/station/showSelectedPhoneData?id=" + productId;
        }
    }

    function deleteBtn(productName, id) {
        if (confirm("确定要删除" + productName + "吗?")) {
            location.href = "/station/deletePhone?id=" + id;
        }
    }
</script>

</body>
</html>
