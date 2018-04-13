package com.coffee.jsr330;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("movieFinder")
public class MovieFinderImpl implements MovieFinder {
	private static List<String> movies = new ArrayList<String>();
	static {
		movies.add("这个杀手不太冷");
		movies.add("泰坦尼克号");
		movies.add("天下无贼");
	}
	
	public List<String> findMovies() {
		return movies;
	}

}
