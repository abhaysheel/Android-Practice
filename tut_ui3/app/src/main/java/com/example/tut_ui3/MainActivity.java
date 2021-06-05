package com.example.tut_ui3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbSuits, cbBarry, cbSilval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbSuits = findViewById(R.id.cbSuits);
        cbBarry = findViewById(R.id.cbBarry);
        cbSilval = findViewById(R.id.cbSilval);

//        if (cbSuits.isChecked()){
//            Toast.makeText(this, "watched suits", Toast.LENGTH_SHORT).show();
//        }else{
//            Toast.makeText(this, "need to watch", Toast.LENGTH_SHORT).show();
//        }

        cbSuits.setOnClickListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "Watched!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Need to", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}