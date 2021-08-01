package com.offcn.exercise;

/**
 * 三个窗口，同时售卖100张火车票
 * 打印某个窗口卖出了1张票，还剩x张
 */
public class Demo03 {

    public static void main(String[] args) {
        Runnable sell = new Runnable() {
            int count = 100;

            @Override
            public void run() {
                while (true){
                synchronized (this){
                        if (count <= 0){
                            break;
                        }else {
                            System.out.println(Thread.currentThread().getName()+"卖出了1张票，还剩"+--count+"张");

                        }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                }
            }
        };

        new Thread(sell, "一号窗口").start();

        new Thread(sell, "二号窗口").start();

        new Thread(sell, "三号窗口").start();
    }

}
