package com.myproject.todo_spring.controller;

import com.myproject.todo_spring.domain.TodoRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Log4j2
@RequestMapping("/todo")
public class TodoController {


    @GetMapping("/list")
    public String getTodoList(Model model){
        List<TodoRequest> list = new ArrayList<>();

        for(int i=0; i<10; i++){
            list.add(new TodoRequest(i+1, "todo"+i, "2022-12-25", false));
        }
        model.addAttribute("todoList",list);
        return "/todo/list";
    }

//    public String get



}
