package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button button;
    private TextView text;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button2);
        text = findViewById(R.id.textView3);
        edit = findViewById(R.id.editTextTextPersonName);
    }
      /*  button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
              String s=  edit.getText().toString();
                double n=Double.parseDouble(s);
                double p=n*2.605;
                text.setText("the value in pounds is:-"+p);
            }
        });*/
       public void calc(View view)
        {
            String s=  edit.getText().toString();
            double n=Double.parseDouble(s);
            double p=n*2.605;
            text.setText("the value in pounds is:-"+p);
            Toast.makeText(this, "thanks", Toast.LENGTH_SHORT).show();
        }

    }
