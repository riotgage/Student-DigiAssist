package com.example.student_digiassist;



import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "reminder")
public class Reminders {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int id;

    String message;
    Date  remindDate;

    public String getMessage() {
        return message;
    }

    public Date getRemindDate() {
        return remindDate;
    }

    public int getId() {
        return id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    public void setId(int id) {
        this.id = id;
    }
}
