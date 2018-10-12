package com.example.springboot06datamybatis.mapper;


import com.example.springboot06datamybatis.bean.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;


//注解版
//@Mapper
public interface DepartmentMapper {

    @Select("select * from Department")
    List<Department> getDep();

    @Delete("delete from Department where id=#{id}")
    int deleteDepById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into Department(departmentName) value(#{departmentName})")
    int insertDep(Department department);

    @Update("update Department set departmentName=#{departmentName} where id=#{id}")
    int updateDep(Department department);
}
