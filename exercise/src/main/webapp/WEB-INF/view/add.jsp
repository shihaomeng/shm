<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/7/10
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet"
      href="<%=request.getContextPath()%>/effect/css/index.css" type="text/css"></link>
<script type="text/javascript"
        src="<%=request.getContextPath()%>/effect/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript"
        src="<%=request.getContextPath()%>/effect/My97DatePicker/WdatePicker.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>姓名</td>
        <td><input type="text" name="name" value=""></td>
        <td>手机号</td>
        <td><input type="text" name="phone" value=""></td>
        <td>小组</td>
        <td><input type="checkbox" name="tid" value=""></td>
    </tr>
</table>
</body>
</html>
