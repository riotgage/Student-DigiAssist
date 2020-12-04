package com.example.student_digiassist.Attendance;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student_digiassist.R;
import com.example.student_digiassist.competition.AlertsAdapter;
import com.example.student_digiassist.competition.Competition;

import java.util.List;

import javax.security.auth.Subject;

public class Attendance_Adapter extends RecyclerView.Adapter<Attendance_Adapter.MyViewHolder> {

    private Context mContext;
    private List<attendance_model> SubjectList;

    public Attendance_Adapter(Context mContext, List<attendance_model> subjectList) {
        this.mContext=mContext;
        this.SubjectList=subjectList;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        public TextView subject_title,total_attended,total_conducted,progress_text;
        public ProgressBar progressBar;
        public MyViewHolder(@NonNull View view) {
            super(view);
            subject_title=view.findViewById(R.id.subject_name);
            total_attended=view.findViewById(R.id.total_attended);
            total_conducted=view.findViewById(R.id.total_classes);
            progressBar=view.findViewById((R.id.progress));
            progress_text=view.findViewById(R.id.progress_text);
            Log.d("Attendance Adapter", "MyViewHolder: binded");
        }
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.attendance_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        attendance_model subject = SubjectList.get(position);
        holder.subject_title.setText(subject.getSubject());
        holder.total_attended.setText("Total Attended:  "+subject.getTotal_attended());
        holder.total_conducted.setText("Total Conducted:  "+subject.getTotal_classes());
        holder.progressBar.setProgress(subject.getPercentage());
        holder.progress_text.setText(String.valueOf(subject.getPercentage()));
    }

    @Override
    public int getItemCount() {
        return SubjectList.size();
    }
}
