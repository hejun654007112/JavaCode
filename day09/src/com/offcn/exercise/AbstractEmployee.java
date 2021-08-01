package com.offcn.exercise;

public abstract class AbstractEmployee {

    private String name;
    private String id;
    private double salary;

    public AbstractEmployee(String name, String id, double salary) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}
abstract class DevelopEmployee extends AbstractEmployee{
    private double bonus;

    public DevelopEmployee(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
}

class Coder extends DevelopEmployee{


    public Coder(String name, String id, double salary, double bonus) {
        super(name, id, salary, bonus);
    }

    @Override
    public void work() {
        System.out.println("软件开发");
    }
}

class Manager extends DevelopEmployee{


    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary, bonus);
    }

    @Override
    public void work() {
        System.out.println("控制进度");
    }
}

abstract class TestEmployee extends AbstractEmployee{

    public TestEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }
}
class Tester extends TestEmployee{

    public Tester(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("软件测试");
    }
}

