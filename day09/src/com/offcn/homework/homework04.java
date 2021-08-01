package com.offcn.homework;

/**
 * 4、设计一个形状类Shape,方法:求周长和求面积
 * 形状类(
 * 形状类也可以写成接口)的子类(实现类):Rect(矩形),Circle(圆形)
 *
 * Rect类的子类:Square(正方形)
 * 不同的子类会有不同的计算周长和面积的方法
 * 创建三个不同的形状对象，
 * 放在Shape类型的数组里,分别打印出每个对象的周长和面积
 */
public class homework04 {
    public static void main(String[] args) {
        AbstractShape[] shapes = {
                new Rect(12.5,2),
                new Circle(2),
                new Square(4)
        };

        for (AbstractShape shape :shapes ) {
            System.out.println("面积是：" + shape.area());
            System.out.println("周长是：" + shape.perimeter());
        }

    }
}

abstract class AbstractShape implements ShapeCalculate{

}
/*
    矩形
 */
 class Rect extends AbstractShape{
    private double length;
    private double width;

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return (length + width) *2;
    }
}
/*
    圆形
 */
class Circle extends AbstractShape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return ShapeCalculate.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return ShapeCalculate.PI * radius *2;
    }
}
/*
    正方形
 */
class Square extends Rect{

    public Square(double sideLength) {
        super(sideLength,sideLength);
    }

}

interface ShapeCalculate{
    double PI = 3.1415926;

    double area();
    double perimeter();
}