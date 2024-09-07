package com.example.chocolates;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button Chocolate,white, dark,clear,Next;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);


        white=findViewById(R.id.btn_white);
        dark=findViewById(R.id.btn_dark);
        text=findViewById(R.id.btn_text);
        clear=findViewById(R.id.btn_clear);
        Next=findViewById(R.id.btn_next);


        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("white chocolate button is clicked");

            }
        });




        dark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Dark chocolate button is clicked");

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(" ");

            }
        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
                Toast.makeText(getApplicationContext(), "Textview is clicked!!", Toast.LENGTH_SHORT).show();


            }
        });
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Textimage.class);
                startActivity(intent);

            }
        });






        }
    }
