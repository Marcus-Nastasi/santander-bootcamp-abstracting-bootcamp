package com.santander.bootcamp.Domain;

public class Course {

    private final String title;
    private final String description;
    private final int totalHours;

    public Course(String title, String description, int totalHours) {
        this.title = title;
        this.description = description;
        this.totalHours = totalHours;
    }

    @Override
    public String toString() {
        return(
            "Course{" + "title='" + title + '\'' +
            ", description='" + description + '\'' +
            ", totalHours=" + totalHours + '}'
        );
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getTotalHours() {
        return totalHours;
    }
}


