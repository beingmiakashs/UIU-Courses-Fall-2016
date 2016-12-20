package com.sa.sectionA.fifthLecture.EleventhLecture;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by akashs on 11/6/16.
 */
class NegativeValueException extends Exception{
    public NegativeValueException(String message) {
        super(message);
    }
}

public class App {
    public static void fun(int a) throws NegativeValueException,IOException {
        if(a<0){
            NegativeValueException ex = new NegativeValueException("You enter negative value");
            throw ex;
        }
        else{
            System.out.println("You enter right value.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String res = input.next();
        try {
            int a = input.nextInt();
            int b = input.nextInt();
            try {
                System.out.println(a / b);
                try {
                    fun(-10);
                } catch (NegativeValueException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            catch (IndexOutOfBoundsException ex){
                System.out.println("You perform a faulty calculation.");
            }
            finally {
                //will execute
            }
            System.out.println(res);
            System.out.println(a);
        }
        catch(InputMismatchException ex){
            System.out.println("You did not enter input properly.");
        }
//        catch (Exception e){
//            System.out.println("Exception occured.");
//        }
        finally {
            System.out.println(res);
        }
        System.out.println("Successfully excuted");
    }
}







