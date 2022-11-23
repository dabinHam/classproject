package com.spring_todo.s_todo.service;

import com.spring_todo.s_todo.dao.MemberDao;
import com.spring_todo.s_todo.domain.Member;
import com.spring_todo.s_todo.util.ConnectionProvider;
import lombok.Cleanup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;

@Service
public class LoginService {

    @Autowired
    private MemberDao memberDao;

    public Member login(String uid, String upw) throws Exception {

        @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();
        return memberDao.selectByIdPw(conn, uid, upw);

    }

}
