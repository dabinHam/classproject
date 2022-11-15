package com.first.app.dept;

import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;


@WebServlet     //  @WebServlet이 없으면 컨테이너안에 servlet이 있는지 모름
(name = "DeptListController", value = "/dept/list") // name생략 가능하지만 WebServlet이나 이런곳에서 추가적으로 처리할 것이 있다면 name을 부여해줘야한다.

@Log4j2
public class DeptListController extends HttpServlet {   // 포켓내부에서 사용자요청에 대하여 처리하기 위해선 HttpServlet를 상속하는


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        log.info("Dept List get ...");

        DeptService service = new DeptService();

//        System.out.println("Dept List get ...");

        List<Dept> list = null;

        try {
            list = service.getList();
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }

        request.setAttribute("list", list);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/dept/list.jsp");
        dispatcher.forward(request,response);

    }

}
