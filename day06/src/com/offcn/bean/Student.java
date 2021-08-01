package com.offcn.bean;

/**
 * 1、有一个学生类，该类有属性：姓名，学号，年龄
 * 要求：利用封装的思想 来对该类的属性进行封装，并测试
 */
public class Student {
    private String name;

    private String sno;

    private int age;

    public Student() {
    }

    public Student(String name, String snumber, int age) {
        this.name = name;
        this.sno = snumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
