package com.bumos.vgvee.connectbetter;

import android.media.MediaCas;

import java.util.ArrayList;

public class dailySessions {
    ArrayList<session> daySession;

    public dailySessions(ArrayList<session> daySession) {
        this.daySession = daySession;
    }

    public ArrayList<session> getDaySession() {
        return daySession;
    }

    public void setDaySession(ArrayList<session> daySession) {
        this.daySession = daySession;
    }
}
