<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/7/9
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet"
          href="<%=request.getContextPath()%>/effect/css/index.css" type="text/css"></link>
    <script type="text/javascript"
            src="<%=request.getContextPath()%>/effect/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript"
            src="<%=request.getContextPath()%>/effect/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
<table>
    <tr>
        <td>学生编号</td>
        <td>学生名称</td>
        <td>学生手机号</td>
        <td>兴趣小组</td>
    </tr>
    <c:forEach items="${list}" var="s">
    <tr>
        <td>${s.id}</td>
        <td>${s.name}</td>
        <td>${s.phone}</td>
        <td>${s.tname}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
