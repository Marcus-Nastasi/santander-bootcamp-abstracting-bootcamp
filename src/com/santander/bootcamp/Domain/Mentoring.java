package com.santander.bootcamp.Domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mentoring extends Content {

    private final Date date;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Mentoring(String title, String description, String date) throws ParseException {
        this.setTitle(title);
        this.setDescription(description);
        this.date = sdf.parse(date);
    }

    @Override
    public double calculateXp() {
        return xp + 10;
    }

    @Override
    public String toString() {
        return(
            "Mentoring{" + "title='" + this.getTitle() + '\'' +
            ", description='" + this.getDescription() + '\'' +
            ", date=" + sdf.format(date) + '}'
        );
    }

    public Date getDate() {
        return date;
    }
}


