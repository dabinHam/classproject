package com.firstcoding.mvc.springmvc.controller;

import com.firstcoding.mvc.springmvc.domain.UserRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;


@Controller
@RequestMapping("/date")
@Log4j2
public class DateConverterController {

//    @GetMapping
    @RequestMapping(method = RequestMethod.GET)     // @GetMapping = @RequestMapping(method = RequestMethod.GET)
    public String getDateForm(){
        return "dateForm";
    }

    @PostMapping
    public String date(
            LocalDate date,   // String type을 LocalDate로 전달하지못하는 오류가 발생해서 UserRequest라는 클래스를 별도로 생성 하여 처리
            UserRequest userRequest,
            Model model
    ){
        model.addAttribute("date",date);
        return "date";
    }

}
