package com.example.springboot06datamybatis.mapper;

import com.example.springboot06datamybatis.bean.Employee;

import java.util.List;

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {
     List<Employee> getEmp();
     Employee getEmpById(Integer id);

     void insertEmp(Employee employee);
}
