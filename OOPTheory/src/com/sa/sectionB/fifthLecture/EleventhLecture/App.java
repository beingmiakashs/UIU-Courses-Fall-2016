package com.sa.sectionB.fifthLecture.EleventhLecture;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by akashs on 11/6/16.
 */

class NegValueEx extends Exception{
    public NegValueEx(String message) {
        super(message);
    }
}

public class App {

    public static void fun(int num) throws NegValueEx, IOException {
        if(num<0){
            NegValueEx ex = new NegValueEx("You enter negative value");
            throw ex;
        }
        else{
            System.out.println("You entered appropriate value.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char ch = s.charAt(0);
        try {
            int a = input.nextInt();
            int b = input.nextInt();
            try {
                try {
                    fun(-15);
                } catch (NegValueEx negValueEx) {
                    negValueEx.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(a / b);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exception in equation");
            }
            finally {
                System.out.println("Equation executed");

                System.out.println(s);
                System.out.println(a);
            }

        }
        catch (InputMismatchException e){
            System.out.println("You enter invalid number");
        }
        catch (ArithmeticException e){
            System.out.println("Wrong Equation");
        }
        finally {
            System.out.println("Exception guarded");
        }

        System.out.println("Successfully executed");

    }
}





