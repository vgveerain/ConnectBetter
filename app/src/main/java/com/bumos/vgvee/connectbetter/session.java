package com.bumos.vgvee.connectbetter;

import java.time.LocalTime;

public class session {
    Subject subject;
    int duration; //in minutes
    String venue;
    int day; //1-7 for monday - sunday
    LocalTime startTime;

    public session(Subject subject, int duration, String venue, int day, LocalTime startTime) {
        this.subject = subject;
        this.duration = duration;
        this.venue = venue;
        this.day = day;
        this.startTime = startTime;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }
}
