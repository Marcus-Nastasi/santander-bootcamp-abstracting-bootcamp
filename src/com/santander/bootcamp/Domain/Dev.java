package com.santander.bootcamp.Domain;

import java.util.HashSet;
import java.util.Set;

public class Dev {

    private String name;
    private final Set<Content> inscriptions = new HashSet<>();
    private final Set<Content> completed = new HashSet<>();

    public Dev(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getInscriptions() {
        return inscriptions;
    }

    public Set<Content> getCompleted() {
        return completed;
    }
}


