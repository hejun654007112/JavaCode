package com.offcn.homerwork;

import java.io.File;
import java.util.*;

/**
 * 3、键盘录入一个文件夹路径，这个文件夹还嵌套了文件夹。统计该文件夹下的各种后缀名的文件的个数
 * 	例如：.txt有10个，.java有30个......
 */
public class Homework03 {
    private static void getAllFile(File file, List<File> list){
        File[] listFiles = file.listFiles();
        if (listFiles != null){
            for (File f : listFiles) {
                if (f.isFile()){
                    list.add(f);
                }else{
                    getAllFile(f,list);
                }
            }
        }
    }

    public static List<File> getAllFile(File file){
        ArrayList<File> list = new ArrayList<>();
        getAllFile(file,list);
        return list;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个有效路径:");
        File file = new File(sc.nextLine());

        List<File> list = getAllFile(file);

        HashMap<String, Integer> map = new HashMap<>();

        for (File f : list) {
            String name = f.getName();
            int i = name.lastIndexOf('.');
            if (i != -1){
                String key = name.substring(i);
               map.put(key, map.containsKey(key)?map.get(key) + 1:1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append("有" ) .append(entry.getValue()).append("个, ");
        }
        sb.replace(sb.length() - 2,sb.length(),"");

        System.out.println(sb);
    }
}
