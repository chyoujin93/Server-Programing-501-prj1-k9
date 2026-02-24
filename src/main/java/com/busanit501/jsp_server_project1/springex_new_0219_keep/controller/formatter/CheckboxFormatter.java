package com.busanit501.jsp_server_project1.springex_new_0219_keep.controller.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CheckboxFormatter implements Formatter {
    @Override
    public Object parse(String text, Locale locale) throws ParseException {
        if(text == null) {
            return false;
        }
        boolean result = text.equals("on");
        return result;
    }

    @Override
    public String print(Object object, Locale locale) {
        return object.toString();
    }
}
