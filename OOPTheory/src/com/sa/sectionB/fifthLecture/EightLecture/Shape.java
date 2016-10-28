package com.sa.sectionB.fifthLecture.EightLecture;

/**
 * Created by akashs on 10/25/16.
 */
public abstract class Shape {
    public double width;
    public double height;
    public double depth;

    public Shape(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public abstract double calArea();
}
