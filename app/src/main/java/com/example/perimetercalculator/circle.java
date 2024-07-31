package com.example.perimetercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class circle extends AppCompatActivity {
    Button buttonCal,buttonbck;
    EditText editTextR;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        buttonCal= findViewById(R.id.cal);
        editTextR= findViewById(R.id.r);
        textView= findViewById(R.id.ans);
        buttonbck=findViewById(R.id.bck);

        buttonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1= Integer.parseInt(editTextR.getText().toString());

                double ANS=n1*2*3.14;
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