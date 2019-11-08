package com.zx.mapper;

import com.zx.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @创建人 张绚
 * @创建时间 2019/11/7 0007
 * @描述
 */

public interface DepartmentMapper {

    @Select("SELECT * FROM department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("DELETE FROM department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("UPDATE department set department_name = #{departmentName} WHERE id=#{id}")
    public int update(Department department);
}
