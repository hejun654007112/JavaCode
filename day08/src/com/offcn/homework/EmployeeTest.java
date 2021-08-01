package com.offcn.homework;

/**
 *
 要求：
 1、写一个程序，把若干各种类型的员工放在一个数组里
 2、结合方法的重写，在上述类结构中合适的位置添加show方法，使show方法能展示任何一个类型对象的属性
 3、在测试类中写一个方法，能够遍历要求1中的数组，展示数组中对象的属性和工资
 */
public class EmployeeTest {
    public static void main(String[] args) {
        int month = 10;
        Employee[] employees = new Employee[8];
        addEmployee(employees);
        print(employees,month);


    }

    //创建员工信息对象
    public static void addEmployee(Employee[] employees){
        //固定工资的员工测试，固定工资为3000
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("张三",10,3000);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("李四",11,3000);
        employees[0] = salariedEmployee1;
        employees[1] = salariedEmployee2;
        //小时员工工资测试
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("王五",8,25.5,200);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("老张",10,25.5,100);
        employees[2] = hourlyEmployee1;
        employees[3] = hourlyEmployee2;
        //销售人员
        SalesEmployee salesEmployee1 = new SalesEmployee("老李",10,12000,0.1);
        SalesEmployee salesEmployee2 = new SalesEmployee("老孙",1,5000,0.1);
        employees[4] = salesEmployee1;
        employees[5] = salesEmployee2;
        //有固定底薪的销售人员测试
        BasePlusSalesEmployee basePlusSalesEmployee1 = new BasePlusSalesEmployee("何梦晨",8,120000,0.5,2100);
        BasePlusSalesEmployee basePlusSalesEmployee2 = new BasePlusSalesEmployee("老王",10,0,0.5,2100);
        employees[6] = basePlusSalesEmployee1;
        employees[7] = basePlusSalesEmployee2;
    }

    public static void print(Employee[] employees, int month){
        for (int i = 0; i < employees.length; i++) {
            employees[i].show();
            employees[i].getSalary(month);
        }
    }

}
