<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/18
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    img{width: 150px; height: 100px;}
    li{list-style: none;}
</style>
<body>
<h1>${title}</h1>

<ul>
<%--    <li>프로젝트 이름 : </li>--%>
<%--    <li>프로젝트 기능 : </li>--%>

    <c:if test="${loginInfo eq null}">
    <%--로그인이 되어 있지 않을때 보이는 화면 : 로그인, 회원가입--%>
    <h1>TodoList</h1>
    <li><a href="/login">로그인</a></li>
    <li><a href="/member/register">회원가입</a></li>
    <li><a href="/todo/list">Todo List</a> </li>
    </c:if>

    <c:if test="${loginInfo ne null}">
    <%--로그인이 되어있을 때 보이는 화면 : 로그아웃--%>
    <li><a href="/todo/list">Todo List</a> </li>
    <li>아이디 : ${loginInfo.uid} , 이름 : (${loginInfo.uname}) <img src="/uploadfile/member/${loginInfo.uphoto}" alt="프로필사진"></li>
    <li><a href="/logout">로그아웃</a></li>
    </c:if>
</ul>

${loginInfo}

</body>
</html>
