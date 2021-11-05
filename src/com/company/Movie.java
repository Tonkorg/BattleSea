package com.company;

public class Movie {
    String title;
    String genre;
    int rating;
    void playIt()
    {
        System.out.println("    Проигрывание фильма"+ "\n" + title + " " + genre + " " + rating +"\n" );
    }

}
