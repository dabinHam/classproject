package com.app.manager.domain;

import lombok.*;

import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class DeptDTO {

    @Min(value = 1)
    @Max(value = 99)
    @Positive // 양수값만 받는다. <-> @Negative : 음수
    private int deptno;     // 해당 컬럼이름과 같게 만들어 줘야 한다.

    @NotEmpty   // 문자열은 비어있지 않은 상태 , List -> 요소의 개수가 비어있는지
    private String dname;

    @NotEmpty
    private String loc;
}

//@Future : 현재시간보다 미래여야한다.
//@Email : 이메일 체크   @가 있는지 없는지 체크함
//@NotBlank : 공백문자열 체크 "" < 처음에 띄워쓰기하는거 (NotEmpty 보다 타이트함 ) ,
//@NotNull : Null값이 아니다
