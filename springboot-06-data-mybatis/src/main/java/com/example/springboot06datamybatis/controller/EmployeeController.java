package com.example.springboot06datamybatis.controller;

import com.example.springboot06datamybatis.bean.Employee;
import com.example.springboot06datamybatis.mapper.DepartmentMapper;
import com.example.springboot06datamybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeMapper mapper;

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return mapper.getEmpById(id);
    }
    @GetMapping("/emp")
    public void insertDep(Employee employee){
        mapper.insertEmp(employee);
    }
}
