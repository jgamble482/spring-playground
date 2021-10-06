package com.jgamble.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    public SortingAlgorithm sortingAlgorithm;

    public int binarySearch(int[] array, int targetValue) {
        int[] sortedNumbers = sortingAlgorithm.sort(array);
        System.out.println(sortingAlgorithm);
        return 325;
    }
}
