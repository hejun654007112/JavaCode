package com.offcn.exercise;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo01 {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + " -> main");
        }

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i + " -> Thread");
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i + " -> Runnable");
                }
            }
        }).start();

        FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i + " -> Callable");
                }
                return " -> Callable -> 结束";
            }
        });

        new Thread(futureTask).start();

        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
