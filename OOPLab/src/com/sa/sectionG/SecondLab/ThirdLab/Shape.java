package com.sa.sectionG.SecondLab.ThirdLab;

/**
 * Created by akashs on 10/30/16.
 */
public class Shape {
    private double width;
    public double height;
    public double depth;

    public void print(){
        System.out.println("shape");
    }

    public Shape(){}

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Shape(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
