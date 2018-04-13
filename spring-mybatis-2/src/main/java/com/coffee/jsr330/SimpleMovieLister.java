package com.coffee.jsr330;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class SimpleMovieLister {
	private MovieFinder movieFinder;

    @Inject
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void listMovies() {
        List<String> movies = movieFinder.findMovies();
        for(String movie : movies) {
        	System.out.println(movie);
        }
    }
}
