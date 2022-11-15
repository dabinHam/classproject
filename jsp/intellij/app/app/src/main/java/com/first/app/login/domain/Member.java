package com.first.app.login.domain;

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

}
