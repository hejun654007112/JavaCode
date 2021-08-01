package com.offcn.bean;

public class Demo {
    public static void main(String[] args) {
        //Car类测试
        Car car = new Car("黑色",4);
        car.run();

        //Animal类测试
        Animal animal = new Animal("小白",2);
        animal.eat();
        animal.sleep();

        //book类测试
        Book book = new Book("自然与科学","12343");
        System.out.println(book.getBookName()+"  "+book.getBookNumber());

        //Employee类测试
        Employee employee = new Employee("张三",02,3000);
        employee.show();

        //Person类测试
        Person person = new Person("李四",23,"男");
        person.study();
        person.sleep();

        //Student类测试
        Student student = new Student("王五","202010203",18);
        System.out.println(student.getName() + student.getAge() +"岁，学号："+ student.getSno());
    }
}
