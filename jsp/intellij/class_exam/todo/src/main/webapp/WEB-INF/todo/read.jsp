<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/11
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>register</title>
</head>
<body>

<h1>Todo Read</h1>

<%--${todo}--%>

    <table>
        <tr>
            <td>번호</td>
            <td><input type="text" name="tno" value="${todo.tno}" readonly></td> <%-- readonly :읽기전용 --%>
        </tr>
        <tr>
            <td>할일</td>
            <td><input type="text" name="todo" value="${todo.todo}" readonly></td>
        </tr>
        <tr>
            <td>기한</td>
            <td><input type="date" name="dueDate" value="${todo.dueDate}" readonly></td>
        </tr>
        <tr>
            <td>상태</td>
            <td><input type="checkbox" name="finished" ${todo.finished ? 'checked' : ''} ></td>
        </tr>
    </table>

<a href="/todo/modify?tno=${todo.tno}">Modify/Remove</a> <a href="/todo/list">Todo List</a>

</body>
</html>
