package com.todo.todospring.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class MemberRegRequest {
    // 사용자로부터 받는 데이터 처리 (Form을 통하여)

    @NotEmpty(message = "uid는 필수 항목 ")   // @NotEmpty : 비어있으면 안되는것
    // 받는데이터기 때문에 idx 가 필요없음.
    private String uid;

    @NotEmpty
    private String upw;
    private String uuid;

    @NotEmpty
    private String uname;

//    @NotNull  // @NotNull : 필수로 넣어야 하는 값이라면 MultipartFile의 경우 NotEmpty 가 아닌 NotNull을 사용해줘야 한다.
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
