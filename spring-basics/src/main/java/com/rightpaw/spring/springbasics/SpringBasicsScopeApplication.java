package com.rightpaw.spring.springbasics;

import com.rightpaw.spring.springbasics.cdi.SomeCDIBusiness;
import com.rightpaw.spring.springbasics.cdi.SomeCDIDAO;
import com.rightpaw.spring.springbasics.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsScopeApplication {

  private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsScopeApplication.class);

  public static void main(String[] args) {
    ApplicationContext ac = SpringApplication.run(SpringBasicsScopeApplication.class, args);
    SomeCDIBusiness business = ac.getBean(SomeCDIBusiness.class);

    LOGGER.info("{}", business);
  }
}
