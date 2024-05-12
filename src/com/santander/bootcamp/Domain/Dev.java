package com.santander.bootcamp.Domain;

public class Dev {

    private String name;
    private int inscriptions;
    private int completed;

    public Dev(String name, int inscriptions, int completed) {
        this.name = name;
        this.inscriptions = inscriptions;
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(int inscriptions) {
        this.inscriptions = inscriptions;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }
}


