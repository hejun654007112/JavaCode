package com.offcn.homework;

/**
 * 2、同时开启3个线程，共同输出100~200之间的所有数字，并且在输出奇数的时候将线程名称打印出来
 */
public class Homework02 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            int num = 100;
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (this){
                        num++;
                        if (num > 200){
                            break;
                        }
                        if (num % 2 != 0){
                            System.out.println(Thread.currentThread().getName() + "数字:" + num);
                        }
                    }

                }
            }
        };

        new Thread(runnable,"线程1").start();
        new Thread(runnable,"线程2").start();
        new Thread(runnable,"线程3").start();


        
    }
}
