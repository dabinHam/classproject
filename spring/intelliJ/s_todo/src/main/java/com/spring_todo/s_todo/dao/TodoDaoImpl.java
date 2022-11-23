package com.spring_todo.s_todo.dao;

import com.spring_todo.s_todo.domain.TodoDTO;
import lombok.Cleanup;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


@RequestMapping("/todoDao")
public class TodoDaoImpl implements TodoDao {
    @Override
    public List<TodoDTO> selectAll(Connection conn) throws SQLException {

        List<TodoDTO> result = null;

        @Cleanup PreparedStatement pstmt = conn.prepareStatement("Select * from tbl_todo");
        @Cleanup ResultSet rs = pstmt.executeQuery();

        if (rs.next()){
            result = new ArrayList<>();
            do{
                result.add(toTodoDto(rs));
            }while (rs.next());
        }else {
            result = Collections.emptyList();
        }

        return result;
    }

    private TodoDTO toTodoDto(ResultSet rs) throws SQLException {

        TodoDTO dto = new TodoDTO(
                rs.getLong(1),
                rs.getString(2),
                rs.getDate(3).toLocalDate(),
                rs.getBoolean(4));

        return dto;
    }

    @Override
    public TodoDTO selectByTno(Connection conn, long tno) throws SQLException {

        TodoDTO todoDTO = null;

        @Cleanup PreparedStatement pstmt = conn.prepareStatement("Select * from tlb_todo where tno=?");
        pstmt.setLong(1,tno);
        @Cleanup ResultSet rs = pstmt.executeQuery();

        return todoDTO;
    }

    @Override
    public int insertToDo(Connection conn, TodoDTO dto) throws SQLException {
        return 0;
    }

    @Override
    public int updateTodo(Connection conn, TodoDTO dto) throws SQLException {
        return 0;
    }

    @Override
    public int deleteTodo(Connection conn, long dto) throws SQLException {
        return 0;
    }
}
