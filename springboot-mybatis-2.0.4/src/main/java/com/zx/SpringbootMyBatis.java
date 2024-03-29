package com.zx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @创建人 张绚
 * @创建时间 2019/11/6 0006
 * @描述
 */

@MapperScan("com.zx.mapper")
@SpringBootApplication
public class SpringbootMyBatis {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMyBatis.class);
    }

}
