package com.offcn.homework;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * 5、(选做题，难度大)给定一个字符串，该字符串只能包括下列字符：
 * '(',')','{','}','[',']'
 * 判断字符串是否有效。
 * 有效字符串必须满足：
 * ① 左括号必须用相同类型的又括号闭合
 * ② 左括号必须以正确的顺序闭合
 * <p>
 * 例如：输入："()"，输出：true
 * 输入："()[]{}"，输出：true
 * 输入："({)}"，输出：false
 * 输入："{[]}"，输出：true
 */
public class Homework05 {


    public static void main(String[] args) {
        System.out.println(judge("()[]{}"));

    }

    public static boolean judge(String s){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        map.put('-','-');
        LinkedList<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {

            if (map.containsKey(c)){
                list.push(c);
            }else if (map.get(list.poll()) == c ){
                    return false;

            }
        }
        return list.size()==1;
    }
}
