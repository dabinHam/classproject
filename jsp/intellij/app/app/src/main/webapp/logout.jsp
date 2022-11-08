<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/08
  Time: 4:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
session.invalidate();
response.sendRedirect("login.jsp");
%>