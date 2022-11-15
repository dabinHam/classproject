package com.first.app.login.dao;

import com.first.app.login.domain.Member;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDaoImpl implements MemberDao {

    @Override
    public int insertMember(Connection conn, Member member) throws SQLException {

        String sql = "insert into member (uid,upw) values (?,?)";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,member.getUid());
        pstmt.setString(2,member.getUpw());
        int result = pstmt.executeUpdate();

        return result;
    }

    @Override
    public Member selectByUidPw(Connection conn, String uid, String upw) throws SQLException {

        String sql = "Select * from member where uid=? and upw=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,uid);
        pstmt.setString(2,upw);
        @Cleanup ResultSet rs = pstmt.executeQuery();

        Member member = null;
        if(rs.next()){  // rs.next() 가 있으면
            member = Member.builder()
                    .idx(rs.getInt("idx"))
                    .uid(rs.getString("uid"))
                    .upw(rs.getString("upw"))
                    .uuid(rs.getString("uuid"))
                    .build();
        }

        return member;
    }

    @Override
    public int updateUUIDByIdx(Connection conn, String uuid, int idx) throws SQLException {

        String sql = "update member set uuid=? where idx=?";
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,uuid);
        pstmt.setInt(2,idx);
        int result = pstmt.executeUpdate();

        return result;
    }

    @Override
    public Member selectByUUID(Connection conn, String uuid) throws SQLException {

        String sql = "select * from member where uuid=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,uuid);
        ResultSet rs = pstmt.executeQuery();

        Member member = null;
        if(rs.next()){
            member = new Member(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4));
        }

        return member;
    }
}
