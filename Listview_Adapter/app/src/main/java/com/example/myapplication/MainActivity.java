package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<String> mang =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);


        mang.add("nguyen the thanh dat");
        mang.add("nguyen thi thu trang");
        mang.add("pecua2002");
        mang.add("nuke handa");
        mang.add("kem que");


        ArrayAdapter<String> arrayAdapter
                = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, mang);

        listView.setAdapter(arrayAdapter);
    }


}