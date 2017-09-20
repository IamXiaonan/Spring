package com.rightpaw.spring.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {
    public static void main(String[] args)
    {
        ApplicationContext ac = SpringApplication.run(SpringBasicsApplication.class, args);
        BinarySearchImpl bsi = ac.getBean(BinarySearchImpl.class);
        BinarySearchImpl bsi2 = ac.getBean(BinarySearchImpl.class);

        System.out.println(bsi);
        System.out.println(bsi2);
        int[] array = {1, 9, 3, 4, 7};
        int result = bsi.binarySearch(array, 7);
        System.out.println(result);
    }
}
