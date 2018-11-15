package com.example.movierental.service.price;

import com.example.movierental.service.Movie;

/**
 * Created by MengLu on 2018/11/7.
 */
public class ChildrensPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	public double getAmount(int daysRented) {
		double result = 1.5;
		if (daysRented > 3) {
			result += (daysRented - 3) * 1;
		}
		return result;
	}
}
