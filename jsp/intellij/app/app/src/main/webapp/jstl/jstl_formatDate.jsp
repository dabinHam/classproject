<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/09
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <%--jstl에 c 라는 core를 사용할거야 라는 뜻--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>formatDate</title>
</head>
<body>
    <%
        request.setAttribute("now",new Date());
    %>
    ${now}

    <hr>

    <h3>날짜</h3>
    <%-- default 값--%>
    <fmt:formatDate value="${now}"/>  <br>       <%-- 결과 값: 2022. 11. 9. --%>

    <fmt:formatDate value="${now}" type="date"/> <br>        <%-- 결과 값: 2022. 11. 9. (일자만 출력) --%>
    <fmt:formatDate value="${now}" type="date" dateStyle="full"/> <br>      <%-- 결과 값 : --%>
    <fmt:formatDate value="${now}" type="date" dateStyle="short"/> <br>     <%-- 결과 값 : --%>

    <h3>시간</h3>
    <fmt:formatDate value="${now}" type="time"/>  <br>                      <%-- 결과 값 : --%>
    <fmt:formatDate value="${now}" type="time" timeStyle="full"/>  <br>     <%-- 결과 값 : --%>
    <fmt:formatDate value="${now}" type="time" timeStyle="short"/>  <br>     <%-- 결과 값 : --%>

    <h3>both (날짜와시간)</h3>
    <fmt:formatDate value="${now}" type="both"/>   <br>                          <%-- 결과 값 : --%>
    <fmt:formatDate value="${now}" type="both" dateStyle="full"/>   <br>                       <%-- 결과 값 : --%>
    <fmt:formatDate value="${now}" type="both" timeStyle="full"/>   <br>                       <%-- 결과 값 : --%>
    <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/>                            <%-- 결과 값 : --%>

    <h3>패턴</h3>
    <fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss"/>  <br>   <%-- 결과 값 : 2022-11-09 17:27:38 --%>
    <fmt:formatDate value="${now}" pattern="yyyy-MM-dd hh:mm:ss"/>  <br>   <%-- 결과 값 : 2022-11-09 05:27:38--%>
    <fmt:formatDate value="${now}" pattern="yyyy-MM-dd h:mm:ss"/>   <br>   <%-- 결과 값 : 2022-11-09 5:27:38--%>
    <fmt:formatDate value="${now}" pattern="yyyy-MM-dd a h:mm:ss"/> <br>   <%-- 결과 값 : 2022-11-09 오후 5:27:38--%>
    <fmt:formatDate value="${now}" pattern="yyyy. MM. dd. HH:mm:ss"/> <br> <%-- 결과 값 : 2022. 11. 09. 17:27:38--%>



</body>
</html>
