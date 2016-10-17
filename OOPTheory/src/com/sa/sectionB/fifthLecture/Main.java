package com.sa.sectionB.fifthLecture;


import com.sa.sectionB.fifthLecture.first.Box;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Box box1 = new Box(10,20,5);
        box1.setHeight(10);
        Box box2 = new Box(15,10,15);
        Box box3 = new Box(20,30,10);


        box1.print("box1");
        box2.print("box2");

        box2=box3;
        box2.print("box2");
        box3.print("box3");

        box2.setWidth(111);
        box2.setHeight(225);

        box2.print("box2");
        box3.print("box3");

        int num=100;
        fun(box1, num);
        box1.print("box1");
        System.out.println("Num "+num);
    }

    public static void fun(Box box, int num){

        Box tmBox = new Box(box.getWidth(), box.getHeight(), box.getDepth());

        tmBox.setHeight(369);
        tmBox.setDepth(999);

        num+=100;
    }
}
