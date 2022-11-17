<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/17
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Login Form</h1>
        <p>${msg}</p>
    <Form method="post">
        <table>
            <tr>
                <td>아이디</td>
                <td><input type="text" name="uid" id="uid"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" name="pw" id="pw"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="로그인"></td>
            </tr>
        </table>
    </Form>


</body>
</html>
