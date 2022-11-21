<%--
  Created by IntelliJ IDEA.
  User: yungwisang
  Date: 2022/11/21
  Time: 10:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--이력서의 경우 경력사항이 추가되는경우에 사용되기도 함.--%>
  <h1>주문</h1>

  <form method="post">

    <h3>상품 1</h3>
    ID - <input type="text" name="orderItems[0].itemId"> <br>  <%--  orderItems[0].itemId : OrderCommand의 List와 같은것 --%>
    개수 - <input type="number" name="orderItems[0].number"> 개 <br>
    주의 - <input type="text" name="orderItems[0].remark">

    <h3>상품 2</h3>
    ID - <input type="text" name="orderItems[1].itemId"> <br>
    개수 - <input type="number" name="orderItems[1].number"> 개 <br>
    주의 - <input type="text" name="orderItems[1].remark">

    <h3>상품 3</h3>
    ID - <input type="text" name="orderItems[2].itemId"> <br>
    개수 - <input type="number" name="orderItems[2].number"> 개 <br>
    주의 - <input type="text" name="orderItems[2].remark">

    <h3>배송지 주소</h3>
    우편번호 - <input type="text" name="address.zipcode"> <br>
    주소1 - <input type="text" name="address.address1"> <br>
    주소2 - <input type="text" name="address.address2" > <br>

    <br>
    <input type="submit" value="제출하기">

  </form>

</body>
</html>
