package com.model;
public class Project {

    private String title;
    private Integer studentsAmount;
    private String status;

    public Project(){

    }

    public Project(String title, Integer studentsAmount, String status) {
        this.title = title;
        this.studentsAmount = studentsAmount;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStudentsAmount() {
        return studentsAmount;
    }
    public void setStudentsAmount(Integer studentsAmount) {
        this.studentsAmount = studentsAmount;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
