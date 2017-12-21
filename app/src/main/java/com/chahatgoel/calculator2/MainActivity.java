package com.chahatgoel.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bclear,b3mul,bdiv,bequals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bclear=findViewById(R.id.bclear);
        bequals=findViewById(R.id.bequals);
        badd=findViewById(R.id.badd);
        bsub=findViewById(R.id.bsub);
        b3mul=findViewById(R.id.b3mul);
        bdiv=findViewById(R.id.bdiv);


    }
}
