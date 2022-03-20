package com.example.firstapp;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("First activity");

        EditText Mname=findViewById(R.id.name);
        EditText Mdob=findViewById(R.id.dob);
        EditText Mphone=findViewById(R.id.phone);
        EditText Memail=findViewById(R.id.email);
        EditText Maddress=findViewById(R.id.address);
        EditText Mbio=findViewById(R.id.bio);

        Button Mbutton=findViewById(R.id.submit);





        Mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=Mname.getText().toString();
                String dob=Mdob.getText().toString();
                String phone=Mphone.getText().toString();
                String email=Memail.getText().toString();
                String address=Maddress.getText().toString();
                String bio=Mbio.getText().toString();


                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("NAME",name);
                intent.putExtra("DOB",dob);
                intent.putExtra("PHONE",phone);
                intent.putExtra("EMAIL",email);
                intent.putExtra("ADDRESS",address);
                intent.putExtra("BIO",bio);
                startActivity(intent);

            }
        });



    }


}