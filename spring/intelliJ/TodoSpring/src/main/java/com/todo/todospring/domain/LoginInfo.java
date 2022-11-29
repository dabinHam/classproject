package com.todo.todospring.domain;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class LoginInfo {
    // 로그인하면 가지고 다닐 정보
    private int idx;
    private String uid;
    private String uname;
    private String uphoto;


}
