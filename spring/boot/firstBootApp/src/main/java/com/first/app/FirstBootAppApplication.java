package com.first.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.first.app.mapper") // 어느 페이지를 스캔해 줄 것인지 정해준다.
public class FirstBootAppApplication {
// 시작 페이지
    public static void main(String[] args) {
        SpringApplication.run(FirstBootAppApplication.class, args);
    }

}
