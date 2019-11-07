package com.zx.bean;

/**
 * @创建人 张绚
 * @创建时间 2019/11/6 0006
 * @描述
 */
public class Department {

    private Integer id;
    private String departmentName;

    public Department() {
    }

    public Department(Integer id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return departmentName;
    }

    public void setLastName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", lastName='" + departmentName + '\'' +
                '}';
    }
}
