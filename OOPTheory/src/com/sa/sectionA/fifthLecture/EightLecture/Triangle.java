package com.sa.sectionA.fifthLecture.EightLecture;

/**
 * Created by akashs on 10/25/16.
 */
public class Triangle extends Shape {
    public Triangle(double width, double height) {
        super(width, height, 0);
    }

    @Override
    public double calArea() {
        return width*height*0.5;
    }
}
