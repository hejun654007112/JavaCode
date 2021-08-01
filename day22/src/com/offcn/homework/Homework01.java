package com.offcn.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        //配置文件路径
        String properties = "day22\\config.properties";
        //本地对象文件路径
        String localPath = "day22\\instance.txt";
        //读取配置文件获取对象集合
//        List<Person> list = readConfigurationFile(properties);
        //将对象list写入文件
//        saveToFile(localPath, list);
        //读取本地对象文件list
        List<Person> personList = readFromFile(localPath);

        //添加成绩属性
        addGrade(personList);

        //输出打印所有学生的属性
        for (Person person : personList) {
            System.out.println(person);
        }

    }

    private static void addGrade(List<Person> personList) {
        Scanner sc = new Scanner(System.in);
        for (Person person : personList) {
            System.out.println("录入" + person.getName() + "的成绩:");
            person.setGrade(sc.nextDouble());
        }
    }

    private static List<Person> readFromFile(String localPath) {
        List<Person> list = null;
        ObjectInputStream ois = null;
        try {
             ois = new ObjectInputStream(new FileInputStream(localPath));
             list= (List<Person>) ois.readObject();

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    //将学生对象进行序列化，存储到名为instance.txt的文件中
    public static void saveToFile(String localPath, List<Person> list) {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(localPath));
        ) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //readConfigurationFile
    public static List<Person> readConfigurationFile(String properties) {
        Properties p = new Properties();
        FileInputStream fis = null;
        List<Person> list = null;
        try {

            fis = new FileInputStream(properties);

            p.load(fis);

            list = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                list.add(new Person(p.getProperty("name" + i), Integer.parseInt(p.getProperty("age" + i))));
            }

        } catch (IOException | IllegalAgeException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}

class Person implements Serializable {

   private static final long serialVersionUID = 8628104205296100114L;
    private String name;
    private int age;
    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Person(String name, int age) throws IllegalAgeException {
        setName(name);
        setAge(age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age > 130 || age < 0) {
            throw new IllegalAgeException(age);
        } else
            this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

class IllegalAgeException extends IllegalAccessException {

    private static final long serialVersionUID = 8496216707537474699L;

    public IllegalAgeException() {
    }

    public IllegalAgeException(int age) {
        super( "年龄非法异常" + age);

    }

}