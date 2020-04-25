package com.example.student_digiassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.student_digiassist.competition.Alerts;
import com.example.student_digiassist.reminder.Reminders;


public class MainActivity extends AppCompatActivity {


    CardView Alerts;
    CardView reminders;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Alerts=findViewById(R.id.alerts);
        reminders=findViewById(R.id.reminder);
        Alerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Alerts.class));
            }
        });
        reminders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Reminders.class));

            }
        });


    }


    public void notesScreen(View view) {
        startActivity(new Intent(MainActivity.this, Alerts.class));
    }


}
