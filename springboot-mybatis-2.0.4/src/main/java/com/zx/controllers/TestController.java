package com.zx.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 张绚
 * @创建时间 2019/11/6 0006
 * @描述
 */

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "";
    }
}
