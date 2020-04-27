package com.example.student_digiassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.student_digiassist.Attendance.Attendances;
import com.example.student_digiassist.competition.Alerts;


public class MainActivity extends AppCompatActivity {
    CardView alerts;

    CardView attend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alerts=findViewById(R.id.alerts);
        attend=findViewById(R.id.attendance);

        alerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Alerts.class));
            }
        });

        attend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Attendances.class));
            }
        });


    }

    public void notesScreen(View view) {
        startActivity(new Intent(MainActivity.this, notes.class));
    }


    public void expensescreenb(View view) {
        startActivity(new Intent(MainActivity.this, AddExpense.class));
    }

    public void reminderhome(View view) {
        startActivity(new Intent(MainActivity.this, MainPage.class));
    }
}
