<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 我欲皆真
  Date: 2019/11/22
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>列表</title>
</head>
<body>
    <table class="table">
        <tr>
    <th>编号</th>
    <th>姓名</th>
    <th>工资</th>
    <th>入职时间</th>
    <th>部门</th>
        </tr>
<c:forEach items="${pageInfo.list}" var="emp">
    <tr>
    <td>${emp.id}</td>
    <td>${emp.name}</td>
    <td>${emp.salary}</td>
    <td>
    ${emp.hiredate}
    </td>
    <td>
    ${emp.deptId}
    </td>
    </tr>
</c:forEach>
    </table>
</body>
</html>
