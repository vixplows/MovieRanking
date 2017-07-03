package com.example.vicky.movieranking;

import java.util.ArrayList;

/**
 * Created by vicky on 03/07/2017.
 */

public class RankingList {
    private ArrayList<Rankable> rankingList;

    public RankingList() {
        this.rankingList = new ArrayList<Rankable>();
    }

    public ArrayList<Rankable> getRankingList() {
        return new ArrayList<Rankable>(rankingList);
    }

    public int getLength() {
        return rankingList.size();
    }

//    public void setUpRankingList() {
//        Movies [] moviesInRankedOrder = {
//
//
//        }
//    }

}