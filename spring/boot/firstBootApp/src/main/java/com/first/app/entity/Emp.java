package com.first.app.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity // Entity를 사용할때에는 반드시 @Id 가 있어야 한다.
@Table(name = "emp")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Emp {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GeneratedValue : 자동 증가하는 값에 대한 설정
                                                        // IDENTITY : Mysql , MariaDB       : 일련번호값을 만들어 줘야 함, 완전한건 이거..?
                                                        // SEQUENCE : Oracle
                                                        // TABLE : TABLE 내부에서 만들어 주는 것
                                                        // AUTO : 일반적으로 증가시켜 주는 것
    private Integer empno;


    @Column
    private String ename;

    @Column
    private String job;

    @Column
    private Integer mgr;    // 상사의 사원번호  | 특징 : 대표(King)의 mgr 은 null , 문제점 : DB값이 null 로 들어오게되면 null을 int로 변환해주는 converter가 별도로 없다. 그래서 null 로 처리가 가능한것은 Integer(정수값을 가지는 WapperClass)로 선언해줘야한다.

    @Column
    private LocalDate hiredate;

    @Column
    private Double sal;

    @Column
    private Double comm;

    /*@Column
    private Integer deptno;*/   // <- 외래키 Column (sql 입장)
    ////////////////////////////
    @JoinColumn(name = "deptno")    //  dept 안에있는 deptno를 가져오겠다.
    @ManyToOne  //  ManyToOne : 연관관계에대한 표현 (객체 입장) Many(=emp) | one(=dept)
    private Dept dept;
    // 사원정보 + 부서정보를 Join해 줌


}
