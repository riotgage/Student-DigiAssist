package com.example.student_digiassist.competition;

import android.media.Image;

import java.util.Date;

public class Competition {
    String website,comp_name,link;
    String date;
    int thumb;

    public Competition() {
    }

    public Competition(String website, String comp_name, String link, String date, int thumb) {
        website = website;
        this.comp_name = comp_name;
        this.link = link;
        this.date = date;
        this.thumb = thumb;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        website = website;
    }

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String  date) {
        this.date = date;
    }

    public int getThumb() {
        return thumb;
    }

    public void setThumb(int thumb) {
        this.thumb = thumb;
    }




}
