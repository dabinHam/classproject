package com.firstcoding.todo.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoRemoveController ", value = "/Todo/remove")
public class TodoRemoveController extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("remove post()");

        response.sendRedirect("/Todo/list");
    }
}
