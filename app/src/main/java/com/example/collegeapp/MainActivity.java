package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
AppCompatButton b1,b2;
String getemail,getpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.eid);
        ed2=(EditText) findViewById(R.id.pass);
        b1=(AppCompatButton) findViewById(R.id.log);
        b2=(AppCompatButton) findViewById(R.id.gtr);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getemail=ed1.getText().toString();
                getpass=ed2.getText().toString();
                if (getemail.equals("admin")&&getpass.equals("12345"))
                {
                    Intent i=new Intent(getApplicationContext(),DashBoardActivity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}