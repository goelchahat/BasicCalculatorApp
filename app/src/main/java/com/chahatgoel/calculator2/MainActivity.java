package com.chahatgoel.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bclear,b3mul,bdiv,bequals;
    boolean mAddition,mSubtract,mMultiplication,mDivision;
    float mValueOne,mValueTwo;


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
        et1=findViewById(R.id.et1);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"0");

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"3");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText()+"9");

            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 mValueOne = Float.parseFloat(et1.getText() + "");
                et1.setText(et1.getText()+"+");
                 mAddition = true;
                et1.setText(null);


            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(et1.getText() + "");
                mSubtract = true ;
                et1.setText(null);


            }
        });
        b3mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(et1.getText() + "");
                mMultiplication = true ;
                et1.setText(" * ");
                et1.setText(null);

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(et1.getText() + "");
                mDivision = true ;
                et1.setText(" / ");
                et1.setText(null);

            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText(" ");

            }
        });
        bequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               float mValueTwo = Float.parseFloat(et1.getText() + "");
               et1.getText().clear();

                if (mAddition == true){
                   float ans=mValueOne+ mValueTwo;


                    et1.setText(ans +"");
                    mAddition=false;
                }





        if (mSubtract == true){
            et1.setText(mValueOne - mValueTwo+"");
            mSubtract=false;
        }

        if (mMultiplication == true){
            et1.setText(mValueOne * mValueTwo+"");
            mMultiplication=false;
        }

        if (mDivision == true){
            et1.setText(mValueOne / mValueTwo+"");
            mDivision=false;
        }
    }
});




    }
}
