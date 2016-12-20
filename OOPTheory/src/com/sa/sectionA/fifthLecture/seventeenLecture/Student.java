package com.sa.sectionA.fifthLecture.seventeenLecture;

import java.io.Serializable;

/**
 * Created by akashs on 12/1/16.
 */
public class Student implements Serializable {
    public String name;
    public int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
