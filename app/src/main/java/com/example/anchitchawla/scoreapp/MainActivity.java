package com.example.anchitchawla.scoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private int sc1=0;
    private int sc2=0;

    public void displayA(int s)
    {
        TextView textView=(TextView) findViewById(R.id.tx3);
        textView.setText(String.valueOf(s));
    }
    public void displayB(int s)
    {
        TextView textView=(TextView) findViewById(R.id.tx5);
        textView.setText(String.valueOf(s));
    }
    public void add1A(View view)
    {
        sc1=sc1+1;
        displayA(sc1);
    }
    public void add2A(View view)
    {
        sc1=sc1+2;
        displayA(sc1);
    }
    public void add4A(View view)
    {
        sc1=sc1+4;
        displayA(sc1);
    }
    public void add6A(View view)
    {
        sc1=sc1+6;
        displayA(sc1);
    }
    public void  add1B(View view)
    {
        sc2=sc2+1;
        displayB(sc2);
    }
    public void add2B(View view)
    {
        sc2=sc2+2;
        displayB(sc2);
    }
    public void add4B(View view)
    {
        sc2=sc2+4;
        displayB(sc2);
    }
    public void add6B(View view)
    {
        sc2=sc2+6;
        displayB(sc2);
    }
    public void reset(View view)
    {
        sc2=0;
        sc1=0;
        displayB(sc2);
        displayA(sc1);
    }
}
