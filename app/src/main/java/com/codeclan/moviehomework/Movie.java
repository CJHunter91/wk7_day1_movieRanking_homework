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
}
