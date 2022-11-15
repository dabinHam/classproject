package com.first.app.member;
// Beans : 모든 변수는 private , 기본생성자, getter / setter
/* JSP 에서 JavaBeans를 사용하려면 명확한 패키지명이 있어야 한다.
        (1) <jsp:useBean id=" " class="" scope=""/>
        - id : 생성할 빈의 이름을 지정합니다.
        - class : 빈 클래스 이름을 지정합니다.
        - scope : 빈을 사용할 수 있는 범위를 지정합니다.(page, request,session, application)

        (2) <jsp:setProperty name=" " property=" " value=" " param=" "/>
        - name : 사용할 빈의 이름을 지정합니다.
        - property : 값을 저장할 빈의 변수 이름을 지정합니다.
        - value : 변수의 값을 지정합니다.
        - param : 폼으로 넘어온 파라미터의 이름을 지정합니다.

        (3) <jsp:getProperty name=" " property=" "/>
        - name : 사용할 빈의 이름을 지정합니다.
        - property : 값을 가져올 빈의 변수를 지정합니다.
*/
// DTO, VO
/* DTO(Data Transfer Object) : 순수하게 데이터를 담아 계층 간으로 전달하는 객체.
                               로직을 갖고 있으며 method로는 getter,setter만 가진다.
   VO(Value Object) : 값 그 자체를 나태는 객체이다. 특정 값 자체를 표현하기 때문에 불변성의 보장을 위해 생성자를 사용!
                    DTO와 반대로 로직을 포함. 서로 다른 이름을 가지더라도 속성값이 같으면 같은객체,  Read-Only의 의미적 특성을 가진 객체
                    ex ) (현대)자동차 , (삼성)자동차  이 둘은 다른 제조회사(이름)을 가지고 있지만 같은 자동차(속성값) 이다.
 */
public class Member {


    // id, pw, name 가지는 method 생성
    private String id;
    private String pw;
    private String name;

    // 기본생성자 , Beans의 경우 꼭 기본생성자가 있어야한다!
    public Member() {
    }


    public Member(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 가져와야 하는 경우 아래와 같이 메소드를 생성하여 사용할 수 있다.
    public String getInfo() {
       return this.id + "(" +this.name + ")";
    }


    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
