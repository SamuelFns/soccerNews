package com.example.soccernews.domain;

public class News {
    private String title;
    private String description;

    public News(String title, String description) {
        this.title = title;
        this.description = description;
    }

    //Getters
    public String getTitle() {
        return title;
    }
    public String getDescription(){
        return description;
    }

    //Setters
    public void  setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
