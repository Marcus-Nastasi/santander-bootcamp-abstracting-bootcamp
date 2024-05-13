package com.santander.bootcamp.Domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String name;
    private final Set<Content> inscriptions = new LinkedHashSet<>();
    private final Set<Content> completed = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.inscriptions.add();
    }

    public void progress() {

    }


    public void calculateXp() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(inscriptions, dev.inscriptions) && Objects.equals(completed, dev.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, inscriptions, completed);
    }

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


