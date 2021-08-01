package com.offcn.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 2、创建一个学生类，属性：姓名，年龄
 * 创建一个List集合，添加5个学生对象
 * 编写一个方法，能够对List集合去重
 * 例如：List集合中的学生对象，如果姓名和年龄相同，就视为重复元素，进行去重
 */
public class Homework02 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("tom",12));
        list.add(new Student("tom",12));
        list.add(new Student("tom",13));
        list.add(new Student("jack",12));
        list.add(new Student("jack",13));

        System.out.println(list);

        removeRepeatEle(list);

        System.out.println(list);
    }


    public static void removeRepeatEle(List list){
        HashSet<Object> objects = new HashSet<>();
       objects.addAll(list);
       list.clear();
       list.add(objects);
    }


}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
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

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
