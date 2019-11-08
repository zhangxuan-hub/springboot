package com.zx.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * @创建人 张绚
 * @创建时间 2019/11/8 0008
 * @描述
 */

//使用JPA注解配置映射关系
@Entity //告诉JPA这是一个实体类，即：和数据表映射的类
@Table(name = "tbl_user") //告诉JPA和数据库中哪个表对应
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class User {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //说明主键策略是自增长
    private Integer id;
    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column
    private String email;

    public User() {
    }

    public User(Integer id, String lastName, String email) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
