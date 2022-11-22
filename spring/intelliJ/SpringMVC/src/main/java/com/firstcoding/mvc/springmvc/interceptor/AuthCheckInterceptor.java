package com.firstcoding.mvc.springmvc.interceptor;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Log4j2
public class AuthCheckInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.info(" >>>>>>> 회원 로그인 여부 체크 ......");

        //  회원 로그인 상태 체크
        HttpSession session = request.getSession(false);    // false :  없으면 null을 반환해주겠다라는 뜻 |  기존 : session.isNew()를 사용해서 체크하였음.

        // 로그인상태 체크여부 실질적 부분  : session.getAttribute("loginInfo")
        // session =null이면 로그인상태 체크를 할 필요가 없고 , 체크가 실행 되서도 안된다 . !
        if (session != null && session.getAttribute("loginInfo")!= null){    // loginInfo 파라미터가 null 이 아니여야 한다는 뜻.
            log.info("로그인 상태 !!!");
            return true;        // 다음으로 넘어가려면 return true를 처리해줘야 넘어갈 수 있다.
        }
        log.info("비 로그인 상태 ...");
        response.sendRedirect("/login");
        return false;      // false 이면 다음으로 넘어갈 수 없다.
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
