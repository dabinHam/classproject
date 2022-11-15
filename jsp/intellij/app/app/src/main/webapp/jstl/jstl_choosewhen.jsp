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
    <%-- choose,when은 switch-case문 과 비슷하다.--%>

    <%--사용자의 입력값--%>
    param.sel  : ${param.sel}

    <hr>

    <select>
        <%--삼항연산자 사용 param.sel이 a가 true 이면 'selected' false이면 '(null)'--%>
        <option ${param.sel eq 'a' ? 'selected': ''}>a--------</option>
        <option ${param.sel eq 'b' ? 'selected': ''}>b--------</option>
        <option ${param.sel eq 'c' ? 'selected': ''}>c--------</option>
    </select>

    <c:choose>
        <%--when : param.sel이 a 일때 해당문구가 나오게한다.--%>
        <c:when test="${param.sel == 'a'}">
            <h3>a를 선택했습니다.</h3>
        </c:when>
        <c:when test="${param.sel == 'b'}">
            <h3>b를 선택했습니다.</h3>
        </c:when>
        <c:when test="${param.sel == 'c'}">
            <h3>c를 선택했습니다.</h3>
        </c:when>

        <%--if의 esle | switch-case의 default(그 외의 선택)--%>
        <c:otherwise>
            <h3>잘못된 데이터가 선택되었습니다.</h3>
        </c:otherwise>
    </c:choose>




</body>
</html>
