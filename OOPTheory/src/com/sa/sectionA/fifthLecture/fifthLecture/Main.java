package com.sa.sectionA.fifthLecture.fifthLecture;

//import com.something.Box;


import com.sa.sectionA.fifthLecture.fifthLecture.something.Box;

public class Main {

    public static void main(String[] args) {
	// write your code
        Box box1 = new Box(10,20,5);
        Box box2 = new Box(12,24,51);
        Box box3 = new Box(15,20,6);

        box1.print("box1");
        box2.print("box2");

        box1=box2;
        box1.print("box1");
        box2.print("box2");

        box1.setDepth(500);
        box1.setWidth(100);

        box1.print("box1");
        box2.print("box2");

        int num=100;
        fun(box3,num);
        box3.print("box3");
        System.out.println("Num "+num);
        box1=box3;
        box3=null;
        box1=null;

        for (int i=0;i<10000;i++){}
    }

    public static void fun(Box box, int num){

        Box tmBox = new Box(box.getWidth(),box.getHeight(),box.getDepth());

        tmBox.setWidth(1111);
        tmBox.setHeight(555);
        num+=500;
    }

    public static void fun( int num, Box box){

        Box tmBox = new Box(box.getWidth(),box.getHeight(),box.getDepth());

        tmBox.setWidth(1111);
        tmBox.setHeight(555);
        num+=500;
    }

    public static int fun(int num){
        num+=500;
        return num;
    }
}
