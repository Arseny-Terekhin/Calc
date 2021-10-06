package com.example.calculytor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view) {
        EditText numberOne = findViewById(R.id.editTextNumberOne);
        EditText numberTwo = findViewById(R.id.editTextNumberTwo);
        String num1 = numberOne.getText().toString();
        String num2 = numberTwo.getText().toString();
        if (num1.equals("")){
            num1 = "0";
        }
        if (num2.equals("")){
            num2 = "0";
        }
        int intNum1 =  Integer.parseInt(num1);
        int intNum2 =  Integer.parseInt(num2);
        int num3 = intNum1 + intNum2;
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("num1",intNum1);
        intent.putExtra("num2", intNum2);
        intent.putExtra("num3", num3);
        startActivity(intent);
    }
}