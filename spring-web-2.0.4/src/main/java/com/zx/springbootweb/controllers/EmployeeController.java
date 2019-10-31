package com.zx.springbootweb.controllers;

import com.zx.springbootweb.dao.DepartmentDao;
import com.zx.springbootweb.dao.EmployeeDao;
import com.zx.springbootweb.entities.Department;
import com.zx.springbootweb.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

/**
 * @创建人 张绚
 * @创建时间 2019/10/30 0030
 * @描述
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    @RequestMapping(value = "/emps")
    public String empList(Model model) {
        Collection<Employee> emps = employeeDao.getAll();
        model.addAttribute("emps", emps);

        return "emp/list";
    }

    //员工添加页面
    @GetMapping(value = "/emp")
    public String toAddEmppage(Map<String, Object> map) {
        Collection<Department> depts = departmentDao.getDepartments();
        map.put("depts", depts);
        return "emp/add";
    }

    //来到修改页面,查出需要修改的员工, 然后再页面回显
    @GetMapping(value = "/emp/{id}")
    public String updateEmp(@PathVariable("id") Integer id,
                            Model model) {
        Employee emp = employeeDao.get(id);
        Collection<Department> depts = departmentDao.getDepartments();
        model.addAttribute("emp", emp);
        model.addAttribute("depts", depts);
        //回到修改页面
        return "emp/add";
    }

    //员工添加,需要提交员工id
    //SpringMVC会自动将请求参数和入参对象的属性进行一一绑定，要求请求参数的名字和javaBean入参对象里面的属性名是一样的
    @PostMapping(value = "/emp")
    public String addEmp(Employee employee) {
        System.out.println("goto addEmp method");
        //保存员工
        employeeDao.save(employee);

        //通过转发(forward)或者重定向(redirect),前往发送emps请求前往员工列表页面,/emps的“/”代表当前项目路径
        return "forward:/emps";
    }

    //员工修改
    @PutMapping(value = "/emp")
    public String updateEmp(Employee employee) {
        System.out.println("goto updateEmp method");
        System.out.println(employee);
        //修改员工数据
        employeeDao.save(employee);

        return "redirect:/emp";
    }

    @DeleteMapping("/emp/{id}")
    public String delEmp(@PathVariable("id") String id) {
        System.out.println("goto delEmp Metod");
        return "redirect:/emps";
    }
}
