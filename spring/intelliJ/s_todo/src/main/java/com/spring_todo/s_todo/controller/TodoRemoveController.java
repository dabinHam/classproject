package com.spring_todo.s_todo.controller;

import com.spring_todo.s_todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoRemoveController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/todo/remove")
    public String removeTodo(
            @RequestParam("tno") int tno
    ){
        todoService.deleteBytno(tno);
        return "redirect:/todo/list";


    }
}
