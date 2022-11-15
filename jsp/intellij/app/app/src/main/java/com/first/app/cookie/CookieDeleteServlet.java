package com.first.app.cookie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CookieDeleteServlet", value = "/cookie/delete")
public class CookieDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 삭제 = 똑같은 이름의 쿠키를 생성
        Cookie cookie = new Cookie("userid","");

        // 쿠키 삭제 메소드는 없다. ->    소멸시간을 0으로 적용해서 소멸
        cookie.setMaxAge(0);

        // 브라우저에게 MaxAge 0 이라는걸 알려줘야한다.
        response.addCookie(cookie);



        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/cookie/delete.jsp");
        dispatcher.forward(request,response);

    }

}
