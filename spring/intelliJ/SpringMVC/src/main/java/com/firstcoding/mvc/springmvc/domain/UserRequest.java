package com.firstcoding.mvc.springmvc.domain;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

// 이 클래스에선 Getter, Setter 가 필수!     // UserRequest 은 기본생성자를 통해 만들고 get,set을 통하여 만드는데
public class UserRequest {
    private LocalDate date;

//    public void setDate(String date){
//        this.date = LocalDate.parse(date); // parse : 문자로 처리해주는거?
//    }




}
