<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/15
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입 폼</title>
</head>
<style>
  table{padding: 2%}
</style>
<body>

  <h1>회원가입</h1>
  <hr>
  <form method="post">
    <table>
      <tr>
        <td>아이디</td>
        <td><input type="text" name="uid" id="uid"></td>
      </tr>
      <tr>
        <td>비밀번호</td>
        <td><input type="password" name="upw" id="upw"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="가입"></td>
      </tr>
    </table>
  </form>
</body>
</html>
