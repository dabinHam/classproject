package com.spring_todo.s_todo.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Member {

    private int idx;
    private String uid;
    private String upw;
    private String uuid;
    private String uname;
    private String uphoto;


    public LoginInfo toLoginInfo(){
        return LoginInfo.builder()
                .uid(this.uid)
                .uname(this.uname)
                .uphoto(this.uphoto)
                .build();
    }
}
