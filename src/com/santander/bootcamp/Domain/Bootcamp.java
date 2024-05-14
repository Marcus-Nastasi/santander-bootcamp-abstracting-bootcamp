package com.santander.bootcamp.Domain;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private LocalDate initDate = LocalDate.now();
    private LocalDate finalDate = initDate.plusDays(45);
    private final Set<Content> contentList = new LinkedHashSet<>();
    private final Set<Dev> devList = new HashSet<>();
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Bootcamp(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return(
            "Bootcamp{" +
            "name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", initDate=" + initDate +
            ", finalDate=" + finalDate +
            ", contentArrayList=" + contentList +
            ", devArrayList=" + devList + '}'
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(initDate, bootcamp.initDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(contentList, bootcamp.contentList) && Objects.equals(devList, bootcamp.devList) && Objects.equals(sdf, bootcamp.sdf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initDate, finalDate, contentList, devList, sdf);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitDate() {
        return initDate;
    }

    public void setInitDate(LocalDate initDate) {
        this.initDate = initDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }

    public Set<Content> getContentList() {
        return contentList;
    }

    public Set<Dev> getDevList() {
        return devList;
    }
}


