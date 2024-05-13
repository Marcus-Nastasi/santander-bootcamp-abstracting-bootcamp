package com.santander.bootcamp.Domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private final Set<Content> inscriptions = new LinkedHashSet<>();
    private final Set<Content> completed = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.inscriptions.addAll(bootcamp.getContentArrayList());
        bootcamp.getDevArrayList().add(this);
    }

    public void progress() {
        Optional<Content> c = this.inscriptions.stream().findFirst();
        if (c.isPresent()) {
            this.completed.add(c.get());
            this.inscriptions.remove(c.get());
            return;
        }
        
        System.err.println("Dev Error: no content on inscriptions");
    }

    public double calculateXp() {
        return this.completed.stream().mapToDouble(Content::calculateXp).sum();
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


