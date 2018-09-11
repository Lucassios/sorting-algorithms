package com.lucasmarques.sortingalgorithms;

public class BubbleSort {

    public static <T extends Comparable<T>> void sort(T[] input) {

        int beginIndex = 0;
        int endIndex = input.length - 1;

        sort(input, beginIndex, endIndex);

    }

    private static <T extends Comparable<T>> void sort(T[] input, int beginIndex, int endIndex) {

        while (beginIndex < endIndex) {

            int leftIndex = beginIndex;
            int rightIndex = beginIndex + 1;

            T leftValue = input[leftIndex];
            T rightValue = input[rightIndex];

            if (leftValue.compareTo(rightValue) > 0) {
                swap(input, leftIndex, rightIndex);
            }

            beginIndex++;

        }

        if (--endIndex > 0) {
            sort(input, 0, endIndex);
        }

    }

    private static <T extends Comparable<T>> void swap(T[] input, int leftIndex, int rightIndex) {
        T temp = input[leftIndex];
        input[leftIndex] = input[rightIndex];
        input[rightIndex] = temp;
    }

}
