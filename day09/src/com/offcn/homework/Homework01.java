package com.offcn.homework;

/**
 * 1、设计一个台灯类Lamp其中台灯有灯泡这个属性，还有开灯(on)这个方法，
 * 设计一个灯泡类 其中有红灯泡(RedBuble)  和绿灯泡(GreenBuble) 他们都有一个发亮的方法，
 * 请设计出一段代码可以使台灯开启灯泡发亮，并且保证替换不同种类的灯泡台灯类代码不被修改
 */
public class Homework01 {

    public static void main(String[] args) {
//        //创建一个自带红灯的台灯
//        Lamp lamp = new Lamp(new RedBulb());
//
//        lamp.on();
//
//        lamp.setBulb(new GreenBulb());
//
//        lamp.on();
        RedBulb redBulb = new RedBulb();
        redBulb.get();


    }
}

class Lamp{
    private AbstractBulb bulb;

    public Lamp(AbstractBulb bulb) {
        this.bulb = bulb;
    }

    public AbstractBulb getBulb() {
        return bulb;
    }

    public void setBulb(AbstractBulb bulb) {
        this.bulb = bulb;
    }

    public void on(){
        bulb.light();
    }
}

abstract class AbstractBulb{

   abstract void light();


}

class RedBulb extends AbstractBulb implements Cloneable{
    int a =3;
    public void get(){
        try {
            RedBulb clone = (RedBulb) clone();
            clone.light();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void light() {
        System.out.println("发红光");
    }
}

class GreenBulb extends AbstractBulb {

    @Override
    void light() {
        System.out.println("发绿光");
    }
}