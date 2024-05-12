package com.santander.bootcamp.Domain;

public abstract class Content {

    protected static final double xp = 10.00;

    private String title;
    private String description;

    public abstract double calculateXp();

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected void setDescription(String description) {
        this.description = description;
    }
}


