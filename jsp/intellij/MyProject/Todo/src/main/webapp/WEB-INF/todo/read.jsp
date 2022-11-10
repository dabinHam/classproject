<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/10
  Time: 5:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Read</title>
</head>
<body>
<%--상세 페이지 (수정,삭제)--%>
할일 <input type="text" name="todo" id="todo" value="저장되어 있는 할일" readonly><br>
마감 <input type="date" name="date" id="date" value="2022-11-10" readonly> <br>

<a href="/Todo/modify?tno=${param.tno}">수정</a>

<form action="/Todo/remove" method="post">
    <input hidden name="tno" value="${param.tno}"> <input type="submit" value="삭제">
</form>
<a href="/Todo/list"> Todo List</a>

</body>
</html>
