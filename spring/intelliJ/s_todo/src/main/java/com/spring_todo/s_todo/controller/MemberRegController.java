package com.spring_todo.s_todo.controller;


import com.spring_todo.s_todo.domain.MemberRegRequest;
import com.spring_todo.s_todo.service.MemberRegService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Log4j2
@Controller
@RequestMapping("/member/insert")
public class MemberRegController {

    @Autowired
    private MemberRegService regService;

    @GetMapping
    public String getRegForm(){
        return "member/regForm";
    }

    @PostMapping
    public String reg(
            MemberRegRequest regRequest,
            HttpServletRequest request // 저장경로를 잡기위하여 설정
    ) throws Exception {

        log.info(regRequest);
        regService.memberReg(regRequest, request);
//        log.info(regRequest.toMember());
        return "redirect:/index.jsp";   // 회원가입이 완료되면 다시 index로 돌아가게하기
    }

}
