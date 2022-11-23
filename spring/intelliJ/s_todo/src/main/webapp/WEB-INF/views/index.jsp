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
    a{text-decoration: none;}
    .wrap{ margin: 0; padding: 0; width: 80%;}
    .go_list_btn{display: block; }
</style>
<body>
<div class="wrap">
    <h1>Todo Project</h1>
    <div class="txt_main">
        <span>spring을 활용하여 만드는 todo 리스트 입니다.</span>
        <p>프로젝트 기능 : </p>
        <span>회원가입, 로그인, 로그아웃</span>
        <br>
        <span>할일목록 확인,추가,삭제 </span>
        <a href="todo/list" class="go_list_btn">Todo List 바로가기</a>
    </div>
    <section><%--비로그인상태 영역--%>
        <c:if test="${loginInfo eq null}">
            <span>비로그인 상태입니다. 로그인 해주세요.</span>
            <ul>
                <li><a href="/login">로그인</a></li>
                <li><a href="member/insert">회원가입</a></li>
            </ul>
        </c:if>
    </section>

    <section><%--로그인상태 영역--%>
        <c:if test="${loginInfo ne null}">
            <span>로그인 상태입니다. 원하는 기능을 선택해주세요.</span>
            <ul>
                <li><b>회원정보</b>
                    <ul>
                        <li>아이디 : ${loginInfo.uid} </li>
                        <li>이름 : ${loginInfo.uname}</li>
                        <li>프로필사진 : <img src="/uploadfile/member/${loginInfo.uphoto}" alt="프로필사진"> </li>
                    </ul>
                </li>
                <li><a href="/logout">로그아웃</a></li>
            </ul>

        </c:if>
    </section>
</div>
</body>
</html>
