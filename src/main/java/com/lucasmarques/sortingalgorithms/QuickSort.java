package com.lucasmarques.sortingalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static <T extends Comparable<T>> T[] sort(T[] input) {

        if (input == null || input.length == 0) {
            return input;
        }

        T pivot = getPivot(input);
        int leftCounter = 0;
        int rightCounter = input.length - 1;

        while (leftCounter <= rightCounter) {

            // the value is in its correct order
            while (input[leftCounter].compareTo(pivot) <= 0) {
                leftCounter++;
            }

            // the value is in its correct order
            while (input[rightCounter].compareTo(pivot) > 0) {
                rightCounter--;
            }

            if (leftCounter <= rightCounter) {
                swap(input, leftCounter, rightCounter);
                leftCounter++;
                rightCounter--;
            }

        }

        return result;

    }

    private static <T extends Comparable<T>> void swap(T[] input, int left, int right) {
        T aux = input[left];
        input[left] = input[right];
        input[right] = aux;
    }

    private static <T extends Comparable<T>> T getPivot(T[] input) {
        return input[input.length / 2];
    }

    private static class Pivot {

        private int value;
        private int position;

        public Pivot(int value, int position) {
            this.value = value;
            this.position = position;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }
    }


}
