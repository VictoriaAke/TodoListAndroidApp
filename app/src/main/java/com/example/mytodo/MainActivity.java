package com.example.mytodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button login;
    TextView fPassword,register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register=(TextView) findViewById(R.id.registerTBut);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent loginIntent = new Intent(MainActivity.this, RegisterPage.class);
                startActivity(loginIntent);
            }
        });
    }
}
