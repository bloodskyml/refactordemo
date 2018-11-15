package com.example.movierental.service;

import com.sun.glass.ui.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestMovieRental_NewRelease extends TestMovieRental_Base {

	private static final Logger log = LoggerFactory.getLogger(TestMovieRental_NewRelease.class);

	@Override
	protected int getMovieType() {
		return Movie.NEW_RELEASE;
	}

	@Test
	public void testStatement_oneMovieOneDay() {
		testStatementSameDays(1, 1, 3,  1);
	}

	@Test
	public void testStatement_oneMovieTwoDays() {
		testStatementSameDays(1, 2, 6,  2);
	}

	@Test
	public void testStatement_oneMovieThreeDays() {
		testStatementSameDays(1, 3, 9,  2);
	}

	@Test
	public void testStatement_twoMoviesOneDay() {
		testStatementSameDays(2, 1, 3.0,  2);
	}

	@Test
	public void testStatement_twoMoviesTwoDays() {
		testStatementSameDays(2, 2, 6.0,  4);
	}

	@Test
	public void testStatement_twoMoviesThreeDays() {
		testStatementSameDays(2, 3, 9.0,  4);
	}

	@Test
	public void testStatement_threeMoviesTenDays() {
		testStatementSameDays(3, 10, 30.0,  6);
	}

	@Test
	public void testStatement_twoMoviesDiffDays_12() {
		testStatementDiffDays(2, new int[]{1, 2}, new double[]{3.0, 6.0}, 3);
	}

	@Test
	public void testStatement_twoMoviesDiffDays_13() {
		testStatementDiffDays(2, new int[]{1, 3}, new double[]{3.0, 9.0}, 3);
	}

	@Test
	public void testStatement_twoMoviesDiffDays_23() {
		testStatementDiffDays(2, new int[]{2, 3}, new double[]{6.0, 9.0}, 4);
	}

	@Test
	public void testStatement_threeMoviesDiffDays_123() {
		testStatementDiffDays(3, new int[]{1, 2, 3}, new double[]{3.0, 6.0, 9.0}, 5);
	}

}
