package com.offcn.homework;

/**
 * 员工类 父类
 */
public class Employee {

    private String name;
    private int birthMonth;



    public Employee(String name, int birthMonth) {
        this.name = name;
        this.birthMonth = birthMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public  void getSalary(int month){}


    public void show() {
        System.out.print("name='" + name +   ", birthMonth=" + birthMonth );
    }
}

/**
 * 固定工资类
 */
class SalariedEmployee extends Employee{

    private double fixedSalary;

    public SalariedEmployee(String name, int birthMonth, double fixedSalary) {
        super(name, birthMonth);
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public void getSalary(int month) {
        double salary = getBirthMonth() == month ? 100:0;
         salary += fixedSalary;
        System.out.println(this.getName() + month + "月份的工资是：" + salary);
    }

    @Override
    public void show() {
        super.show();
        System.out.println(",fixedSalary=" + fixedSalary );
    }
}

/**
 * 小时工类
 */
class HourlyEmployee extends Employee{
    private double hourlySalary;
    private double hours;

    public HourlyEmployee(String name, int birthMonth, double hourlySalary, double hours) {
        super(name, birthMonth);
        this.hourlySalary = hourlySalary;
        this.hours = hours;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public void getSalary(int month) {
        double salary = getBirthMonth() == month ? 100:0;
        double outHours = this.hours - 160;
        if (outHours > 0){
            salary +=  (160 * hourlySalary) + (outHours * hourlySalary * 1.5);
        }else {
           salary += hours * hourlySalary;
        }
        System.out.println(this.getName() + month + "月份的工资是：" + salary);
    }

    @Override
    public void show() {
        super.show();
        System.out.println( ",hourlySalary=" + hourlySalary + ",hours ="  + hours);
    }
}

/**
 * 销售类
 */
class SalesEmployee extends Employee{
    private double monthlySales;
    private double commissionRate;

    public SalesEmployee(String name, int birthMonth, double monthlySales, double commissionRate) {
        super(name, birthMonth);
        this.monthlySales = monthlySales;
        this.commissionRate = commissionRate;
    }

    public double getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(double monthlySales) {
        this.monthlySales = monthlySales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public void getSalary(int month) {
        double salary = getBirthMonth() == month ? 100:0;
        salary += monthlySales*commissionRate;
        System.out.println(this.getName() + month + "月份的工资是：" + salary);
    }

    @Override
    public void show() {
        super.show();
        System.out.println( ",monthlySales=" + monthlySales + ",commissionRate ="  + commissionRate);
    }
}

/**
 * 底薪销售类
 */
class BasePlusSalesEmployee extends SalesEmployee{
    private double basicSalary;

    public BasePlusSalesEmployee(String name, int birthMonth, double monthlySales, double commissionRate, double basicSalary) {
        super(name, birthMonth, monthlySales, commissionRate);
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public void getSalary(int month) {
        double salary = getBirthMonth() == month ? 100:0;
        salary += basicSalary + this.getMonthlySales()*this.getCommissionRate();
        System.out.println(this.getName() + month + "月份的工资是：" + salary);
    }

    @Override
    public void show() {
        super.show();
        System.out.println( ",basicSalary=" + basicSalary );

    }
}