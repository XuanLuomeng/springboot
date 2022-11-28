package com.atguigu.config;

import com.atguigu.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration:标识当前类作为配置文件使用，用于配置容器
 *      位置:类的上面
 * SpringConfig这个类就相当于beans.xml
 */
@Configuration
public class SpringConfig {
    /**
     * 创建方法，方法的返回值是对象，在方法的上面加入@Bean
     * 方法的返回值对象就注入到容器中
     *
     * @Bean:把对象注入到spring容器中，作用相当于<bean>
     *     位置:方法的上面
     *
     *     说明:@Bean,不指定对象的名称，默认是方法名是id
     */
    @Bean
    public Student createStudent(){
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setSex("男");
        return s1;
    }

    
}
