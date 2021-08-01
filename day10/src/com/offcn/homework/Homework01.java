package com.offcn.homework;

/**
 * 1、自定义一个老师类,要求有属性:姓名 name ，年龄 age
 * 在控制台上打印老师对象,要求打印 格式如下: 老师[姓名:xxx, 年龄:xx]
 */
public class Homework01 {
    public static void main(String[] args) {
        System.out.println(new Teacher("老张",30));
    }
}
class Teacher{
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "老师[" +
                "姓名:" + name +
                ", 年龄" + age +
                ']';
    }


}