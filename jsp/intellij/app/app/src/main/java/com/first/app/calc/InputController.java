package com.first.app.calc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
// value에 input 만 써야하고 input.jsp 쓰면 안됨. -> JSP파일을 찾게됨
// value에   *.do   를 하면 모든 요청을 실행하게된다.
@WebServlet(name = "InputController", value = "/calc/input")
public class InputController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("Calc InputController : doGet()");


    // controller(Servlet) => Model (Service -> Dao)
    // Model -> controller : 데이터 반환

    // 결과 데이터
    String result = "계산기";   // Model을 통한 결과 Data

    // view 페이지에 결과 데이터 전달 (공유)
    request.setAttribute("title",result);



    // 화면을 구성해야 하는 경로 , view 지정
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/calc/input.jsp");
    // forward : request 객체 공유!!
    dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 사용자 입력데이터 받기
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");

        // 핵심처리
        int result = Integer.parseInt(num1) + Integer.parseInt(num2);

        req.setAttribute("num1",num1);
        req.setAttribute("num2",num2);
        req.setAttribute("result",result);

        // 결과 view 생성처리
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calc/result.jsp");
        dispatcher.forward(req, resp);
    }
}
