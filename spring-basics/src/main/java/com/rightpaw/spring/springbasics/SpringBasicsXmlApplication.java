package com.rightpaw.spring.springbasics;

import com.rightpaw.spring.springbasics.basic.BinarySearchImpl;
import com.rightpaw.spring.springbasics.xml.XmlPersonDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringBasicsXmlApplication {
    public static void main(String[] args)
    {
        try (ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml"))
        {
            XmlPersonDao personDao = ac.getBean(XmlPersonDao.class);
            System.out.println(personDao);
        }
    }
}
