package com.example.tut_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView citiesList;
    private Spinner spin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.cities);
        spin = findViewById(R.id.spin);

        ArrayList<String> students = new ArrayList<>();
        students.add("Abhay1");
        students.add("Abhay2");
        students.add("Abhay3");
        students.add("Abhay4");
        students.add("Abhay5");

        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                students
        );

        spin.setAdapter(studentsAdapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, students.get(position)+" Selected!", Toast.LENGTH_SHORT).show();

                                            // OR

//                Toast.makeText(MainActivity.this, spin.getSelectedItem().toString()+" Selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        final ArrayList<String> city = new ArrayList<>();

        city.add("Delhi");
        city.add("Mumbai");
        city.add("Bhopal");
        city.add("Chennai");
        city.add("Kolkata");

        ArrayAdapter<String> cityAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                city
        );

        citiesList.setAdapter(cityAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, city.get(position)+ " Selected!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}