package com.example.demo.controller;


import com.example.demo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Employee {

    //@Autowired
    //EmployeeMapper mapper;

    //查询所有员工
    @GetMapping("/emps")
    public  String list(Model model){
        //List<com.example.demo.bean.Employee> employees=mapper.getEmp()；
        //classpath:/templates/ XXX.html
        return "emp/list";
    }
}
