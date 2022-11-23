<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/22
  Time: 5:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Modify Page</title>
</head>
<body>
    <h1>할일 수정</h1>
    <form method="post">
        <table>
            <tr>
                <td>번호</td>
                <td><input type="text" name="tno" value="${param.tno}" readonly></td>
            </tr>
            <tr>
                <td>할일</td>
                <td><input type="text" name="todo" capture="${todo.todo}"></td>
            </tr>
            <tr>
                <td>기한</td>
                <td><input type="date" name="dueDate" value="${todo.dueDate}"></td>
            </tr>
            <tr>
                <td>상태</td>
                <td><input type="checkbox" name="finished" ${todo.finshied ? 'checked' : ''}></td>
            </tr>
            <tr>
                <td><input type="reset" value="초기화"></td>
                <td><input type="submit" value="수정완료"></td>
            </tr>
        </table>
    </form>

    <form action="/todo/remove" method="post">
        <input type="hidden" name="tno" value="${param.ton}">
        <input type="submit" value="삭제">
    </form>

    <a href="/todo/list">목록으로 돌아가기</a>
</body>
</html>
