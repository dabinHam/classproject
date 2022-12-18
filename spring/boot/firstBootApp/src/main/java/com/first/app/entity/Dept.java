package com.first.app.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "dept")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Dept {
        // 0이라는 값을 인식하지못하는 에러가 생길 수 있음-
    @Id // 필수!!
    @GeneratedValue(strategy = GenerationType.IDENTITY) // mysql mariDB auto Incement

    @Column
    private Integer deptno;

    @Column(length = 20, nullable = false)
    private String loc;

    @Column(length = 20, nullable = false)
    private String dname;
}
