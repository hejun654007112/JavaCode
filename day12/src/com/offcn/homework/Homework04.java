package com.offcn.homework;

import java.util.Arrays;

/**
 * 定义一个类型，这个类型能够创建对象，对象中可以添加任意字符串，且对象能够容纳的字符串数量
 * 初始的时候为10个。当对象中的10个字符串填满后，对象能够容纳的字符串的数量扩大为原来的2倍。
 * 在类中定义一个方法，可以向对象中添加字符串；定义第二个方法，可以删除对象中添加好的字符串；
 * 定义第三个方法，可以显示对象中已经添加的所有有效的字符串。
 */
public class Homework04 {

    public static void main(String[] args) {
        MyString1 myString = new MyString1();
        myString.add("asd");
        myString.add("ba");
        myString.add("cf");
        myString.add("dsa");
        myString.add("ed");
        myString.print();

        myString.delete("ba");
        myString.print();

        myString.add("111");
        myString.add("222");
        myString.add("333");
        myString.add("444");

        myString.print();

        myString.delete("000");

        myString.print();

        myString.delete("444");
        myString.print();

    }
}

class MyString1 {
    //value内有效字符串大小
    private int validSize;
    //当前数组长度
    private int curSize;
    private String[] value;

    public MyString1() {
        value = new String[1];
        this.curSize = value.length;
    }

    //expansion 扩容
    public void expansion(String str) {
        if (curSize == validSize) {
           curSize *= 2;
            value = Arrays.copyOf(value, curSize);
        }
    }

    //添加字符串
    public void add(String str) {
        expansion(str);
        //将传入的内容添加到新数组中
        value[validSize] = str;
        validSize++;
    }

    //删除指定字符串
    public void delete(String str) {
//        String[] strings = new String[value.length];
        int index = find(str);
        if ( index != -1){
           System.arraycopy(value,index+1,value,index,validSize-index-1);
            value[--validSize] = null;
       }
    }
    //查找字符串
    public int find(String str){
        for (int i = 0; i < validSize; i++) {
            if (str.equals(value[i])){
                return i;
            }
        }
        return -1;
    }

    //显示有效字符串
    public void print() {
        for (int i = 0; i < validSize; i++) {
            System.out.print(value[i] + " ");
        }
        System.out.println();
    }


}
