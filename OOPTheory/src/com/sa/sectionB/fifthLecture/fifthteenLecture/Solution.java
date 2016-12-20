package com.sa.sectionB.fifthLecture.fifthteenLecture;

/**
 * Created by akashs on 11/27/16.
 */
public class Solution {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        mainThread.setName("MainThread");
        mainThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(mainThread);

        Counter counter = new Counter();
        MyThread m1 = new MyThread("ThreadOne",1 ,100, counter);
        MyThread m2 = new MyThread("ThreadTwo", 101, 200, counter);
        SecondThread st = new SecondThread("Second Thread");
        st.th.start();

        m1.start();
        m1.setPriority(Thread.MAX_PRIORITY);
        m2.start();
        m2.setPriority(Thread.MIN_PRIORITY);

//        try {
//            for(int i=2;i>=0;i--) {
//                System.out.println("Main: "+i);
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        //m1.stop();
//        //m2.stop();

        try {
            m1.join();
            m2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        System.out.println("ThreadOne "+m1.count);
//        System.out.println("ThreadTwo "+m2.count);
        System.out.println("Total: "+counter.total);
        System.out.println("Complete");
    }
}
