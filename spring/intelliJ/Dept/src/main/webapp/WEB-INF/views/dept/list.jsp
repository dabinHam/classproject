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
    <title>list</title>
</head>
<body>
    <h1>Dept List</h1>
    <hr>
    <a href="/dept/register">부서 등록</a>
    <br>

    <div style="margin-top: 10px">
        <form>
            검색
            <select name="searchType">
                <option value="dname">부서이름</option>
                <option value="loc">부서위치</option>
            </select>
            <input type="text" name="keyword">

            <input type="submit" value="검색">
        </form>
    </div>
    <table border="1">
        <tr>
            <th>부서번호</th>
            <th>부서이름</th>
            <th>부서위치</th>
        </tr>

        <c:forEach items="${deptList}" var="dept" >
            <tr>
                <td>${dept.deptno}</td>
                <td>${dept.dname}</td>
                <td>${dept.loc}</td>
                <td><a href="/dept/edit?no=${dept.deptno}">수정</a> | <a onclick="deleteDept(${dept.deptno})" style="cursor: pointer">삭제</a></td>
            </tr>
        </c:forEach>
    </table>

    <script>
        function deleteDept(deptno){
            if(confirm("삭제하시겠습니까?")){
                location.href = '/dept/delete?deptno='+deptno;
            }
        }
    </script>
</body>
</html>
