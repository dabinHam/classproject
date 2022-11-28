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
    <title>edit</title>

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

    <main role="main" class="container">
        <div class="d-flex align-items-center p-3 my-3 text-white-50 bg-dark rounded box-shadow">
            <img class="mr-3" src="https://icons.getbootstrap.com/assets/img/icons-hero.png" alt="" width="48" height="48">
            <div class="lh-150">
                <h6 class="mb-0 text-white lh-150" >사원정보 수정</h6>
                <small>사원의정보를 수정 합니다.</small>
            </div>
        </div>

        <form method="post">
            <table class="table">
                <tr>
                    <td>사원번호</td>
                    <td><input type="number" name="empno" value="${emp.empno}" readonly></td>
                </tr>
                <tr>
                    <td>사원이름</td>
                    <td><input type="number" name="empno" value="${emp.ename}" readonly></td>
                </tr>
                <tr>
                    <td>직급</td>
                    <td><input type="number" name="empno" value="${emp.job}" readonly></td>
                </tr>
                <tr>
                    <td>직송상사 사번</td>
                    <td><input type="number" name="empno" value="${emp.mgr}" readonly></td>
                </tr>
                <tr>
                    <td>입사년도</td>
                    <td><input type="number" name="empno" value="${emp.hiredate}" readonly></td>
                </tr>
                <tr>
                    <td>월급</td>
                    <td><input type="number" name="empno" value="${emp.sal}" readonly></td>
                </tr>
                <tr>
                    <td>보너스</td>
                    <td><input type="number" name="empno" value="${emp.comm}" readonly></td>
                </tr>
                <tr>
                    <td>부서번호</td>
                    <td><input type="number" name="empno" value="${emp.deptno}" readonly></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="등록"></td>
                </tr>
            </table>
        </form>

        <small class="d-block text-right mt-3">
            <a href="/emp/register" class="btn">사원 등록</a>
        </small>
</body>
</html>
