package com.santander.bootcamp;

import com.santander.bootcamp.Domain.*;

public class Main {
    public static void main(String[] args) {
        try {
            Content c1 = new Course("Java Course", "Complete java course", 140);
            Content m1 = new Mentoring("Java Mentoring", "Java's first mentoring", "12/10/2024");

            Dev d1 = new Dev("Marc");
            Dev d2 = new Dev("Maria");

            Bootcamp bJava = new Bootcamp("Java Bootcamp", "Java's most complete bootcamp");
            bJava.getContentList().add(c1);
            bJava.getContentList().add(m1);

            d1.subscribeBootcamp(bJava);
            d2.subscribeBootcamp(bJava);

            d1.progress();
            d2.progress();
            d1.progress();

            System.out.println(d1);

            //System.out.println(bJava);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}


