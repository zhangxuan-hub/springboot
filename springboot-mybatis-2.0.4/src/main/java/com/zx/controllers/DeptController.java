package com.zx.controllers;

import com.zx.bean.Department;
import com.zx.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 张绚
 * @创建时间 2019/11/7 0007
 * @描述
 */

@RestController
public class DeptController {

    @Autowired
    private DepartmentMapper mapper;

    @RequestMapping(value = "/dept", method = RequestMethod.GET)
    public Department insertDept(Department department) {
        System.out.println(department);
        mapper.insertDept(department);
        return department;
    }

    @RequestMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return mapper.getDeptById(id);
    }
}
