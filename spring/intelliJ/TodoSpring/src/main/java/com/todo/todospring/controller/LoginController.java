package com.todo.todospring.controller;


import com.todo.todospring.dao.MemberDao;
import com.todo.todospring.domain.Member;
import com.todo.todospring.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private LoginService loginService;

    @GetMapping
    public String loginForm(){
        return "loginForm";
    }

    @PostMapping
    public String login(
            @RequestParam("uid")String uid,
            @RequestParam("upw")String upw,
            HttpServletRequest request
    ) throws Exception {

        Member member = loginService.login(uid, upw);

        if(member != null){
            // 로그인 처리
            HttpSession session = request.getSession(); // 세션객체를 무조건 받아와야 할 땐 (true)
            session.setAttribute("loginInfo", member.toLoginInfo());


        }

        return "redirect:/index.jsp";
    }
}
