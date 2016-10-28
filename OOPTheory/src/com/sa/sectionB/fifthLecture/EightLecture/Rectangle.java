package com.sa.sectionB.fifthLecture.EightLecture;


/**
 * Created by akashs on 10/25/16.
 */
public class Rectangle extends Shape{
    public Rectangle(double width, double height) {
        super(width, height, 1);
    }

    @Override
    public double calArea() {
        return width*height;
    }
}
