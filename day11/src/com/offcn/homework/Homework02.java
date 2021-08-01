package com.offcn.homework;

/**
 * 2、分析以下需求，并用代码实现：
 * 	(1)定义如下方法public static String getPropertyGetMethodName(String property);
 * 	(2)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的get方法的名字
 * 	(3)如：用户调用此方法时给定的参数为"name",该方法的返回值为"getName"
 */
public class Homework02 {
    public static void main(String[] args) {
        System.out.println(getPropertyGetMethodName("name"));
    }

    public static String getPropertyGetMethodName(String property){
        StringBuilder stringBuilder = new StringBuilder(property);

        char c = stringBuilder.charAt(0);
        c = c >= 97 && c <= 122 ? (char) (c - 32) :c;

        stringBuilder.replace(0,1, String.valueOf(c));
        stringBuilder.insert(0,"get");
        return stringBuilder.toString();
    }
}
