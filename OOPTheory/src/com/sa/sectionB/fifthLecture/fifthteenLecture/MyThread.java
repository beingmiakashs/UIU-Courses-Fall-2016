package com.sa.sectionB.fifthLecture.fifthteenLecture;

/**
 * Created by akashs on 11/27/16.
 */
public class MyThread extends Thread {

    private String name;
    public long count;
    private long start;
    private long end;
    Counter counter;

    public MyThread(String name) {
        super(name);
        this.name = name;
    }

    public MyThread(String name, long start, long end) {
        super(name);
        this.start = start;
        this.end = end;
    }

    public MyThread(String name, long start, long end, Counter counter) {
        super(name);
        this.start = start;
        this.end = end;
        this.counter = counter;
    }

    @Override
    synchronized  public void run() {
        //synchronized (counter) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (long i = start; i <= end; i++) {
                if (i % 2 == 0) {

                    counter.total++;
                }
          //  }
        }
//        try {
//            for(int i=10;i>=0;i--) {
//                System.out.println(name+": "+i);
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
