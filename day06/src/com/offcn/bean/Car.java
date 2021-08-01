package com.offcn.bean;

/**
 * 4、定义一个汽车类，属性：颜色、轮胎数；
 * 行为：跑（执行跑的方法时，可以展示汽车的颜色和轮胎数）
 *
 */
public class Car {

    private String color;

    private int tiresCount;

    public Car() {
    }

    public Car(String color, int tiresCount) {
        this.color = color;
        this.tiresCount = tiresCount;
    }

    //跑
    public void run(){
        System.out.println("汽车的颜色是：" + this.getColor());
        System.out.println("汽车有" + this.getTiresCount() + "个轮子");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTiresCount() {
        return tiresCount;
    }

    public void setTiresCount(int tiresCount) {
        this.tiresCount = tiresCount;
    }
}
