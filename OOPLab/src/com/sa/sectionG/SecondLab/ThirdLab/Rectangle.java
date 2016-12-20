package com.sa.sectionG.SecondLab.ThirdLab;

/**
 * Created by akashs on 10/30/16.
 */
public class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        //super(width, height);
        super.height = height;
        setWidth(width);
    }

    public void fun(){

    }

    public void print(){
        System.out.println("Rectangle");
        super.print();
    }

    public void print(String name){
        System.out.println("Rectangle");
        super.print();
    }
}











