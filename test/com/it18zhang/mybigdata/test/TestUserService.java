package com.it18zhang.mybigdata.test;

import com.it18zhang.mybigdata.model.User;
import com.it18zhang.mybigdata.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by xiebi on 5/17/2017.
 */
public class TestUserService {
    @Test
    public void testTest()
    {
        System.out.println("@Test works !");
    }

    @Test
    public void saveUser() throws SQLException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:WEB-INF/applicationContext.xml");
        UserService us= (UserService) ac.getBean("userService");
        for (int i=0;i<100;i++){
            User u=new User();
            u.setName("tom"+i);
            u.setAge(i%100);
            us.saveEntity(u);
        }
    }

    @Test
    public void deleteUser(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:WEB-INF/applicationContext.xml");
        UserService us= (UserService) ac.getBean("userService");
        User u=new User();
        u.setId(1);
        us.deleteEntity(u);
    }

    @Test
    public void findAll() throws SQLException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:WEB-INF/applicationContext.xml");
        UserService us= (UserService) ac.getBean("userService");
//        List<User> list = us.findByHQL("from User");
        List<User> list = us.findAll();
        for(User u:list){
            System.out.println(u.getId()+","+u.getName()+","+u.getAge());
        }
    }
}
