package com.santander.bootcamp.Domain;

public class Course extends Content {

    private final int totalHours;

    public Course(String title, String description, int totalHours) {
        this.setTitle(title);
        this.setDescription(description);
        this.totalHours = totalHours;
    }

    @Override
    public double calculateXp() {
        return xp * this.totalHours;
    }

    @Override
    public String toString() {
        return(
            "Course{" + "title='" + this.getTitle() + '\'' +
            ", description='" + this.getDescription() + '\'' +
            ", totalHours=" + totalHours + '}'
        );
    }

    public int getTotalHours() {
        return totalHours;
    }
}


