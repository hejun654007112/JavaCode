package com.offcn.homework;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat("小花",1);
        cat.show();
        cat.catchMice();

        Dog dog = new Dog("小白",3);
        dog.show();
        dog.porter();

    }
}
