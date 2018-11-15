package com.example.movierental.service.price;

import com.example.movierental.service.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by MengLu on 2018/11/7.
 */
public class RegularPrice extends Price {
	private static final Logger log = LoggerFactory.getLogger(RegularPrice.class);

	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	public double getAmount(int daysRented) {
		log.debug("called in RegularPrice...");
		double result = 2;
		if (daysRented > 2) {
			result += (daysRented - 2) * 1.5;
		}
		return result;
	}
}
