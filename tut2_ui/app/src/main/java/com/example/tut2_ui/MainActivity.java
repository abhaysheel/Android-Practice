package com.example.tut2_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Second way to set OnClickListener

        TextView txtWelcome = findViewById(R.id.txtone);
        Button bttnone = findViewById(R.id.bttnone);
        bttnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hello Abhay");
                txtWelcome.setText("Chal nikal!");
            }
        });
    }

    // First way to On-click-listener
//    public void clickbttn(View view){
//        TextView txtWelcome = findViewById(R.id.txtone);
//        txtWelcome.setText("Chal Nikal!!");
//    }


}