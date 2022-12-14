package com.app.manager.controller;


import com.app.manager.service.DeptDeleteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
public class DeptDeleteController {

    @Autowired
    private DeptDeleteService deleteService;

    @GetMapping("/dept/delete")
    public String deleteDept(@RequestParam("deptno")int deptno){
        log.info("delect..." + deptno);
        deleteService.deleteDept(deptno);
        return "redirect:/dept/list";
      }

}
