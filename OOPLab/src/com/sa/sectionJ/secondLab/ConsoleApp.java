package com.sa.sectionJ.secondLab;

import java.util.Scanner;

/**
 * Created by akashs on 10/19/16.
 */
public class ConsoleApp {
    public static void main(String[] args) {

        int n=10;
        int[] a = new int[n];
        double[][] d = new double[10][5];

        Box box = new Box(10,20,15);
        box.print("box1");

        Scanner scanner = new Scanner(System.in);

        a[5]=scanner.nextInt();
        String name = scanner.next();
        scanner.nextLine();
        int num = scanner.nextInt();
        scanner.nextLine();

        String fullName = scanner.nextLine();

        System.out.println(name+" "+num+" "+fullName);
    }
}











