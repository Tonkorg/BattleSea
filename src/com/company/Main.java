package com.company;

public class Main {

    public static void main(String[] args) {
        Movie m1 = new Movie();
        Movie m2 = new Movie();
        Movie m3 = new Movie();

        m1.title = "Это же полный пиздец";
        m2.title = "Сука, даже словами не описать";
        m3.title = "Ебанный цирк";

        m1.genre = "С++ для чайников";
        m2.genre = "C для чайников";
        m3.genre = "С# для чайников";

        m1.rating = -22;
        m2.rating = -20;
        m3.rating = -10;
        
        m1.playIt();
        m2.playIt();
        m3.playIt();
    }
}
