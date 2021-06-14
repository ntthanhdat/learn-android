package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BroadcastReceiver br = new MyBroadcastReceiver();
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        this.registerReceiver(br, filter);

        SQLiteDatabase mydatabase = openOrCreateDatabase("your database name",MODE_PRIVATE,null);
        mydatabase.execSQL("CREATE TABLE IF NOT EXISTS TutorialsPoint(Username VARCHAR,Password VARCHAR);");
        mydatabase.execSQL("INSERT INTO TutorialsPoint VALUES('admin','admin');");

        Cursor resultSet = mydatabase.rawQuery("Select * from TutorialsPoint",null);
        resultSet.moveToFirst();
        String username = resultSet.getString(0);
        String password = resultSet.getString(1);
        tv1= (TextView) findViewById(R.id.tv1);
        tv1.setText(username);
        tv2= (TextView) findViewById(R.id.tv2);
        tv2.setText(password);
    }
}