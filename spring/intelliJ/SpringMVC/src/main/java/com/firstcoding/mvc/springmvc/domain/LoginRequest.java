package com.firstcoding.mvc.springmvc.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class LoginRequest {     // <= Beans

    private String uid;
    private String pw;
}
