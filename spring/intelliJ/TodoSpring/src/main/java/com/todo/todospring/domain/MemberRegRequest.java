package com.todo.todospring.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class MemberRegRequest {
    // 사용자로부터 받는 데이터 처리 (Form을 통하여)

    // 받는데이터기 때문에 idx 가 필요없음.
    private String uid;
    private String upw;
    private String uuid;
    private String uname;
    private MultipartFile uphoto;

    public Member toMember(){
        Member member = Member.builder()
                .uid(this.uid)
                .upw(this.upw)
                .uname(this.uname)
                .build();

        return member;
    }
}
