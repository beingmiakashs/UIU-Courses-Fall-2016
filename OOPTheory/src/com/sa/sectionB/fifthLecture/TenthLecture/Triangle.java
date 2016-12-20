package com.sa.sectionB.fifthLecture.TenthLecture;

/**
 * Created by akashs on 11/1/16.
 */
public class Triangle extends Shape implements ShapeFunctionality, PrintFuntionality  {

    @Override
    public void calArea() {

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

    }

    @Override
    public void print() {
        System.out.println("Triangle");
        Inner in = new Inner();
        System.out.println(in.iName);

        class Inner{
            public String iName;
            public void inFun(){
                System.out.println(iName);
            }

        }
    }
    private String oName;

    public static class Inner{
        public String iName;
        public void inFun(){
            System.out.println(iName);
        }

    }
}



class App{
    final int a=10;

    public static void main(String[] args) {
        //Triangle obj = new Triangle();
        //Triangle.Inner in = obj.new Inner();

        //Triangle.Inner sIn = new Triangle.Inner();

        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Shape sh;

        sh = triangle;
        sh.print();

        Class ch = sh.getClass();
        System.out.println(ch.getName());

        if(sh instanceof Triangle){
            System.out.println("Triangla instance");
        }

        sh = rectangle;
        sh.print();
        sh.calArea();
    }
}









