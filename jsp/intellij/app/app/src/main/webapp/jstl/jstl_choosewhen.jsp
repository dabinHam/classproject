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
    <title>Choose,When</title>
</head>
<body>

<%--    <c:if test=""></c:if>--%>
    param.sel  : ${param.sel}

    <hr>

    <select>
        <option ${param.sel eq 'a' ? 'selected': ''}>a--------</option>
        <option ${param.sel eq 'b' ? 'selected': ''}>b--------</option>
        <option ${param.sel eq 'c' ? 'selected': ''}>c--------</option>
    </select>

    <c:choose>
        <c:when test="${param.sel == 'a'}">
            <h3>a를 선택했습니다.</h3>
        </c:when>
        <c:when test="${param.sel == 'b'}">
            <h3>b를 선택했습니다.</h3>
        </c:when>
        <c:when test="${param.sel == 'c'}">
            <h3>c를 선택했습니다.</h3>
        </c:when>

        <c:otherwise>
            <h3>잘못된 데이터가 선택되었습니다.</h3>
        </c:otherwise>
    </c:choose>




</body>
</html>
