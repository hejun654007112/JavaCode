package com.offcn.bean;

/**
 * 2、有一个图书类Book，该类有属性：图书名称，图书编号
 * 要求：利用封装的思想，对该类进行封装测试。
 */
public class Book {
    private String bookName;

    private String bookNumber;

    public Book() {
    }

    public Book(String bookName, String bookNumber) {
        this.bookName = bookName;
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }
}
