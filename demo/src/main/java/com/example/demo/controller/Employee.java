package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Employee {

    //@Autowired
   // EmployDao employDao;

    //查询所有员工
    @GetMapping("/emps")
    public  String list(){

        //classpath:/templates/ XXX.html
        return "emp/list";
    }
}
