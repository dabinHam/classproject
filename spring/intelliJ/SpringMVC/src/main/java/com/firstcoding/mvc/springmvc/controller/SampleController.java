package com.firstcoding.mvc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @RequestMapping("/sample")
    public ModelAndView getSamplePage(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("sample");    // => /WEB-INF/views/sample.jsp
        return mav;
    }

    @RequestMapping("/sample2")     // 경로는 대문자로 하지 않는다.
    public String getStringPage(){
        return "sample2";           // => /WEB-INF/views/sample2.jsp
    }

    // View 페이지만 있는건 이런식으로 설정하여 띄운다.   다른 디렉토리가 있거나 하면 사용은 별루.. 오류날가능성있음.
    @RequestMapping("/sample3")
    public void getVoidPage(){

    }

    @RequestMapping("/sample4")
    @ResponseBody
    public String page(){
        return "Y";
    }

    @RequestMapping("/sample5")
    @ResponseBody
    public String page2(int num){
        String str = null;
        str.trim();
        return String.valueOf(num); // 정상처리 : sample5?num=10        | 오류발생 : sample5 , sample5?num=aaa
    }




}
