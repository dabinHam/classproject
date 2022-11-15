package com.first.app.login.controller;

import com.first.app.login.domain.Member;
import com.first.app.login.service.MemberService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MemberRegController", value = "/member/register")
@Log4j2
public class MemberRegController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // getform
        log.info("회원 가입 폼 ...");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/member/regform.jsp");
        dispatcher.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // getpost
        log.info("회원가입 처리 ...");

        // 사용자 입력 데이터 받기
        String uid = request.getParameter("uid");
        String upw = request.getParameter("upw");


        // lombok의 builder() : 유연하게 객체를 만들어줄 수 있음.
//        Member member = Member.builder().build();   // member의 객체를 만들어줌.

        Member member = Member.builder()
                .uid(uid)   // uId와 uPw를 가진 객체만 만들어줌.
                .upw(upw)
                .build();

        log.info(member);

        // 예외처리 : 입력실패의 경우
        int result = 0;
        try {
            result = MemberService.getInstance().insertMember(member);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }

        if (result>0){
            log.info("회원 가입 성공 ....");
        }

        response.sendRedirect("/index.jsp");

    }
}
