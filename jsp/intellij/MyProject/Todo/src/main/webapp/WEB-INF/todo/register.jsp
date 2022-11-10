<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/10
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<%--등록 페이지--%>

<form method="post">
    할일 <input type="text" name="todo" id="todo" placeholder="할일을 입력하세요!"> <br>
    마감 <input type="date" name="date" id="date"> <br>
    <input type="reset"> <input type="submit" value="등록">
</form>

</body>
</html>
