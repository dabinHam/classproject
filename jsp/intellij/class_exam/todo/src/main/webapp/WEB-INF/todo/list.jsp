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
    <title>list</title>
</head>
<body>

<h1>${title}</h1>

<table>
    <tr>
        <td>번호</td>
        <td>할일</td>
        <td>기간</td>
        <td>완료여부</td>
    </tr>

    <c:forEach var="todo" items="${todoList}"/>
    <tr>
        <td>${todo.tno}</td>
        <td><a href="/todo/read?tno=${todo.tno}"${todo.todo}/></td>
        <td>${todo.dueDate}</td>
        <td>${todo.finished ? "완료" : "진행중"}</td>
    </tr>
</table>

<a href="/todo/register">Todo 등록하기</a>

</body>
</html>
