package com.lucasmarques.sortingalgorithms;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class QuickSortTest {

    @Test
    public void test() {
        List<Integer> input = Arrays.asList(5, 3, 8, 1, 2);
        System.out.println(QuickSort.sort(input));
    }

}
