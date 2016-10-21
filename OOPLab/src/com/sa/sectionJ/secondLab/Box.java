package com.sa.sectionJ.secondLab;

/**
 * Created by akashs on 10/19/16.
 */
public class Box {
    private double width;
    private double height;
    private double depth;

    public void print(String name){
        System.out.println(name+" "+width+" "+height+" "+depth);
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}









