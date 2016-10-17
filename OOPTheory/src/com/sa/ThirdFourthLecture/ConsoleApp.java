package com.sa.ThirdFourthLecture;

public class ConsoleApp {

    public static void main(String[] args) {
	// write your code here
        int studentID=10;
        char ch;
        double cgpa=3.8;
        boolean isStudent=false;
        String stundetName="anik";
        isStudent = true;
        System.out.println("Hello World "+studentID+" "+stundetName);
        if(isStudent==true){
            System.out.println("UIU student");
        }
        int[] a = new int[6];
        double[][] d = new double[10][];
        d[0]=new double[10];
        d[1]=new double[5];
        d[2]=new double[2];
        //d[3][5]=10;

        a[0]=13;
        a[1]=15;
        a[2]=11;
        a[3]=15;
        a[4]=12;
        for(int num : a){
            System.out.println(num);
        }

        Student student1 = new Student();
        student1.cgpa=3.8;
        student1.studentId=101;
        student1.studentName="Safat";

        Box box = new Box();
        box.width=10;
        box.height=5;
        box.setDepth(3);
        System.out.println(box.calArea());
        Box box2 = new Box();
        System.out.println(box2.calArea());

        Box box3 = new Box(200,10,5);
        System.out.println(box3.calArea());

        Box box4 = new Box(200,10);
        System.out.println(box4.calArea());

        box=box2;
        box2=box3;
    }

}







