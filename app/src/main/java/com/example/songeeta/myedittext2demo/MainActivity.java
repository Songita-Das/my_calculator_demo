package com.example.songeeta.myedittext2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    private Button addButton;
    private Button subButton;
    private Button mulButton;
    private Button divButton;
    private EditText editText1,editText2;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1= (EditText)findViewById(R.id.edittextId1);
        editText2= (EditText)findViewById(R.id.edittextId2);
        addButton=(Button)findViewById(R.id.addbtnId);
        subButton=(Button) findViewById(R.id.subbtnId);
        mulButton=(Button)findViewById(R.id.mulbtnId);
        divButton=(Button) findViewById(R.id.divbtnId);
        textView=(TextView) findViewById(R.id.textviewId);
        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
         mulButton.setOnClickListener(this);
        divButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        try {
            String numbe1 = editText1.getText().toString();
            String numbe2 = editText2.getText().toString();
            double num1 = Double.parseDouble(numbe1);
            double num2 = Double.parseDouble(numbe2);
            if (v.getId() == R.id.addbtnId) {
                double sum = num1 + num2;
                textView.setText("Result :" + sum);
            }
            if (v.getId() == R.id.subbtnId) {
                double sub = num1 - num2;
                textView.setText("Result :" + sub);
            }
           if (v.getId() == R.id.mulbtnId) {
               double mul = num1 * num2;
                textView.setText("Result :" + mul);
           }
            if (v.getId() == R.id.divbtnId) {
               double div = num1 / num2;
               textView.setText("Result :" + div);
            }


        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "please enter number", Toast.LENGTH_SHORT).show();

        }


    }
}

