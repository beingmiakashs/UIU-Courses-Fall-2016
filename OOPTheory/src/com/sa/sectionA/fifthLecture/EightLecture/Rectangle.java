package com.sa.sectionA.fifthLecture.EightLecture;

/**
 * Created by akashs on 10/25/16.
 */
public class Rectangle extends Shape implements shapeFunctionality {
    public Rectangle(double width, double height) {
        super(width, height, 1);
    }

    @Override
    public double calArea() {
        return width*height;
    }

    @Override
    public double calAngle() {
        return 0;
    }

    @Override
    public double calDiagonalLength() {
        return 0;
    }

    @Override
    public void doNothing(String name) {

    }
}
