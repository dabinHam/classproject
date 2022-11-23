package com.spring_todo.s_todo.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class LoginInfo {
    // 로그인상태일때 페이지 이동시 서버에 넣고 다닐 정보
    private String uid;
    private String uname;
    private String uphoto;
}
