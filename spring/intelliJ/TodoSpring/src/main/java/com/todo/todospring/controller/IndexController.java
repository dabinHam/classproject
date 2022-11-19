package com.todo.todospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index") // 또는 ("/") 이렇게만 적어도 같지만 안전하게 적어주기
    public String getIndex(){
        return "index";
    }
}
