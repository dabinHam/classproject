package com.myproject.todo_spring.controller;

import com.myproject.todo_spring.domain.LoginRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@Log4j2
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String getLogin(Model model){
        model.addAttribute("msg","회원만 리스트를 사용할 수 있습니다. 로그인해주세요");
        return "/login/login";
    }

    @PostMapping
    public String login(
                        @RequestParam(value = "p", defaultValue= "1") int page,
                        HttpServletRequest request,
                        HttpServletResponse response,
                        @ModelAttribute("req") LoginRequest loginRequest,
                        @RequestParam  Map paramMap
    ){

        log.info("loginRequest => " + loginRequest);
        log.info("paramMap => " + paramMap);

        return "/todo/list";   // "redirect:/index"    => return
    }



}
