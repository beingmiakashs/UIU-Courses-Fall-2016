package com.sa.sectionA.fifthLecture.TenthLecture;

import com.sa.sectionA.fifthLecture.ninthLecture.PrintFuntionality;
import com.sa.sectionA.fifthLecture.ninthLecture.ShapeFunctionality;

import java.util.Scanner;

/**
 * Created by akashs on 10/30/16.
 */
public class Triangle extends Shape implements ShapeFunctionality, PrintFuntionality {

    @Override
    public double calArea() {
        return width*height*0.5;
    }

    @Override
    public double getAngle() {
        return 0;
    }

    @Override
    public double calDiagonal(String name) {
        return 0;
    }

    @Override
    public void print(String name) {


        class InnerLocal{
            public String iName;
            public void fun(){
                System.out.println("Inner class method: Triangle");
            }
        }
        InnerLocal local = new InnerLocal();
        local.fun();
    }

    private String name;

    public class Inner{
        public String iName;
        public void fun(){
            System.out.println("Inner class method");
        }
    }
}

class App{

    final int a=10;

    public static void main(String[] args) {
        Triangle obj = new Triangle();
        Triangle.Inner inner = obj.new Inner();
        //Triangle.Inner inner = new Triangle.Inner();
        Rectangle rectangle = new Rectangle();

        Shape shape;
        shape = obj;
        shape.print();
        shape.calArea();

        if(shape instanceof Triangle){
            System.out.println("Now shape refered Triangle.");
            Class sh = shape.getClass();            System.out.println(sh.getName());
        }

        shape=rectangle;
        shape.print();

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int res = a/b;
        System.out.println(res);

    }
}





