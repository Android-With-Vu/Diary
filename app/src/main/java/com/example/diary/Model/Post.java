package com.example.diary.Model;

public class Post {
    private String id;
    private String tittle;
    private String content;

    private String color;
    public Post() {
    }

    public Post(String id, String tittle, String content, String color) {
        this.id = id;
        this.tittle = tittle;
        this.content = content;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
