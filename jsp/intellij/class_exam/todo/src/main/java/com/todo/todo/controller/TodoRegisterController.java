package com.todo.todo.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

// get 방식으로 하는 사용자가 입력할 수 잇는 폼이 화면에 나와야 한다.
@WebServlet(name = "TodoRegisterController", value = "/todo/register")
public class TodoRegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 사용자가 입력할 수 있는 폼 화면
        System.out.println("register get...");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/register.jsp");
        dispatcher.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 사용자가 입력한 데이터를 받아서 처리
        System.out.println("register post ...");

        // 한글처리 : post
        request.setCharacterEncoding("utf-8");

        // 데이터 받기
        String todo = request.getParameter("todo");
        String dueDate = request.getParameter("dueDate");

        System.out.println(todo);
        System.out.println(dueDate);

        response.sendRedirect("/todo/list");


    }
}
