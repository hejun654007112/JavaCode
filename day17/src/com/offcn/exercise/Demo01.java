package com.offcn.exercise;

import java.util.LinkedList;

/**
 * 原题：模拟Java栈内存机制，写一段代码。
 * 定义一个泛型类，类中选择合适的集合作为成员变量，模拟栈内存的运行特点，提供相应的进栈、出栈的方法，
 * 在集合的头部进行增删。特别的：进栈手动调用进栈；出栈：自动出栈
 */
public class Demo01 {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.push("aa");
        list.push("bb");
        list.push("cc");

        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());


        list.addFirst("1122");
        list.addFirst("2233");

        System.out.println(list.removeFirst());

        String s = list.removeFirst();


    }
}

class MyList<E>{
    private LinkedList<E> list;

    public MyList() {
        this.list = new LinkedList<>();
    }

    //进栈
    public void push(E e){
        list.push(e);
    }

    //出栈
    public E poll(){
        return list.poll();
    }

    //头部增
    public void addFirst(E e){
        list.addFirst(e);
    }

    //头部删
    public E removeFirst(){
        return list.removeFirst();
    }
}
