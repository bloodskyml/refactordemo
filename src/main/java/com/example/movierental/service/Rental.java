package com.example.movierental.service;

/**
 * Created by MengLu on 2018/11/5.
 */
public class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public double getAmount() {
		return movie.getAmount(daysRented);
	}

	public int getScore() {
		return movie.getScore(daysRented);
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}
}
