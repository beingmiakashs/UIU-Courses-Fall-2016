package com.sa.sectionA.fifthLecture.TenthLecture;

/**
 * Created by akashs on 10/30/16.
 */
public abstract class Shape {
    public double width;
    public double height;
    public double depth;

    public abstract double calArea();

    public void print(){
        System.out.println(width+" "+height+" "+depth);
    }
}
