package com.example.student_digiassist.reminder;

public class reminderModel {
    String date;
    String Title;
    String desc;
    String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public reminderModel() {
    }

    public reminderModel(String date, String title, String desc,String time) {
        this.date = date;
        Title = title;
        this.desc = desc;
        this.time=time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
