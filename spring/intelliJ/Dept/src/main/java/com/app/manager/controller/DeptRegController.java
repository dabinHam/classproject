package com.app.manager.controller;

import com.app.manager.domain.DeptDTO;
import com.app.manager.service.DeptRegService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/dept/register")
public class DeptRegController {
    @Autowired
    private DeptRegService regService;

    @GetMapping
    public void getRegForm(){
        log.info(regService);
    }

//    redirect 처리할거니까 void 말고 String // redirect : 같은경로구분, 다시반복제어 ?
    @PostMapping
    public String reg(DeptDTO deptDTO){

        regService.insertDept(deptDTO);
        return "redirect:/dept/list";
    }
}
