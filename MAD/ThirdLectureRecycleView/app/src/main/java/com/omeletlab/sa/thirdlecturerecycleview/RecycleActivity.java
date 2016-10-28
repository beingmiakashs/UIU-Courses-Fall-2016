package com.omeletlab.sa.thirdlecturerecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Laptop Acer", 25));
        products.add(new Product("Laptop HP", 10));
        products.add(new Product("Apple Mac", 5));

        ProductAdapter productAdapter = new ProductAdapter(products);
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setAdapter(productAdapter);
    }
}

















