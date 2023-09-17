package com.model;
public class Professor {
    private String fullName;
    private String academicDegree;

    public Professor(String fullName, String academicDegree) {
        this.fullName = fullName;
        this.academicDegree = academicDegree;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }
}
