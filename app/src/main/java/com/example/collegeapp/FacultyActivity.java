package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FacultyActivity extends AppCompatActivity {
EditText ed1;
AppCompatButton b1,b2;
String getfmn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        ed1=(EditText) findViewById(R.id.fnam);
        b1=(AppCompatButton) findViewById(R.id.se);
        b2=(AppCompatButton) findViewById(R.id.btd);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashBoardActivity.class);
                startActivity(i);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getfmn=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),getfmn, Toast.LENGTH_SHORT).show();
            }
        });

    }
}