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
    <title>if</title>
</head>
<body>

<%--true 일때만 보여진다. 참의 값 : 10>0 --%>
<%--    <c:if test="${10>0}">--%>
<%--        참일 때 보여집니다.--%>
<%--    </c:if>--%>

    <c:if test="${10 eq 10}">
        참일 때 보여집니다!
    </c:if>

    <hr>
    <br>
    이름 :
    <c:if test="${member[1].name eq null}">
        입력된 정보가 없습니다.
    </c:if>

    <hr>

    <c:if test="${members[0].name == 'COOLO0'}" var="result" scope="request" />
    memebers[0].name == 'COOL0' => ${result}



</body>
</html>
