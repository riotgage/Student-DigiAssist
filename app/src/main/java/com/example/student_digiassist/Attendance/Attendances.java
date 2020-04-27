package com.example.student_digiassist.Attendance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.student_digiassist.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;



public class Attendances extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Attendance_Adapter adapter;
    private List<attendance_model> subjectList;
    FloatingActionButton add_attendance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendances);
        recyclerView =  findViewById(R.id.recycler_view_attendance);

        subjectList = new ArrayList<>();
        add_attendance=findViewById(R.id.add_attendance);

        adapter = new Attendance_Adapter(this, subjectList);

        add_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Attendances.this,AddAttendance.class));
            }
        });
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        prepareSubjects();
    }

    private void prepareSubjects() {
        attendance_model a=new attendance_model("AAC",49,43);
        subjectList.add(a);
        a=new attendance_model("PSUO",40,35);
        subjectList.add(a);
        a=new attendance_model("SDP",42,38);
        subjectList.add(a);
        a=new attendance_model("AVR",38,31);
        subjectList.add(a);
        a=new attendance_model("WEB",34,21);
        subjectList.add(a);

        adapter.notifyDataSetChanged();



    }
}
