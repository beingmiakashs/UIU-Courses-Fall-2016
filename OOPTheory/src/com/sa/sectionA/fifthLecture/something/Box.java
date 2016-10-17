package com.sa.sectionA.fifthLecture.something;

/**
 * Created by akashs on 10/16/16.
 */
public class Box {
    private double width;
    private double height;
    private double depth;

    public void print(String name){
        System.out.println(name+":"+width+" "+height+" "+depth);
    }

    public void print(){
        System.out.println(":"+width+" "+height+" "+depth);
    }

    public void print(double name){
        System.out.println(":"+width+" "+height+" "+depth);
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

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("garbage collected");
    }
}
