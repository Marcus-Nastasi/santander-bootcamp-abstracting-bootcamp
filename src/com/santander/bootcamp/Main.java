package com.santander.bootcamp;

import com.santander.bootcamp.Domain.Course;
import com.santander.bootcamp.Domain.Mentoring;

public class Main {
    public static void main(String[] args) {
        try {
            Course math = new Course("Math", "Math course", 110);
            Mentoring java = new Mentoring("Java", "Java mentoring", "01/12/2024");
            System.out.println(math);
            System.out.println(java);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}


