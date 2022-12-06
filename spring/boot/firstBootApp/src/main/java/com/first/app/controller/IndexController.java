package com.first.app.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log4j2
public class IndexController {

    @GetMapping("/")
    @ResponseBody   // @ResponseBody : 문자열 그대로 응답처리 -> @Controller 대신  @RestController를 사용하면 @ResponseBody 는 생략이 가능하다
    public String index(){
        log.info(">>> get | /");
        return "Index";
    }

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","Hello ~ Spring boot");
        return "hello";     // templates/hello.html
    }

}
