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

    @Before
    public void before() {
        rankingList = new RankingList();
    }

    @Test
    public void getRankingListTest() {
        assertNotNull(rankingList.getRankingList());
    }

//    @Test
//    public void setUpRankingList() {
//        assertEquals(10, rankingList.getLength());
//    }
}
