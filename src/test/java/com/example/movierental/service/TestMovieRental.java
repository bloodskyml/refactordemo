package com.example.movierental.service;

import com.sun.glass.ui.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestMovieRental extends TestMovieRental_Base {

	private static final Logger log = LoggerFactory.getLogger(TestMovieRental_Regular.class);

	@Test
	public void testStatement_regular_children_oneDay() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.REGULAR));
		movieList.add(createMovie("m2", Movie.CHILDRENS));
		testStatement(movieList, new int[]{1, 1}, new double[]{2.0, 1.5}, 2);
		//

	}

	@Test
	public void testStatement_regular_children_twoDays() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.REGULAR));
		movieList.add(createMovie("m2", Movie.CHILDRENS));
		testStatement(movieList, new int[]{2, 2}, new double[]{2.0, 1.5}, 2);
	}

	@Test
	public void testStatement_regular_children_threeDays() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.REGULAR));
		movieList.add(createMovie("m2", Movie.CHILDRENS));
		testStatement(movieList, new int[]{3, 3}, new double[]{3.5, 1.5}, 2);
	}

	@Test
	public void testStatement_regular_children_fourDays() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.REGULAR));
		movieList.add(createMovie("m2", Movie.CHILDRENS));
		testStatement(movieList, new int[]{4, 4}, new double[]{5.0, 2.5}, 2);
	}

	@Test
	public void testStatement_regular_new_oneDay() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.REGULAR));
		movieList.add(createMovie("m2", Movie.NEW_RELEASE));
		testStatement(movieList, new int[]{1, 1}, new double[]{2.0, 3.0}, 2);
	}

	@Test
	public void testStatement_regular_new_twoDays() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.REGULAR));
		movieList.add(createMovie("m2", Movie.NEW_RELEASE));
		testStatement(movieList, new int[]{2, 2}, new double[]{2.0, 6.0}, 3);
	}

	@Test
	public void testStatement_regular_new_threeDays() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.REGULAR));
		movieList.add(createMovie("m2", Movie.NEW_RELEASE));
		testStatement(movieList, new int[]{3, 3}, new double[]{3.5, 9.0}, 3);
	}

	@Test
	public void testStatement_children_new_oneDay() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.CHILDRENS));
		movieList.add(createMovie("m2", Movie.NEW_RELEASE));
		testStatement(movieList, new int[]{1, 1}, new double[]{1.5, 3.0}, 2);
	}

	@Test
	public void testStatement_children_new_threeDays() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.CHILDRENS));
		movieList.add(createMovie("m2", Movie.NEW_RELEASE));
		testStatement(movieList, new int[]{3, 3}, new double[]{1.5, 9.0}, 3);
	}

	@Test
	public void testStatement_children_new_fourDays() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.CHILDRENS));
		movieList.add(createMovie("m2", Movie.NEW_RELEASE));
		testStatement(movieList, new int[]{4, 4}, new double[]{2.5, 12.0}, 3);
	}

	@Test
	public void testStatement_regular_children_new_oneDay() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.REGULAR));
		movieList.add(createMovie("m2", Movie.CHILDRENS));
		movieList.add(createMovie("m3", Movie.NEW_RELEASE));
		testStatement(movieList, new int[]{1, 1, 1}, new double[]{2.0, 1.5, 3.0}, 3);
	}

	@Test
	public void testStatement_regular_children_new_211() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.REGULAR));
		movieList.add(createMovie("m2", Movie.CHILDRENS));
		movieList.add(createMovie("m3", Movie.NEW_RELEASE));
		testStatement(movieList, new int[]{2, 1, 1}, new double[]{2.0, 1.5, 3.0}, 3);
	}

	@Test
	public void testStatement_regular_children_new_311() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.REGULAR));
		movieList.add(createMovie("m2", Movie.CHILDRENS));
		movieList.add(createMovie("m3", Movie.NEW_RELEASE));
		testStatement(movieList, new int[]{3, 1, 1}, new double[]{3.5, 1.5, 3.0}, 3);
	}

	@Test
	public void testStatement_regular_children_new_341() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.REGULAR));
		movieList.add(createMovie("m2", Movie.CHILDRENS));
		movieList.add(createMovie("m3", Movie.NEW_RELEASE));
		testStatement(movieList, new int[]{3, 4, 1}, new double[]{3.5, 2.5, 3.0}, 3);
	}

	@Test
	public void testStatement_regular_children_new_342() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.REGULAR));
		movieList.add(createMovie("m2", Movie.CHILDRENS));
		movieList.add(createMovie("m3", Movie.NEW_RELEASE));
		testStatement(movieList, new int[]{3, 4, 2}, new double[]{3.5, 2.5, 6.0}, 4);
	}

	@Test
	public void testStatement_regular_children_new_789() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(createMovie("m1", Movie.REGULAR));
		movieList.add(createMovie("m2", Movie.CHILDRENS));
		movieList.add(createMovie("m3", Movie.NEW_RELEASE));
		testStatement(movieList, new int[]{7, 8, 9}, new double[]{2 + 5 * 1.5, 1.5 + 5 * 1, 3 * 9}, 4);
	}


}
