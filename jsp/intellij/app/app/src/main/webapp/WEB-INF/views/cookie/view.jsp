<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/15
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>쿠키 값 확인</h1>

    userid : ${cookie.userid.value}
    <br>
    uuid : ${cookie.uuid.value}

    <br>

    <a href="create">쿠키 생성</a>
    <a href="delete">userid 쿠키값을 삭제</a>
    <a href="search?cname= ">쿠키 검색</a>


</body>
</html>
