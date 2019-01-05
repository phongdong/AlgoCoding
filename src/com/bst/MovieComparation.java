package com.bst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie> {
	private double rating;
	private String name;
	private int year;
	
	public Movie (String n, double r,  int y) {
		this.rating = r;
		this.name = n;
		this.year = y;
	}
	@Override
	public int compareTo(Movie o) {
		return this.year - o.year;
	}
	public double getRating() {return rating;}
	public String getName() {return name;}
	public int getYear() {return year;}
}

class RatingCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		if (m1.getRating() < m2.getRating()) return -1;
		if (m1.getRating() > m2.getRating()) return 1;
		else return 0;
	}
}

class NameCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		return m1.getName().compareTo(m2.getName());
	}
}

public class MovieComparation {
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie: list) {
        	 	System.out.println(movie.getName() + " : " + movie.getRating() + " : " + movie.getYear());
        }
        System.out.println("-----------------");
        System.out.println("Sorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie: list) {
        	 	System.out.println(movie.getName() + " : " + movie.getRating() + " : " + movie.getYear());
        }
        
        System.out.println("-----------------");
        System.out.println("Sorted by year");
        Collections.sort(list);
        for (Movie movie: list) {
        	 	System.out.println(movie.getName() + " : " + movie.getRating() + " : " + movie.getYear());
        }
        
	}
}
