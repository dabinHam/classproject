package com.first.app;

import sun.nio.cs.UTF_8;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SignupServlet", value = "/signup")
public class SignupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        // 사용자가 입력한 데이터를 추출
        String userid = request.getParameter("userid");
        String pw = request.getParameter("pw");
        String usernm = request.getParameter("usernm");

        String memo = request.getParameter("memo");
        String gender = request.getParameter("gender");
        String[] langs = request.getParameterValues("lang");
        String year = request.getParameter("year");

        response.setContentType("text/html; charset=UTF-8;");

        PrintWriter out = response.getWriter();

        out.write("<html>");
        out.write("<head><title>회원가입 데이터</title></head>");
        out.write("<body>");
        out.write("<h1> userid :" + userid +  "</h1>");
        out.write("<h1> pw :" + pw +  "</h1>");
        out.write("<h1> 이름 :" + usernm +  "</h1>");
        out.write("<h1> 메모 :" + memo +  "</h1>");
        out.write("<h1> 성별 :" + gender +  "</h1>");

//        System.out.println(langs);

        for(String lang : langs ){
            out.write("<h1>선택언어 :" + lang +"</h1>");
        }

        out.write("<h1>선택 년도 :" + year +"</h1>");

        out.write("</body>");
        out.write("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}