package com.rightpaw.spring.springbasics;

import com.rightpaw.spring.springbasics.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBasicsBasicApplication {
    public static void main(String[] args)
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringBasicsBasicApplication.class);
        BinarySearchImpl bsi = ac.getBean(BinarySearchImpl.class);
        BinarySearchImpl bsi2 = ac.getBean(BinarySearchImpl.class);

        System.out.println(bsi);
        System.out.println(bsi2);
        int[] array = {1, 9, 3, 4, 7};
        int result = bsi.binarySearch(array, 7);
        System.out.println(result);
    }
}
