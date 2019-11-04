package com.zx.springbootweb.controllers;

import com.zx.springbootweb.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @创建人 张绚
 * @创建时间 2019/11/4 0004
 * @描述
 */
@ControllerAdvice
public class MyExceptionHanlder {

    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String,Object>();
        /**
         * Integer statusCode = (Integer) request
         * 				.getAttribute("javax.servlet.error.status_code");
         */
        //传入自己的错误状态码,4xx，5xx，否则就不会进入定制错误页面的解析流程
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("code", "user.noexist");
        map.put("message", e.getMessage());
        request.setAttribute("ext", map);
        return "forward:/error";
    }
}
