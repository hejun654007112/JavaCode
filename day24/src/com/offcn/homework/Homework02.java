package com.offcn.homework;

/**
 * 4、使用switch语句结合枚举类型，以枚举项作为匹配的表达式，输出打印周一到周日
 */
public class Homework02 {
    public static void main(String[] args) {

        getWeek(Week.MON);
    }

    public static void getWeek(Week v) {
        switch(v){
            case MON:
                System.out.println(Week.MON.getName());
                break;
            case TUS:
                System.out.println(Week.TUS.getName());
                break;
            case WED:
                System.out.println(Week.WED.getName());
                break;
            case THU:
                System.out.println(Week.THU.getName());
                break;
            case FRI:
                System.out.println(Week.FRI.getName());
                break;
            case SAT:
                System.out.println(Week.SAT.getName());
                break;
            case SUN:
                System.out.println(Week.SUN.getName());
                break;
        }
    }

}

enum Week{
    MON("星期一"),
    TUS("星期二"),
    WED("星期三"),
    THU("星期四"),
    FRI("星期五"),
    SAT("星期六"),
    SUN("星期天");

    private String name;
    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
