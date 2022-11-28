package com.atguigu.pojo;

import lombok.Data;

@Data
public class Student {
    private String name;
    private Integer age;
    private String sex;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
