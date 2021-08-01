package com.offcn.homework;

public class Person {
    private String name;

    private int age;

    private String gender;

    public Person() {
    }

    public Person( String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class Teacher extends Person{
    private String tcId;

    public Teacher() {
    }

    public Teacher(String name, int age, String gender, String tcId) {
        super(name, age, gender);
        this.tcId = tcId;
    }

    public String getTcId() {
        return tcId;
    }

    public void setTcId(String tcId) {
        this.tcId = tcId;
    }

    public void teach(){
        System.out.println(this.getName() +"教书");
    }
}

class Student extends Person{
    private String stId;

    public Student() {
    }

    public Student(String name, int age, String gender, String stId) {
        super(name, age, gender);
        this.stId = stId;
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }

    public void study(){
        System.out.println(this.getName() + "学习");
    }
}
