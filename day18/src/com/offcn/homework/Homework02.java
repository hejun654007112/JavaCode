package com.offcn.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 2、分析以下需求，并用代码实现：
 * 	(1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)
 * 	(2)定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
 * 	(3)利用四种方式遍历Map集合中的内容，格式：key::value
 *
 */
public class Homework02 {
    public static void main(String[] args) {
        Student student01 = new Student("李四",23);
        Student student02 = new Student("王五",23);
        Student student03 = new Student("赵二",25);
        Student student04 = new Student("啊明",23);
        Student student05 = new Student("啊明",23);

        HashMap<Student, String> map = new HashMap<>();

        map.put(student01,"长沙市");
        map.put(student02,"湘潭市");
        map.put(student03,"邵阳市");
        map.put(student04,"衡阳市");
        map.put(student05,"株洲市");

//        print01(map);
//        print02(map);
        print03(map);
//        print04(map);


    }

    public static void print01(HashMap<Student, String> map){
        Set<Student> students = map.keySet();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println("姓名:" + student.getName() + "\t住址:" + map.get(student));
        }
    }

    public static void print02(HashMap<Student, String> map){
        Set<Student> students = map.keySet();
        for (Student student : students) {
            System.out.println("姓名:" + student.getName() + "\t住址:" + map.get(student));
        }
    }

    public static void print03(HashMap<Student, String> map){
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        Iterator<Map.Entry<Student, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Student, String> next = iterator.next();
            System.out.println("姓名:" + next.getKey().getName() + "\t住址:" + next.getValue());
        }
    }

    public static void print04(HashMap<Student, String> map){
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println("姓名:" + entry.getKey().getName() + "\t住址:" + entry.getValue());
        }
    }
}
