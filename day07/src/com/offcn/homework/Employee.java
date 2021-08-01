package com.offcn.homework;


public class Employee {
    //员工的姓名
    private String name;
    //员工的生日月份
    private int months;
    //员工的工资
    private double currentSalary ;

    public Employee() {
    }

    public Employee(String name, int months) {
        this.name = name;
        this.months = months;
    }

    public Employee(String name, int months, double currentSalary) {
        this.name = name;
        this.months = months;
        this.currentSalary = currentSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }

    //如果该月员工过生日，则公司会额外奖励100元
    public void getSalary(int month){
        if (this.months == month){
            currentSalary += 100;
        }
    }
    //打印员工工资
    public void showSalary(){
        System.out.println(this.getName()+"工资是："+this.getCurrentSalary());
    }
}

class SalariedEmployee extends Employee {
    //月薪
    private double monthSalary;


    public SalariedEmployee(String name, int months, double monthSalary) {
        super(name, months);
        this.monthSalary = monthSalary;
    }
    //固定工资
    @Override
    public void getSalary(int month) {
        setCurrentSalary(monthSalary);
        super.getSalary(month);
    }
}

class HourlyEmployee extends Employee{
    //每小时的工资
    private double hourSalary;
    //每月工作的小时数
    private double hoursForMonth;

    public HourlyEmployee(String name, int months, double hourSalary, double hoursForMonth) {
        super(name, months);
        this.hourSalary = hourSalary;
        this.hoursForMonth = hoursForMonth;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public double getHoursForMonth() {
        return hoursForMonth;
    }

    public void setHoursForMonth(double hoursForMonth) {
        this.hoursForMonth = hoursForMonth;
    }

    //每月工作超出160小时的部分按照1.5倍工资发放
    @Override
    public void getSalary(int month) {
        double outHours = this.hoursForMonth - 160;
        if (outHours > 0){
            this.setCurrentSalary ((160 * hourSalary) + (outHours * hourSalary * 1.5));
        }else {
            this.setCurrentSalary (hoursForMonth * hourSalary);
        }
        super.getSalary(month);
    }
}

class SalesEmployee extends Employee{
    //月销售额
    private double monthSales;
    //提成率
    private double commission;

    public SalesEmployee(String name, int months, double monthSales, double commission) {
        super(name, months);
        this.monthSales = monthSales;
        this.commission = commission;
    }

    public double getMonthSales() {
        return monthSales;
    }

    public void setMonthSales(double monthSales) {
        this.monthSales = monthSales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }


}
class BasePlusSalesEmployee extends SalesEmployee{
    //固定底薪
    private double basicSalary;

    public BasePlusSalesEmployee(String name, int months, double monthSales, double commission, double basicSalary) {
        super(name, months, monthSales, commission);
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    //工资由底薪加上销售提成部分
    @Override
    public void getSalary(int month) {
        this.setCurrentSalary(basicSalary + getMonthSales()*getCommission());
        super.getSalary(month);
    }
}