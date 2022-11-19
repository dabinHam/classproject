<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/17
  Time: 5:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Todo List</title>
</head>
<body>
<h1>Todo List</h1>

<form>
    <table>
        <tr>
            <th>번호</th>
            <th>할일</th>
            <th>실행여부</th>
            <th>날짜</th>
        </tr>

        <c:forEach var="todo" items="${todoList}">
        <tr>
            <td>${tdNum}</td>
            <td>${tdList}</td>
            <td>${tdCheck}</td>
            <td>${tdDate}</td>
        </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
