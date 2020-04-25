package com.example.student_digiassist.reminder;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.student_digiassist.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Reminders extends AppCompatActivity {

    ArrayList<reminderModel> reminderList;
    ListView listView;
    private static ReminderAdapter adapter;
    FloatingActionButton add_reminder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminders);

        reminderList=new ArrayList<>();
        reminderList.add(new reminderModel("12/2/2020","Purchase book","Purchase maths book from store down the ally","12:43PM"));
        reminderList.add(new reminderModel("12/2/2020","Purchase book","Purchase maths book from store down the ally","12:43PM"));
        reminderList.add(new reminderModel("12/2/2020","Purchase book","Purchase maths book from store down the ally","12:43PM"));
        reminderList.add(new reminderModel("12/2/2020","Purchase book","Purchase maths book from store down the ally","12:43PM"));
        reminderList.add(new reminderModel("12/2/2020","Purchase book","Purchase maths book from store down the ally","12:43PM"));
        reminderList.add(new reminderModel("12/2/2020","Purchase book","Purchase maths book from store down the ally","12:43PM"));
        reminderList.add(new reminderModel("12/2/2020","Purchase book","Purchase maths book from store down the ally","12:43PM"));

        listView=findViewById(R.id.list);
        add_reminder=findViewById(R.id.add_reminder);

        adapter=new ReminderAdapter(getApplicationContext(),reminderList);
        listView.setAdapter(adapter);

        adapter.notifyDataSetChanged();

        add_reminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Reminders.this, SetReminder.class));

            }
        });
    }
}
