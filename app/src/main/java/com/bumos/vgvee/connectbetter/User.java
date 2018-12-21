package com.bumos.vgvee.connectbetter;

import java.util.ArrayList;
import java.util.Calendar;

public class User {
    String fname, lname, enrollno, instituteCode;
    /**
     * instituteCode - holds value either 1 or 2;
     * 1 for 62, 2 for 128
     * further versions i.e. universal versions of the app will use complex alphanumeric codes as data set map keys
     * for cross referencing
     */
    int age, semester;
    Calendar DOB;
    ArrayList<Subject> subjects;
    ArrayList<dailySessions> dailySessions;
    AttendanceObj attendanceObj;

    public User(String fname, String lname, String enrollno, String instituteCode, int age, int semester, Calendar DOB, ArrayList<Subject> subjects, ArrayList<com.bumos.vgvee.connectbetter.dailySessions> dailySessions, AttendanceObj attendanceObj) {
        this.fname = fname;
        this.lname = lname;
        this.enrollno = enrollno;
        this.instituteCode = instituteCode;
        this.age = age;
        this.semester = semester;
        this.DOB = DOB;
        this.subjects = subjects;
        this.dailySessions = dailySessions;
        this.attendanceObj = attendanceObj;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEnrollno() {
        return enrollno;
    }

    public void setEnrollno(String enrollno) {
        this.enrollno = enrollno;
    }

    public String getInstituteCode() {
        return instituteCode;
    }

    public void setInstituteCode(String instituteCode) {
        this.instituteCode = instituteCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Calendar getDOB() {
        return DOB;
    }

    public void setDOB(Calendar DOB) {
        this.DOB = DOB;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<com.bumos.vgvee.connectbetter.dailySessions> getDailySessions() {
        return dailySessions;
    }

    public void setDailySessions(ArrayList<com.bumos.vgvee.connectbetter.dailySessions> dailySessions) {
        this.dailySessions = dailySessions;
    }

    public AttendanceObj getAttendanceObj() {
        return attendanceObj;
    }

    public void setAttendanceObj(AttendanceObj attendanceObj) {
        this.attendanceObj = attendanceObj;
    }
}
