package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
    public void onCreate(Bundle savedInstanceState, Intent data) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_view);
        TextView label = (TextView) findViewById(R.id.show_data);
        Intent x = getIntent();
        String name = x.getStringExtra("name");
        label.setText(name);
    }
}
