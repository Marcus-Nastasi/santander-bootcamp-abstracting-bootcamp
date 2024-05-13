package com.santander.bootcamp.Domain;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class Bootcamp {

    private String name;
    private String description;
    private LocalDate initDate = LocalDate.now();
    private LocalDate finalDate = initDate.plusDays(45);
    private final ArrayList<Content> contentArrayList = new ArrayList<>();
    private final ArrayList<Dev> devArrayList = new ArrayList<>();
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
            ", initDate=" + sdf.format(initDate) +
            ", finalDate=" + sdf.format(finalDate) +
            ", contentArrayList=" + contentArrayList +
            ", devArrayList=" + devArrayList + '}'
        );
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

    public ArrayList<Content> getContentArrayList() {
        return contentArrayList;
    }

    public ArrayList<Dev> getDevArrayList() {
        return devArrayList;
    }
}


