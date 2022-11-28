package com.todo.todospring.mapper;

import com.todo.todospring.domain.Member;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Connection;
import java.sql.SQLException;

@Mapper
public interface MemberMapper {

    // 회원가입
    int insertMember(Member member) throws SQLException;

    Member selectByIdPw(String uid, String upw) throws SQLException;   // param1, param2 <- xml로 전달되는 1번째 2번째 값
}
