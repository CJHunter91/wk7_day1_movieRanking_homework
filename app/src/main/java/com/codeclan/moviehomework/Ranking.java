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

    public String toString(){
        String output = "";
        int count = 1;
        for(Movie movie: this.rankings){
            output += Integer.toString(count)+ ": " + movie + "\n";
            count++;
        }
        return output;
    }

    public void movieUp(Movie movieToMove) {
        int prevPosition = this.getIndex(movieToMove);
        Movie movieToReplace = this.rankings[prevPosition - 1];

        this.rankings[prevPosition] = movieToReplace;
        this.rankings[prevPosition - 1] = movieToMove;

    }
}
