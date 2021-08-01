package com.offcn.homework;

/**
 * 2、自定义一个学生类,要求有属性:姓名 name ，年龄 age
 * 创建两个学生对象,判断这两个学生对象是否相等。
 * 判断条件：按照对象属性值判断
 */
public class Homework02 {
    public static void main(String[] args) {
        Student student1 = new Student("小明",13);
        Student student2 = new Student("小明",12);

        System.out.println(student1.equals(student2));

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


}
