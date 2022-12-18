package com.first.app;

import com.first.app.entity.Emp;
import com.first.app.entity.EmpRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest // 1. @SpringBootTest 선언
@Log4j2

public class EmpRepositoryTest {

    @Autowired
    private EmpRepository empRepository;    // 2. 주입받기

    //save 가 잘 되는지 확인

    @Test
    public void empRepositorySaveTest(){

       Emp emp = empRepository.save(Emp.builder()
                       /*.empno()   // empno는 들어가지않음! 주의!*/
                       .ename("SON")
                       .job("MANAGER")
                       .mgr(null)
                       .hiredate(LocalDate.now())
                       .sal(4000d)  // Double형이기 때문에 4000으로만 넣으면 에러 발생, d 붙혀주었음.
                       .comm(null)
                       .deptno(30)
                        .build());

        log.info("emp entity insert >>>>>>>>" + emp);   // emp가 0 이라는걸 확인하기 위함.
    }

    @Test
    public void empListTest(){  // empListTest : 페이징 처리를 위하여 결과 먼저 확인해보기

        List<Emp> list =  empRepository.findAll();    // findAll() : List Type으로 가져온다.

        log.info("############################ ############################ ############################");
        for(Emp emp : list){
            log.info(emp);
        }

    }

    @Test
    public void empPagingTest(){
        // page는 0부터 시작!! | 화면에 보이는 1페이지 = page 0
//        Pageable pageable = PageRequest.of(0,5); //  Pageable : org.springframework.data.domain 로 선택 해주기
        Pageable pageable = PageRequest.of(3,5); // 4페이지

        Page<Emp> result = empRepository.findAll(pageable); //  pageable로 하게되면 page type으로 반환.

        log.info("############################ ############################ ############################");
        log.info("result >>>>조회항목 리스트 " + result.getContent());
        log.info("result >>>>전체 게시물의 개수 " + result.getTotalElements());
        log.info("result >>>>전체 페이지의 개수 " + result.getTotalPages());
        log.info("result >>>>현재 요청 페이지 번호 " + result.getNumber());
        log.info("result >>>>페이지당 표현할 항목의 개수 " + result.getSize());
        log.info("result >>>>현재 페이지에 출력된 항목의 개수 " + result.getNumberOfElements());

    }





}// EmpRepositoryTest end
