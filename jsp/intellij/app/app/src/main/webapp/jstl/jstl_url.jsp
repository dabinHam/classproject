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
    <title>url</title>
</head>
<body>
    <%--url태그의 경우 단일태그로 많이 사용한다.--%>
<%--    <c:url value="index.jsp" var="urlIndex"/>--%>
<%--    ${urlIndex} <br>--%>

    <c:url value="/index.jsp" var="urlIndex2"/>
    ${urlIndex2}

    <br>

    <c:url value="/index.jsp"></c:url>

    <br>

    <a href="<c:url value="/index.jsp"/>">홈으로 가기</a>
    <a href="<c:url value="/el/elObj.jsp"/>">elObj</a>         <%--    <c:url value="/el/elObj.jsp"/>--%>

    <br>
    <hr>
<%--c:param name : 파라미터의 이름 , value속성이 들어가줘야한다! --%>
    <c:url value="/jstl/jstl_choosewhen.jsp" var="url">
        <c:param name="sel" value="c"/>
        <c:param name="index">1</c:param>
    </c:url>                                              <%--app/jstl/jstl_choosewhen.jsp
                                                           name="sel" value="c" :  ?sel=c&
                                                           name="index"         :  index=1 --%>


    ${url}
    <a href="${url}">${url}</a>

</body>
</html>
