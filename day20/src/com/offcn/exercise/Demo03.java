package com.offcn.exercise;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 键盘录入一个文件夹路径，使用递归打印这个文件夹下的所有文件的绝对路径（包含子文件夹的内容）
 */
public class Demo03 {
    public static void getAllFile(List<File> list,String path){
        File[] files = new File(path).listFiles();
        if (files !=null){
            for (File file : files) {
                if (file.isFile()){
                    list.add(file);
                }else {
                    getAllFile(list,file.getPath());
                }
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<File> list = new ArrayList<>();
        getAllFile(list,"E:\\");

        for (File file : list) {
            System.out.println(file);
        }
    }
}
