package com.spring_todo.s_todo.dao;

import com.spring_todo.s_todo.domain.Member;

import java.sql.Connection;
import java.sql.SQLException;

public interface MemberDao {

    int insertMember(Connection conn, Member member) throws SQLException;
    Member selectByIdPw(Connection conn, String uid, String upw) throws SQLException;
}
