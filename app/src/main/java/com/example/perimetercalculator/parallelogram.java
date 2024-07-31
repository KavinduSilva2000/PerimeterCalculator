package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class parallelogram extends AppCompatActivity {

    Button buttonCal,buttonbck;
    EditText editTextA,editTextB;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelogram);
        buttonCal= findViewById(R.id.cal);
        editTextA= findViewById(R.id.a);
        editTextB= findViewById(R.id.b);
        textView= findViewById(R.id.ans);
        buttonbck=findViewById(R.id.bck);


        buttonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1= Integer.parseInt(editTextA.getText().toString());
                int n2= Integer.parseInt(editTextB.getText().toString());
                int ANS=(n1+n2)*2;
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