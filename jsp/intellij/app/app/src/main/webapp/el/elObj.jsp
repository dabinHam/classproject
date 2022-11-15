<%@ page import="com.first.app.member.Member" %>
<%@ page import="com.first.app.product.Product" %><%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/09
  Time: 12:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--객체를 참조하는 방법--%>
<%--EL을 사용하는 목적 : 각 속성을 가질 수 있는 내장객체(page,request,session,appliction) 영역의 속성을 찾아 사용하는 것--%>

<%
    // scope(범위) 를 생략하게 되면
    // request -> session -> application 순서로 찾는다

    request.setAttribute("name","빨강색");
    session.setAttribute("name","노랑색");

    Member member = new Member();
    member.setId("cool");
    member.setPw("1234");
    member.setName("COOL");

    // session에서 호출
    session.setAttribute("member" , member);
    session.setAttribute("product" , new Product());

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h4>표현식 : <%= request.getAttribute("name")%> </h4>          <%--결과 : 빨간색--%>
    <h4>표현언어 : ${requestScope.name} </h4>                       <%--결과 : 빨간색--%>

    <h4>표현식 : <%= request.getAttribute("id")%> </h4>            <%--결과 : null--%>
    <h4>표현언어 : ${requestScope.id} </h4>                         <%--결과 :     (공백)--%>

    <%--  뒤에있는 --%>
    <h4> param(code) : ${param.code}</h4>               <%--결과 : url 뒤 ?code=abc 라고입력하면 abc라고 나온다.--%>

    <%--url : 프로토콜,도메인,포트,경로   | uri : 경로--%>
    <h4> pageContext : ${pageContext.request.requestURL}</h4>
    <h4> pageContext : ${pageContext.request.requestURI}</h4>
    <h4> pageContext : ${pageContext.request.contextPath}</h4>  <%-- 여기에서 contextPath = method의 호출 --%>
    <h4> contextpath : <%= request.getContextPath()%>    </h4>       <%-- method를 호출한 것 --%>

        <h4> sessionScope ( name ) : ${sessionScope.name} </h4> <%--결과 : 노란색--%>
        <h4> ( name ) : ${name} </h4>                           <%--결과 : 빨간색--%>
        <%-- name : 속성의 이름을 가르킴
                    scope를 생략시, 내장되어있는 객체가 아니라면 속성에 있는 key값을 찾는다. --%>
    <hr>

                        <%-- ↓↓ 표현언어의 데이터타입 ↓↓--%>
    ${true} / ${false}  <%--Boolean (true,false)--%>
    / ${100}            <%--정수 (0-9)--%>
    / ${1.2}            <%--실수 (소수점, 0.23e4와 같이 지수형표현도 가능)--%>
    / ${'손흥민'}         <%--문자열 (따옴표 (' , ")로 둘러쌓여진 문자열 , 값에 포함된 따옴표는 \' 로 표시 \(역슬래시) )--%>
    / ${null}           <%--null 타입--%>

    <hr>

    <%----%>
    <h4>${sessionScope.member}</h4>
    <%-- Scope 생략 가능--%>
    <h4>
        <%--Member 클래스의 변수들은 모두 private타입이기 때문에 외부에서 참조가 안되지만
        JSP는 Servelet에서 바뀌어서 오는거기 때문에 가능하다..?
         전달되어있는 데이터--%>
        ${member}

        / ${member.id} / ${member.pw} / ${member.name} /     <%-- 메소드만 찾는경우  --%>

        ${member.info}                                        <%--JavaBeans 예시 --%>
    </h4>

    <br>
    <hr>

    <%--Product클래스의 vo개념--%>
    <h4> 첫번째 상품 : ${product.list[1]} , 가격 ${product.price}</h4> <%--결과값 :  item1 , 가격 1000--%>


</body>
</html>
