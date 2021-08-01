package com.offcn.homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 2、创建班级类(Classes)，具有两个属性：班级人数，班级名称；
 * 创建学生类(Student),具有三个属性：学生姓名，学号，所在班级(Classes类型对象)，
 * 所有属性都通过构造方法赋值。
 * 在测试类中，创建List，并向其添加五个学生的信息，
 * 通过迭代器，迭代该List，并将学生所在班级名称打印到控制台。
 */
public class Homework02 {
    public static void main(String[] args) {
        Classes classes01 = new Classes(30, "三年级一班");
        Classes classes02 = new Classes(25, "三年级二班");
        Classes classes03 = new Classes(35, "三年级三班");

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", "2021071901", classes01));
        list.add(new Student("李四", "2021071902", classes02));
        list.add(new Student("王五", "2021071903", classes03));
        list.add(new Student("小赵", "2021071904", classes03));
        list.add(new Student("小孙", "2021071905", classes03));

        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Classes {
    private int classSize;
    private String className;

    public Classes(int classSize, String className) {
        this.classSize = classSize;
        this.className = className;
    }

    public int getClassSize() {
        return classSize;
    }

    public void setClassSize(int classSize) {
        this.classSize = classSize;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

class Student {
    private String studentName;
    private String studentID;
    private Classes classes;

    public Student(String studentName, String studentID, Classes classes) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.classes = classes;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID='" +  studentID + '\'' +
                ", classes=" +  '\'' + classes.getClassName() +
                "'}";
    }
}
