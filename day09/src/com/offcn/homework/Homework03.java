package com.offcn.homework;

/**
 *    3、现有两种  OldPhone NewPhone; 两个类都有call()  sendMessage() 方法(考虑向上抽取一个父类);
 * 	    已知接口IPlay中有一个方法 playGame()，NewPhone添加玩游戏的功能;
 * 	要求: 分别测试OldPhone和NewPhone的两个方法,再测试新手机palyGame()的方法.
 */
public class Homework03 {

    public static void main(String[] args) {
        Phone phone1 = new OldPhone();
        Phone phone2 = new NewPhone();

        phone1.call();
        phone1.sendMessage();

        phone2.call();
        phone2.sendMessage();

        IPlay play = (IPlay) phone2;
        play.playGame();

        NewPhone newPhone = (NewPhone) phone2;
        newPhone.playGame();
    }
}

abstract class Phone{
    public Phone() {
    }

    public abstract void call();
  public abstract void sendMessage();
}
class OldPhone extends Phone{

    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("发短信");
    }
}

class NewPhone extends Phone implements IPlay{
    @Override
    public void call() {
        System.out.println("打视频电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("发彩信");
    }

    @Override
    public void playGame() {
        System.out.println("打游戏");
    }
}

interface IPlay{
    void playGame();
}