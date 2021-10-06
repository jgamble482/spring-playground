package com.jgamble.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.System.Logger;


@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		/*
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
		int result = binarySearch.binarySearch(new int[]{1, 2, 3}, 3);
		System.out.println(result);
		*/
		ApplicationContext app = SpringApplication.run(SpringAppApplication.class, args);
		BinarySearchImpl binarySearch = app.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{5, 1, 3}, 3);
		System.out.println(result);

	}

}
