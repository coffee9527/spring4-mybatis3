package com.coffee.jsr330;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jsr330Test {
	public static void main(String[] args) {
		SimpleMovieLister simpleMovieLister = new ClassPathXmlApplicationContext().getBean("simpleMovieLister", SimpleMovieLister.class);
		simpleMovieLister.listMovies();
	}
}
