package com.example.movierental.service;

import com.example.movierental.service.price.ChildrensPrice;
import com.example.movierental.service.price.NewReleasePrice;
import com.example.movierental.service.price.Price;
import com.example.movierental.service.price.RegularPrice;

/**
 * Created by MengLu on 2018/11/5.
 */
public class Movie {
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;

	private String title;
	private Price price;

	public double getAmount(int daysRented) {
		return price.getAmount(daysRented);
	}

	public int getScore(int daysRented) {
		return price.getScore(daysRented);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int priceCode) {
		switch (priceCode) {
			case Movie.REGULAR:
				this.price = new RegularPrice();
				break;
			case Movie.NEW_RELEASE:
				this.price = new NewReleasePrice();
				break;
			case Movie.CHILDRENS:
				this.price = new ChildrensPrice();
				break;
			default:
				throw new RuntimeException("不支持的影片类型!");
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
