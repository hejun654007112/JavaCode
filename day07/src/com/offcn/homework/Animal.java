package com.offcn.homework;

public class Animal {

    private String name;

    private int age;

    public Animal() {
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

    public void show(){
        System.out.println(name + age + "岁");
    }
}

class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMice(){
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void porter(){
        System.out.println("看门");
    }
}