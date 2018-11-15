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
public class TestMovieRental_Regular extends TestMovieRental_Base {

	private static final Logger log = LoggerFactory.getLogger(TestMovieRental_Regular.class);

	@Test
	public void testStatement_oneMovieOneDay() {
		testStatementSameDays(1, 1, 2.0, 1);
	}

	@Test
	public void testStatement_oneMovieTwoDays() {
		testStatementSameDays(1, 2, 2.0, 1);
	}

	@Test
	public void testStatement_oneMovieThreeDays() {
		testStatementSameDays(1, 3, 3.5, 1);
	}

	@Test
	public void testStatement_oneMovieTenDays() {
		testStatementSameDays(1, 10, 14.0, 1);
	}

	@Test
	public void testStatement_twoMoviesOneDay() {
		testStatementSameDays(2, 1, 2, 2);
	}

	@Test
	public void testStatement_twoMoviesTwoDays() {
		testStatementSameDays(2, 2, 2, 2);
	}

	@Test
	public void testStatement_twoMoviesThreeDays() {
		testStatementSameDays(2, 3, 3.5, 2);
	}

	@Test
	public void testStatement_twoMoviesTenDays() {
		testStatementSameDays(2, 10, 14.0, 2);
	}

	@Test
	public void testStatement_threeMoviesTenDays() {
		testStatementSameDays(3, 10, 14.0, 3);
	}

	@Test
	public void testStatement_twoMoviesDiffDays_12() {
		testStatementDiffDays(2, new int[]{1, 2}, new double[]{2.0, 2.0}, 2);
	}

	@Test
	public void testStatement_twoMoviesDiffDays_13() {
		testStatementDiffDays(2, new int[]{1, 3}, new double[]{2.0, 3.5}, 2);
	}

	@Test
	public void testStatement_twoMoviesDiffDays_23() {
		testStatementDiffDays(2, new int[]{2, 3}, new double[]{2.0, 3.5}, 2);
	}

	@Test
	public void testStatement_twoMoviesDiffDays_310() {
		testStatementDiffDays(2, new int[]{3, 10}, new double[]{3.5, 14}, 2);
	}

	@Test
	public void testStatement_threeMoviesDiffDays_123() {
		testStatementDiffDays(3, new int[]{1, 2, 3}, new double[]{2.0, 2.0, 3.5}, 3);
	}

	@Test
	public void testStatement_threeMoviesDiffDays_234() {
		testStatementDiffDays(3, new int[]{2, 3, 4}, new double[]{2.0, 3.5, 5.0}, 3);
	}

}
