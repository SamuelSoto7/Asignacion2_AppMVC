package com.model;
public class Project {
    private String title;
    private int numberOfStudents;
    private String status;

    public Project(String title, int numberOfStudents, String status) {
        this.title = title;
        this.numberOfStudents = numberOfStudents;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
