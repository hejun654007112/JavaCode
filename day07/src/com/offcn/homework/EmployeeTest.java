package com.offcn.homework;

public class EmployeeTest {

    public static void main(String[] args) {
        //当前月份
        int month = 10;

        //固定工资的员工测试，固定工资为3000
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("张三",10,3000);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("李四",11,3000);

        salariedEmployee1.getSalary(month);
        salariedEmployee2.getSalary(month);

        salariedEmployee1.showSalary();
        salariedEmployee2.showSalary();

        //小时员工工资测试
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("王五",8,25.5,200);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("老张",10,25.5,100);

        hourlyEmployee1.getSalary(month);
        hourlyEmployee2.getSalary(month);

        hourlyEmployee1.showSalary();
        hourlyEmployee2.showSalary();

        //有固定底薪的销售人员测试
        BasePlusSalesEmployee basePlusSalesEmployee1 = new BasePlusSalesEmployee("何梦晨",8,120000,0.5,2100);
        BasePlusSalesEmployee basePlusSalesEmployee2 = new BasePlusSalesEmployee("老王",10,0,0.5,2100);

        basePlusSalesEmployee1.getSalary(month);
        basePlusSalesEmployee2.getSalary(month);

        basePlusSalesEmployee1.showSalary();
        basePlusSalesEmployee2.showSalary();
    }
}
