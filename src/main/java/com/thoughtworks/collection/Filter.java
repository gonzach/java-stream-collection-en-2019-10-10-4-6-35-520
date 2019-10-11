package com.thoughtworks.collection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
        List<Integer> finalRes = array.stream()
                                .filter(num -> num % 2 == 0)
                                .collect(Collectors.toList());
    }

    public List<Integer> filterEven() {
            return null;
    }

    public List<Integer> filterMultipleOfThree() {
        return null;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return null;
    }

    public List<Integer> getDifferentElements() {
        return null;
    }
}