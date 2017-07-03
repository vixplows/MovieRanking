package com.example.vicky.movieranking;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by vicky on 03/07/2017.
 */

public class MovieTest {

    Movie movie0;
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Movie movie6;
    Movie movie7;
    Movie movie8;
    Movie movie9;


    @Before
    public void before() {
        movie0 = new Movie("Withnail and I", "Comedy", 1);
        movie1 = new Movie("Love Acutally", "Comedy", 2);
        movie2 = new Movie("We Need to Talk About Kevin", "Drama", 3);
        movie3 = new Movie("Slumdog Millionaire", "Drama", 4);
        movie4 = new Movie("The Castle", "Comedy", 5);
        movie5 = new Movie("Misery", "Thriller", 6);
        movie6 = new Movie("Logan's Run", "Science Fiction", 7);
        movie7 = new Movie("Die Hard", "Action", 8);
        movie8 = new Movie("Jerry Maguire", "Comedy", 9);
        movie9 = new Movie("Terminator", "Science Fiction", 10);


    }

    @Test
    public void canGetTitle() {
        assertEquals("Withnail and I", movie0.getTitle());
    }

    @Test
    public void canSetTitle() {
        movie9.setTitle("Terminator 2: Judgement Day");
        assertEquals("Terminator 2: Judgement Day", movie9.getTitle());
    }

    @Test
    public void canGetGenre() {
        assertEquals("Comedy", movie0.getGenre());
    }

    @Test
    public void canSetGenre() {
        movie9.setGenre("Action");
        assertEquals("Action", movie9.getGenre());
    }

    @Test
    public void canGetCurrentRanking() {
        assertEquals(1, movie0.getCurrentRanking());
    }

    @Test
    public void canSetCurrentRanking() {
        movie9.setCurrentRanking(1);
        assertEquals(1, movie9.getCurrentRanking());
    }

}
