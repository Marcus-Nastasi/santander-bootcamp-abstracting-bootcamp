package com.santander.bootcamp.Domain;

public abstract class Content {

    protected static final double xp = 10.00;

    private String title;
    private String description;

    public abstract double calculateXp();
}


