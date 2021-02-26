package com.ioc;

import com.ioc.dto.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PersonDaoTest {
    @Test
    public void test() {
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        User user = (User) applicationContext.getBean("user");
        System.out.println(user.toString());;
    }
}