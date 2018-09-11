package com.lucasmarques.sortingalgorithms;

public class InsertionSort {

    public static <T extends Comparable<T>> void sort(T[] input) {

        for (int indexPivot = 0; indexPivot < input.length; indexPivot++) {

            T pivot = input[indexPivot];

            for (int i = indexPivot - 1; i >= 0; i--) {

                T value = input[i];
                if (value.compareTo(pivot) > 0) {
                    swap(input, indexPivot, i);
                    indexPivot = i;
                }

            }

        }

    }

    private static <T extends Comparable<T>> void swap(T[] input, int leftIndex, int rightIndex) {
        T temp = input[leftIndex];
        input[leftIndex] = input[rightIndex];
        input[rightIndex] = temp;
    }

}
