package org.wipro.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Student emp = ctx.getBean("student",Student.class);
        System.out.println(emp);
    }
}
