package com.myproject.todo_spring.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class LoginRequest {

    private String uid;
    private String pw;
}