package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvCountry;
ArrayList<Country> countryArr =new ArrayList<>();
CountryAdapter countryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Reference();
        countryAdapter=new CountryAdapter(this, R.layout.onecountry,countryArr);
        lvCountry.setAdapter(countryAdapter);
    }
    private void Reference(){
        lvCountry = (ListView)findViewById(R.id.listView);
        countryArr=new ArrayList<>();
        countryArr.add(new Country("Afghanistan",  R.drawable.afg, "38.040M"));
        countryArr.add(new Country("Albania",  R.drawable.albania, "28.62M"));
        countryArr.add(new Country("Algeria",  R.drawable.algen, "44.7M"));
    }


}