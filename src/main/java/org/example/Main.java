package org.example;

import org.example.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        Student student = context.getBean(Student.class);
        Student student2 = (Student) context.getBean("student");
        System.out.println(student);
        student.say("hello java");
        student.text();
//        System.out.println(student2);
//        System.out.println(student2 == student);

        context.close();

    }
}