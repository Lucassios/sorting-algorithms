package com.lucasmarques.sortingalgorithms;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {

    @Test
    public void test() {
        Integer[] input = new Integer[]{5, 3, 8, 12, 90, 0, 1, 2, 76, 4, 6, 5};
        InsertionSort.sort(input);
        System.out.println(Arrays.toString(input));
    }

}
