package com.example.movierental.service.price;

/**
 * Created by MengLu on 2018/11/7.
 */
public abstract class Price {

	public abstract double getAmount(int daysRented);

	public int getScore(int daysRented) {
		return 1;
	}

	public abstract int getPriceCode();

}
