package com.offcn.exercise;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/**
 * 1、结合所学的知识，实现本班的随机点名器
 */
public class Demo01 {

    public static String rollCall() {
        String[] names = {"陈炜", "余贤钟", "杰瑞", "汤家豪", "孙布尔", "廖载荣", "何志鹏", "谢世杰", "江骏", "梁黄奥",
                "罗阳", "李骏", "刘炅", "陈雨龙", "廖少柏", "李厚翔", "何梦成", "何俊", "游运嘉", "王子豪", "曾欢",
                "彭敏兵", "黄雄", "龙慧美", "李杰", "童稹", "刘祖缘", "张天龙", "李战"};
        System.out.println(names.length);
        return names[(int)(Math.random()*names.length)];
    }



    public static void main(String[] args) throws IOException {
        String name = "jun";
        File file = new File(".\\name.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();


    }
}
