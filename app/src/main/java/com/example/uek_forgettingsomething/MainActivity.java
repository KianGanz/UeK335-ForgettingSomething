package com.example.uek_forgettingsomething;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button  = (Button) findViewById(R.id.create_reminder);

        button.setOnClickListener(view -> {
            Intent numbersIntent = new Intent(MainActivity.this, ReminderActivity.class);
            startActivity(numbersIntent);
        });

    }
}