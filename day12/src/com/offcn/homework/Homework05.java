package com.offcn.homework;

/**
 * 定义一个类型，这个类型能够创建对象，对象中可以添加任意字符串，且对象能够容纳的字符串数量
 * 初始的时候为10个。当对象中的10个字符串填满后，对象能够容纳的字符串的数量扩大为原来的2倍。
 * 在类中定义一个方法，可以向对象中添加字符串；定义第二个方法，可以删除对象中添加好的字符串；
 * 定义第三个方法，可以显示对象中已经添加的所有有效的字符串。
 */
public class Homework05 {
    public static void main(String[] args) {
        StringLinkedList linkedList = new StringLinkedList();
        linkedList.add("何俊1");
        linkedList.add("何俊2");
        linkedList.add("何俊3");
        linkedList.add("何俊4");

        linkedList.print();
    }
}

class StringLinkedList{
    private MyString head;

    public StringLinkedList() {
        head = new MyString();
    }

    //添加元素
    public void add(String str){
        MyString myString = new MyString(str);
        if (head.getNext() == null){
            head.setNext(myString);
            return;
        }
        MyString temp = head;
        while (true){
            if (temp.getNext() == null){
                break;
            }
            temp = temp.getNext();
        }
        temp.setNext(myString);
    }

    //打印链表
    public void print(){
        MyString temp = head.getNext();
        System.out.println("所有有效的字符串:");
        while (true){
            if (temp.getNext() == null){
                break;
            }
            System.out.println( temp.toString());
            temp = temp.getNext();
        }
    }
}

class MyString{
    private static int id = 0;
    private String data;
    private MyString next;

    public MyString() {
    }

    public MyString(String data) {
        id++;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public MyString getNext() {
        return next;
    }

    public void setNext(MyString next) {
        this.next = next;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return data;
    }
}
