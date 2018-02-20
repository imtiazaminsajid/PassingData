package com.example.imtiazaminsajid.passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nameET, emailET, phoneET;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameET = findViewById(R.id.nameET);
        emailET = findViewById(R.id.emailET);
        phoneET = findViewById(R.id.phoneET);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name,email,phone;

                name = String.valueOf(nameET.getText());
                email = String.valueOf(emailET.getText());
                phone = String.valueOf(phoneET.getText());

                Intent intent = new Intent(MainActivity.this, PassingValue.class);
                intent.putExtra("Name", name);
                intent.putExtra("Email", email);
                intent.putExtra("Phone", phone);

                startActivity(intent);
            }
        });



    }

}
