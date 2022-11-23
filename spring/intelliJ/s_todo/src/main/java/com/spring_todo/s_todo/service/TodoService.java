package com.spring_todo.s_todo.service;

import com.spring_todo.s_todo.dao.TodoDao;
import com.spring_todo.s_todo.dao.TodoDaoImpl;
import com.spring_todo.s_todo.domain.TodoDTO;
import com.spring_todo.s_todo.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.Collections;
import java.util.List;

@Log4j2
@Repository
public class TodoService {

    @Autowired
    private TodoDao dao;

    static private TodoService instance = new TodoService(new TodoDaoImpl());

    private TodoService(TodoDao dao) {this.dao = dao;}

    public static TodoService getInstance(){return instance;}

    public List<TodoDTO> getTodoList(){
        List<TodoDTO> list = null;
        try {
            @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
            list = dao.selectAll(conn);
        } catch (Exception e) {
            e.printStackTrace();
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

    // 할일 추가
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

    // 할일 수정
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

    // 할일 삭제
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
