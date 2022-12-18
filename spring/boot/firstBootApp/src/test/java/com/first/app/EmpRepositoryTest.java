package com.first.app;

import com.first.app.entity.Emp;
import com.first.app.entity.EmpRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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


}
