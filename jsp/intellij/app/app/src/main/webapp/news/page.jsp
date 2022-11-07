<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/08
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>페이지 모듈</title>
    <style>
        header{
            text-align : center;
        }
    </style>
</head>
<body>
<%@include file="top.jsp"%>
<%@include file="nav.jsp"%>
<%@include file="news.jsp"%>
<%@include file="shopping.jsp"%>
<table>
    <tr>
        <td>
            <%@include file="news.jsp"%>>
        </td>
    </tr>

</table>
</body>
</html>
