package com.todo.todo.service;

import com.todo.todo.domain.TodoDTO;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

    public Object getTodolist(){

        List<TodoDTO> list = new ArrayList<>();

        for(int i=0; i<10; i++){
            list.add(new TodoDTO(i+1, "todo"+i, "2022-12-25", false));
        }

        return list;
    }








}