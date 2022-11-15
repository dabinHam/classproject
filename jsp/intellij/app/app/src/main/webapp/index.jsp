<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br>
<hr>

<c:if test="${loginInfo eq null}">
    <a href="/login">로그인</a>
</c:if>

<br>

<c:if test="${loginInfo ne null}">
    회원정보 : ${loginInfo}
    <br>
    <a href="/logout">로그아웃</a>
</c:if>

</body>
</html>