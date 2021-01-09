package com.example.notebin.competition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.notebin.R;

import java.util.ArrayList;
import java.util.List;

public class Alerts extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AlertsAdapter adapter;
    private List<Competition> competitionList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerts);
        recyclerView =  findViewById(R.id.recycler_view);

        competitionList = new ArrayList<>();


        adapter = new AlertsAdapter(this, competitionList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        prepareCompetition();

    }

    private void prepareCompetition() {
        int[] covers = new int[]{
                R.drawable.hackerearth,
                R.drawable.hackerank,
                R.drawable.codechef,
                R.drawable.spoj,
                R.drawable.codeforces,
                R.drawable.d2c,
        };

        Competition a = new Competition("Hackerrank", "code summer", "hackerrank", "12/12/12",covers[1]);
        competitionList.add(a);

         a = new Competition("Hackerearth", "P&G Innovation", "hackerearth", "12/12/12",covers[0]);
        competitionList.add(a);

         a = new Competition("Codechef", "cook off", "codechef", "12/12/12",covers[2]);
        competitionList.add(a);

        a = new Competition("Spoj", "Weekly contest", "Spoj", "12/12/12",covers[3]);
        competitionList.add(a);

        a = new Competition("Codeforces", "Div 2 round", "codeforces", "12/12/12",covers[4]);
        competitionList.add(a);

        a = new Competition("Dare2Compete", "Quiz Mela", "Dare2Compete", "12/12/12",covers[5]);
        competitionList.add(a);


        adapter.notifyDataSetChanged();
    }


}
