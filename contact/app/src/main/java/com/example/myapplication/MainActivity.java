package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Database database;
    ListView lvCountry;
    ArrayList<Contact> countryArr =new ArrayList<>();
    ContactAdapter countryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvCountry = (ListView)findViewById(R.id.listView);
        countryArr=new ArrayList<>();

        database =new Database(this, "contact.db", null, 1);
        database.QueryData("create table if not exists Contact(id integer primary key autoincrement, name varchar(200)" +
                ", mobile char(20), avatar varchar(100), email varchar(100))");
        database.QueryData("insert into contact(name, mobile, email) values ('nam', '123', 'dat@gmail.com') ");
        Cursor data =database.GetData("select * from contact");
        while(data.moveToNext()){
            String name = data.getString(1);
            String phone = data.getString(2);
            String email = data.getString(4);
            countryArr.add(new Contact(name, phone, email,  R.drawable.man));
            //Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        }

            countryAdapter=new ContactAdapter(this, R.layout.display_contact,countryArr);
            lvCountry.setAdapter(countryAdapter);

    }
}