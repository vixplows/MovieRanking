package com.example.vicky.movieranking;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Created by vicky on 03/07/2017.
 */

public class RankingListTest {

    RankingList rankingList;
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
        rankingList = new RankingList();
    }

    @Test
    public void getRankingListTest() {
        assertNotNull(rankingList.getRankingList());
    }

    @Test
    public void testAddToRankingList() {
        rankingList.addToRankingList(movie0);
        rankingList.addToRankingList(movie1);
        rankingList.addToRankingList(movie2);
        rankingList.addToRankingList(movie3);
        rankingList.addToRankingList(movie4);
        rankingList.addToRankingList(movie5);
        rankingList.addToRankingList(movie6);
        rankingList.addToRankingList(movie7);
        rankingList.addToRankingList(movie8);
        rankingList.addToRankingList(movie9);
        assertEquals(10, rankingList.getLength());
    }
}
