package com.example.firstapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Second activity");

        Intent intent=getIntent();
        String name=intent.getStringExtra("NAME");
        String dob=intent.getStringExtra("DOB");
        String phone=intent.getStringExtra("PHONE");
        String email=intent.getStringExtra("EMAIL");
        String address=intent.getStringExtra("ADDRESS");
        String bio=intent.getStringExtra("BIO");

        TextView Sresult=findViewById(R.id.result);

        Sresult.setText("Name : "+name+"\nDob : "+dob+"\nEmail : "+email+ "\nPhone : "+phone+"\nEmail : "+ email+ "\nAddress"+address+"\nBio : "+bio);

    }
}