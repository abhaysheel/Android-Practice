package com.example.tut1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void btnClickTut (View view) {
        TextView fName = findViewById(R.id.fName_view);
        TextView lName = findViewById(R.id.lName_view);
        TextView eMail = findViewById(R.id.eMail_view);

        EditText f_in = findViewById(R.id.fName_txt);
        EditText l_in = findViewById(R.id.lName_txt);
        EditText e_in = findViewById(R.id.eMail_txt);

        fName.setText("First Name: " + f_in.getText().toString());
        lName.setText("Last Name: " + l_in.getText().toString());
        eMail.setText("Email: " + e_in.getText().toString());
    }
//    public void onBtnClick (View view) {
//        TextView txtHello = findViewById(R.id.txtMsg);
//        EditText txtInput = findViewById(R.id.txtInput);
//
//        txtHello.setText("Hello!" + txtInput.getText().toString());
//    }
}