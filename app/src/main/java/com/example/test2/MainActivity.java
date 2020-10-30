package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    TextView sum;
    Button pls, mia, gop, nau;
    double a, b, c=0;
    View.OnClickListener cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        sum =  findViewById(R.id.sum);
        pls = (Button) findViewById(R.id.pls);
        mia = (Button) findViewById(R.id.mia);
        gop = (Button) findViewById(R.id.gop);
        nau = (Button) findViewById(R.id.nau);

        cl = new View.OnClickListener() {
            public void onClick(View v) {
                a = Double.parseDouble(num1.getText().toString());
                b = Double.parseDouble(num2.getText().toString());

                switch (v.getId()){
                    case R.id.pls :
                        c=a+b;
                        break;
                    case R.id.mia:
                        c=a-b;
                        break;
                    case R.id.gop:
                        c=a*b;
                        break;
                    case R.id.nau:
                        c=a/b;
                        break;
                }
                sum.setText(String.valueOf(c));
            }
        };
        pls.setOnClickListener(cl);
        mia.setOnClickListener(cl);
        gop.setOnClickListener(cl);
        nau.setOnClickListener(cl);
    }
}