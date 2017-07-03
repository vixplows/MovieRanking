package com.example.vicky.movieranking;

/**
 * Created by vicky on 03/07/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int currentRanking;

    public Movie(String title, String genre, int currentRanking) {
        this.title = title;
        this.genre = genre;
        this.currentRanking = currentRanking;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
