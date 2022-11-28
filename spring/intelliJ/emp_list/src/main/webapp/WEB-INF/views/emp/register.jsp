<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/24
  Time: 1:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="/css/bootstrap/offcanvas.css" rel="stylesheet">

    <!-- Bootstrap core JavaScript
================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="js/assets/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="js/assets/vendor/popper.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>
    <script src="js/assets/vendor/holder.min.js"></script>
    <script src="js/bootstrap/offcanvas.js"></script>
</head>
<body class="bg-light">
    <h1>사원등록</h1>
    <hr>
    <form method="post">
        <tr>
            <td>부서번호</td>
            <td><input type="number" name="deptno"></td>
        </tr>
        <tr>
            <td>부서이름</td>
            <td><input type="text" name="dname"></td>
        </tr>
        <tr>
            <td>부서위치</td>
            <td><input type="text" name="loc"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="등록"></td>
        </tr>
    </form>
</body>
</html>
