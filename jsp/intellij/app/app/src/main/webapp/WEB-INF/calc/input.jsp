<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/08
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%--get 방식과  post 방식을 하나로 이용해본 예--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>계산기</title>
</head>
<body>
<h1>${title}</h1>
  <form method="post">

      <input type="number" name="num1" id="num1">
      <input type="number" name="num2" id="num2">
      <button> 전송 </button>

  </form>
</body>
</html>
