package com.santander.bootcamp;

import com.santander.bootcamp.Domain.Content;
import com.santander.bootcamp.Domain.Course;
import com.santander.bootcamp.Domain.Mentoring;

public class Main {
    public static void main(String[] args) {
        try {
            Content course = new Course("Java", "Java complete course", 140);
            System.out.println(course);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}


