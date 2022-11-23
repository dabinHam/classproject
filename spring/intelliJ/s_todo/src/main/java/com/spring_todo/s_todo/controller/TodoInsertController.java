package com.spring_todo.s_todo.controller;


import com.spring_todo.s_todo.domain.TodoDTO;
import com.spring_todo.s_todo.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/todo/register")
public class TodoInsertController {

    private final TodoService todoService;

    public TodoInsertController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public String getInsertForm(){ return "todo/register";}

    @PostMapping
    public String insert(
            TodoDTO todoDTO
    ){

        log.info(todoDTO.getTodo());
        log.info(todoDTO.getDuedate());
        log.info(todoDTO);
        log.info("todoDto ->" + todoDTO);

        todoService.insertTodo(todoDTO);


        return "redirect:/todo/list";
    }
}
