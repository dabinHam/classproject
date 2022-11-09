<%@ page import="java.util.List" %>
<%@ page import="com.first.app.member.Member" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/09
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%--JSP를 하기위해서 셋팅을 하기 위하여 만든 파일 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  List<Member> members = new ArrayList<>();
  members.add(new Member("cool00", "1110", "COOL0"));
  members.add(new Member("cool01", "1111", null));
  members.add(new Member("cool02", "1112", "COOL0"));
  members.add(new Member("cool03", "1113", "COOL0"));
  members.add(new Member("cool04", "1114", null));
  members.add(new Member("cool05", "1115", null));
  members.add(new Member("cool06", "1116", "COOL0"));
  members.add(new Member("cool07", "1117", null));
  members.add(new Member("cool08", "1118", "COOL0"));
  members.add(new Member("cool09", "1119", "COOL0"));

  session.setAttribute("members",members);
%>
<html>
<head>
    <title>makeList</title>
</head>
<body>

</body>
</html>
