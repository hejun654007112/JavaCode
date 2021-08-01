package com.offcn.homework;

/**
 * 1、有一辆班车除司机外只能承载80个人，假设前中后三个车门都能上车，如果坐满则不能再上车。
 *    请用线程模拟上车过程并且在控制台打印出是从哪个车门上车以及剩下的numberOfSeats。
 *    比如:
 *   	（前门上车---还剩N个座...）
 */
public class Homework01 {

    public static void main(String[] args) {
        Bus bus = new Bus();

        new Thread(bus,"前门").start();
        new Thread(bus,"中门").start();
        new Thread(bus,"后门").start();
    }
}

class Bus implements Runnable{

    private int seats = 80;

    @Override
    public void run() {
       while (true){
           synchronized (this){
               if (seats <= 0){
                   System.out.println("坐满不能再上车");
                   break;
               }else {
                   System.out.println(Thread.currentThread().getName() + "上车,还剩"+--seats+"个座位");
               }
           }
           try {
               Thread.sleep(50);
           } catch (InterruptedException e) {


           }
       }
    }
}
