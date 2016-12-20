package com.sa.sectionJ.secondLab.FourthLab;

/**
 * Created by akashs on 11/2/16.
 */
public class Triangle extends Shape {

    public Triangle(double width, double height) {
        super(width, height);
    }

    public void print(){
        System.out.println(super.getWidth());
    }

    @Override
    public double calArea() {
        double res = getWidth()*height*0.5;
        return res;
    }
}

class App{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10,20);
        double res = triangle.calArea();
        System.out.println(res);
        int[] a = new int[10];
        Integer[] b = new Integer[10];

        Shape[] triangleList = new Shape[10];
        triangleList[0] = new Triangle(10,15);
        triangleList[1] = new Triangle(20,25);

    }
}










