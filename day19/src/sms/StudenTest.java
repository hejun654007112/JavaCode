package sms;

import java.util.Scanner;

public class StudenTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while (true){

            StudentUtil.getInstance().mainInterface();
            switch(sc.nextInt()){
                case 1:
                    // TODO: 2021/7/22  添加学生
                    addByInput(sc);
                    break;
                case 2:
                    // TODO: 2021/7/22  删除学生
                   delStu(sc);
                    break;
                case 3:
                    // TODO: 2021/7/22  修改学生
                    updteStu(sc);
                    break;
                case 4:
                    // TODO: 2021/7/22  查看学生
                    show();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("功能选择错误!");
            }
        }
    }

    public static void addByInput(Scanner sc){
        System.out.println("请输入学生学号:");
        String sid = sc.next();

        System.out.println("请输入学生姓名:");
        String name = sc.next();

        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();

        System.out.println("请输入学生出生日期:");
        String birthday = sc.next();

        StudentUtil.getInstance().add(new Student(sid,name,age,birthday));
    }

    public static void show(){
        StudentUtil.getInstance().showAllStu();
    }

    public static void delStu(Scanner sc){
        System.out.println("请输入删除学生的学号:");
        String sid = sc.next();
        StudentUtil.getInstance().remove(sid);
    }

    public static void updteStu(Scanner sc){
        System.out.println("请输入修改学生的学号:");
        String sid = sc.next();
        if (!StudentUtil.getInstance().contains(sid)){
            System.out.println("此学生信息不存在!");
            return;
        }
        System.out.println("请输入修改后学生姓名:");
        String name = sc.next();

        System.out.println("请输入修改后学生年龄:");
        int age = sc.nextInt();

        System.out.println("请输入修改后学生出生日期:");
        String birthday = sc.next();

        StudentUtil.getInstance().update(new Student(sid,name,age,birthday));
    }
}
