package com.example.uek_forgettingsomething;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ReminderActivity extends AppCompatActivity {
    Button submitReminder;
    EditText editTitle, editDate, editTime;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        editTitle = (EditText) findViewById(R.id.editTitle);
        editDate = (EditText) findViewById(R.id.editDate);
        editTime = (EditText) findViewById(R.id.editTime);
        submitReminder = (Button) findViewById(R.id.submitReminder);

        submitReminder.setOnClickListener(view -> {
            String title = editTitle.getText().toString().trim();
            String date = editDate.getText().toString().trim();
            String time = editTime.getText().toString().trim();

            if (title.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Please Enter text", Toast.LENGTH_SHORT).show();
            } else {
                if (time.equals("time") || date.equals("date")) {
                    Toast.makeText(getApplicationContext(), "Please select date and time", Toast.LENGTH_SHORT).show();
                } else {

                }
            }


        });
    }
}
