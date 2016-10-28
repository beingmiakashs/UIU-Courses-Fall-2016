package com.sa.sectionB.fifthLecture.EightLecture;

/**
 * Created by akashs on 10/25/16.
 */
public abstract class Triangle extends Shape implements ShapeFunctionality {
    public Triangle(double width, double height) {
        super(width, height, 0);
    }

    @Override
    public double calArea() {
        return width*height*0.5;
    }
}
