package com.sa.sectionA.fifthLecture.FifthteenLecture;

/**
 * Created by akashs on 11/29/16.
 */
public class SecondThread implements Runnable {

    private String name;
    Thread th;

    public SecondThread(String name) {
        this.name = name;
        th = new Thread(this,name);
        th.start();
    }

    @Override
    public void run() {

    }
}
