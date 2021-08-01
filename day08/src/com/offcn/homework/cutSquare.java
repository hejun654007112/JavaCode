package com.offcn.homework;

/**
 * 6、【问题描述】（这道题目和最近学习的知识无关，在于复习之前的内容以及锻炼思维，题目实际不难）
 * 	小明有一些矩形的材料，他要从这些矩形材料中切割出一些正方形。
 * 	当他面对一块矩形材料时，他总是从中间切割一刀，切出一块最大的正方形，
 * 	剩下一块矩形，然后再切割剩下的矩形材料，直到全部切为正方形为止。
 * 	例如，对于一块两边分别为 5 和 3 的材料（记为 5×3），
 * 	小明会依次切出 3×3、2×2、1×1、1×1 共 4 个正方形。
 * 	现在小明有一块矩形的材料，两边长分别是 2019 和 324。
 * 	请问小明最终会 切出多少个正方形？
 * 	【正确答案】
 * 	21个
 */
public class cutSquare {

    public static void main(String[] args) {
        int l = 2019;
        int w = 324;
        int count = 0;
        while (true){
            while (l > w){
                l = l - w;
                count++;
            }
            while (l < w){
                w = w - l;
                count++;
            }
            if (l == w){
                count++;
                break;
            }
        }
        System.out.println(count);

    }
}
