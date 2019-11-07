package com.zx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @创建人 张绚
 * @创建时间 2019/11/6 0006
 * @描述
 */

@Controller
public class HelloController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/query")
    public Map<String, Object> map() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM department");
        return list.get(0);
    }
}
