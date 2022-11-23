package com.firstcoding.mvc.springmvc.controller;

import com.firstcoding.mvc.springmvc.domain.LoginRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping("/login")           // 사용자의 요청을 위에서처리해보기
@Log4j2
// == 기본적인 폼에서 데이터를 받아오는 방법! ==
public class LoginController {

/*
//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getLoginForm(){
        return "login/form";        // => /WEB-INF/views/login/form.jsp
    }*/
    @GetMapping
    public String getLoginForm(Model model){
        model.addAttribute("msg","아이디와 패스워드를 반드시 입력하세요");
        return "login/form";        // => /WEB-INF/views/login/form.jsp
    }

//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String login(String uid, String pw , String p,   // <- 이방법은 추천하진 않는다.
//                        @RequestParam(value = "p",required = true)String userId
//                        @RequestParam(value = "p", defaultValue= "1") String page,
                        @RequestParam(value = "p", defaultValue= "1") int page,         // int, String 전부 다 가능하다.
                        HttpServletRequest request,
                        HttpServletResponse response,
                        @ModelAttribute("req") LoginRequest loginRequest,   // @ModelAttribute("req"): 특정객체를 view로 공유할 수 있게 사용할 수 있다. | name을 부여해줄수있음
                        @RequestParam Map paramMap,      // 여러 파라미터들을 Map안에 넣는다.
                        RedirectAttributes redirectAttributes
                        ){

        String uId2 = request.getParameter("uid");
        String pw2 = request.getParameter("pw");


        log.info("uid => " + uid);
        log.info("pw => " + pw);
        log.info("p => " + p);
        log.info("p => " + page);
        log.info("uId2 => " + uId2);
        log.info("pw2 => " + pw2);
        log.info("loginRequest => " + loginRequest);
        log.info("paramMap => " + paramMap);

        request.getSession().setAttribute("loginInfo", uid);

        redirectAttributes.addAttribute("type","test");
        redirectAttributes.addFlashAttribute("ermsg","에러메시지");

//        return "login/login";   // "redirect:/index"    => return
        return "redirect:/mypage/mypage1";      // ?type=test       <- 로 나옴.
    }

    @GetMapping("/info")    // http://localhost:8080/login/info
    public String info(){
        return "login/info";
    }








}
