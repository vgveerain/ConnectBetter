package com.bumos.vgvee.connectbetter;

import java.util.ArrayList;
import java.util.Calendar;

public class AttendanceObj {
    Subject subject;
    float AttPercentage;
    ArrayList<RecordObj> records;
    public class RecordObj {
        boolean pa;
        Calendar SessionDate;

        public RecordObj(boolean pa, Calendar sessionDate) {
            this.pa = pa;
            SessionDate = sessionDate;
        }

        public boolean isPa() {
            return pa;
        }

        public void setPa(boolean pa) {
            this.pa = pa;
        }

        public Calendar getSessionDate() {
            return SessionDate;
        }

        public void setSessionDate(Calendar sessionDate) {
            SessionDate = sessionDate;
        }
    }

    public AttendanceObj(Subject subject, float attPercentage, ArrayList<RecordObj> records) {
        this.subject = subject;
        AttPercentage = attPercentage;
        this.records = records;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public float getAttPercentage() {
        return AttPercentage;
    }

    public void setAttPercentage(float attPercentage) {
        AttPercentage = attPercentage;
    }

    public ArrayList<RecordObj> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<RecordObj> records) {
        this.records = records;
    }
}
