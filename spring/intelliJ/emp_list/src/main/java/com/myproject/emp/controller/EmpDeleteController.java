package com.myproject.emp.controller;


import com.myproject.emp.service.EmpDeleteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class EmpDeleteController {

    @Autowired
    private EmpDeleteService empDeleteService;

    @GetMapping("/emp/delete")
    public String empDeleteService(@RequestParam ("empno") int empno){
        log.info("delete ...." + empno);
        empDeleteService.deleteEmp(empno);
        return "redirect:/emp/list";
    }

}
