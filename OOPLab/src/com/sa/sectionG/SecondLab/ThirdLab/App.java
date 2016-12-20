package com.sa.sectionG.SecondLab.ThirdLab;

/**
 * Created by akashs on 10/30/16.
 */
public class App {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        rectangle.print();

        int[] a = new int[10];
        Integer[] b = new Integer[10];
        Rectangle[] rList = new Rectangle[10];
        rList[0] = new Rectangle(10,20);
        rList[1] = new Rectangle(20,15);

        rList[1].print();
        int len = rList.length;


        rList[0].fun();
        Shape sh;
        sh = new Rectangle(10,12);
        //sh = new Triangle(10,12);
        sh.print();
        //sh.fun();

        Shape[] sList = new Shape[10];

        sList[0] = new Triangle(10,15);
        sList[1] = new Rectangle(25,5);
        sList[2] = new Triangle(20,10);
        sList[3] = new Rectangle(20,15);
    }
}




















