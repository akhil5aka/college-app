package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;

public class AddFacultyActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5;
AppCompatButton b1,b2;
String getfname,getdpt,getqul,getmbno,geteid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        ed1=(EditText) findViewById(R.id.fnam);
        ed2=(EditText) findViewById(R.id.dept);
        ed3=(EditText) findViewById(R.id.qual);
        ed4=(EditText) findViewById(R.id.mobno);
        ed5=(EditText) findViewById(R.id.eid);
        b1=(AppCompatButton) findViewById(R.id.sub);
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
                getfname=ed1.getText().toString();
                getdpt=ed2.getText().toString();
                getqul=ed3.getText().toString();
                getmbno=ed4.getText().toString();
                geteid=ed5.getText().toString();
                Toast.makeText(getApplicationContext(),getfname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getdpt, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getqul, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getmbno, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),geteid, Toast.LENGTH_SHORT).show();
            }
        });

    }
}