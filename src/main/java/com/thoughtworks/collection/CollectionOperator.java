package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {

        if (left < right) {
            return IntStream.rangeClosed(left, right)
                    .boxed()
                    .collect(Collectors.toList());
        } else {
            List<Integer> list = IntStream.rangeClosed(right, left)
                    .boxed()
                    .collect(Collectors.toList());
            Collections.reverse(list);
            return list;
        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {

        if (left < right) {
            return IntStream.rangeClosed(left, right)
                    .filter(val -> val % 2 == 0)
                    .boxed()
                    .collect(Collectors.toList());
        } else {
            List<Integer> list = IntStream.rangeClosed(right, left)
                    .filter(val -> val % 2 == 0)
                    .boxed()
                    .collect(Collectors.toList());
            Collections.reverse(list);
            return list;
        }
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list = Arrays.stream(array)
                .filter(i -> i % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
        return list;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        return Arrays.stream(firstArray)
                .distinct()
                .filter(x -> Arrays.stream(secondArray).anyMatch(y -> y == x))
                .boxed()
                .collect(Collectors.toList());
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> unionA = Arrays.stream(firstArray).collect(Collectors.toList());
        List<Integer> unionB = Arrays.stream(secondArray).collect(Collectors.toList());
        unionA.addAll(unionB);
        List<Integer> distinctUnion = unionA.stream().distinct().collect(Collectors.toList());
        return distinctUnion;
    }
}
