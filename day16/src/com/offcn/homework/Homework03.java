package com.offcn.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * 3、创建一个学生类，属性：姓名，年龄
 * 创建一个List集合，添加5个学生对象
 * 编写一个方法，能够对List集合去重
 * 例如：List集合中的学生对象，如果姓名和年龄相同，就视为重复元素，进行去重
 */
public class Homework03 {
    public static void main(String[] args) {
        ArrayList<Student03> list = new ArrayList<>();
        add(list,new Student03("a",13));

        add(list,new Student03("a",13));
        add(list,new Student03("a",13));

        add(list,new Student03("a",14));
        add(list,new Student03("b",14));

        System.out.println(list);

    }

    public static void add(List list,Student03 student){
        if (list.contains(student)){
            return;
        }else {
            list.add(student);
        }
    }
}

class Student03{
    private String name;
    private int age;

    public Student03(String name, int age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student03 student03 = (Student03) o;

        if (age != student03.age) return false;
        return name != null ? name.equals(student03.name) : student03.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Student03{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
