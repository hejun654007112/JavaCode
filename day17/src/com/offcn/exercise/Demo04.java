package com.offcn.exercise;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream os = new FileOutputStream();
        String s = "想见你想见你想见你\n" +
                "小幸运\n" +
                "stay with me\n" +
                "喜欢你\n" +
                "句号\n" +
                "透明\n" +
                "倒数\n" +
                "我的秘密\n" +
                "光年之外\n" +
                "没有理由\n" +
                "嚣张\n" +
                "最甜情歌\n" +
                "晚安\n" +
                "嘉宾\n" +
                "我的梦(中英)\n" +
                "间距\n" +
                "没有理由\n" +
                "收敛\n" +
                "为敌\n" +
                "四季予你\n" +
                "偏爱\n" +
                "厚颜无耻\n" +
                "天外来物\n" +
                "少年\n" +
                "太阳\n" +
                "心如止水\n" +
                "说爱你\n" +
                "that girl\n" +
                "faded\n" +
                "你就不要想起我\n" +
                "夜空中最亮的星\n" +
                "最美的太阳\n" +
                "为你写诗\n" +
                "有点甜\n" +
                "一笑倾城\n" +
                "后会无期\n" +
                "十年\n" +
                "白鸽\n" +
                "love short\n" +
                "十二月的奇迹\n" +
                "晴天\n" +
                "红黑\n" +
                "失眠飞行\n" +
                "年轮说\n" +
                "我的歌声里\n" +
                "没有什么不同\n" +
                "让我留在你身边\n" +
                "love love\n" +
                "浪人琵琶\n" +
                "光的方向\n" +
                "清空\n" +
                "云与海\n" +
                "执迷不悟\n" +
                "偏爱\n" +
                "忘记时间\n" +
                "脆弱星球\n" +
                "坠落星空\n" +
                "微微\n" +
                "来自天堂的魔鬼\n" +
                "梦不落雨林\n" +
                "下坠\n" +
                "空空如也";
        String[] split = s.split("\\n");




//        System.out.println(Arrays.toString(split));

        FileWriter fileWriter = new FileWriter("E:\\1.txt");

        for (int i = 0; i < split.length; i++) {
            String s2 = add(split[i]);
            if (i % 3 == 0 &&i!=0){
                fileWriter.write(s2  +"\t" + "\n");
            }else {
                fileWriter.write(s2  +"\t");
            }


        }

        fileWriter.close();
    }

    public static String add(String s){
        if (s.length() < 20){
            for (int i = 0; i < 20 - s.length(); i++) {
                s += " ";
            }
        }

        return s;
    }
}
