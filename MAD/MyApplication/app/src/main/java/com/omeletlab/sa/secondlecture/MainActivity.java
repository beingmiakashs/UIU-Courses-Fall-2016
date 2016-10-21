package com.omeletlab.sa.secondlecture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputOne;
    EditText inputTwo;
    TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        inputOne = (EditText) findViewById(R.id.inputOne);
        inputTwo = (EditText) findViewById(R.id.inputTwo);
        resultTV = (TextView) findViewById(R.id.result);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numOne = inputOne.getText().toString();
                String numTwo = inputTwo.getText().toString();

                double n1 = Double.parseDouble(numOne);
                double n2 = Double.parseDouble(numTwo);
                double res = n1+n2;
                String tmRes = String.valueOf(res);
                resultTV.setText(tmRes);
            }
        });

    }
}











