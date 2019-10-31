package com.zx.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @创建人 张绚
 * @创建时间 2019/10/29 0029
 * @描述
 */

@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,
                        Map<String, String> errorfInfo,
                        HttpSession session) {
        if("zhangxuan".equals(username) && "123".equals(password)) {
            //验证成功,保存用户名密码，以便于拦截跳过验证直接访问网站的拦截器使用
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }else {
            errorfInfo.put("msg", "用户名密码有误，请检查！");
            return "index";
        }
    }
}
