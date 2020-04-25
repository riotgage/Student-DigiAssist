package com.example.student_digiassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.student_digiassist.competition.Alerts;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void notesScreen(View view) {
        startActivity(new Intent(MainActivity.this, notes.class));
    }


    public void expensescreenb(View view) {
        startActivity(new Intent(MainActivity.this, AddExpense.class));
    }
}
