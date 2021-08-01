package com.offcn.exercise;

import java.io.*;
import java.net.MalformedURLException;

public class Demo01 {
    public static void main(String[] args) {

//    findAllFile("F:\\api\\jdk api 1.8");
        del("sad");
    }


    public static void del(String path1) {
        StringBuilder document = new StringBuilder();
        try {
            File file = new File("F:\\api\\jdk api 1.8\\compact2-frame.html");
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            int line;
            while ((line = reader.read()) != -1)
                document.append((char) line);
            reader.close();

            String str = "<p class=\"legalCopy\"><small><font size=\"-1\"> <a href=\"http://bugreport.sun.com/bugreport/\">Submit a bug or feature</a> <br>For further API reference and developer documentation, see <a href=\"http://download.oracle.com/javase/8/docs/index.html\" target=\"_blank\">Java SE Documentation</a>. That documentation contains more detailed, developer-targeted descriptions, with conceptual overviews, definitions of terms, workarounds, and working code examples.<br> Copyright © 1993, 2014, Oracle and/or its affiliates. All rights reserved. </font></small> \n" +
                    "   <div id=\"juede_adDiv\" data-version=\"1.0.0\"> \n" +
                    "    <script type=\"text/javascript\" src=\"http://466dd.com/scriptAPI/jdk1.8ByGoogle.js\"></script> \n" +
                    "    <div id=\"adDivContent\">\n" +
                    "     本帮助文档是使用\n" +
                    "     <a href=\"http://translate.google.com/\" target=\"_blank\">《谷歌翻译》</a>翻译，请与英文版配合使用 by--QQ:654638585 \n" +
                    "     <div>\n" +
                    "      <div></div>\n" +
                    "     </div>\n" +
                    "    </div>\n" +
                    "   </div></p>  ";
            String str1 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">";
            String replace = document.toString().replace(str, "\n");
            System.out.println(replace);

//            String replace1 = replace.replace(str1, "\n");

//            String path = file.getPath();
//            file.delete();
//            File file1 = new File(path);
//            if (!file1.exists()) {
//                file1.createNewFile();
//            }
//            FileOutputStream fileOutputStream = new FileOutputStream(file1);
//            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//            bufferedOutputStream.write(replace1.getBytes());
//            bufferedOutputStream.flush();
//            bufferedOutputStream.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(document.toString());
    }
    public static void findAllFile(String path) {
        File file = new File(path);

        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                findAllFile(files[i].getPath());
            }

            if (files[i].isFile()) {
                String name = files[i].getName();
                int index = name.lastIndexOf('.');
                if (index != -1) {
                    String suffix = name.substring(index);
                    if (suffix.equalsIgnoreCase(".html")) {
                        del(files[i].getPath());
                    }
                }

            }
        }
    }

}
