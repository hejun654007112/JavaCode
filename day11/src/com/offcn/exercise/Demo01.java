package com.offcn.exercise;

import java.io.File;

/**
 * 自己定义一个字符串，表示一个文件的名称。例如：day11_05_使用帮助手册的技巧和方法.mp4，使用代码，获取文件的后缀名
 */
public class Demo01 {
    int count = 0;
    public static void main(String[] args) {
//        String str = "day11_05_使用帮助手册的技巧和方法.mp4";
//
//        String suffix = str.substring(str.lastIndexOf('.'));
//        System.out.println("suffix = " + suffix);



        Demo01 demo01 = new Demo01();
        demo01.findAllFile("E:\\JavaCode");
        System.out.println(demo01.count);

    }

    public void findAllFile(String path) {
        File file = new File(path);

        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                findAllFile(files[i].getPath());
            }

            if (files[i].isFile()) {
                String name = files[i].getName();
                int index = name.lastIndexOf('.');
                if ( index != -1){
                    String suffix = name.substring(index);
                    if (suffix.equalsIgnoreCase(".java")){
                        System.out.println("["+files[i].getPath()+"]");
                        count++;
                    }
                }

            }
        }


    }
}
