package com.myproject.emp.controller;


import com.myproject.emp.domain.EmpDTO;
import com.myproject.emp.service.EmpRegService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Log4j2
@Controller
@RequestMapping("/emp/register")
public class EmpRegController {

    @Autowired
    private EmpRegService empRegService;

    @GetMapping
    public void getRegForm(){
        log.info("regForm....");
    }

    @PostMapping
    public String reg(@Valid EmpDTO empDTO , BindingResult bindingResult){
        log.info("reg Post ...");
        log.info(empDTO);

//        if (bindingResult.hasErrors()){
//            log.info(bindingResult.getAllErrors());
//            for(ObjectError objectError: bindingResult.getAllErrors()){
//                log.info(objectError.getCodes()[2] + " : " + objectError.getDefaultMessage()
//                ());
//            }
//        }
//
//        empRegService.insertEmp(empDTO);
        empRegService.insertEmp(empDTO);
        return "redirect:/emp/list";
    }

}
