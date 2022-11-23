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
    <title>Insert Page</title>
</head>
<body>
    <h1>할일 추가</h1>
    <form method="post">
        <table>
            <tr>
                <td>할일</td>
                <td><input type="text" name="todo"></td>
            </tr>
            <tr>
                <td>기한</td>
                <td><input type="date" name="dueDate"></td>
            </tr>
            <tr>
                <td><input type="reset" value="초기화"></td>
                <td><input type="submit" value="수정"></td>
            </tr>
        </table>
    </form>
</body>
</html>
