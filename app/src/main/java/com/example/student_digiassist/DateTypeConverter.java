package com.example.student_digiassist;


import androidx.room.TypeConverter;

import java.util.Date;


public class DateTypeConverter {

    @TypeConverter
    public Date LongtoDateConverter(Long date){
        return new Date(date);
    }

    @TypeConverter
    public Long DatetoLongConverter(Date date){
        return date.getTime();
    }

}
