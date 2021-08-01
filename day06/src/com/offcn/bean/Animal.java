package com.offcn.bean;

/**
 * 动物类Animal
 * 	属性:姓名name,年龄age
 * 	行为:吃饭eat，睡觉sleep
 */
public  class Animal {

    private String name;

    private int age;

    public  Animal() {
    }

    public Animal(String name, int age) {
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

    //吃饭
    public void eat(){
        System.out.println(this.name + "吃饭~~~");
    }

    //睡觉
    public void sleep(){
        System.out.println(this.name + "睡觉~~~");
    }
}
