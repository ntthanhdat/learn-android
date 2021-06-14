package com.example.sharedprefenrences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btsave;
    TextView txt1, txt2;
    EditText txtname, txtage;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();

        sharedPreferences=getPreferences("datalogin",MODE_PRIVATE);

        txtname=setText(sharedPreferences.getString("ten",""));
        txtage=setText(sharedPreferences.getString("tuoi",""));

        btsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username =txtname.getText().toString().trim();
                String userage =txtage.getText().toString().trim();
                if(username.equals("a")){
                    Toast.makeText(MainActivity.this, "ok",Toast.LENGTH_LONG).show();
                }
                SharedPreferences.Editor editor= sharedPreferences.edit();
                editor.putString("ten", username);
                editor.putString("tuoi", userage);
                editor.commit();
            }
        });
    }
    private void Anhxa(){
        btsave=(Button) findViewById(R.id.btsave);
        txtname=(EditText)findViewById(R.id.txtname);
        txtage=(EditText)findViewById(R.id.txtage);
    }
}