package circlearray;

import java.io.File;

/*
    用递归获取目录下的所有文件
 */
public class FileName {
    public static void main(String[] args) {
        File file = new File("D:\\CTS下载");
        getFileName(file);

    }
    public static void getFileName(File file){
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()){
                getFileName(files[i]);
            }else {
                System.out.println(files[i].getAbsolutePath());
            }
        }
    }
}
