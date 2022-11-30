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

<%--
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

    // callback
    // get -> put -> get -> post
    // get(put(get(post())))
</script>
--%>

<%--fetch !! --%>
<%--
    <script>
    const request = {
        get(url) {
            return fetch(url)
        },
        post(url, payload) {    // payload : parameter
            return fetch(url, {
                method: 'POST',
                headers: {'content-Type': 'appliction/json'},    /* headers는 {key,value} 로 묶는다.*/
                body: JSON.stringify(payload)
            })
        },
        put(url, payload) {    // payload : parameter
            return fetch(url, {
                method: 'PUT',
                headers: {'content-Type': 'appliction/json'},    /* headers는 {key,value} 로 묶는다.*/
                body: JSON.stringify(payload)
            })
        },
        delete(url){
            return fetch(url, {method:'DELETE'})
        }
    }

    request.get('/api/v1/depts')
        .then(response =>{
            if(!response.ok){
                throw new Error(response.statusText);
            }
            return request.get('/api/v1/depts/10');
        })
        .then(response =>{
            if(!response.ok){
                throw new Error(response.statusText);
            }
            return response.json();
        })
        .then(list => console.log(list))
        .catch(err => console.log(err))

    request.post('/api/v1/depts', {deptno:11,dname:'test',loc:'test123'})
        .then(response => {
            if(!response.ok)
                return new Error(response.statusText)
            console.log(response)
        })
        .catch(err => console.log(err))

    request.put('/api/v1/depts/22', {deptno:22,dname:'기획팀',loc:'부산'})
        .catch(err => console.log(err))

    request.delete('/api/v1/depts/22')
        .then(response => {
            console.log(response.body)
        })
</script>
--%>

<%-- axios !! --%>
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
<script>

    axios.get('/api/v1/depts/10')
        .then(res => {console.log('res',res.data)
            // 태그 캐스팅 -> 데이터 변경
        })
        .catch(err => console.log(err))

    // 입력
    axios.post('/api/v1/depts',{"deptno" : 35,"dname" : "DEV","loc" : "판교"})
    .then(res => console.log(rest))
    .catch(err => console.log(err))
</script>
</body>
</html>