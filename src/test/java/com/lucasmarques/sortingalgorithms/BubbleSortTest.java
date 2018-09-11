package com.lucasmarques.sortingalgorithms;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void test() {
        Integer[] input = new Integer[]{5, 3, 8, 1, 2};
        BubbleSort.sort(input);
        System.out.println(Arrays.toString(input));
    }

}
