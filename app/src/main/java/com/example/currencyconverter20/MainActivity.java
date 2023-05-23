package com.example.currencyconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText dollarAmountEditTextNumber = (EditText) findViewById(R.id.dollarAmountEditTextNumber);

        Double dollarAmount = Double.parseDouble(dollarAmountEditTextNumber.getText().toString());
        Double inrAmount = dollarAmount * 82.83;
        Toast.makeText(MainActivity.this, inrAmount.toString(), Toast.LENGTH_LONG).show();
        //Log.i("Amount", dollarAmountEditTextNumber.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}