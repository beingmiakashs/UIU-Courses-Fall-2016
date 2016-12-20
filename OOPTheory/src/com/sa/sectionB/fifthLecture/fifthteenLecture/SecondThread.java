package com.sa.sectionB.fifthLecture.fifthteenLecture;

/**
 * Created by akashs on 11/29/16.
 */
public class SecondThread implements Runnable {

    public String name;
    Thread th;
    long start;
    long end;

    public SecondThread(String name) {
        this.name = name;
        th = new Thread(this);
        //th.start();
    }

    @Override
    public void run() {

    }
}









