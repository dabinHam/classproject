package com.first.app.calc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "makeResultContoroller", value = "/calc/makeResult")
public class makeResultContoroller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");

        System.out.println(num1);
        System.out.println(num2);

        // index.jsp로 보내는 Redirect
        response.sendRedirect("/index.jsp");


    }
}
