package com.controller;

import com.entity.EmployeeEntity;
import com.github.pagehelper.PageInfo;
import com.service.DeptService;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FirstController {
    @Autowired
    private EmployeeService employeeService;

// hehe
    @RequestMapping("/list/{num}")
    public String list(Model model, @PathVariable(value = "num", required = false) @RequestParam(defaultValue = "1") int num) {
        List<EmployeeEntity> all = employeeService.getAll(num, 3);
        PageInfo pageInfo = new PageInfo(all, 3);
        model.addAttribute("pageInfo", pageInfo);
        return "list";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        employeeService.deleteEmp(id);
        return "ok";
    }
}
