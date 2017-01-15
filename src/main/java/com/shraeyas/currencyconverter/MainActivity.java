package com.shraeyas.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    public void dollar(View view)
    {
        EditText rate = (EditText)findViewById(R.id.rate);
        EditText amt = (EditText)findViewById(R.id.editText);

        Double money = Double.parseDouble(amt.getText().toString());
        Double conv = Double.parseDouble(rate.getText().toString());

        Double mon = money/conv;
        //Log.i("info", money.toString());
        //TextView ans = (TextView)findViewById(R.id.ans);
        Toast.makeText(MainActivity.this, "Amount in Dollars" + String.format("%.2f" , mon), Toast.LENGTH_SHORT).show();
    }

    public void rupee(View view)
    {
        EditText rate = (EditText)findViewById(R.id.rate);
        EditText amt = (EditText)findViewById(R.id.editText);

        Double money = Double.parseDouble(amt.getText().toString());
        Double conv = Double.parseDouble(rate.getText().toString());

        Double mon = money * conv;
        //Log.i("info", money.toString());
        //TextView ans = (TextView)findViewById(R.id.ans);
        Toast.makeText(MainActivity.this, "Amount in Rupees" + String.format("%.2f" , mon), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
