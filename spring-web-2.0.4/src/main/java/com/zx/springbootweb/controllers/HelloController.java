package com.zx.springbootweb.controllers;

import com.zx.springbootweb.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @创建人 张绚
 * @创建时间 2019/11/4 0004
 * @描述
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user) {
        if("aaa".equals(user)) {
            throw new UserNotExistException();
        }
        return "hello";
    }
}
