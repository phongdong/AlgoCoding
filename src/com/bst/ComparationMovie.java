package com.bst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MovieN implements Comparable<MovieN> {

	
	private String name;
	private double rating;
	private int year;

	public MovieN(String n, double r, int y) {
		this.name = n;
		this.rating = r;
		this.year = y;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int compareTo(MovieN m1) {
		return this.year - m1.year;
	}
}

class RatingCompareN implements Comparator<MovieN> {
	public int compare(MovieN m1, MovieN m2) {
		
		if (m1.getRating() > m2.getRating() ) return 1;
		else if (m1.getRating() == m2.getRating()) return 0;
		else return -1;
	}
}

class NameCompareN implements Comparator<MovieN> {
	public int compare(MovieN m1, MovieN m2) {
		return m1.getName().compareTo(m2.getName());
	}
}

public class ComparationMovie {

	public static void main(String[] args) {
		ArrayList<MovieN> list = new ArrayList<MovieN>();
		list.add(new MovieN("Force Awakens", 8.3, 2015));
		list.add(new MovieN("Star Wars", 8.7, 1977));
		list.add(new MovieN("Empire Strikes Back", 8.8, 1980));
		list.add(new MovieN("Return of the Jedi", 8.4, 1983));

		System.out.println("\t\tSorted by year");

		Collections.sort(list);
		for (MovieN movieN : list) {
			System.out.println(movieN.getName() + " : " + movieN.getRating() + " : " + movieN.getYear());
		}
		System.out.println();
		
		RatingCompareN ratingCompareN = new RatingCompareN();
		Collections.sort(list, ratingCompareN);
		System.out.println("\t\tSorted by rating");
		for (MovieN movieN : list) {
			System.out.println(movieN.getName() + " : " + movieN.getRating() + " : " + movieN.getYear());
		}
		System.out.println();
		
		
		System.out.println("\t\tSorted by name");
		NameCompareN nameCompareN = new NameCompareN();
		Collections.sort(list, nameCompareN);
		for (MovieN movieN : list) {
			System.out.println(movieN.getName() + " : " + movieN.getRating() + " : " + movieN.getYear());
		}
	}

}
