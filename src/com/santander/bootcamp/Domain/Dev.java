package com.santander.bootcamp.Domain;

import com.santander.bootcamp.Exceptions.DevException;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private final Set<Content> inscriptions = new LinkedHashSet<>();
    private final Set<Content> completed = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) throws DevException {
        if (bootcamp.getContentList().isEmpty()) throw new DevException("Dev Error: content list on bootcamp empty");
        this.inscriptions.addAll(bootcamp.getContentList());
        bootcamp.getDevList().add(this);
    }

    public void progress() throws DevException {
        Optional<Content> c = this.inscriptions.stream().findFirst();
        if (!c.isPresent()) throw new DevException("Dev Error: no content on inscriptions");
        this.completed.add(c.get());
        this.inscriptions.remove(c.get());
    }

    public double calculateXp() throws DevException {
        if (this.completed.isEmpty()) throw new DevException("Dev Error: no completed courses or mentorings");
        return this.completed.stream().mapToDouble(Content::calculateXp).sum();
    }

    @Override
    public String toString() {
        return(
            "Dev{" + "name='" + name + '\'' +
            ", inscriptions=" + inscriptions +
            ", completed=" + completed + '}'
        );
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


