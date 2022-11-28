package com.todo.todospring.controller;


import com.todo.todospring.domain.Member;
import com.todo.todospring.domain.MemberRegRequest;
import com.todo.todospring.service.MemberRegService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Log4j2
@Controller
@RequestMapping("/member/register")
public class MemberRegController {

    @Autowired(required = false)
    private MemberRegService regService;

    @GetMapping
    public String getRegForm(){
        return "member/regForm";
    }

    @PostMapping
    public String reg(
            MemberRegRequest regRequest,
            BindingResult bindingResult,
            HttpServletRequest request // 저장경로를 잡기위하여 설정

    ) throws Exception {
        if (bindingResult.hasErrors()){
            log.info(bindingResult.getAllErrors());

            return "redirect/member/register";
        }


        log.info(regRequest);
        regService.memberReg(regRequest, request);
//        log.info(regRequest.toMember());
        return "redirect:/index.jsp";   // 회원가입이 완료되면 다시 index로 돌아가게하기
    }
}
