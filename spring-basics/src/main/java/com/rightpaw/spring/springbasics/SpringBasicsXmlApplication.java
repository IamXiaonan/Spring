package com.rightpaw.spring.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBasicsXmlApplication {
    public static void main(String[] args)
    {
        try (ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml"))
        {
            Logger LOGGER = LoggerFactory.getLogger(SpringBasicsXmlApplication.class);
            LOGGER.info("Beans -> {}", (Object) ac.getBeanDefinitionNames());
        }
    }
}
