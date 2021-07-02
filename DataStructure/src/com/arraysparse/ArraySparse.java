package com.arraysparse;

import java.io.*;
import java.util.ArrayList;

/*
    稀疏数组 (压缩数组)
 */
public class ArraySparse {
    public static void main(String[] args) throws IOException {
        //创建一个二位数组
        int[][] chessArray = new int[11][11];
        chessArray[0][0] = 1;
        chessArray[1][1] = 2;
        //遍历二维数组,确定有效数据的个数
        //计数器
        int count = 0;
        for (int[] array:chessArray) {
            for (int item : array) {
                if (item != 0){
                    count++;
                }
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }
        System.out.println("二维数组中的有效数据个数是:" + count);

        //根据有效数据,创建稀疏数组
        int[][] sparseArray = new int[count + 1][3];
        //在稀疏数据的第一行中写入二维数组的基本状态 行数 列数  有效数据
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = count;

        //循环遍历二维数组,并将有效数据写入稀疏数组中
        //定义一个稀疏数组的行数计数器,从第二行开始
        int spa_count = 1;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArray[i][j] != 0) {
                    sparseArray[spa_count][0] = i;
                    sparseArray[spa_count][1] = j;
                    sparseArray[spa_count][2] = chessArray[i][j];
                    spa_count++;
                }
            }
        }
        //遍历稀疏数组
        for (int[] array:sparseArray) {
            for (int item : array) {
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }

        //将稀疏数组转换为二维数组,根据稀疏数组第一行的数据创建新的二维数组
        int[][] chessArray1 = new int[sparseArray[0][0]][sparseArray[0][1]];
        //将有效数据写入二维数组中
        for (int i = 1; i < sparseArray[0][2] + 1; i++) {
            chessArray1[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        System.out.println("恢复后的二维数组");
        for (int[] array:chessArray1) {
            for (int item : array) {
                if (item != 0){
                    count++;
                }
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }
        //将稀疏数组写入文件中
        File file = new File(".\\sparse.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        for (int[] array:sparseArray) {
            for (int item : array) {
                fileWriter.write(item + "\t");
            }
            fileWriter.write("\r\n");
        }
        fileWriter.close();
        //从文件中读取稀疏数组
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        int[][] sparseArray2 = new int[11][11];
        int row = 0;
        String str;
        while ((str = bufferedReader.readLine() )!= null){
            String[] temp = str.split("\t");
            for (int i = 0; i < temp.length; i++) {
                sparseArray2[row][i] = Integer.parseInt(temp[i]);
            }
            row++;
        }
        bufferedReader.close();
        //将稀疏数组转换为二维数组,根据稀疏数组第一行的数据创建新的二维数组
        int[][] chessArray2 = new int[sparseArray2[0][0]][sparseArray2[0][1]];
        //将有效数据写入二维数组中
        for (int i = 1; i < sparseArray2[0][2] + 1; i++) {
            chessArray2[sparseArray2[i][0]][sparseArray2[i][1]] = sparseArray2[i][2];
        }
        System.out.println("文件恢复后的二维数组");
        for (int[] array:chessArray2) {
            for (int item : array) {
                if (item != 0){
                    count++;
                }
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }
    }


}
