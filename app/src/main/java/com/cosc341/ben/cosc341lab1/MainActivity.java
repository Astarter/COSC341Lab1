package com.cosc341.ben.cosc341lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinner1;   int Numselected1=0;
    Spinner spinner2;   int Numselected2=0;
    Spinner spinner3;   int Numselected3=0;
    Spinner spinner4;   int Numselected4=0;

    int itemAtPosition=0;
    ArrayAdapter<CharSequence> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1=(Spinner)findViewById(R.id.spinner1);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        spinner3=(Spinner)findViewById(R.id.spinner3);
        spinner4=(Spinner)findViewById(R.id.spinner4);

        adapter = ArrayAdapter.createFromResource(this,R.array.my_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);


//        spinner1.setOnItemSelectedListener(this);Numselected1=itemAtPosition;
//        spinner2.setOnItemSelectedListener(this);Numselected2=itemAtPosition;
//        spinner3.setOnItemSelectedListener(this);Numselected3=itemAtPosition;
//        spinner4.setOnItemSelectedListener(this);Numselected4=itemAtPosition;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
         itemAtPosition = (int)parent.getItemAtPosition(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        itemAtPosition = 0; //if nothing is selected, set default is 0;
    }
}
