package com.example.chocolates;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Textimage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_textimage);

        Button chocolate = findViewById(R.id.btn_chocolate);
        chocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater li = getLayoutInflater();

                View layout = li.inflate(R.layout.image, findViewById(R.id.iv_selected_image));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setView(layout);
                toast.show();

            }
        });

        Button kitkat = findViewById(R.id.btn_kitkat);
        kitkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater li = getLayoutInflater();

                View layout = li.inflate(R.layout.image1, findViewById(R.id.v_selected_image));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setView(layout);
                toast.show();

            }
        });

        Button dairymilk = findViewById(R.id.btn_dairymilk);
        dairymilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater li = getLayoutInflater();

                View layout = li.inflate(R.layout.image2, findViewById(R.id.vi_selected_image));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setView(layout);
                toast.show();
            }
        });

        Button snickers=findViewById(R.id.btn_snickers);
        snickers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater li = getLayoutInflater();

                View layout = li.inflate(R.layout.image3, findViewById(R.id.vii_selected_image));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setView(layout);
                toast.show();
            }
        });




        Button ferrero=findViewById(R.id.btn_ferrero);
        ferrero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater li = getLayoutInflater();

                View layout = li.inflate(R.layout.image4, findViewById(R.id.viii_selected_image));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setView(layout);
                toast.show();
            }
        });







}   }