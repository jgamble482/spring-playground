package com.jgamble.springapp;

import org.springframework.stereotype.Component;
import java.util.Arrays;

public class QuickSort implements  SortingAlgorithm{

    public int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
