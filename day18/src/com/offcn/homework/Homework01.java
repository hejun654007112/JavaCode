package com.offcn.homework;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 1、应以一个学生类，学生有姓名、年龄、学号、成绩。
 * 创建一个集合，存储若干个学生对象，重复的学生对象不能存储（重复：学生信息都一样的视为重复）。
 * 之后，按照学生的年龄从大到小的顺序，对学生对象进行排序，年龄有重复的话，按照姓名的字典顺序排序，
 * 如果姓名还重复，根据剩余的两个属性，自己发挥。
 */
public class Homework01 {
    public static void main(String[] args) {
        Student student01 = new Student("2021072101","李四",23,68);
        Student student02 = new Student("2021072102","王五",23,90);
        Student student03 = new Student("2021072103","赵二",25,80);
        Student student04 = new Student("2021072105","啊明",23,48);
        Student student05 = new Student("2021072104","啊明",23,48);


        ArrayList<Student> list = new ArrayList<>();
        list.add(student01);
        list.add(student02);
        list.add(student03);
        list.add(student04);
        list.add(student05);

        Collections.sort(list);

        for (Student student : list) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student>{
    private String id;
    private String name;
    private int age;
    private double score;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (Double.compare(student.score, score) != 0) return false;
        if (id != null ? !id.equals(student.id) : student.id != null) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        temp = Double.doubleToLongBits(score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Student o) {
        int num = this.age - o.age;

        if (num == 0){
            num = this.name.compareTo(o.name);
            if (num == 0){
                num = this.id.compareTo(o.id);
            }
        }

        return num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

}
