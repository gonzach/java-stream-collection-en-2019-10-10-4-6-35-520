package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
       return this.arrayList.stream()
               .mapToInt(v -> v)
               .max().orElseThrow(NoSuchElementException::new);
    }

    public double getMinimum() {
        return this.arrayList
                .stream()
                .mapToInt(v -> v)
                .min().orElseThrow(NoSuchElementException::new);
    }

    public double getAverage() {
        return this.arrayList
                .stream()
                .mapToDouble(v -> v)
                .average()
                .orElseThrow(NoSuchElementException::new);
    }

    public double getOrderedMedian() {
        this.arrayList.stream();
        double median;
        if (this.arrayList.size() % 2 == 0) {
            median = ((double) this.arrayList.get(this.arrayList.size() / 2) + (double) this.arrayList.get(this.arrayList.size() / 2 - 1))/2;
        } else {
            median = (double) this.arrayList.get(this.arrayList.size() / 2);
        }
        return median;
    }

    public int getFirstEven() {
        return this.arrayList.stream()
                .filter(val -> val % 2 == 0)
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }

    public int getIndexOfFirstEven() {
        return IntStream.range(0, this.arrayList.size())
                .filter(i -> (this.arrayList.get(i)) % 2 == 0)
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        return this.arrayList.stream()
                .filter(val -> val % 2 != 0)
                .distinct()
                .reduce((first, second) -> second)
                .orElse(null);
    }

    public int getIndexOfLastOdd() {
        return null;
       // return this.arrayList[this.arrayList.length-1];
       // return this.arrayList.lastIndexOf(this.arrayList.size()-1);
    }
}
