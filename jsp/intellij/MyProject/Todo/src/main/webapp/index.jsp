<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
<%--
index.jsp -> list.jsp (목록)->register(등록) -> *등록(Redirect)성공하면* list.jsp(목록) | register(등록)
-> list.jsp(목록) 으로 가게되면 -> 수정(modify) | 삭제(Redirect)
--%>
</head>
<body>
<h1>Todo List
</h1>
<br/>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<a href="Todo/list"> Todo List go</a>

</body>
</html>