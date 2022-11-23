<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/22
  Time: 5:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Todo List</title>
</head>
<body>
    <h1>할일 목록</h1>

    <table>
        <tr>
            <td>번호</td>
            <td>할일</td>
            <td>기간</td>
            <td>완료여부</td>
        </tr>

        <c:forEach var="todo" items="${todoList}" varStatus="stat">
            <tr>
                <td>${todo.tno} / ${stat.count}</td>
                <td><a href="/todo/read?tno=${todo.tno}">${todo.todo}</a></td>
                <td>${todo.duedate}</td>
                <td>${todo.finishied ? '완료' : '진행중'}</td>
            </tr>
        </c:forEach>
    </table>

    <a href="/todo/register">Todo 등록하기</a>
</body>
</html>
