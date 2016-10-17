package com.sa.omelet.SecondLab;

public class ConsoleApp {

    private static String fullName;

    public static void main(String[] args) {
	// write your code here
//        int a=10;
//        double d=15;
//        String name="anik";
//
//        System.out.print("Hello world: "+a+" "+d);
//        System.out.println(name);
//
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        sc.nextLine();
//        d = sc.nextDouble();
//        sc.nextLine();
//        name = sc.next();
//        sc.nextLine();
//
//        fullName = sc.nextLine();
//        System.out.println(a);
//        System.out.println(d);
//        System.out.println(name);
//        System.out.println(fullName);

        Box box1 = new Box(10,15,5,"box1");
//        box1.height=10;
//        box1.name="box1";
        box1.print();
        double area = box1.calArea();
        System.out.println("Area "+area);


    }
}














