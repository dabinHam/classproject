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
    <h1>쿠키 값 검색</h1>

    검색 쿠키 이름 : ${param.cname}
    <br>
    검색 쿠키 결과 : ${result}

    <br>

    <a href="create">쿠키 생성</a>
    <a href="delete">userid 쿠키값을 삭제</a>


</body>
</html>
