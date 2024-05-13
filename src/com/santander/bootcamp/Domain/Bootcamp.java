package com.santander.bootcamp.Domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Bootcamp {

    private String name;
    private String description;
    private Date initDate = new Date();
    private Date finalDate;
    private final ArrayList<Content> contentArrayList = new ArrayList<>();
    private final ArrayList<Dev> devArrayList = new ArrayList<>();
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Bootcamp(String name, String description, Date initDate, Date finalDate) {
        this.name = name;
        this.description = description;
        this.initDate = initDate;
        this.finalDate = finalDate;
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

    public Date getInitDate() {
        return initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public ArrayList<Content> getContentArrayList() {
        return contentArrayList;
    }

    public ArrayList<Dev> getDevArrayList() {
        return devArrayList;
    }
}


