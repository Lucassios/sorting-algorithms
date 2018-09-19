package com.lucasmarques.sortingalgorithms;

public class BubbleSort {

    public static <T extends Comparable<T>> void sort(T[] input) {

        int endIndex = input.length - 1;
        sort(input, endIndex);

    }

    private static <T extends Comparable<T>> void sort(T[] input, int endIndex) {

        for (int currentIndex = 0; currentIndex < endIndex; currentIndex++) {

            int nextIndex = currentIndex + 1;
            T currentValue = input[currentIndex];
            T nextValue = input[nextIndex];

            if (currentValue.compareTo(nextValue) > 0) {
                swap(input, currentIndex, nextIndex);
            }

        }

        if (--endIndex > 0) {
            sort(input, endIndex);
        }

    }

    private static <T extends Comparable<T>> void swap(T[] input, int leftIndex, int rightIndex) {
        T temp = input[leftIndex];
        input[leftIndex] = input[rightIndex];
        input[rightIndex] = temp;
    }

}
