package com.offcn.bean;

/**
 * 人类Person
 * 	属性:姓名name,年龄age,性别gender
 * 	行为:学习study,睡觉sleep
 */
public class Person {

    private String name;

    private int age;

    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
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

    //学习
    public void study(){
        System.out.println(this.name + "学习~~");
    }

    //睡觉
    public void sleep(){
        System.out.println(this.name + "睡觉~~");
    }
}
