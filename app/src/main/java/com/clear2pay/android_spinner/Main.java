package com.clear2pay.android_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {

    private TextView textView;
    private Spinner spinner;
    private List<String> list;

    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        textView = (TextView)findViewById(R.id.textView);
        spinner = (Spinner)findViewById(R.id.spinner);

        list = new ArrayList<String>();
        list.add("Beijing");
        list.add("Shanghai");
        list.add("GuangZhou");
        list.add("ShenZhen");

        adapter = new ArrayAdapter<String>(Main.this,android.R.layout.simple_spinner_item,list);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);






    }
}
