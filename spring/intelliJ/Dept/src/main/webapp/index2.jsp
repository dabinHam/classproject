<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%--
    <script>
    // setTimeout() : 비동기 처리는 언제 처리할지 모르는데 setTimeout의 경우는 언제인지 시간을 알 수 있다.
    console.log(1);
    console.log(2);
    setTimeout(()=> console.log(3),1000);
    console.log(4);
    </script>
--%>

<script>

    const xhr = new XMLHttpRequest();
    // xhr.open('get','https://jsonplaceholder.typicode.com/todos/1');
    xhr.open('get','/api/v1/depts/150');
    xhr.send();

    xhr.onreadystatechange = () => {
        if (xhr.readyState !== XMLHttpRequest.DONE){    // 완료되지 않았다면(XMLHttpRequest.DONE) 아무것도 처리하지않는다(return)는 뜻
                return;
        }

        if (xhr.status === 200){    // 응답(200) 한다면
            console.log(JSON.parse(xhr.response))
        } else {    // status가 200이 아니라면 오류 발생 | 405 허용되지않음 | 400 파라미터값 오류 등등
            console.log("error", xhr.status, xhr.statusText)
        }
    }
</script>

</body>
</html>