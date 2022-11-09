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
    <title>forEach</title>
</head>
<body>

<%--delims : 해당 표시가 되어있는곳은 다 잘라준다. --%>
    <c:forTokens items="손흥민,010-1234-5678,런던" delims="," var="str" varStatus="stat">
        <%--원하는 부분만 잘라서 표시할 수 있다. --%>
        <c:if test="${stat.index == 1}">
            ${str} <br>
        </c:if>

    </c:forTokens>

    <hr>

    <table border="1">
        <tr>
            <th>index</th>
            <th>count</th>
            <th>아이디</th>
            <th>이름</th>
            <th>비밀번호</th>
        </tr>

        <c:forEach var="member" items="${members}" varStatus="stat">
            <tr>
                <td>${stat.index}</td>
                <td>${stat.count}</td>
                <td>${member.id}</td>
                <td>${member.name}</td>
                <td>${member.pw}</td>
            </tr>
<%--            <h3>${member}</h3>--%>
        </c:forEach>

    </table>





    <br>
    <hr>

    <h2>1~5까지 반복 출력</h2>
    <c:forEach var="num" begin="1" end="5">
        <h3>${num}</h3>
    </c:forEach>

</body>
</html>
