package com.example.uek_forgettingsomething;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ReminderActivity extends AppCompatActivity {
    Button submit, date, time;

    EditText editTitle;

    String notificationTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

    }
}
