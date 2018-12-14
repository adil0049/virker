package com.springmandatory.demo.Model;

public class Grade {
    private int id;
    private int studentId;
    private String grade;
    private String date;

    public Grade(int studentId, String grade, String date) {
        this.studentId = studentId;
        this.grade = grade;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
