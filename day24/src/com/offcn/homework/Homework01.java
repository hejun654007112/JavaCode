package com.offcn.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 3、定义一个能够表示dormitoryMembers的枚举类型，枚举类型中定义量个成员变量：姓名，年龄
 * 采用合适的集合，将枚举项添加到这个集合中，分别按照以下规则排序，展示三种排序结果：
 * ① 第一种结果：枚举项的定义倒序排序
 * ② 第二种结果：姓名的字典顺序对枚举项排序
 * ③ 第三种结果：年龄的正序对枚举项排序
 */
public class Homework01 {
    public static void main(String[] args) {
        DormitoryMembers[] members = DormitoryMembers.values();
        List<DormitoryMembers> list = Arrays.asList(members);

        test03(list);

    }

    public static void test03(List<DormitoryMembers> list) {
        list.sort(new Comparator<DormitoryMembers>() {
            @Override
            public int compare(DormitoryMembers o1, DormitoryMembers o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(list);
    }

    public static void test02(List<DormitoryMembers> list) {
        list.sort(new Comparator<DormitoryMembers>() {
            @Override
            public int compare(DormitoryMembers o1, DormitoryMembers o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(list);
    }

    public static void test01(List<DormitoryMembers> list) {
        //第一种结果：枚举项的定义倒序排序
        list.sort(new Comparator<DormitoryMembers>() {
            @Override
            public int compare(DormitoryMembers o1, DormitoryMembers o2) {
                return -o1.compareTo(o2);
            }
        });

        System.out.println(list);
    }

}

enum DormitoryMembers{
    First("a",18),
    Second("c",15),
    THIRD("d",14),
    FOURTH("b",25);

    private String name;
    private int age;

    DormitoryMembers(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Members{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}