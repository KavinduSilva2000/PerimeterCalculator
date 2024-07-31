package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class trapezoid extends AppCompatActivity {
    Button buttonCal,buttonbck;
    EditText editTextA,editTextB,editTextC,editTextD;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid);
        buttonCal= findViewById(R.id.cal);
        editTextA= findViewById(R.id.a);
        editTextB= findViewById(R.id.b);
        editTextC= findViewById(R.id.c);
        editTextD= findViewById(R.id.d);
        textView= findViewById(R.id.ans);
        buttonbck=findViewById(R.id.bck);

        buttonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1= Integer.parseInt(editTextA.getText().toString());
                int n2= Integer.parseInt(editTextB.getText().toString());
                int n3= Integer.parseInt(editTextC.getText().toString());
                int n4= Integer.parseInt(editTextD.getText().toString());
                int ANS=n1+n2+n3+n4;
                textView.setText("Perimeter:"+ANS);

            }
        });
        buttonbck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}