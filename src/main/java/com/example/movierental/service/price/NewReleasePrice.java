package com.example.movierental.service.price;

import com.example.movierental.service.Movie;

/**
 * Created by MengLu on 2018/11/7.
 */
public class NewReleasePrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getAmount(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getScore(int daysRented) {
		return daysRented > 1 ? 2 : 1;
	}
}
