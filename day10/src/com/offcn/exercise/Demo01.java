package com.offcn.exercise;

import java.util.Scanner;

/**
 * 模拟用户登录：
 * 正确用户名是admin，密码是123
 * 键盘录入用户名和密码，一共有三次机会，如果录入错误，前两次提示还有几次机会
 * 最后一次提示“登录机会已经用完”
 * 录入正确，提示“登录成功”
 */
public class Demo01 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String usrName = "admin";
        String password = "123";

        for (int i = 2; i >= 0; i--) {
            System.out.println("请输入用户名:");
            String s1 = sc.nextLine();
            System.out.println("请输入密码:");
            String s2 = sc.nextLine();
            if (usrName.equals(s1) && password.equals(s2)){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("录入错误,你还有" +i+"次机会");
            }
        }

    }
}
