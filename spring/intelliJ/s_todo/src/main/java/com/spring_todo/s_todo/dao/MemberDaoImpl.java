package com.spring_todo.s_todo.dao;

import com.spring_todo.s_todo.domain.Member;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Log4j2
@Repository
public class MemberDaoImpl implements MemberDao {
    @Override
    public int insertMember(Connection conn, Member member) throws SQLException {

        log.info(member);

        String sql = "insert into member(uid, upw, uname, uphoto) value(?,?,?,?)";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,member.getUid());
        pstmt.setString(2,member.getUpw());
        pstmt.setString(3,member.getUname());
        pstmt.setString(4,member.getUphoto());

        return pstmt.executeUpdate();
    }

    @Override
    public Member selectByIdPw(Connection conn, String uid, String upw) throws SQLException {

        String sql = "select * from member where uid=? and upw=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,uid);
        pstmt.setString(2,upw);

        @Cleanup ResultSet rs = pstmt.executeQuery();

        Member member = null ;

        if(rs.next()){
            member = Member.builder()
                    .idx(rs.getInt("idx"))
                    .uid(rs.getString("uid"))
                    .upw(rs.getString("upw"))
                    .uname(rs.getString("uname"))
                    .uphoto(rs.getString("uphoto"))
                    .build();
        }

        return member;
    }
}
