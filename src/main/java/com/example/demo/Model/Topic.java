package com.example.demo.Model;

public class Topic {
    private long id;
    private String name;
    private String course;

    public Topic() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Topic(long id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
}
