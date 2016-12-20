package com.sa.sectionJ.secondLab.FourthLab;

/**
 * Created by akashs on 11/2/16.
 */
public class Shape  {
    private double width;
    public double height;
    public double depth;

    public double calArea(){
        return width*height*depth;
    }

    public Shape(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

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
}
