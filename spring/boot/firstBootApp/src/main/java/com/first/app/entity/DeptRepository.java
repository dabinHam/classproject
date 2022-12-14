package com.first.app.entity;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface DeptRepository extends JpaRepository<Dept,Integer> {


    Dept findByDeptno(Integer deptno);

    List<Dept> findByDnameLikeOrderByLocAsc(String dname);

    List<Dept> findByDeptnoGreaterThanAndDnameLikeAndLocLikeOrderByDeptnoDesc(Integer deptno, String dname, String loc);


    // @Query를 사용하면 이름을 위와같이 길게 하지 않고 짧게 써도 상관없다.
    @Query("select d from Dept d where d.loc like :loc")    // @Param("") 에 있는 게 들어가면 앞에 : 가 붙음
    List<Dept> findByLocLike(@Param("loc") String loc); // loc의 경우 같은게 있을 수 있기 때문에 List로 감싸주었음


    @Query("select d from Dept d where d.deptno between :startNum and :endNum")
    List<Dept> findByDeptnoBetween(@Param("startNum") Integer startNum, @Param("endNum") Integer endNum);


}
