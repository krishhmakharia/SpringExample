package com.componentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("componentScanDemo.xml");
        Employee emp = context.getBean("employee", Employee.class);//You can also override this
        System.out.println(emp.toString());

    }
}
