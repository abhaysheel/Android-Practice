package com.example.tut_ui3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbSuits, cbBarry, cbSilval;

    private RadioGroup rgMarital;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbSuits = findViewById(R.id.cbSuits);
        cbBarry = findViewById(R.id.cbBarry);
        cbSilval = findViewById(R.id.cbSilval);

        rgMarital = findViewById(R.id.rgMarital);  // Radio group

//        progressBar = findViewById(R.id.pbCircle);
        progressBar = findViewById(R.id.pbHorizontal);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++){
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(500);
                }
            }
        });
        thread.start();


        int checkedButton = rgMarital.getCheckedRadioButtonId();

        switch(checkedButton) {
            case R.id.rbMarried:
                Toast.makeText(MainActivity.this, "MARRIED!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbSingle:
                Toast.makeText(MainActivity.this, "Single!!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbRelation:
                Toast.makeText(MainActivity.this, "In a relationship!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

        rgMarital.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbMarried:
                        Toast.makeText(MainActivity.this, "MARRIED!", Toast.LENGTH_SHORT).show();

//                        progressBar.setVisibility(View.GONE);

                        break;
                    case R.id.rbSingle:
                        Toast.makeText(MainActivity.this, "Single!!", Toast.LENGTH_SHORT).show();

//                        progressBar.setVisibility(View.VISIBLE);

                        break;
                    case R.id.rbRelation:
                        Toast.makeText(MainActivity.this, "In a relationship!", Toast.LENGTH_SHORT).show();

//                        progressBar.setVisibility(View.GONE);

                        break;
                    default:
                        break;
                }
            }
        });


//        if (cbSuits.isChecked()){
//            Toast.makeText(this, "watched suits", Toast.LENGTH_SHORT).show();
//        }else{
//            Toast.makeText(this, "need to watch", Toast.LENGTH_SHORT).show();
//        }

        cbSuits.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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