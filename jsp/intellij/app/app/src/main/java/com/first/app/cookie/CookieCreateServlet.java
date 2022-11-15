package com.first.app.cookie;

import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.UUID;

@WebServlet(name = "CookieCreateServlet", value = "/cookie/create")
@Log4j2
public class CookieCreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 새로운 쿠키값을 만들고싶음
        Cookie cookie = new Cookie("userid","cool");
        cookie.setMaxAge((60*10));  // 60초 * 10 = 10분
        response.addCookie(cookie);

        // 유니크한 식별 값, UUID: 1.5버전에서 사용된다.
        UUID str = UUID.randomUUID();
        log.info("유니크한 식별 값 생성 =>"+ str.toString());

        Cookie c = new Cookie("uuid",str.toString());
        c.setMaxAge(60*60*24*7);    // <- 1주일동안의 기간 (초단위)

        c.setHttpOnly(true);        // Javascript에서 접속불가!

        response.addCookie(c);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/cookie/create.jsp");
        dispatcher.forward(request,response);

    }

}
