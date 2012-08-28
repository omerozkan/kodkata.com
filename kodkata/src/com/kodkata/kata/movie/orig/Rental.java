package com.kodkata.kata.movie.orig;

public class Rental {

    private int daysRented;
    private Movie movie;

    public Rental(Movie movie, int daysrented) {
	this.movie = movie;
	this.daysRented = daysrented;
    }

    public int getDaysRented() {
	return daysRented;
    }

    public void setDaysRented(int daysRented) {
	this.daysRented = daysRented;
    }

    public Movie getMovie() {
	return movie;
    }

    public void setMovie(Movie movie) {
	this.movie = movie;
    }

}
