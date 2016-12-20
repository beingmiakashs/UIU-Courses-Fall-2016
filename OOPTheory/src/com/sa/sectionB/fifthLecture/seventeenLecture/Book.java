package com.sa.sectionB.fifthLecture.seventeenLecture;

import java.io.Serializable;

/**
 * Created by akashs on 12/1/16.
 */
public class Book implements Serializable {
    public String name;
    public double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
