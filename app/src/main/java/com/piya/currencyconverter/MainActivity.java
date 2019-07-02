package com.piya.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText dollarAmount =(EditText) findViewById(R.id.textField);
        Double dollarAmountDouble = Double.parseDouble(dollarAmount.getText().toString());
        Double rupees = dollarAmountDouble * 70;
        Toast.makeText(MainActivity.this, "Rs. " + String.format("%.2f",rupees), Toast.LENGTH_SHORT).show();
        Log.i("info",dollarAmount.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
