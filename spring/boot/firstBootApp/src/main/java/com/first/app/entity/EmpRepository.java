package com.first.app.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

    // Join에 필요한 처리
    @Query(value = "select e from Emp e join fetch e.dept")
    List<Emp> findEmpDept();

    @Query(value = "select e from Emp e, Dept d where e.dept=d")
    List<Emp> findEmpWithDept();

    // 게시물 리스트 => 제목[12] <= 댓글의 개수
    // 게시물[dept], count 사원 수    <= groupBy를 사용하여 배열로 처리..

}
