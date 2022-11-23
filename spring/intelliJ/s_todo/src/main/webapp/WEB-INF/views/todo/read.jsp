<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/22
  Time: 5:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Read Page</title>
</head>
<body>
    <h1>상세페이지</h1>

    <table>
        <tr>
            <td>번호</td>
            <td><input type="text" name="tno" value="${param.tno}" readonly></td>
        </tr>
        <tr>
            <td>할일</td>
            <td><input type="text" name="todo" capture="${todo.todo}" readonly></td>
        </tr>
        <tr>
            <td>기한</td>
            <td><input type="date" name="dueDate" value="${todo.dueDate}" readonly></td>
        </tr>
        <tr>
            <td>상태</td>
            <td><input type="checkbox" name="finished" ${todo.finshied ? 'checked' : ''}></td>
        </tr>
    </table>

    <a href="/todo/modify?tno=${param.tno}">수정 &#166; 삭제</a> <a href="/todo/list">Todo List</a>
</body>
</html>
