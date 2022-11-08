<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/08
  Time: 10:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인 페이지</title>
</head>
<body>
  <h1>로그인 페이지</h1>
  <%  // 1. 객체를 만들어놓고
//    request.getParameter("aaa");
    String userid = request.getParameter("userid");
    String pw = request.getParameter("pw");

    if (userid.equals(pw)){
      session.setAttribute("loginid",userid);
      response.sendRedirect("mypage.jsp");
    }else {
      response.sendRedirect("login.html");
    }

    LocalDate now = LocalDate.now();
  %>
<%--  2. 여기서 호출 ,  표현식 --%>
  <%= now %>
</body>
</html>
