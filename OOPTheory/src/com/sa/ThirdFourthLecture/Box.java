package com.sa.ThirdFourthLecture;

/**
 * Created by akashs on 10/15/16.
 */
public class Box {
    public double width;
    public double height;
    private double depth;

    public double getDepth() {
        return this.depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    Box(){
        width=10;
        height=10;
        depth=10;
        System.out.println("constructor called");
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(double w, double h){
        width=w;
        height=h;
        depth=10;
        System.out.println("Paremeterized consturctor(2) called");
    }

    Box(double w, int h){
        width=w;
        height=h;
        depth=10;
        System.out.println("Paremeterized consturctor(2) called");
    }


    double calArea(){
        return width*height*this.getDepth()-20;
    }

    protected void finalized(){
        System.out.println("Garbage collected");
    }
}



