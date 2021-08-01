package com.offcn.exercise;

/**
 * 程序员类：姓名、年龄、工号、工资、工作
 * 项目经理：姓名、年龄、工号、工资、奖金、工作
 */
public class Employees {
    //姓名
    private String name;
    //年龄
    private int age;
    //工号
    private String sno;
    //工资
    private double salary;


    public Employees() {
    }

    public Employees(String name, int age, String sno, double salary) {
        this.name = name;
        this.age = age;
        this.sno = sno;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void work(){
        System.out.println("工作");
    }

}

class Programmer extends Employees {

    public Programmer() {
    }

    public Programmer(String name, int age, String sno, double salary) {
        super(name, age, sno, salary);
    }
}

class PM extends Employees {
    //奖金
   private double bonus;


    public PM(double bonus) {
        this.bonus = bonus;

    }

    public PM() {
        System.out.println("构造方法执行");
    }

    {
        System.out.println("构造代码快执行");
    }
    static {
        System.out.println("静态代码快执行");
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
