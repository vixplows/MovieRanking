package com.example.vicky.movieranking;

import java.util.ArrayList;

/**
 * Created by vicky on 03/07/2017.
 */

public class RankingList {
    private ArrayList<String> rankingList;

    public RankingList() {
        this.rankingList = new ArrayList<String>();
    }

    public ArrayList<String> getRankingList() {
        return new ArrayList<String>(rankingList);
    }

//    public int getLength() {
//        return rankingList.size();
//    }

//    public void setUpRankingList() {
//        String [] rankings = {
//
//        }
//    }

}