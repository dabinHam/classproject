<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/22
  Time: 4:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Todo Project</title>
</head>
<style>
    ul,li{list-style: none;}
    body{background: antiquewhite;}
</style>
<body>
<p>이동시킨 index 페이지</p>

<h1>Todo Project</h1>

<ul>
    <li>spring을 활용하여 만드는 todo 리스트 입니다.</li>
    <li>
        프로젝트 기능 :
        <p>보안에 취약한 쿠키가 아닌 세션을 이용하여 로그인정보를 저장하고 로그인상태일때만 페이지를 확인할 수 있게 만들었습니다.</p>
        <span>회원가입, 로그인, 로그아웃</span>
        <span>할일목록 확인,추가,삭제 </span>
    </li>


    <span>비로그인 상태입니다. 로그인 해주세요.</span>
    <li><a href="loginForm">로그인</a></li>
    <li><a href="#">회원가입</a></li>

    <span>로그인 상태입니다. 원하는 기능을 선택해주세요.</span>
    <b>회원정보</b>
    <li>아이디 : </li>
    <li>이름 : </li>
    <li>프로필사진 : </li>
    <li><a href="#">로그아웃</a></li>
</ul>
</body>
</html>
