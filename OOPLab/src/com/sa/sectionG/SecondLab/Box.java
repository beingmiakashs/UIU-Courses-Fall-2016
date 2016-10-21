package com.sa.sectionG.SecondLab;

/**
 * Created by akashs on 10/16/16.
 */
public class Box {
    public double width;
    public double height;
    public double depth;
    public String name;

    public Box(double width, double height, double depth, String name) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.name = name;
    }
    public void print(){
        System.out.println(name+" "+width+" "+height+" "+depth);
    }

    public double calArea(){
        double area = width*height*depth;
        return area;
    }

}












