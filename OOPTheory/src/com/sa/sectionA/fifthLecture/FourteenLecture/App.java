package com.sa.sectionA.fifthLecture.FourteenLecture;

/**
 * Created by akashs on 11/13/16.
 */
public class App {
    public static void main(String[] args) {
        Activity ac = new Activity(){

            @Override
            public void fun() {

            }

            @Override
            public void setElement(String s) {

            }
        };
    }
}

abstract class Activity{
    public abstract void fun();
    public abstract void setElement(String s);
}
