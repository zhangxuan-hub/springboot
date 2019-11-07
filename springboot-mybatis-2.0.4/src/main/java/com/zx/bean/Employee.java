package com.zx.bean;

/**
 * @创建人 张绚
 * @创建时间 2019/11/6 0006
 * @描述
 */
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private Integer gender; //0:男；1:女
    private Integer d_id;

    public Employee() {
    }

    public Employee(Integer id, String lastName, String email, Integer gender, Integer d_id) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.d_id = d_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", d_id=" + d_id +
                '}';
    }
}
