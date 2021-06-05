package com.example.tut_ui2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtone;
    private EditText entername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bttnone = findViewById(R.id.bttnone);
        bttnone.setOnClickListener(this);

        entername = findViewById(R.id.entername);
        entername.setOnClickListener(this);

        txtone = findViewById(R.id.txtone);

//        bttnone.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//
//                Toast.makeText(MainActivity.this, "you clicked for long", Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bttnone:
                Toast.makeText(this, "Button is clicked", Toast.LENGTH_SHORT).show();
                txtone.setText("Hello! " + entername.getText().toString());
                break;
            case R.id.entername:
                Toast.makeText(this, "Writing...", Toast.LENGTH_SHORT).show();
            default:
                break;
        }
    }
}