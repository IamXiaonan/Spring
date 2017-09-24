package com.rightpaw.spring.springbasics;

import com.rightpaw.spring.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.rightpaw.spring.componentscan")
public class SpringBasicsComponentApplication {

  private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsComponentApplication.class);

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringBasicsComponentApplication.class);
    ComponentDAO componentDAO = ac.getBean(ComponentDAO.class);

    LOGGER.info("{}", componentDAO);
    ac.close();
  }
}
