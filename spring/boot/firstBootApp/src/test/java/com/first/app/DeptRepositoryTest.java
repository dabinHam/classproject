package com.first.app;

import com.first.app.entity.Dept;
import com.first.app.entity.DeptRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@Log4j2
public class DeptRepositoryTest {

    @Autowired
    private DeptRepository deptRepository;

    @Test
    public void jpaMethodTest(){
        // 전체 리스트 반환 findAll()
        /*select
        dept0_.deptno as deptno1_0_,
                dept0_.dname as dname2_0_,
        dept0_.loc as loc3_0_
                from
        dept dept0_*/
        List<Dept> list1 = deptRepository.findAll();
        for(Dept dept : list1){
            log.info(dept);
        }
        log.info("::::::::::::::::::::::: ::::::::::::::::::::::: :::::::::::::::::::::::");

        // 정렬 기준 설정
        /*select
        dept0_.deptno as deptno1_0_,
                dept0_.dname as dname2_0_,
        dept0_.loc as loc3_0_
                from
        dept dept0_
        order by
        dept0_.dname desc*/
        Sort sort = Sort.by(Sort.Direction.DESC,"dname");    // DESC : 오름차순,내림차순
        List<Dept> list2 = deptRepository.findAll(sort);
        for(Dept dept : list2){
            log.info(dept);
        }
        log.info("::::::::::::::::::::::: ::::::::::::::::::::::: :::::::::::::::::::::::");

        // 검색   findById
        /*select
        dept0_.deptno as deptno1_0_0_,
                dept0_.dname as dname2_0_0_,
        dept0_.loc as loc3_0_0_
                from
        dept dept0_
        where
        dept0_.deptno=?*/
        Optional<Dept> dept1 = deptRepository.findById(10); // findById : entity에 ID로 지정해놓은 컬럼
        Dept deptData = dept1.orElse(null);     // null에 대한 반환값, null 처리를 어떻게 할 것인지
        log.info("Dept >>>>>> " + deptData);

        log.info("::::::::::::::::::::::: ::::::::::::::::::::::: :::::::::::::::::::::::");

        // 검색 , ~~중에 찾는것
         /*select
                dept0_.deptno as deptno1_0_,
                dept0_.dname as dname2_0_,
                dept0_.loc as loc3_0_
            from
                dept dept0_
            where
                dept0_.deptno in (
                    ? , ? , ? , ?
                )*/
        List<Integer> nos = Arrays.asList(10, 20, 30, 40);
        List<Dept> list3 = deptRepository.findAllById(nos); // where in 연산 : 많이 사용되는 편
        for(Dept dept : list3){
            log.info(dept);
        }
        log.info("::::::::::::::::::::::: ::::::::::::::::::::::: :::::::::::::::::::::::");


        //  insert
        Dept insertData = Dept.builder().dname("기획팀").loc("서울").build();

        log.info("insert 전 데이터 >>>>>> " + insertData);
        Dept resultData = deptRepository.save(insertData);
        log.info("insert 후 데이터 >>>>>> " + resultData);
        log.info("::::::::::::::::::::::: ::::::::::::::::::::::: :::::::::::::::::::::::");

        // update -> save(S) 이용
        Dept editData = Dept.builder().deptno(207).dname("QA").loc("분당").build();

        Dept editResult = deptRepository.save(editData);

        log.info(editResult);

        log.info("::::::::::::::::::::::: ::::::::::::::::::::::: :::::::::::::::::::::::");


        // delete
        //deptRepository.deleteById(208);

        // 개수 count() | 반환타입: long
        long cnt = deptRepository.count();
        log.info("전체 부서의 수 >>>>>>>>" + cnt);




    }

    @Test
    public void jpqlMethodTest(){
        Dept dept1 = deptRepository.findByDeptno(30);

        log.info(">>>>>>>>>>>>>>>>>>>>>>>" + dept1);

        log.info("##################### ##################### #####################");

        List<Dept> list1 = deptRepository.findByDnameLikeOrderByLocAsc("A");

        for (Dept dept : list1){
            log.info(dept);
        }

        log.info("##################### ##################### #####################");

        // Like 패턴검색("%%")
//        List<Dept> list2 = deptRepository.findByLocLike("%B%");
        List<Dept> list2 = deptRepository.findByLocLike("%서%");

        for (Dept dept : list2){
            log.info(dept);
        }

        log.info("##################### ##################### #####################");
        List<Dept> list3 = deptRepository.findByDeptnoBetween(100, 300);

        for (Dept dept : list3){
            log.info(dept);
        }



    }

}
