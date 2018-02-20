package com.example.imtiazaminsajid.passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class PassingValue extends AppCompatActivity {

    TextView name,email,phone;

    String n,e,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_value);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);


        Intent intent = getIntent();
        n = intent.getStringExtra("Name");
        e = intent.getStringExtra("Email");
        p = intent.getStringExtra("Phone");

        name.setText(n);
        email.setText(e);
        phone.setText(p);



    }
}
