package com.spring_todo.s_todo.service;


import com.spring_todo.s_todo.dao.MemberDao;
import com.spring_todo.s_todo.domain.Member;
import com.spring_todo.s_todo.domain.MemberRegRequest;
import com.spring_todo.s_todo.util.ConnectionProvider;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@Log4j2
@Service
public class MemberRegService {

    @Autowired
    private MemberDao memberDao;

    public int memberReg(MemberRegRequest regRequest, HttpServletRequest request) throws Exception {

        String newFileName = null;

        // 파일 업로드 처리 여부 체크
        if (
                regRequest.getUphoto() != null
                        && !regRequest.getUphoto().isEmpty()     // isEmpty() : 파일이 비어있는지
                        && regRequest.getUphoto().getSize() > 0) {

            // uri 정의 : 저장할 폴더
            String dirURI = "/uploadfile/member";
            // 시스템의 절대 경로
            String dirRealPath = request.getSession().getServletContext().getRealPath(dirURI);
            log.info(dirRealPath);

            // currentTimeMillis() : 밀리초 단위
//            newFileName = System.currentTimeMillis() + regRequest.getUphoto().getOriginalFilename();
            // nanoTime() 또는 난수발생 으로 처리해도된다. 문자형식으로 해놓고  문자열의형태가 이미지로 처리되는것.
            newFileName = System.nanoTime() + regRequest.getUphoto().getOriginalFilename();
            log.info(newFileName);

            // 저장
            try {
//                regRequest.getUphoto().transferTo(new File(dirRealPath,regRequest.getUphoto().getOriginalFilename()));
                regRequest.getUphoto().transferTo(new File(dirRealPath,newFileName));
                //   getOriginalFilename : 원래있는 파일이름을 가져오는것
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        Member member = regRequest.toMember();

        if(newFileName != null){
            member.setUphoto(newFileName);
        }
        log.info(member);

        @Cleanup Connection conn = ConnectionProvider.getInstance().getConnection();

        return memberDao.insertMember(conn , member);
    }


}
