package com.offcn.homework;

/**
 * 2、设计：
 * 	动物类：姓名，年龄，吃饭，睡觉。
 * 	猫类（捉老鼠）和狗类（看家）
 * 	动物培训接口：跳高
 * 	会跳高的猫
 */
public class Homework02 {
    public static void main(String[] args) {
        AnimalTraining animal = new HighJumpCat("小花猫",3);
        

        animal.HighJumpTraining();

        if (animal instanceof Animal){
            Animal a = (Animal)animal;
            a.eat();
            a.sleep();
        }

        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchTheMouse();
        }
    }
}

 class Animal {
    private String name;
    private int age;

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

    public  void eat(){
       System.out.println(this.name + "吃饭");
   }

    public void sleep(){
        System.out.println(this.name + "睡觉");
    }
}

class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchTheMouse(){
        System.out.println(this.getName() + "捉老鼠");
    }


}

class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    public void housekeeping(){
        System.out.println(this.getName() + "看家");
    }
}

class HighJumpCat extends Cat implements AnimalTraining{

    public HighJumpCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void HighJumpTraining() {
        System.out.println(this.getName() + "跳高");
    }
}

interface AnimalTraining{
    void HighJumpTraining();
}