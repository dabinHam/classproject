<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/24
  Time: 12:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="/css/bootstrap/offcanvas.css" rel="stylesheet">

    <script>
        function deleteDept(deptno){
            if(confirm("삭제하시겠습니까?")){
                location.href = '/dept/delete?deptno='+deptno;
            }
        }
    </script>
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

<%-- main nav 필요없어서 주석처리--%>
<%--<nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-dark">
    <a class="navbar-brand mr-auto mr-lg-0" href="#">EMP MANAGER</a>
    <button class="navbar-toggler p-0 border-0" type="button" data-toggle="offcanvas">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Dashboard <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Notifications</a>
            </li>

            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="https://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Settings</a>
                <div class="dropdown-menu" aria-labelledby="dropdown01">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <a class="dropdown-item" href="#">Something else here</a>
                </div>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>


<div class="nav-scroller bg-white box-shadow">
    <nav class="nav nav-underline">
        <a class="nav-link active" href="#">Dashboard</a>
        <a class="nav-link" href="#">
            Friends
            <span class="badge badge-pill bg-light align-text-bottom">27</span>
        </a>
        <a class="nav-link" href="#">Explore</a>
    </nav>
</div>
--%>

<main role="main" class="container">
    <div class="d-flex align-items-center p-3 my-3 text-white-50 bg-dark rounded box-shadow">
        <img class="mr-3" src="https://icons.getbootstrap.com/assets/img/icons-hero.png" alt="" width="48" height="48">
        <div class="lh-150">
            <h6 class="mb-0 text-white lh-150" >사원 리스트</h6>
            <small>사원의정보를 출력합니다.</small>
        </div>
    </div>

    <div style="right: 0;" >
        <form>
            <select name="searchType">
                <option value="empno">사원번호</option>
                <option value="ename">사원이름</option>
                <option value="job">직급</option>
                <option value="mgr">담당자 사번</option>
                <option value="hiredate">입사년도</option>
                <option value="sal">월급</option>
                <option value="comm">보너스</option>
                <option value="deptno">부서번호</option>
            </select>
            <input type="text" name="keyword">
            <input type="submit" value="검색">
        </form>
    </div>


    <table class="table">
        <tr>
            <th>사원번호</th>
            <th>사원이름</th>
            <th>직급</th>
            <th>담당자 사번</th>
            <th>입사년도</th>
            <th>월급</th>
            <th>보너스</th>
            <th>부서번호</th>
            <th></th>
        </tr>

        <c:forEach items="${empList}" var="emp" >
            <tr>
                <td>${emp.empno}</td>
                <td>${emp.ename}</td>
                <td>${emp.job}</td>
                <td>${emp.mgr}</td>
                <td>${emp.hiredate}</td>
                <td>${emp.sal}</td>
                <td>${emp.comm}</td>
                <td>${emp.deptno}</td>
                <td><a href="/emp/edit?no=${emp.empno}">수정</a> | <a onclick="deleteEmp(${emp.empno})" style="cursor: pointer">삭제</a></td>
            </tr>
        </c:forEach>
    </table>

    <small class="d-block text-right mt-3">
        <a href="/emp/register" class="btn">사원 등록</a>
    </small>
</body>
</html>
