package com.todo.todospring.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CheckBoxFormatter implements Formatter<Boolean> {
    @Override
    public Boolean parse(String text, Locale locale) throws ParseException {
        if (text == null){  // 파라미터가 안들어온경우 null 일 수도 있음.
            return false;
        }
        return text.equals("on");   // "on"과 같으면 true 처리.

    }

    @Override
    public String print(Boolean object, Locale locale) {
        return object.toString();
    }
}
