package com.firstcoding.mvc.springmvc.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {

//    @ExceptionHandler(NumberFormatException.class)
//    @ResponseBody
//    public String exceptionNumber(NumberFormatException exception){
//
//        log.info(exception.getMessage());
//
//        return "NumberFormatException ...";
//    }
//
//    @ExceptionHandler(NullPointerException.class)
//    @ResponseBody
//    public String exceptionNull(NullPointerException exception){
//
//        log.info(exception.getMessage());
//
//        return "NullPointerException ...";
//    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public String exception(Exception exception){

        log.info(exception.getMessage());

        // []배열 이 나오면 반복이 가능하다! 라고 생각하기
        StackTraceElement[] stackTraceElements = exception.getStackTrace();

        StringBuffer buffer = new StringBuffer("<h1>");
        buffer.append(exception.getMessage() + "</h1>");
        buffer.append("<hr>");

        for(StackTraceElement element : stackTraceElements){
            buffer.append("<div>" + element + "</div>");
        }

        return buffer.toString();
    }

    // 특정 뷰 페이지에서(error,status 404server 등등 에러가 발생한 경우) 커스텀한 페이지로 이동하여 에러처리
    // HttpStatus : 잘못된 요청으로 인하여 발생되는 에러 확인가능 
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)   //NOT_FOUND = 404
    public String notFound(){
        return "custom404";
    }






}
