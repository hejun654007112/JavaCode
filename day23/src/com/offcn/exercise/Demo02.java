package com.offcn.exercise;

/**
 * 1、获取main方法所在线程的名称
 * 2、获取垃圾回收线程的名称
 *
 * 分别从【作用上】和【代码】上：判断垃圾回收线程是否是守护线程
 * 代码示例
 */
public class Demo02 {
    public static void main(String[] args) throws Throwable {
        System.out.println(Thread.currentThread().getName());


        new Demo02();

        System.gc();

        System.out.println(Thread.currentThread().isDaemon());

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(Thread.currentThread().isDaemon());
    }
}

