package com.spring_todo.s_todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoListController {

    @RequestMapping("/todo/list")
    public String getTodoList(){
        return "/todo/list";
    }
}
