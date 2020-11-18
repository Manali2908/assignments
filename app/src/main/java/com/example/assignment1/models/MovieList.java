package com.example.assignment1.models;

public class MovieList {

    String moviename;
    String ratings;
    String description;

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MovieList(String moviename, String ratings, String description) {
        this.moviename = moviename;
        this.ratings = ratings;
        this.description = description;
    }

    public MovieList() {
    }
}
