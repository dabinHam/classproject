package com.firstcoding.mvc.springmvc.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Log4j2
@Controller
@RequestMapping("/cookie")
public class CookieController {

    @GetMapping("/viewCk")
    public String viewCookie(
            @CookieValue("userName") String userName ,       // String userName을 받고싶음 -> @CookieValue를 붙혀준 후 ("") 이름을 적어준다.
            @CookieValue(name = "auth", defaultValue = "ok") String auth,
            Model model,
            @RequestHeader("Referer") String referer
    ){

        log.info("referer = " + referer);
        log.info("auth = " + auth);
        log.info("userName = " + userName);

        model.addAttribute("cookieName", "userName");
        model.addAttribute("cookieValue", userName);

        return "cookie/viewCk";
    }

    @GetMapping("/make")
    public String makeCookie(
            HttpServletResponse response        // 매개변수를 받아서 처리
    ){

        Cookie cookie = new Cookie("userName","son");
        cookie.setPath("/");        // "/" <- 모든요청을 받을 수 있음.
        cookie.setMaxAge(60*60);       // 초 단위 . 1시간

        response.addCookie(cookie);

        return "/cookie/make";
    }

}
