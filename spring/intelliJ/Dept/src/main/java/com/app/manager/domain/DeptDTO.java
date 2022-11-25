package com.app.manager.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class DeptDTO {

    private int deptno;     // 해당 컬럼이름과 같게 만들어 줘야 한다.
    private String dname;
    private String loc;
}
