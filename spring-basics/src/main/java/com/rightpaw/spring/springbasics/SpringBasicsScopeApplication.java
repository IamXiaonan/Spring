package com.rightpaw.spring.springbasics;

import com.rightpaw.spring.springbasics.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBasicsScopeApplication {

  private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsScopeApplication.class);

  public static void main(String[] args) {
    ApplicationContext ac = new AnnotationConfigApplicationContext(SpringBasicsScopeApplication.class);
    SomeCDIBusiness business = ac.getBean(SomeCDIBusiness.class);

    LOGGER.info("{}", business);
  }
}
