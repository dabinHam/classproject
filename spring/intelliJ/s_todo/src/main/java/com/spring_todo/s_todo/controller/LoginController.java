package com.spring_todo.s_todo.controller;

import com.spring_todo.s_todo.domain.Member;
import com.spring_todo.s_todo.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping
    public String loginForm(){
        return "/loginForm";
    }


    // 로그인체크여부
    @PostMapping
    public String login(
            @RequestParam("uid")String uid,
            @RequestParam("upw")String upw,
            HttpServletRequest request
    ) throws Exception {
        Member member = loginService.login(uid,upw);

        if(member != null){
            HttpSession session = request.getSession();
            session.setAttribute("loginInfo",member.toLoginInfo());
        }

        return "redirect:/index";
    }
}
