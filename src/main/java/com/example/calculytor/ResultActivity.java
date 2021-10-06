package com.example.calculytor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView res = (TextView)findViewById(R.id.result);
        int num1 = getIntent().getExtras().getInt("num1");
        int num2 = getIntent().getExtras().getInt("num2");
        int num3 = getIntent().getExtras().getInt("num3");
        String result;
        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);
        String strNum3 = Integer.toString(num3);
        if (num2 < 0){
            strNum2 = "(" + Integer.toString(num2) + ")";
        }
        result = strNum1 + " + " + strNum2 + " = " + strNum3;
        res.setText(result);
    }
}