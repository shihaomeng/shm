<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/7/10
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet"
      href="<%=request.getContextPath()%>/effect/css/index.css" type="text/css"></link>
<script type="text/javascript"
        src="<%=request.getContextPath()%>/effect/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript"
        src="<%=request.getContextPath()%>/effect/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
    function toAdd() {
        location.href="toAdd";
    }
</script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/list" method="post">
    <input type="text" name="mohu"><input type="submit" value="搜索">
</form>
<table>
    <tr>
        <td><input type="checkbox" id="qx" value="全选"></td>
        <td>编号</td>
        <td>姓名</td>
        <td>手机</td>
        <td>爱好小组</td>
        <td>操作
            <input type="button" value="添加" onclick="toAdd()"></td>
    </tr>
    <c:forEach items="${list}" var="li">
            <tr>
                <td><input type="checkbox"></td>
                <td>${li.id}</td>
                <td>${li.name}</td>
                <td>${li.phone}</td>
                <td>
            <c:forEach items="${li.utypeList}" var="o" >
                ${o.tname}&nbsp;&nbsp;
            </c:forEach>
                </td>
            </tr>
    </c:forEach>
</table>
</body>
</html>
