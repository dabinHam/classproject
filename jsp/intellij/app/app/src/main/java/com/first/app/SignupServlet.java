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

        // 사용자 입력 값 한글 처리
        request.setCharacterEncoding("utf-8");  // post 방식의 경우 이 코드로 한글인코딩을 설정 해줘야 한다.!

        // 사용자가 입력한 데이터를 추출 getParameter();
        String userid = request.getParameter("userid");
        String pw = request.getParameter("pw");
        String usernm = request.getParameter("usernm");

        String memo = request.getParameter("memo");
        String gender = request.getParameter("gender");

        // 이렇게하면 3개를 체크해도 view에 보이는건 제일 앞에있는 값 1개만 출력이 된다. 모든 체크값을 다 보일수 있게 배열로 받게하기
        // 배열 = 반복가능
//        String lang = request.getParameter("lang");

        String[] langs = request.getParameterValues("lang");
        String year = request.getParameter("year");

        response.setContentType("text/html; charset=UTF-8;");  // get 이던 post 이던 한글이 깨지지 않게 처리해주기!

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
        for(String lang : langs ){ // 향상된 for문
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