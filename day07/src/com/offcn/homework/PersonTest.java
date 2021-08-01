package com.offcn.homework;

public class PersonTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("杨老师",28,"男","T20210203");
        teacher.teach();

        Student student = new Student("小明",18,"男","S20210209");
        student.study();
        
    }
}
