package com.kcgroup.bmicalculator;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;


public class MainActivity extends Activity
{private EditText et1, et2;
    private Button btn;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.edittext1);
        et2=(EditText) findViewById(R.id.edittext2);
        btn=(Button) findViewById(R.id.calculate);
        tv=(TextView) findViewById(R.id.textview);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View pl)
            {
                bmi();



            }
        });

    }



    private void bmi(){

        float a, b, c;

        a = Float.parseFloat(et2.getText().toString()) / 100;
        b = Float.parseFloat(et1.getText().toString());
        c = b/(a * a);
        tv.setText("" + c);


        if (c<=18.8){

            Toast.makeText(getApplicationContext(), "You are Underweight", Toast.LENGTH_SHORT);
        }
        if ((c>=18.0 && c<25)) {

            Toast.makeText(getApplicationContext(), "You are Normal", Toast.LENGTH_SHORT);
        }

        if (c>=25){

            Toast.makeText(getApplicationContext(), "You are Overweight", Toast.LENGTH_SHORT);
        }




    }



}