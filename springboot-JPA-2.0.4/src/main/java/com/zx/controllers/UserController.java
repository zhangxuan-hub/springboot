package com.zx.controllers;

import com.zx.beans.User;
import com.zx.respositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @创建人 张绚
 * @创建时间 2019/11/8 0008
 * @描述
 */

@Controller
public class UserController {

    @Autowired
    private UserRepository repository;

    @ResponseBody
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        User user = repository.getOne(id);
        System.out.println(user);
        return user;
    }

    @ResponseBody
    @GetMapping("/user")
    public User insertUser(User user) {
        repository.saveAndFlush(user);
        return user;
    }
}
