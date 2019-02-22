package com.example.demo.mapper;


import com.example.demo.bean.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

     @Select("select * from employee")
     List<Employee> getEmp();
     Employee getEmpById(Integer id);

     void insertEmp(Employee employee);
}
