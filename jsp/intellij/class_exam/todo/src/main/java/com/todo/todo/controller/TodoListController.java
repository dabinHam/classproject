package com.todo.todo.controller;

import com.todo.todo.service.TodoService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TodoListController", value = "/todo/list")
public class TodoListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 테스트
        System.out.println("todo list ... doGet()");

        // 출력 결과
//        String title = "Todo List";
//        request.setAttribute("title", title);
        request.setAttribute("title","Todo List");
        request.setAttribute("todoList", new TodoService().getTodolist());

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/todo/list.jsp");
        dispatcher.forward(request, response);

    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

}