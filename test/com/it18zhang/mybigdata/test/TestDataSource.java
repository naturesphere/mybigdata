package com.it18zhang.mybigdata.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by xiebi on 5/17/2017.
 */
public class TestDataSource {
    @Test
    public void testTest()
    {
        System.out.println("@Test works !");
    }

    @Test
    public void getConn() throws SQLException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:WEB-INF/applicationContext.xml");
        DataSource ds=(DataSource) ac.getBean("dataSource");
        Connection conn=ds.getConnection();
        System.out.println(conn);
    }


}
