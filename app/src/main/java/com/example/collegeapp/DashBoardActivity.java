package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class DashBoardActivity extends AppCompatActivity {
AppCompatButton b1,b2,b3,b4,b5,b6;
SharedPreferences mypref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        b1=(AppCompatButton) findViewById(R.id.ads);
        b2=(AppCompatButton) findViewById(R.id.adf);
        b3=(AppCompatButton) findViewById(R.id.ses);
        b4=(AppCompatButton) findViewById(R.id.sef);
        b5=(AppCompatButton) findViewById(R.id.vweb);
        b6=(AppCompatButton) findViewById(R.id.lg);
        mypref=getSharedPreferences("login",MODE_PRIVATE);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor myedit=mypref.edit();
                myedit.clear();
                myedit.commit();

                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),ViewWebsiteActivity.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),FacultyActivity.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SearchStudentActivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddFacultyActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddStudentActivity.class);
                startActivity(i);
            }
        });
    }
}