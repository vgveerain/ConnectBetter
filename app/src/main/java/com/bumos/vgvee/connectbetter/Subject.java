package com.bumos.vgvee.connectbetter;

public class Subject {
    /**
     * sessionType - Lecture, Tutorial, LAB;
     * 1,2,3 respectively;
     */
    int subjectType;
    String subjectName, subjectCode, faculty;

    public Subject(int subjectType, String subjectName, String subjectCode, String faculty) {
        this.subjectType = subjectType;
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.faculty = faculty;
    }

    public int getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(int subjectType) {
        this.subjectType = subjectType;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
