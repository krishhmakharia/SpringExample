package com.annotationAutowireExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.annotationAutowireExample");
        Employee emp1 = context.getBean("employee", Employee.class);
        System.out.println(emp1.toString());
        Manager mng1 = context.getBean("manager", Manager.class);
        System.out.println(mng1.toString());
    }
}
