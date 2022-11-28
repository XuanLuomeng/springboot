package com.atguigu;

import com.atguigu.config.SpringConfig;
import com.atguigu.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    /**
     * 使用xml作为容器配置文件
     */
    @Test
    public void test01(){
        String config = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Student student = (Student) context.getBean("myStudent");
        System.out.println("容器中的对象:"+student);
    }

    /**
     * 使用JavaConfig
     */
    @Test
    public void test02(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) context.getBean("createStudent");
        System.out.println("使用JavaConfig创建的bean对象:"+student);
    }
}
