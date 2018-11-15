package com.example.movierental.service;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

public abstract class TestMovieRental_Base {

	private static final Logger log = LoggerFactory.getLogger(TestMovieRental_Base.class);

	private void assertResult(Custom custom, List<Movie> movieList, double[] eachAmounts, int score) {
		Assert.assertTrue(movieList.size() > 0);
		String result = custom.statement();
		log.debug(result);
		String[] resultList = result.split("\\n");
		Assert.assertEquals("客户：" + custom.getName(), resultList[0]);
		double totalAmount = 0.0;
		for (int i = 0; i < movieList.size(); i++) {
			String title = movieList.get(i).getTitle();
			log.debug("i:" + i + " title: " + title);
			Assert.assertEquals("影片：" + title + " 的价格是：" + eachAmounts[i], resultList[i + 1]);
			totalAmount += eachAmounts[i];
		}
		Assert.assertEquals("总价格：" + totalAmount + " 总积分：" + score, resultList[movieList.size() + 1]);
	}

	protected void testStatementSameDays(int movieCount, int daysRented, double eachAmount, int score) {
		int[] daysRentedArray = new int[movieCount];
		double[] eachAmounts = new double[movieCount];
		for (int i = 0; i < movieCount; i++) {
			daysRentedArray[i] = daysRented;
			eachAmounts[i] = eachAmount;
		}
		testStatement(createMovieList(movieCount), daysRentedArray, eachAmounts, score);
	}

	protected void testStatementDiffDays(int movieCount, int[] daysRentedArray, double[] eachAmounts, int score) {
		testStatement(createMovieList(movieCount), daysRentedArray, eachAmounts, score);
	}

	protected void testStatement(List<Movie> movieList, int[] daysRentedArray, double[] eachAmounts,
			int score) {
		Custom custom = createCustom();
		List<Rental> rentals = buildRentals(movieList, daysRentedArray);
		custom.setRentals(rentals);
		assertResult(custom, movieList, eachAmounts, score);
	}

	private Custom createCustom() {
		Custom custom = new Custom();
		custom.setName("张三");
		return custom;
	}

	private List<Rental> buildRentals(List<Movie> movieList, int[] daysRentedArray) {
		List<Rental> rentals = new ArrayList<>();
		for (int i = 0; i < daysRentedArray.length; i++) {
			int daysRented = daysRentedArray[i];
			Rental r = new Rental(movieList.get(i), daysRented);
			rentals.add(r);
		}
		return rentals;
	}

	protected Movie createMovie(String title, int movieType) {
		Movie newMovie = new Movie();
		newMovie.setTitle(title);
		newMovie.setPriceCode(movieType);
		return newMovie;
	}

	private List<Movie> createMovieList(int movieCount) {
		List<Movie> movieList = new ArrayList<>(movieCount);
		for (int i = 0; i < movieCount; i++) {
			int index = i + 1;
			movieList.add(createMovie("m" + index, getMovieType()));
		}
		return movieList;
	}

	protected int getMovieType() {
		return Movie.REGULAR;
	}

}
