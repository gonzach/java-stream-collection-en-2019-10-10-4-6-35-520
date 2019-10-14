package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int findResult = 0;
        int lowerLimit = Math.min(leftBorder, rightBorder);
        int upperLimit = Math.max(rightBorder, leftBorder);

        IntStream numbers = IntStream.rangeClosed(lowerLimit, upperLimit);
        return numbers.filter(val -> val%2 == 0).sum();

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int findResult = 0;
        int lowerLimit = Math.min(leftBorder, rightBorder);
        int upperLimit = Math.max(rightBorder, leftBorder);
        for(int startNum = lowerLimit;  startNum<=upperLimit; startNum++){
            if ( startNum % 2 != 0) {
                findResult += startNum;
            }
        }
        return findResult;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(val -> (val * 3) + 2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(val -> val % 2 != 0)
                .map(v -> (v * 3) + 2)
                .collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(val -> val % 2 != 0)
                .mapToInt(val -> (val * 3) + 5).sum();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        arrayList.stream();
        double median;
        if (arrayList.size() % 2 == 0) {
            median = ((double) arrayList.get(arrayList.size() / 2) + (double) arrayList.get(arrayList.size() / 2 - 1))/2;
        } else {
            median = (double) arrayList.get(arrayList.size() / 2);
        }
        return median;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return  arrayList.stream()
                .filter(val -> val%2 == 0)
                .mapToDouble( val -> val)
                .average().orElseThrow(NoSuchElementException::new);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> finalRes = arrayList.stream()
                .filter(val -> val % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
        return finalRes;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> finalRes = arrayList.stream().filter(val -> val % 2 == 0).collect(Collectors.toList());
        List<Integer> odd = arrayList.stream().filter(val -> val % 2 != 0).collect(Collectors.toList());
        Collections.reverse(odd);
        finalRes.addAll(odd);
        return finalRes;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        return null;
    }
}
