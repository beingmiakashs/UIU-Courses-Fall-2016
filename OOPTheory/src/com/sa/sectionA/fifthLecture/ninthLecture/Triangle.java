package com.sa.sectionA.fifthLecture.ninthLecture;


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
                System.out.println("Inner class method");
            }
        }
        InnerLocal local = new InnerLocal();
    }

    private String name;


    public static class Inner{
        public String iName;
        public void fun(){
            System.out.println("Inner class method");
        }
    }
}

class App{
    public static void main(String[] args) {
        //Triangle triangle = new Triangle();
        Triangle.Inner inner = new Triangle.Inner();
    }
}
