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
public class TestMovieRental_Children extends TestMovieRental_Base{

	private static final Logger log = LoggerFactory.getLogger(TestMovieRental_Children.class);

	@Override
	protected int getMovieType() {
		return Movie.CHILDRENS;
	}

	@Test
	public void testStatement_oneMovieOneDay() {
		testStatementSameDays(1, 1, 1.5,  1);
	}

	@Test
	public void testStatement_oneMovieTwoDays() {
		testStatementSameDays(1, 2, 1.5,  1);
	}

	@Test
	public void testStatement_oneMovieThreeDays() {
		testStatementSameDays(1, 3, 1.5,  1);
	}

	@Test
	public void testStatement_oneMovieFourDays() {
		testStatementSameDays(1, 4, 2.5,  1);
	}

	@Test
	public void testStatement_oneMovieTenDays() {
		testStatementSameDays(1, 10, 8.5,  1);
	}

	@Test
	public void testStatement_twoMoviesOneDay() {
		testStatementSameDays(2, 1, 1.5,  2);
	}

	@Test
	public void testStatement_twoMoviesTwoDays() {
		testStatementSameDays(2, 2, 1.5,  2);
	}

	@Test
	public void testStatement_twoMoviesThreeDays() {
		testStatementSameDays(2, 3, 1.5,  2);
	}

	@Test
	public void testStatement_twoMoviesFourDays() {
		testStatementSameDays(2, 4, 2.5,  2);
	}

	@Test
	public void testStatement_twoMoviesTenDays() {
		testStatementSameDays(2, 10, 8.5,  2);
	}

	@Test
	public void testStatement_threeMoviesTenDays() {
		testStatementSameDays(3, 10, 8.5,  3);
	}

	@Test
	public void testStatement_twoMoviesDiffDays_12() {
		testStatementDiffDays(2, new int[]{1, 2}, new double[]{1.5, 1.5},  2);
	}

	@Test
	public void testStatement_twoMoviesDiffDays_13() {
		testStatementDiffDays(2, new int[]{1, 3}, new double[]{1.5, 1.5},  2);
	}

	@Test
	public void testStatement_twoMoviesDiffDays_23() {
		testStatementDiffDays(2, new int[]{2, 3}, new double[]{1.5, 1.5},  2);
	}

	@Test
	public void testStatement_twoMoviesDiffDays_34() {
		testStatementDiffDays(2, new int[]{3, 4}, new double[]{1.5, 2.5},  2);
	}

	@Test
	public void testStatement_twoMoviesDiffDays_310() {
		testStatementDiffDays(2, new int[]{3, 10}, new double[]{1.5, 8.5}, 2);
	}

	@Test
	public void testStatement_threeMoviesDiffDays_123() {
		testStatementDiffDays(3, new int[]{1, 2, 3}, new double[]{1.5, 1.5, 1.5},  3);
	}

	@Test
	public void testStatement_threeMoviesDiffDays_234() {
		testStatementDiffDays(3, new int[]{2, 3, 4}, new double[]{1.5, 1.5, 2.5},  3);
	}

}
