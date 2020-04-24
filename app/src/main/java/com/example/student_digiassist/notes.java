package com.example.student_digiassist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class notes extends AppCompatActivity {
    GridView grid;
    String[] titiles = {
            "Anirudh",
            "Rohit",
            "Abhishek",
            "Tanay",
            "Yash",
    };
    String[] contain = {
            "Anirudh",
            "Rohit",
            "Abhishek",
            "Tanay",
            "Yash",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        CustomGrid adapter = new CustomGrid(notes.this, titiles);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(notes.this, "You Clicked at " +titiles[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}
