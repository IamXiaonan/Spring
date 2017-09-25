package com.rightpaw.spring.springbasics;

import com.rightpaw.spring.springbasics.external.ExternalProperty;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by alinawxn on 9/24/2017.
 */
@Configuration
@ComponentScan
@PropertySource("classpath:external.properties")
public class SpringBasicsExternalApplication {
    public static void main(String[] args){
      try(AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringBasicsExternalApplication.class))
      {
        ExternalProperty ep = ac.getBean(ExternalProperty.class);
        System.out.println(ep+"-> "+ep.getUrl());
        ac.close();
      }
    }
}
