package com.codeclan.moviehomework;

/**
 * Created by user on 07/08/2017.
 */

public class Ranking {

    private Movie[] rankings;

    public Ranking(Movie[] currentRankings){
        this.rankings = currentRankings;
    }

    public Movie getRanking(int index){
        return this.rankings[index - 1];
    }   
}
