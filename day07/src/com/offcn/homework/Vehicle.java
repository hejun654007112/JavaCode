package com.offcn.homework;

public class Vehicle {
    public void run(){
        System.out.println("这是交通工具run方法");
    }
}

class Motor extends Vehicle{
    @Override
    public void run() {
        System.out.println("这是Vehicle子类Motor的run方法");
    }
}

class Ship extends Vehicle{
    @Override
    public void run() {
        System.out.println("这是Vehicle子类Ship的run方法");
    }
}

class Aeroplane extends Vehicle{
    @Override
    public void run() {
        System.out.println("这是Vehicle子类Aeroplane的run方法");
    }
}

class Bus extends Motor{
    @Override
    public void run() {
        System.out.println("这是Motor子类Bus的run方法");
    }
}
class Car extends Motor{
  /*  @Override
    public void run() {
        System.out.println("这是Motor子类Car的run方法");
    }*/
}