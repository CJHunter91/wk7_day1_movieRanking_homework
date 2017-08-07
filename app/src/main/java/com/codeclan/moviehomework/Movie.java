package com.codeclan.moviehomework;

/**
 * Created by user on 07/08/2017.
 */

public class Movie{

    private String title;
    private String genre;
    private int rating;

    public Movie(String title,  String genre, int rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRanking() {
        return rating;
    }

    public void setRanking(int rating) {
        this.rating = rating;
    }

    public String toString(){
        String sTitle = "Title: " + this.title;
        String sGenre = "Genre: " + this.genre;
        String sRating = "Ranking: " + Integer.toString(this.rating);
        return sTitle + ", " + sGenre + ", " + sRating;
    }
}
