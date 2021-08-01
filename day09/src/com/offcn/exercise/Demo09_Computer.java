package com.offcn.exercise;


/**
 * 定义一个电脑（Computer）类型，要求有开机（powerOn）关机（powerOff）功能，并且能够使用指定的外接设备，
 * 例如键盘（Keyboard）鼠标（Mouse）等
 * 在测试类中，创建电脑对象，调用开机功能，之后创建鼠标、键盘等外接设备，
 * 并让电脑调用外接设备各自的功能，最后关机
 */
public class Demo09_Computer {

    public static void main(String[] args) {
        Computer c = new Computer();

        c.powerOn();

        c.useUSB(new Keyboard());
    }
}

class Computer {

    private USB usb;//USB usb = new Keyboard();

    public Computer() {
    }



    public void powerOn() {
        System.out.println("开机");
    }

    public void useUSB(AbstractPeripherals p) {
        setUsb(p);
        usb.using();//new Keyboard().using();
    }

    public void powerOff() {
        System.out.println("关机");
    }

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }
}

interface USB {

    public abstract void using();
}


abstract class  AbstractPeripherals implements USB{

}
class Keyboard extends AbstractPeripherals  {

    @Override
    public void using() {
        System.out.println("键盘输入");
    }

}

class Mouse extends AbstractPeripherals  {

    @Override
    public void using() {
        System.out.println("鼠标点击");
    }
}
