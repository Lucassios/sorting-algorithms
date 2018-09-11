package com.lucasmarques.sortingalgorithms;

import java.util.LinkedList;
import java.util.List;

public class QuickSort {

    public static <T extends Comparable<T>> List<T> sort(List<T> input) {

        if (input == null || input.size() == 0) {
            return input;
        }

        T pivot = getPivot(input);

        List<T> pivotList = new LinkedList<>();
        List<T> lessThanPivotList = new LinkedList<>();
        List<T> greaterThanPivotList = new LinkedList<>();

        for (T value : input) {
            if (value.compareTo(pivot) < 0) {
                lessThanPivotList.add(value);
            } else if (value.compareTo(pivot) > 0) {
                greaterThanPivotList.add(value);
            } else {
                pivotList.add(value);
            }
        }

        lessThanPivotList = sort(lessThanPivotList);
        greaterThanPivotList = sort(greaterThanPivotList);

        return concatenateList(pivotList, lessThanPivotList, greaterThanPivotList);

    }

    private static <T extends Comparable<T>> List<T> concatenateList(List<T> pivotList, List<T> lessThanPivotList,
                                                                     List<T> greaterThanPivotList) {
        lessThanPivotList.addAll(pivotList);
        lessThanPivotList.addAll(greaterThanPivotList);
        return lessThanPivotList;
    }

    private static <T extends Comparable<T>> T getPivot(List<T> input) {
        return input.get(input.size() / 2);
    }


}
