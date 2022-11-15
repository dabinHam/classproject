package com.first.app.filter;

import com.first.app.login.domain.Member;
import com.first.app.login.service.MemberService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginCheckFilter", urlPatterns = {"/mypage/*"})
@Log4j2
public class LoginCheckFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        log.info("LoginCheckFilter 로그인 ");

        // Session 객체에 liginInfo속성이 존재하는지 체크 -> 로그인체크
        // 없으면 => 로그인상태로 이동

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res =(HttpServletResponse) response;

        // 현재세션 구하기
        HttpSession session = req.getSession();

        if(session.getAttribute("loginInfo") == null){

            // 쿠키 체크 : uuid
            Cookie cookie = findCookie(req.getCookies(),"uuid");

            if(cookie != null){

                log.info("uuid Cookie 존재....");

                String uuid = cookie.getValue();

                try {
                    // DB 에서 uuid 값을 가지는 회원 데이터를 찾는다!!!
                    Member member = MemberService.getInstance().selectByUUID(uuid);

                    if(member != null){
                        log.info("uuid 값을 가지고 있는 회원의 정보로 로그인 처리");
                        session.setAttribute("loginInfo", member.getUid());
                    }

                } catch (Exception e) {
//                    throw new RuntimeException(e);
                    e.printStackTrace();
                }
                chain.doFilter(request,response);
                return;

            }


            log.info ("비로그인 상태 => 로그인 페이지로 이동");
            res.sendRedirect("login");
            return;
        }
        chain.doFilter(request, response);
    }

    // Cookie[], 찾고자 하는 Cookie 이름 전달하면 값을 반환
    private Cookie findCookie(Cookie[] cookies, String name){

        if(cookies == null || cookies.length == 0){
            return null;
        }
        Cookie cookie = null;

        for (int i=0 ; i<cookies.length; i++){
            if(name.equals(cookies[i].getName())){
                cookie = cookies[i];
                break;
            }
        }

        return cookie;
    }


}