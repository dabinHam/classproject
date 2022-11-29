package com.todo.todospring.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Member {

    // DB와 연결하는 DTO 로 사용
    private int idx;
    private String uid;
    private String upw;
    private String uuid;
    private String uname;
    private String uphoto; // 데이터베이스엔 문자열(String)로 저장할꺼고 가져오는건 멀티파트파일(MultipartFile) 형식으로 가져올꺼이기 때문에 고민해봐야한다.


    public LoginInfo toLoginInfo(){
        return LoginInfo.builder()
                .idx(this.idx)
                .uid(this.uid)
                .uname(this.uname)
                .uphoto(this.uphoto)
                .build();
    }

}
