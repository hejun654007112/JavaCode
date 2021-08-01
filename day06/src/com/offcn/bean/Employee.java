package com.offcn.bean;

/**
 * 员工类Employee
* 	属性：姓名name,工号id,工资salary
 * 	行为：显示所有成员信息的方法show()
 */
public class Employee {

    private String name;

    private int id;

    private double salary;

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //显示信息
    public void show(){
        System.out.println("name=" + this.name+",id=" + this.id+",salary=" + this.salary);
    }
}
