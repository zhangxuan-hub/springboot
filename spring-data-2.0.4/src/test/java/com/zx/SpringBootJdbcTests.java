package com.zx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @创建人 张绚
 * @创建时间 2019/11/5 0005
 * @描述
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootJdbc.class})
public class SpringBootJdbcTests {

    @Autowired
    DataSource dataSource;

    @Test
    public void test() throws SQLException {
        System.out.println("datasource:" + dataSource.getClass());
        dataSource.getConnection();
    }
}
