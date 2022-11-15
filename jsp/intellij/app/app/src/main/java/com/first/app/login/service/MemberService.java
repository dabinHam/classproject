package com.first.app.login.service;

import com.first.app.login.dao.MemberDao;
import com.first.app.login.dao.MemberDaoImpl;
import com.first.app.login.domain.Member;
import com.first.app.util.ConnectionUtil;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;

@Log4j2
public class MemberService {

    private final MemberDao dao;    // instance 변수 , final : 값을 초기화하지않은경우 생성자에서 바로 처리하도록 되어있다.

    private static MemberService instance = new MemberService();

    private MemberService(){        // instance를 더이상 생성하지 못하도록 private 처리
        this.dao = new MemberDaoImpl();
    }

    private MemberService(MemberDao dao){       // 의존성을 낮추는 코딩
        this.dao = dao;
    }

    public static MemberService getInstance(){      // instance를 가져갈수있는 메소드
        return instance;
    }

    public int insertMember(Member member) throws Exception {

        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();

//        int result = 0;
//        dao.insertMember();
//        int result = dao.insertMember(conn, member);

//        return result;
        return dao.insertMember(conn, member);
    }

    public Member login(String uid, String upw) throws Exception {
        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
        return dao.selectByUidPw(conn, uid, upw);
    }

    public int updateUUID(int idx, String uuid) throws Exception {
        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
        return dao.updateUUIDByIdx(conn, uuid, idx);
    }

    public Member selectByUUID(String uuid) throws Exception {
        @Cleanup Connection conn = ConnectionUtil.getInstance().getConnection();
        return dao.selectByUUID(conn, uuid);
    }


}
