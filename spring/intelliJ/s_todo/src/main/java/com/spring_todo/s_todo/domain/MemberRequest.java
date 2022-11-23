package com.spring_todo.s_todo.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class MemberRequest {
    // 사용자로부터 Form을 통하여 받는 데이터 처리
//    private int idx;    // 받는데이터기 때문에 idx 불필요
    private String uid;
    private String upw;
    private String uuid;
    private String uname;
    private MultipartFile uphoto;   // 데이터베이스엔 문자열(String)로 저장, 가져오는건 멀티파트파일(MultipartFile)형식 이기에 고민해봐야한다.

    public Member tomember(){
        Member member  = Member.builder()
                .uid(this.uid)
                .upw(this.upw)
                .uname(this.uname)
                .build();


        return member;
    }


}
