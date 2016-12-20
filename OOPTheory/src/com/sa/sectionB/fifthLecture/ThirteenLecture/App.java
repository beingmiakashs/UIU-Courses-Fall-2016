package com.sa.sectionB.fifthLecture.ThirteenLecture;

/**
 * Created by akashs on 11/13/16.
 */
public class App {
    public static void main(String[] args) {
        Activity ac = new Activity(){

            @Override
            public void setContent() {

            }

            @Override
            public String getView(String s) {
                return null;
            }
        };
    }
}

class B extends Activity{
    @Override
    public void setContent() {

    }

    @Override
    public String getView(String s) {
        return null;
    }
}

abstract class Activity{
    public String msg;
    public abstract void setContent();
    public abstract String getView(String s);
}
