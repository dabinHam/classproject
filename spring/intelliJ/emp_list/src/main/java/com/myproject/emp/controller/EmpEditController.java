package com.myproject.emp.controller;


import com.myproject.emp.domain.EmpDTO;
import com.myproject.emp.service.EmpEditService;
import com.myproject.emp.service.EmpReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequestMapping("emp/edit")
public class EmpEditController {

    @Autowired
    private EmpEditService empEditService;

    @Autowired
    private EmpReadService empReadService;

    @GetMapping
    public void getEditForm(@RequestParam("empno") int empno, Model model){
    log.info("edit get ...");
    model.addAttribute("emp",empReadService.getEmp(empno));
    }

    @PostMapping
    public String edit(EmpDTO empDTO){
        log.info("edit post ...");
        log.info(empDTO);

        empEditService.editEmp(empDTO);

        return "redirect:/dept/list";
    }

}
