package com.santander.bootcamp.Domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mentoring {

    private final String title;
    private final String description;
    private final Date date;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Mentoring(String title, String description, String date) throws ParseException {
        this.title = title;
        this.description = description;
        this.date = sdf.parse(date);
    }

    @Override
    public String toString() {
        return(
            "Mentoring{" + "title='" + title + '\'' +
            ", description='" + description + '\'' +
            ", date=" + sdf.format(date) + '}'
        );
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }
}


