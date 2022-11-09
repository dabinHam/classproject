<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/09
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <%--jstl에 c 라는 core를 사용할거야 라는 뜻--%>
<html>
<head>
    <title>out</title>
    <style>
        .red{color: red;}
    </style>
</head>
<body>

    ${members}
    <hr><br>
    ${members[0]} <br>
    ${members[1]} /  ${members[1].name} <br><br>

    <c:out value="${members[0].name}">
        <span class="red">입력정보 없음</span>
    </c:out>

    <br>

    <c:out value="${members[1].name}" escapeXml="false"> <%-- escapeXml="false" : html로 인식하고 싶어서 넣어줌 --%>
        <span class="red">입력정보 없음</span>
    </c:out>

</body>
</html>
