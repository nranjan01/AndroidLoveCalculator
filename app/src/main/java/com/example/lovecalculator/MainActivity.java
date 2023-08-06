package com.example.lovecalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    Button b1;
    EditText e1;
    EditText e2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        t1=findViewById(R.id.t1);
        b1.setOnClickListener(new View.OnClickListener(){



            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Successfully Calculated", Toast.LENGTH_SHORT).show();
                final String s1=e1.getText().toString();
                final String s2=e2.getText().toString();
                final int count=Math.min(s1.length(),s2.length());
                int per=0;

                int i=0;
                while(i<count)
                {
                    int j=0;
                    while(j<count)
                    {
                        if(s1.charAt(i)==s2.charAt(j))
                        {
                            per++;
                            j++;
                        }
                        else
                            j++;
                    }
                    i++;
                }
                per=per*14;
                if(per>100)
                     per=(int)99.9;
                else if(per==0)
                    per=50;
                t1.setText("Your Love Percentage is: "+per+"%");
            }
        });


    }
}