package com.example.springboot06datamybatis.controller;


import com.example.springboot06datamybatis.bean.Department;
import com.example.springboot06datamybatis.bean.Employee;
import com.example.springboot06datamybatis.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepController {

    @Autowired
    DepartmentMapper mapper;

    @GetMapping("/dep")
    public List<Department> getDep(){
        return  mapper.getDep();
    }

    @GetMapping("/dep/insert")
    public Department insertDep(Department dep){
        mapper.insertDep(dep);
        return  dep;
    }


}
