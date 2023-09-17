package com.model;

public class Article {
    private String title;
    private String journalName;
    private String category;
    private String status;

    public Article(String title, String journalName, String category, String status) {
        this.title = title;
        this.journalName = journalName;
        this.category = category;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
