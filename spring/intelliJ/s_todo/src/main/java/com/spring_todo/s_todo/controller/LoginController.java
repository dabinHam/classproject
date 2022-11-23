package com.spring_todo.s_todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    // 로그인 화면
    @GetMapping
    public String loginForm(){
        return "/loginForm";
    }


    // 로그인체크여부
    @PostMapping
    public String login(){



        return "";
    }
}
