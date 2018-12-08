package com.example.junwatanabe.taskapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;


public class InputCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_category);

        ArrayList<String> list = new ArrayList<String>();

        list.add("ポケモン");
        list.add("デジモン");
        list.add("フジモン");
        list.add("ラショウモン");

        ArrayAdapter<String>adapter= new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        spinner.setAdapter(adapter);



    }
}
