package com.todo.todospring.mapper;

import com.todo.todospring.domain.TodoDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.sql.Connection;
import java.util.List;

@Mapper
public interface TodoMapper {

    // Todo 전체 리스트 출력
    @Select("select *from tbl_todo")
    public List<TodoDTO> selectAll();

    // tno 값으로 하나의 Todo 정보를 가져오는 메소드
    @Select("select *from tbl_todo where tno=#{no}")
    public TodoDTO selectByTno(long tno);

    // todo 정보 입력
    int insertToDo(TodoDTO dto);

    // todo 정보 수정
    int updateTodo(TodoDTO dto);

    @Delete("delete from tbl_todo where tno=#{no}")
    // todo 정보 삭제
    int deleteTodo(long dto);

}
