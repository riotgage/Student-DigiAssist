package com.example.student_digiassist.Attendance;

import android.util.Log;
import android.widget.Toast;

public class attendance_model {
    private String subject;
    private String total_classes;
    private String total_attended;



    private int Percentage;
    public attendance_model(String subject, int classes, int attended) {
        this.subject = subject;
        this.total_classes = String.valueOf(classes);
        this.total_attended = String.valueOf(attended);
        Percentage=(attended*100/classes);
    }

    public attendance_model() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTotal_classes() {
        return total_classes;
    }

    public void setTotal_classes(String total_classes) {
        this.total_classes = total_classes;
    }

    public String getTotal_attended() {
        return total_attended;
    }

    public void setTotal_attended(String total_attended) {
        this.total_attended = total_attended;
    }
    public int getPercentage() {
        return Percentage;
    }

    public void setPercentage(int percentage) {
        Percentage = percentage;
    }
}
