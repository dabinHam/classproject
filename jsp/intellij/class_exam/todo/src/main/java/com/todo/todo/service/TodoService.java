package com.todo.todo.service;

import com.todo.todo.dao.TodoDao;
import com.todo.todo.dao.TodoDaoImpl;
import com.todo.todo.domain.TodoDTO;
import com.todo.todo.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.util.Collections;
import java.util.List;

@Log4j2
public class TodoService {

    private final TodoDao dao;

    static private TodoService instance = new TodoService(new TodoDaoImpl());

    private TodoService(TodoDao dao) {
        this.dao = dao;
    }

    public static TodoService getInstance() {
        return instance;
    }

    public List<TodoDTO> getTodoList() {
        List<TodoDTO> list = null;
        try {
            @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
            list = dao.selectAll(conn);
            log.info(list);
        } catch (Exception e) {
            e.printStackTrace();
            // 예외 발생 시 -> 빈 List 생성
            list = Collections.emptyList();
        }
        return list;
    }

    public TodoDTO getTodo(long tno) {
        TodoDTO todoDTO = null;
        try {
            @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
            todoDTO = dao.selectByTno(conn, tno);
            log.info(todoDTO);
        } catch (Exception e) {
            e.printStackTrace();
            // 예외 발생 시 -> 빈 List 생성
            todoDTO = new TodoDTO();
        }
        return todoDTO;
    }

    public int insertTodo(TodoDTO todoDTO) {
        int result = 0;

        try {
            @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
            result = dao.insertToDo(conn, todoDTO);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public int modify(TodoDTO todoDTO) {
        int result = 0;

        try {
            @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
            result = dao.updateTodo(conn, todoDTO);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public int deleteBytno(long tno) {
        int result = 0;
        try {
            @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
            result = dao.deleteTodo(conn, tno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}