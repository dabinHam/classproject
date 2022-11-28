package com.todo.todospring.exception;

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

    @ExceptionHandler(Exception.class)   // 어떤 에러타입일때 이 클래스가 실행할것인지
    @ResponseBody   //  @ResponseBody  :  문자열 그대로 출력하는 것
    public String except(Exception exception){
        log.info(exception.getMessage());
        return exception.getMessage();
    }

    @ExceptionHandler(NoHandlerFoundException.class)    // 우리가 알수없는 예외타입이거나 처리가 없는것
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound(){
        return "error/404error";    // views 의 경로 지정
    }



}
