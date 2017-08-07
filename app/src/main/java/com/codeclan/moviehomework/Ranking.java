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

    public int getIndex(Movie movieToFind){
        int count = 0;
        for(Movie movie: this.rankings){
            if(movie == movieToFind){
                return count;
            }
            count++;
        }
        return -1;
    }

    public void addMovie(Movie newMovie){
        this.rankings[newMovie.getRanking() - 1] = newMovie;
    }

//    public void movieUp(Movie movieToMove) {
//
//    }
}
