package com.sa.sectionA.fifthLecture.FifthteenLecture;

/**
 * Created by akashs on 11/27/16.
 */
public class App {
    public static void main(String[] args) {
        Thread mainTh = Thread.currentThread();
        mainTh.setName("mainThread");
        //mainTh.setPriority(Thread.MAX_PRIORITY);
        System.out.println(mainTh);

        Counter counter = new Counter();
        MyThread th1 = new MyThread("ThreadOne", 1, 1000000, counter);
        MyThread th2 = new MyThread("ThreadTwo", 1, 1000000, counter);

        th1.start();
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.start();
        th2.setPriority(Thread.MIN_PRIORITY);

        SecondThread st = new SecondThread("second thread");

        try {
            th1.join();
            th2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.total);


//        for(long i=2;i<1000000000;i++){
//            for(long j=2;j<1000000;j++) {
//                long res = i+j;
//            }
//        }
        System.out.println("complete");
    }
}
