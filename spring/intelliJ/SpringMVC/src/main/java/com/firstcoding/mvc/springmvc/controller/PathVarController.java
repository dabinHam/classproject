package com.firstcoding.mvc.springmvc.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
public class PathVarController {

    // url 하나를 놓고 뒤에오는값을 변수처럼 사용하고 싶음
    // http://localhost:8080/member/뒤에오는 값
    // http://localhost:8080/member/1
    // http://localhost:8080/member/11
    // http://localhost:8080/member/30

    @RequestMapping("/members/{type}/{idx}")
    public String getMemberInfo(
            @PathVariable("idx") String idx,
            @PathVariable("type") String type,
            Model model
    ){
        log.info("type =" + type);
        log.info("idx =" + idx);

        model.addAttribute("type", type);
        model.addAttribute("idx",idx);

        return "info";
    }
}
