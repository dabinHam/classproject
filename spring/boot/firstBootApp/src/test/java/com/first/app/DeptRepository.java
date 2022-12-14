package com.first.app;


import com.first.app.entity.Dept;
import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Log4j2
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class DeptRepository {
    @Autowired
    private com.first.app.entity.DeptRepository deptRepository;
    @Test
    public void jpaMehodoTest(){
        // 전체 리스트 반환 findAll()s
        List<Dept> list1 = deptRepository.findAll();
        for(Dept dept : list1){
            log.info(dept);
        }
    }

}
