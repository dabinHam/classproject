package com.spring_todo.s_todo.controller;


import com.spring_todo.s_todo.domain.TodoDTO;
import com.spring_todo.s_todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo/modify")
public class TodoModifyController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public String getModifyForm(Model model, @RequestParam("tno")int tno){
        model.addAttribute("todo",todoService.getTodo(tno));

        return "todo/modify";
    }

    @PostMapping
    public String modify(TodoDTO todoDTO){
        todoService.modify(todoDTO);
        return "redirect:/todo/list";
    }



}
