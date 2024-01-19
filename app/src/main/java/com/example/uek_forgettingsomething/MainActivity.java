package com.example.uek_forgettingsomething;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {


    FloatingActionButton CreateRem;
    RecyclerView Recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Recyclerview = findViewById(R.id.recyclerView);
        Recyclerview.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        CreateRem = findViewById(R.id.create_reminder);
        CreateRem.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), ReminderActivity.class);
            startActivity(intent);
        });


    }
}